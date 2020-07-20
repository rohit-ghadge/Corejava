### package practice;

class MT implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("inside the child method" + i);
		}
	}

}

public class Prc {

	public static void main(String args[]) // driver function
	{
		MT obj = new MT();
		Thread t = new Thread(obj);
		t.start();
		for (int i = 0; i < 4; i++) {
			System.out.println("inside the Main method" + i);
		}
	}
}
-----------------------------------------------------------------------------------------------------------------
package practice;

public class Prc {

	public static void main(String args[]) // driver function
	{
		Runnable r = () -> {
			for (int i = 0; i < 4; i++) {
				System.out.println("inside the Child method" + i);
			}
		};

		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 4; i++) {
			System.out.println("inside the Main method" + i);
		}
	}
}
------------------------------------------------------------------------------------------------------------------
