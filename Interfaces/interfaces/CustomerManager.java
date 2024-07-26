package interfaces;


public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		// iş kodları
		// bağımlıyız. Yanlış. OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();
		customerDal.add();
	}

}
