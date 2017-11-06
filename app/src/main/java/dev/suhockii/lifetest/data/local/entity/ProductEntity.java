package dev.suhockii.lifetest.data.local.entity;

import android.arch.persistence.room.Entity;
import android.support.annotation.NonNull;

import dev.suhockii.lifetest.model.Product;

@Entity(
        tableName = "Products",
        primaryKeys = "id"
)
public class ProductEntity implements Product {
    @NonNull
    private String id;
    private String imageUrl;
    private String name;
    private int price;

    public ProductEntity(@NonNull String id, String imageUrl, String name, int price) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.price = price;
    }

    @Override
    @NonNull
    public String getId() {
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

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    ProductEntity(@NonNull Builder builder) {
        this.id = builder.id;
        this.imageUrl = builder.imageUrl;
        this.price = builder.price;
        this.name = builder.name;
    }

    public static class Builder {
        private String id;
        private String imageUrl;
        private String name;
        private int price;

        public ProductEntity build() {
            return new ProductEntity(this);
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }
    }
}
