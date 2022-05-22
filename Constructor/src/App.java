public class App {
    public static void main(String[] args) throws Exception {

        // Product product = new Product(0, null, null, 0, 0, null, null);

        Product product = new Product();
        product.setName("Telefon");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setRenk("Kırmızı");
        product.setKod("Remove");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
}
