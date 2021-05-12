package com.nestclass;

public class StaticNestedClass 
{
	static int i = 10;
	private int x = 15;
	
	static class NestedClass{
		int a = 5;
		//static int y = 10;
		private int b = 10;
		
		void display() {
			a = 10;
			b = 20;
			//x = 30;
			i = 50;
			System.out.println("Value- i= "+i+" a = "+a+" b = "+b);
		}
	}

	public static void main(String[] args) {
	
	}

}
