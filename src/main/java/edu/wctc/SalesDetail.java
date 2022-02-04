package edu.wctc;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesDetail implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALES DETAIL REPORT");
        System.out.printf("%-30s %-20s %-10s %-10s %-10s\n",
                "Customer",
                "Country",
                "Amount",
                "Tax",
                "Shipping"
        );
        for (Sale s : salesList) {
            System.out.printf("%-30s %-20s %-10s %-10s %-10s\n",
                    s.getCustomer(),
                    s.getCountry(),
                    String.format("%.2f", s.getAmount()),
                    String.format("%.2f", s.getTax()),
                    String.format("%.2f", s.getShipping())
            );
        }
    }
}
