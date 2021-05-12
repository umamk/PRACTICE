package practice;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		String a = "Good morning...";
		
		Scanner sc = new Scanner(a);
		
		
		System.out.println("Its : "+sc.findInLine("Good"));
		System.out.println("And the remaing: "+sc.next());
		sc.close();
		
	}

}
