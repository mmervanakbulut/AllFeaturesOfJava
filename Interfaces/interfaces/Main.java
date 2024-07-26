package interfaces;

public class Main {

	public static void main(String[] args) {
		/* 
		arayüz-iş-db katmanları arası bağımlılığı azaltarak
		işlemleri yönetmeye yarar. 
		*/
		// ICustomerDal customerDal = new OracleCustomerDal();
		
		// Hata alırız
		// CustomerManager customerManager = new CustomerManager();
		// customerManager.add();
		
		// 1.Yol
		// CustomerManager customerManager = new CustomerManager();
		// customerManager.customerDal = new SqlServerCustomerDal();
		// customerManager.add();
		
		// 2.Yol
		CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal());
		customerManager.add();
	}

}
