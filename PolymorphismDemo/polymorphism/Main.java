package polymorphism;

public class Main {

	public static void main(String[] args) {
		// EmailLogger logger = new EmailLogger();
		// logger.Log("Hello");
		
		// BaseLogger[] loggers = new BaseLogger[] 
		// 		{
		// 				new FileLogger(), 
		// 				new EmailLogger(),
		// 				new DatabaseLogger(),
		// 				new ConsoleLogger()
		// 		};
		// for( BaseLogger logger:loggers) {
		// 	logger.Log("Foreach");
		// }
		
		// Sadece new DatabaseManager'i değiştirerek işlem yerini değiştirebiliriz.
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
		
	}

}
