package interfaces;

public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal, IRepository{
	// dal = data access layer

	@Override
	public void add() {
		System.out.println("MySql'e eklendi.");
	}
	
	

}
