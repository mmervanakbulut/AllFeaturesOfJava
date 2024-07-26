package throwSyntax;

public class Main {

	public static void main(String[] args) {
		AccountManager manager = new AccountManager();
		System.out.println("Hesaptaki para = " + manager.getBalance());
		manager.depozit(100);
		System.out.println("Hesaptaki para = " + manager.getBalance());
		try {
			manager.withdraw(40);
		}catch(BalanceInsufficientException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Hesaptaki para = " + manager.getBalance());
		try {
			manager.withdraw(70);
		}catch(BalanceInsufficientException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Hesaptaki para = " + manager.getBalance());
	}

}
