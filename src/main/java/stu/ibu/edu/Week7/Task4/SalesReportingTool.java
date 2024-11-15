package stu.ibu.edu.Week7.Task4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SalesReportingTool {
    public static void main(String[] args) {
        List<Sale> sales = new ArrayList<>();
        sales.add(new Sale("Laptop", "Electronics", 1200.0, LocalDate.of(2024, 1, 10)));
        sales.add(new Sale("Smartphone", "Electronics", 800.0, LocalDate.of(2024, 1, 15)));
        sales.add(new Sale("Refrigerator", "Appliances", 1500.0, LocalDate.of(2024, 2, 20)));
        sales.add(new Sale("Microwave", "Appliances", 200.0, LocalDate.of(2024, 2, 25)));
        sales.add(new Sale("Shoes", "Fashion", 100.0, LocalDate.of(2024, 3, 5)));
        sales.add(new Sale("Jacket", "Fashion", 250.0, LocalDate.of(2024, 3, 10)));

        // Generate full report
        SalesReport.generateReport(sales);

        // Generate report for a specific category
        SalesReport.generateReport(sales, "Electronics");

        // Generate report for a specific date range
        SalesReport.generateReport(sales, LocalDate.of(2024, 2, 1), LocalDate.of(2024, 2, 28));
    }
}
