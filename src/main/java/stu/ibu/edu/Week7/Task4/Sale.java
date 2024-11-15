package stu.ibu.edu.Week7.Task4;

import java.time.LocalDate;

public class Sale {
    private String productName;
    private String productCategory;
    private double amount;
    private LocalDate saleDate;

    public Sale(String productName, String productCategory, double amount, LocalDate saleDate){
        this.productName = productName;
        this.productCategory = productCategory;
        this.amount = amount;
        this.saleDate = saleDate;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", amount=" + amount +
                ", saleDate=" + saleDate +
                '}';
    }
}
