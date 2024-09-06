package com.hitsuni.management.product.model.dto;

public class ProductDTO {
    private String productCode;      // 제품코드
    private String productName;      // 제품 명
    private String originCost;       // 원가
    private String releaseDate;      // 출시일
    private String discountRate;     // 할인율
    private String salesQuantity;    // 판매량
    private String stockQuantity;    // 재고량
    private String categoryCode;     // 제품분류코드
    private String productionStatus; // 생산상태

    public ProductDTO() { }

    public ProductDTO(String productCode, String productName, String originCost, String releaseDate, String discountRate, String salesQuantity, String stockQuantity, String categoryCode, String productionStatus) {
        this.productCode = productCode;
        this.productName = productName;
        this.originCost = originCost;
        this.releaseDate = releaseDate;
        this.discountRate = discountRate;
        this.salesQuantity = salesQuantity;
        this.stockQuantity = stockQuantity;
        this.categoryCode = categoryCode;
        this.productionStatus = productionStatus;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOriginCost() {
        return originCost;
    }

    public void setOriginCost(String originCost) {
        this.originCost = originCost;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    public String getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(String salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public String getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(String stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getProductionStatus() {
        return productionStatus;
    }

    public void setProductionStatus(String productionStatus) {
        this.productionStatus = productionStatus;
    }

    @Override
    public String toString() {
        return "========= 제품 정보 =========" + '\n' +
                "제품 코드 : " + productCode + '\n' +
                "제품 이름 : " + productName + '\n' +
                "제품 원가 : " + originCost + '\n' +
                "출시일 : " + releaseDate +'\n' +
                "할인율 : " + discountRate + '\n' +
                "판매량 : " + salesQuantity + '\n' +
                "재고량 : " + stockQuantity + '\n' +
                "분류코드 : " + categoryCode + '\n' +
                "생산상태 : " + productionStatus;
    }
}
