/*You are provided with a public class Product with private attributes, productId, productName, price, and category.
Write the necessary getters and setters and test using the main method in the UserInterface class and submit the code for evaluation.
Note:
    Ensure to follow the object-oriented specifications provided in the question description.
    Ensure to provide the names for classes, attributes, and methods as specified in the question description.
    Adhere to the code template, if provided.
    Please do not use System.exit(0) to terminate the program*/

//Program CODE
    class Product {
    private int productId;
    private String productName;
    private float price;
    private char category;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }
}

public class stterandgetter {
    public static void main(String[] args) {
        Product pdtObj = new Product();

        pdtObj.setProductId(12);
        pdtObj.setProductName("Kayal");
        pdtObj.setPrice(450);
        pdtObj.setCategory('H');

        System.out.println(pdtObj.getProductId());
        System.out.println(pdtObj.getProductName());
        System.out.println(pdtObj.getPrice());
        System.out.println(pdtObj.getCategory());
    }
}
