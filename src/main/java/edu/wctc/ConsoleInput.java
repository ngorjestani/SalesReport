package edu.wctc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        String response = "y";

        while (response.equalsIgnoreCase("y")) {
            Sale sale = new Sale();

            System.out.println("Enter customer name: ");
            sale.setCustomer(keyboard.nextLine());

            System.out.println("Enter country: ");
            sale.setCountry(keyboard.nextLine());

            System.out.println("Enter amount: ");
            sale.setAmount(Float.parseFloat(keyboard.nextLine()));

            System.out.println("Enter tax: ");
            sale.setTax(Float.parseFloat(keyboard.nextLine()));

            sales.add(sale);

            System.out.println("Add another? ");
            response = keyboard.nextLine();
        }

        return sales;
    }
}
