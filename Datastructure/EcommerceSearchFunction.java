package Datastructure;
import java.util.*;

class Products {
    private int productId;
    private String productName;
    private String productCategory;

    public Products(int productId, String productName, String productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Category: " + productCategory;
    }
}

public class EcommerceSearchFunction {
    public static void main(String[] args) {
        ArrayList<Products> lst = new ArrayList<>();
        lst.add(new Products(101, "Laptop", "Electronics"));
        lst.add(new Products(102, "Shirt", "Fashion"));
        lst.add(new Products(103, "Phone", "Electronics"));
        lst.add(new Products(104, "Book", "Education"));

        linearSearch(lst, "Phone");
        binarySearch(lst, 101);
    }

    public static void linearSearch(ArrayList<Products> products, String search) {
        for (Products cur : products) {
            if (cur.getProductName().equalsIgnoreCase(search)) {
                System.out.println("Product found: " + cur);
                return;
            }
        }
        System.out.println("Product not found");
    }
    public static void binarySearch(ArrayList<Products> products,int search){
        ArrayList<Integer> lst=new ArrayList<>();
        for(int i=0;i<products.size();i++){
            Products cur=products.get(i);
            lst.add(cur.getProductId());
        }
    Collections.sort(lst);
    int start=0;
    int end=lst.size()-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(lst.get(mid)==search){
            System.out.print(search+" found");
        
            return;
        }
        else if(lst.get(mid)<search){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    System.out.print("Not found");


    }
}
