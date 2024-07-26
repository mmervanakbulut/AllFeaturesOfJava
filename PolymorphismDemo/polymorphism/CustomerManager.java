package polymorphism;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	public void add() {
		// new ile yazmak yerine constructor'da işlemi gerçekleştiriyoruz.
		// DatabaseLogger logger = new DatabaseLogger();
		// logger.Log("Log message.");
		System.out.println("Müşteri eklendi.");
		this.logger.log("customerManager Log mesajı");
	}
}
