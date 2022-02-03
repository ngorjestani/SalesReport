package edu.wctc;

public class Sale {
    private String customer;
    private String country;
    private float amount;
    private float tax;

    public Sale(
            String customer,
            String country,
            float amount,
            float tax
    ) {
        this.customer = customer;
        this.country = country;
        this.amount = amount;
        this.tax = tax;
    }

    public String getCustomer() {
        return customer;
    }

    public String getCountry() {
        return country;
    }

    public float getAmount() {
        return amount;
    }

    public float getTax() {
        return tax;
    }
}
