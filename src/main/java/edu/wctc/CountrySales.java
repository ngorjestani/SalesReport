package edu.wctc;

public class CountrySales {
    private String name;
    private float amount;
    private float tax;
    private float shipping;

    public CountrySales(String name) {
        this.name = name;
        this.amount = 0;
        this.tax = 0;
        this.shipping = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getShipping() {
        return shipping;
    }

    public void setShipping(float shipping) {
        this.shipping = shipping;
    }
}
