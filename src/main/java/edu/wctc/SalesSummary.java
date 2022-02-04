package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class SalesSummary implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        List<CountrySales> salesByCountry = new ArrayList<>();


        System.out.println("SALES SUMMARY REPORT");
        System.out.printf("%-30s %-20s %-10s %-10s",
                "Country",
                "Amount",
                "Tax",
                "Shipping"
        );
        for (Sale s : salesList) {
            System.out.printf("%-30s %-20s %-10s %-10s",
                    s.getCountry(),
                    String.format("%.2f", s.getAmount()),
                    String.format("%.2f", s.getTax()),
                    String.format("%.2f", s.getShipping())
            );
        }
    }
}
