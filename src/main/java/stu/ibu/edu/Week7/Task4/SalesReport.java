package stu.ibu.edu.Week7.Task4;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalesReport {
    public static void generateReport(List<Sale> sales){
        System.out.println("Full Sales Report:");
        sales.forEach(System.out::println);
        printStatistics(sales);
    }

    public static void generateReport(List<Sale> sales, String productCategory) {
        List<Sale> filteredSales = sales.stream()
                .filter(sale -> sale.getProductCategory().equalsIgnoreCase(productCategory))
                .collect(Collectors.toList());

        System.out.println("\nSales Report for Category: " + productCategory);
        filteredSales.forEach(System.out::println);
        printStatistics(filteredSales);
    }

    public static void generateReport(List<Sale> sales, LocalDate startDate, LocalDate endDate) {
        List<Sale> filteredSales = sales.stream()
                .filter(sale -> !sale.getSaleDate().isBefore(startDate) && !sale.getSaleDate().isAfter(endDate))
                .collect(Collectors.toList());

        System.out.println("\nSales Report for Date Range: " + startDate + " to " + endDate);
        filteredSales.forEach(System.out::println);
        printStatistics(filteredSales);
    }

    private static void printStatistics(List<Sale> sales) {
        if (sales.isEmpty()) {
            System.out.println("No sales data available.");
            return;
        }

        double totalRevenue = sales.stream().mapToDouble(Sale::getAmount).sum();
        double averageSales = sales.stream().mapToDouble(Sale::getAmount).average().orElse(0.0);

        Map<String, Double> categoryRevenue = sales.stream()
                .collect(Collectors.groupingBy(Sale::getProductCategory,
                        Collectors.summingDouble(Sale::getAmount)));

        System.out.println("\n--- Statistics ---");
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Average Sale Amount: $" + averageSales);
        System.out.println("Category Revenue:");
        categoryRevenue.forEach((category, revenue) -> System.out.println("  " + category + ": $" + revenue));
    }
}
