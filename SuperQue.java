package oops;

class bank1{
	String name = "Saving Accontant";
}
class bank2 extends bank1{
	String name="Canara TVM";
	void display() {
		System.out.println(" I have a account in "+name+" which is a "+super.name);
	}
}
public class SuperQue {

	public static void main(String[] args) {
		
		bank2 obj = new bank2();
		obj.display();
	}

}
