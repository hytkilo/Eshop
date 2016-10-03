package net.togogo.test;

import java.io.File;

import org.aspectj.util.FileUtil;
import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;




public class UploadTest {

	@Test
	public void testUpload() throws Exception{
		Client client = new Client();
		//图片上传的路径
		String imgUrl = "http://localhost:8088/imgweb/upload/ab.jpg";
		
		WebResource webResource = client.resource(imgUrl );
		//读本地文件
		byte[] buf = FileUtil.readAsByteArray(new File("d:/aa.jpg"));
		webResource.put(String.class, buf);
		System.out.println("图片上传完成");
	}
}
