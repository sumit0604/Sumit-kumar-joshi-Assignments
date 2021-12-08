package com.eshoppingzone.product.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class product {
    @Id
    private int productId;
    private String productType;
    private String productName;
    private String category;
    private int rating;
    private String review;
    private String image;
    private Double price;
    private String description;
    private String specification;

    public product(int productId, String productType, String productName, String category, int rating, String review, String image, Double price, String description, String specification) {
        this.productId = productId;
        this.productType = productType;
        this.productName = productName;
        this.category = category;
        this.rating = rating;
        this.review = review;
        this.image = image;
        this.price = price;
        this.description = description;
        this.specification = specification;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int  productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }
}
