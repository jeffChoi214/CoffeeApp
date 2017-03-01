package com.test.models;

/*
 * Created by Jeff Choi on 3/1/17.
 */
public class Products {
    String productID, name, price;

    public Products() {}

    public Products(String productID,  String name, String price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
