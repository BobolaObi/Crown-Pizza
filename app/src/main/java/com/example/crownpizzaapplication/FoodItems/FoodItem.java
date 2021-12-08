package com.example.crownpizzaapplication.FoodItems;

/**
 * The type Food item.
 */
public class FoodItem {
    private int drawable;
    private String name;
    private String size;
    private double price;

    /**
     * Instantiates a new Food item.
     *
     * @param drawable the drawable
     * @param name     the name
     * @param size     the size
     * @param price    the price
     */
    public FoodItem(int drawable, String name, String size, double price) {
        this.drawable = drawable;
        this.name = name;
        this.size = size;
        this.price = price;
    }

    /**
     * Instantiates a new Food item.
     *
     * @param drawable the drawable
     * @param name     the name
     */
    public FoodItem(int drawable, String name) {
        this.drawable = drawable;
        this.name = name;
    }

    /**
     * Gets drawable.
     *
     * @return the drawable
     */
    public int getDrawable() {
        return drawable;
    }

    /**
     * Sets drawable.
     *
     * @param drawable the drawable
     */
    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    /**
     * Gets name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
