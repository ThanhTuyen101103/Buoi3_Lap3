/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap_buoi3;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 20.0);
        Product product3 = new Product("Product 3", 30.0);

       
        Order order = new Order();
        order.addLineItem(product1, 2);
        order.addLineItem(product2, 3);
        order.addLineItem(product3, 1);
        double total = order.getTotal();
        System.out.println("Tong hoa don: " + total);
    }
}

