package edu.wctc;

import org.springframework.stereotype.Component;

@Component
public class FlatRateShipping implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(10);
    }
}
