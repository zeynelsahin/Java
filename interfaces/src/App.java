public class App {
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager = new CustomerManager(new OraleCustomerDal());
        customerManager.add();
        
    }
}
