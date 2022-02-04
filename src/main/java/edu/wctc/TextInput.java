package edu.wctc;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class TextInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        File file = new File("sales.txt");

        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNext()) {
                String line = reader.nextLine();
                String[] contents = line.split(",");

                Sale sale = new Sale();

                sale.setCustomer(contents[0]);
                sale.setCountry(contents[1]);
                sale.setAmount(Float.parseFloat(contents[2]));
                sale.setTax(Float.parseFloat(contents[3]));

                sales.add(sale);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return sales;
    }
}
