public class App {

    public static void main(String[] args) throws Exception {
        Product product = new Product();
        product.price = 10;
        product.name = "Zeynel";
        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}
