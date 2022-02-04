package edu.wctc;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class SalesSummary implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        HashMap<String, CountrySales> salesByCountry = new HashMap<String, CountrySales>();

        for (Sale s : salesList) {
            if (!salesByCountry.containsKey(s.getCountry())) {
                CountrySales sale = new CountrySales(s.getCountry());
                salesByCountry.put(sale.getName(), sale);
            }
            CountrySales countryToEdit = salesByCountry.get(s.getCountry());
            countryToEdit.setAmount(countryToEdit.getAmount() + s.getAmount());
            countryToEdit.setTax(countryToEdit.getTax() + s.getTax());
            countryToEdit.setShipping(countryToEdit.getShipping() + s.getShipping());

            salesByCountry.put(countryToEdit.getName(), countryToEdit);
        }


        System.out.println("SALES SUMMARY REPORT");
        System.out.printf("%-30s %-20s %-10s %-10s\n",
                "Country",
                "Amount",
                "Tax",
                "Shipping"
        );
        for (CountrySales c : salesByCountry.values()) {
            System.out.printf("%-30s %-20s %-10s %-10s\n",
                    c.getName(),
                    String.format("%.2f", c.getAmount()),
                    String.format("%.2f", c.getTax()),
                    String.format("%.2f", c.getShipping())
            );
        }
    }
}
