package com.example.crownpizzaapplication.FoodItems;

public class FoodItem {
    private int drawable;
    private String name;
    private String size;
    private double price;


    public FoodItem(int drawable, String name, String size, double price) {
        this.drawable = drawable;
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public FoodItem(int drawable, String name) {
        this.drawable = drawable;
        this.name = name;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
