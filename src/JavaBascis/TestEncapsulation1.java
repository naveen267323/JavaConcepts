package JavaBascis;

class Account1 {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



}

public class TestEncapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account1 acc = new Account1();
		acc.setAge(200);
		System.out.println(acc.getAge());

	}

}
