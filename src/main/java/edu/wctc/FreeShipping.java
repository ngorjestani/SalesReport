package edu.wctc;

public class FreeShipping implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(0);
    }
}
