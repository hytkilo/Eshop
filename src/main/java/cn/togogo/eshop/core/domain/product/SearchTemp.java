package cn.togogo.eshop.core.domain.product;

import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Created by hyt on 16-10-3.
 */
public class SearchTemp {
    private String brandName;
    private String price;
    private String type;
    private String feature;
    private String fitPerson;
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getFitPerson() {
        return fitPerson;
    }

    public void setFitPerson(String fitPerson) {
        this.fitPerson = fitPerson;
    }

    @Override
    public String toString() {
        return "SearchTemp{" +
                "brandName='" + brandName + '\'' +
                ", price='" + price + '\'' +
                ", type='" + type + '\'' +
                ", feature='" + feature + '\'' +
                ", fitPerson='" + fitPerson + '\'' +
                '}';
    }
}
