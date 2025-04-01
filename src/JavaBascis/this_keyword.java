package JavaBascis;

public class this_keyword {
// this is a class - which means this variable can be used anywhere in this class
	int a;

	this_keyword(int a) {// this is local variable-which means variable a can be used only in this method
		this.a = a;
	}

	void display() {
		System.out.println(a);
//		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		this_keyword th = new this_keyword(10);
		th.display();

	}

}
