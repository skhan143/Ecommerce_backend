package com.ecommerce.Ecommerce.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name= "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private @NotNull String name;
    private @NotNull String imageurl;
    private @NotNull Double price;
    private @NotNull String discription;

    // many to onerelationship
    @ManyToOne
    @JoinColumn(name= "category_id")
          Category category;


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
        return price;
    }

    public void setPricr(Double pricr) {
        this.price = pricr;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
