package day12;

public class AccountEncapsMain {

	public static void main(String[] args) {
		
		AccountEncaps accObj = new AccountEncaps();
		
        accObj.setAccno(565656);
        System.out.println(accObj.getAccno());
        
        accObj.setAccName("Sommu Alagappan");
        System.out.println(accObj.getAccName());
        
        accObj.setBalance(100000000);
        System.out.println(accObj.getBalance());
	}

}
