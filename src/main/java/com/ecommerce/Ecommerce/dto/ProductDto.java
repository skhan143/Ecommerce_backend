package com.ecommerce.Ecommerce.dto;

import com.ecommerce.Ecommerce.model.Category;

import javax.validation.constraints.NotNull;

public class ProductDto  {
    private Integer id;
    private @NotNull String name;
    private @NotNull String imageurl;
    private @NotNull Double pricr;
    private @NotNull String discription;
    private @NotNull Integer categoryId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Double getPricr() {
        return pricr;
    }

    public void setPricr(Double pricr) {
        this.pricr = pricr;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
