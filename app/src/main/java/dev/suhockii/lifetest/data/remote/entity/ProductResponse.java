package dev.suhockii.lifetest.data.remote.entity;

import com.google.gson.annotations.SerializedName;

import dev.suhockii.lifetest.model.Product;

public class ProductResponse implements Product {
    @SerializedName("product_id")
    private long id;

    @SerializedName("image")
    private String imageUrl;

    private String name;
    private int price;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getImageUrl() {
        return imageUrl;
    }
}
