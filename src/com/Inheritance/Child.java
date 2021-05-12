package com.Inheritance;

	class Child extends ParentClass1
	{
		void child() 
		{
			System.out.println("This is Child class");
		}
	
		public static void main(String[] args) 
		{
			ParentClass1 p = new ParentClass1();
			Child c = new Child();
			p.parent();
			c.child();
			/*//p.child();
			c.child();
			System.out.println("Parent method: "p.parent());*/
		}
	}
