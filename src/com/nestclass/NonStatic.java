package com.nestclass;

public class NonStatic 
	{
		int a;
		static int b;
		private int c;
			
		private class NestedClass{
			static final int x = 5;
			int num;
			private int z = 6;
			void display() {
				System.out.println("In nested class method-num val "+num+" a value "+a+" b value "+b+" c value "+c);
			}
		}
		void displayInnerClassContent() {
			NestedClass nestObj = new NestedClass();
			nestObj.display();
			}
		public static void main(String[] args) 
		{
			NonStatic innerClassObj = new NonStatic();
			innerClassObj.a = 10;
			NonStatic.b = 100;//Static variable is called using class name
			innerClassObj.c = 1000;
			NonStatic.NestedClass nestObj1 = innerClassObj.new NestedClass();
			nestObj1.num = 20;
			nestObj1.display();
			innerClassObj.displayInnerClassContent();
			System.out.println(NestedClass.x);
			System.out.println(nestObj1.z);
			
			}
		}
