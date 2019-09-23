package day30;

public class WarmUp {

	public static void main(String[] args) {
		
		sayHello();
		sayHello();
		sayHello("Spartans");
		sayGoodbye();
       WarmUp.sayGoodbye();
		
	}

	public static void sayGoodbye() {
		
			System.out.println("Bye spartans!");
	}

	public static void sayHello() {
			System.out.println("Greeting Spartans!");
			sayHello("jon snow");
	}
	public static void sayHello(String name){
	System.out.println("Greeting,"+name);
}

}
