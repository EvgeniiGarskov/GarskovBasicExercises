package BasicExercises.Object_Oriented_Programming;

import java.util.ArrayList;

public class Object_Oriented_Programming13 {

    public static void main(String[] args) {

        /*
        Напишите Java-программу для создания класса Inventory с набором продуктов и методов для добавления и
        удаления продуктов, а также для проверки низкого уровня запасов.
         */

//        Inventory inventory = new Inventory();
//
//        Product mobile = new Product("Mobile phone", 50);
//        Product accessories = new Product("Mobile accessories", 50);
//
//        inventory.addProduct(mobile);
//        inventory.addProduct(accessories);
//
//        // ArrayList <Product> products = inventory.getProducts();
//
//        System.out.println("Product categories:");
//        for (Product product: inventory.getProducts()) {
//            System.out.println(product.getProductСategory() + ", quantity: " + product.getQuantity());
//        }
//
//        System.out.println("\nChecking stocks:");
//
//        inventory.checkQuantity();
//
//        System.out.println("\nDeleting a category " + accessories.getProductСategory());
//        System.out.println("\nChecking stocks:");
//
//        inventory.removeProduct(accessories);
//
//        inventory.checkQuantity();
    }
}

//class Inventory {
//
//    ArrayList<Product> products;
//
//    public Inventory() {
//        products = new ArrayList <Product>();
//    }
//
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public void removeProduct(Product product) {
//        products.remove(product);
//    }
//
//    public void checkQuantity() {
//        for (Product product: products) {
//            if (product.getQuantity() <= 50) {
//                System.out.println("Low stock " + product.getProductСategory() + ". Current quantity: " + product.getQuantity());
//            }
//        }
//    }
//
//    public ArrayList < Product > getProducts() {
//        return products;
//    }
//}
//
//class Product {
//
//    String productСategory;
//    int quantity;
//
//    public Product(String productСategory, int quantity) {
//        this.productСategory = productСategory;
//        this.quantity = quantity;
//    }
//
//    public String getProductСategory() {
//        return productСategory;
//    }
//
//    public void setProductСategory(String productСategory) {
//        this.productСategory = productСategory;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//}