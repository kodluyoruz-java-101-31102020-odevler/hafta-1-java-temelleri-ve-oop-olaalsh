package q1;

import java.util.Scanner;

public class firstquestion {

	public static void main(String[] args) {
		  try (Scanner input = new Scanner(System.in)) {
			System.out.print("Please enter a Password.şifrenizi giriniz!");  
	        String password = input.next();  
	        if (isValid(password)) {  
	            System.out.println("Valid Password");  
	        }
	        else {  
	            System.out.println("Invalid Password");  
	        }
		}  
	    }  

	    public static boolean isValid(String password) {  
	    	  
	        //1.8 karakterden oluşması gerekiyor
	        //2. harf ve rakam içerebilir
	        //3. en az iki rakam içermeli
	        if (password.length() < 8) {   
	            return false;  
	        } else {      
	            char c;  
	            int count = 1;   
	            for (int i = 0; i < password.length() - 1; i++) {  
	                c = password.charAt(i);  
	                if (!Character.isLetterOrDigit(c)) {          
	                    return false;  
	                } else if (Character.isDigit(c)) {  
	                    count++;  
	                    if (count < 2)   {     
	                        return false;  
	                    }     
	                }  
	            }  
	        }  
	        return true;  
	        
	    }  
	}


