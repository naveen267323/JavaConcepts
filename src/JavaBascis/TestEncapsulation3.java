package JavaBascis;

class Encapsulation {

	private String name = "Naveen";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class TestEncapsulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulation Encap = new Encapsulation();
		String name1 = Encap.getName();
		System.out.println(name1);

	}

}
