package practice;

public class InnerClass {

	public static void main(String[] args) {
		OuterClass outerObject = new OuterClass(); // accessing an inner class
		OuterClass.InnerClass innerObject = outerObject.new InnerClass();
		innerObject.display();


	}

}
