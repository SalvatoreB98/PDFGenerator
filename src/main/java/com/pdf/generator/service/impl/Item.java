package com.pdf.generator.service.impl;

public class Item {
    String article;
    String description;
    String serialNumber;
    String orderNumber;
    Item(String article, String description, String serialNumber, String orderNumber){
        this.article = article;
        this.description = description;
        this.serialNumber = serialNumber;
        this.orderNumber = orderNumber; 
    }
    public String getArticle() {
        return article;
    }
    
    public void setArticle(String article) {
        this.article = article;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public String getOrderNumber() {
        return orderNumber;
    }
    
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
