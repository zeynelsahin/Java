public class App {
    public static void main(String[] args) throws Exception {
        Validator validator = new Validator();
        Customer customer = new Customer();
        validator.validate(customer);
    }
} 
