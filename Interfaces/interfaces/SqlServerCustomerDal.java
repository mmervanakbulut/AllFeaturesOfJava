package interfaces;

public class SqlServerCustomerDal implements ICustomerDal{
	public void add() {
		System.out.println("SqlServer db müşteri eklendi.");
	}
}
