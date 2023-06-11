package BT12.btsudungarraylistlinkedlist.manager;

import BT12.btsudungarraylistlinkedlist.model.Product;

import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> arrayListProduct = new ArrayList<>();

    public void addProduct(Product product) {
        arrayListProduct.add(product);
    }

    public void editProduct(int id, String nameProduct, int priceProuct) {
//        for (Product product : arrayListProduct) {
//           if (product.getId() == id){
//               product.setNameProduct(nameProduct);
//               product.setProductPrice(priceProuct);
//           }
//        }
        for (int i = 0; i < arrayListProduct.size(); i++) {
            if (arrayListProduct.get(i).getId() == id) {
                arrayListProduct.get(i).setProductPrice(priceProuct);
                arrayListProduct.get(i).setNameProduct(nameProduct);
                break;
            }
        }
    }

    public void delProduct(int id) {
        for (Product product : arrayListProduct) {
            if (product.getId() == id) {
                arrayListProduct.remove(product);
                break;
            }
        }
    }

    public void displayProduct() {
        for (Product product : arrayListProduct) {
            System.out.println(arrayListProduct.toString());
        }
    }

    public void searchProduct(String nameProduct) {
        for (int i = 0; i < arrayListProduct.size(); i++) {
            if(arrayListProduct.get(i).getNameProduct().equals(nameProduct)){
                System.out.println(arrayListProduct.get(i));
            }

        }
        for (Product product : arrayListProduct) {
            if (product.getNameProduct().equals(nameProduct)) {
                System.out.println(product);
            }
            break;
        }
    }

}
