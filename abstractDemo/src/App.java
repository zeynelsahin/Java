public class App {
    public static void main(String[] args) throws Exception {
        
        CustomerManger customerManger = new CustomerManger();
        customerManger.databaseManager = new MySqlDatabaseManager();
        customerManger.getCustomers();
    }
}
