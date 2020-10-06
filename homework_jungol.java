package day03;

public class homework_jungol {
	    public static void main(String[] args) {

	        int num = 453, reversed = 0;

	        while(num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }

	        System.out.println("Reversed Number: " + reversed);
	  
	    
	    {
        int num1 = 123456, reversed1 = 0;

        while(num1 != 0) {
            int digit = num1 % 10;
          	reversed1 = reversed1 * 10 + digit;
            num1 /= 10;
        }

        System.out.println("Reversed Number: " + reversed1);
        {
            int num2 = 123456, reversed2 = 0;

            while(num2 != 0) {
                int digit = num2 % 10;
              	reversed2 = reversed1 * 10 + digit;
                num1 /= 10;
            }

            System.out.println("Reversed Number: " + reversed2);
        
	}
}
}
}
