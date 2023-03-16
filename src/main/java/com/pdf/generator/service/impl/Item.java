package com.pdf.generator.service.impl;

public class Item {
    private String article;
    private String description;
    private String serialNumber;
    private String order;
    private String position;
    private String ddtNumber;
    private String ddtDate;
    private String installation;
    private Double unitaryCost;
    private Integer quantity;
    private Double totalCost;

    public Item(String article, String description, String serialNumber, String order, String position,
                String ddtNumber, String ddtDate, String installation, Double unitaryCost, Integer quantity, 
                Double totalCost) {
        this.article = article;
        this.description = description;
        this.serialNumber = serialNumber;
        this.order = order;
        this.position = position;
        this.ddtNumber = ddtNumber;
        this.ddtDate = ddtDate;
        this.installation = installation;
        this.unitaryCost = unitaryCost;
        this.quantity = quantity;
        this.totalCost = totalCost;
    }

    // Setters and getters for all properties

    public void setArticle(String article) {
        this.article = article;
    }

    public String getArticle() {
        return article;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getOrder() {
        return order;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setDdtNumber(String ddtNumber) {
        this.ddtNumber = ddtNumber;
    }

    public String getDdtNumber() {
        return ddtNumber;
    }

    public void setDdtDate(String ddtDate) {
        this.ddtDate = ddtDate;
    }

    public String getDdtDate() {
        return ddtDate;
    }

    public void setInstallation(String installation) {
        this.installation = installation;
    }

    public String getInstallation() {
        return installation;
    }

    public void setUnitaryCost(Double unitaryCost) {
        this.unitaryCost = unitaryCost;
    }

    public Double getUnitaryCost() {
        return unitaryCost;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getTotalCost() {
        return totalCost;
    }
}
