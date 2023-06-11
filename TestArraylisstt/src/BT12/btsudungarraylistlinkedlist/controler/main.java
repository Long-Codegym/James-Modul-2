package BT12.btsudungarraylistlinkedlist.controler;

import BT12.btsudungarraylistlinkedlist.manager.ProductManager;
import BT12.btsudungarraylistlinkedlist.model.Product;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        productManager.addProduct(new Product("Long", 1, 1000000000, "Long ế"));
        System.out.println(" danh sách sản phẩm");
        productManager.displayProduct();
        while (true) {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: // sửa
                    productManager.editProduct(1, "VladimirLong", 100000);
                    productManager.displayProduct();
                    break;
                case 2: // xóa
                    productManager.delProduct(1);
                    productManager.displayProduct();
                    break;
                case 3:
                    productManager.displayProduct();
                    break;
            }
        }
    }
}
