package BT12.btsudungarraylistlinkedlist.model;

public class Product {
    private String nameProduct;
    private int id;
    private int productPrice;
    private String productInformation;

    public Product() {
    }

    public Product(String nameProduct, int id, int productPrice, String productInformation) {
        this.nameProduct = nameProduct;
        this.id = id;
        this.productPrice = productPrice;
        this.productInformation = productInformation;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductInformation() {
        return productInformation;
    }

    public void setProductInformation(String productInformation) {
        this.productInformation = productInformation;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", id=" + id +
                ", productPrice=" + productPrice +
                ", productInformation='" + productInformation + '\'' +
                '}';
    }
}
