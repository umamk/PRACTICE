package practice;

class Animal 
{
	void eat()
	{
		System.out.println("Eating...");
	}
}


class Dog extends Animal{
	
		void bark()
		{
			System.out.println("Barking...");
		}
		
	public static void main(String args[])
	{	
		System.out.println("test this class");
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}	

