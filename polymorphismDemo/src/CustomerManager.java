public class CustomerManager {
    private BaseLogerr logger;

    public CustomerManager(BaseLogerr logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Müşteri Eklendi");
        this.logger.log("Log Mesajı");
    }
}
