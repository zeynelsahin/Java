
public class App {
    public static void main(String[] args) throws Exception {
        // BaseLogerr[] loggers = new BaseLogerr[] { new ConsoleLogger(), new
        // FileLogerr(), new EmailLogerr(),
        // new DatabaseLogger() };

        // for (BaseLogerr logger : loggers) {
        // logger.Log("Log mesajı");
        // }

        CustomerManager customerManager = new CustomerManager(new FileLogerr());
        customerManager.add();
    }
}
