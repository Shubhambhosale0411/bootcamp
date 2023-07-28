package LooselyCoupled;


interface Breakfast{
	void eat();
	void make();
}

class Idly implements Breakfast{

	@Override
	public void eat() {
		System.out.println("eat idly");
	}

	@Override
	public void make() {
		System.out.println("cooker needed");
	}
	
}

class Dosa implements Breakfast{

	@Override
	public void eat() {
		System.out.println("eating dosa");
	}

	@Override
	public void make() {
		
		System.out.println("pan needed");
	}
	
}

public class LooselyDemo {

	public static void main(String[] args) {
		
		Breakfast breakfast=new Dosa(); //looselycoupling
		breakfast.eat();
		breakfast.make();
	}

}
