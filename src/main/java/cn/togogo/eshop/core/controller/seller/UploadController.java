package cn.togogo.eshop.core.controller.seller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import cn.togogo.eshop.common.utils.Constants;
import org.apache.commons.io.FilenameUtils;
import org.aspectj.util.FileUtil;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import cn.togogo.eshop.common.utils.Constants;
/**
 * 实现文件异步上传
 * @author stone
 *
 */
//@Controller
public class UploadController {
	private Client client = new Client();
	
	private Map<String,byte[]> maps = new HashMap<String,byte[]>();
	
	/**
	 * 实现异步通信，通过输出流向客户端响应信息，所以不需要返回值
	 * 1.将图片上传到另一个tomcat服务器
	 * 2.向客户端输出两个路径,以json的方式来输出
	 * pic：代表客户端上传的文件对象
	 */
	@RequestMapping(value="/upload/img_upload")
	public void uploadImg(@RequestParam(value="pic",required=false) MultipartFile pic,HttpServletResponse response){
		
		//1.将图片上传到另一个tomcat服务器
//		System.out.println("****UploadController's uploadImg()****");
		//生成文件名,
		String fileName = getFileName();
		//获得文件名称的后辍
		String ext = FilenameUtils.getExtension(pic.getOriginalFilename());
		String filePath = "upload/"+fileName+"."+ext;
		String imgUrl = Constants.IMG_URL + filePath;
		
		//图片上传的路径
		WebResource webResource = client.resource(imgUrl);
		//读本地文件
		byte[] buf = null;
		try {
//			buf = FileUtil.readAsByteArray(new File("d:/aa.jpg"));
			buf = FileUtil.readAsByteArray(pic.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		maps.put(imgUrl, buf);
		webResource.put(String.class, buf);
		System.out.println("图片上传完成");
		
		//2.向客户端输出两个路径,以json的方式来输出
		JSONObject json = new JSONObject();
		json.put("filePath", filePath);
		json.put("imgUrl", imgUrl);
		
		response.setContentType("application/json;charset=utf-8");
		try {
			PrintWriter out = response.getWriter();
			out.println(json);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 生成文件名称,不包括后辍
	 *根据系统时间来生成文件名称
	 * @return
	 */
	private String getFileName() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
		String format = sdf.format(new Date());
		return format;
	}
}
