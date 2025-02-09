package JavaBascis;

class Account {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		acc.setName("naveen");
		System.out.println(acc.getName());

	}

}
