package practice;

import java.util.Scanner;

public class ScannerValidateInput {
	
	public static void main(String[] args) {
        ScannerValidateInput demo = new ScannerValidateInput();
        demo.validatePositiveNumber();
    }

    private void validatePositiveNumber() {
        Scanner scanner = null;
        int number = 0;
        
        try {
			scanner = new Scanner(System.in);
   
			do {
			    System.out.print("Please enter a positive number: ");
			    while (!scanner.hasNextInt()) {
			        String input = scanner.next();
			        System.out.printf("\"%s\" is not a valid number.\n", input);
			    }
			    number = scanner.nextInt();
			} while (number < 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			scanner.close();
		}

        System.out.printf("You have entered a positive number %d.\n", number);
    }
}
