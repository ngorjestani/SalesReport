package edu.wctc;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportGenerator {
    private SalesInput salesInput;
    private ShippingPolicy shippingPolicy;
    private SalesReport salesReport;

    public ReportGenerator(SalesInput salesInput, ShippingPolicy shippingPolicy, SalesReport salesReport) {
        this.salesInput = salesInput;
        this.shippingPolicy = shippingPolicy;
        this.salesReport = salesReport;
    }

    public void generateReport() {
        List<Sale> allSales = salesInput.getSales();
        for (Sale s : allSales) {
            shippingPolicy.applyShipping(s);
        }
        salesReport.generateReport(allSales);
    }
}
