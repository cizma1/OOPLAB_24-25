package stu.ibu.edu.Week7.Task1;

import java.util.ArrayList;
import java.util.List;

public class DiscountEngine {
    public static double calculateTotal(List<Product> products, DiscountStrategy discountStrategy){
        double total = 0.0;
        for(Product product : products){
            double discountPrice = discountStrategy.applyDiscount(product.getPrice(), product.getQuantity());
            total += discountPrice * product.getQuantity();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1000,1));
        products.add(new Product("Phone", 500, 2));
        products.add(new Product("Headphones", 100, 5));

        DiscountStrategy percentageDiscount = (price, quantity) -> price * 0.90;

        DiscountStrategy fixedDiscount = (price, quantity) -> price - 50;

        DiscountStrategy bulkDiscount = (price, quantity) -> quantity > 3 ? price * 0.85 : price;

        System.out.println("Total with Percentage Discount: $" + calculateTotal(products, percentageDiscount));
        System.out.println("Total with Fixed Discount: $" + calculateTotal(products, fixedDiscount));
        System.out.println("Total with Bulk Discount: $" + calculateTotal(products, bulkDiscount));
    }
}


