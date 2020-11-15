package q2;

import java.util.Scanner;

public class math {

	private static Scanner scanner = new Scanner(System.in);
		
		
		public static void Main(String[] args) {
			showMenu();
			int operationChoice = makeOperationChoice();
			
			operationNavigator(operationChoice);
			
			scanner.close();
		}
	
		private static void operationNavigator(int operationChoice) {
			
			switch (operationChoice) {
				case 1:
					System.out.println("toplama.");
					runArithmeticOperators1();
					break;
				case 2:
					System.out.println("çikarma.");
					runArithmeticOperators2();
					
					
					break;
				case 3:
					System.out.println("çarpma.");
					runArithmeticOperators3();
					break;
				case 4:
					System.out.println("bölme.");
					runArithmeticOperators4();
					break;
			
			}
		}
			
		
		private static void runArithmeticOperators1() {
			
			
			
			int a = 10;
			int b = 20;
			
			System.out.println("a + b = " + (a + b) );
			
			
			
			
			}
		private static void runArithmeticOperators2() {
			int a = 10;
			int b = 20;
			System.out.println("a - b = " + (a - b) );
			
		}
		private static void runArithmeticOperators3() {
			int a = 10;
			int b = 20;
			System.out.println("a * b = " + (a * b) );
			
		}
		private static void runArithmeticOperators4() {
			int a = 10;
			int b = 20;
			System.out.println("b / a = " + (b / a) );
			

		}
		private static void showMenu() {
			
			System.out.println("1- toplama.");
			System.out.println("2- çikarma.");
			System.out.println("3- çarpma.");
			System.out.println("4- bölme.");
		}
		private static int makeOperationChoice() {
			
			System.out.println("İşlem tipini giriniz");
			String operationChoice = scanner.nextLine();
			
			return Integer.parseInt(operationChoice);
		}




	

}
