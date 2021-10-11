package StringMultiplication;
import java.util.Scanner;
public class StrMul { 
	    // Driver code
	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the first number ");
	    	String num1=sc.nextLine();
	    	System.out.println("Enter the second number ");
	    	String num2=sc.nextLine();
	        String tempnum1 = num1;
	        String tempnum2 = num2;
	        if (num1.charAt(0) == '-'
	            && num2.charAt(0) != '-') {
	            num1 = num1.substring(1);
	        }
	        else if (num1.charAt(0) != '-'
	                 && num2.charAt(0) == '-') {
	            num2 = num2.substring(1);
	        }
	        else if (num1.charAt(0) == '-'
	                 && num2.charAt(0) == '-') {
	            num1 = num1.substring(1);
	            num2 = num2.substring(1);
	        }
	        String s1
	            = new StringBuffer(num1).reverse().toString();
	        String s2
	            = new StringBuffer(num2).reverse().toString();
	 
	        int[] m = new int[s1.length() + s2.length()];
	        for (int i = 0; i < s1.length(); i++) {
	            for (int j = 0; j < s2.length(); j++) {
	                m[i + j] = m[i + j]
	                           + (s1.charAt(i) - '0')
	                                 * (s2.charAt(j) - '0');
	            }
	        }
	        String product = new String();
	        for (int i = 0; i < m.length; i++) {
	            int digit = m[i] % 10;
	            int carry = m[i] / 10;
	            if (i + 1 < m.length) {
	                m[i + 1] = m[i + 1] + carry;
	            }
	            product = digit + product;
	        }
	        while (product.length() > 1
	               && product.charAt(0) == '0') {
	            product = product.substring(1);
	        }
	        if (tempnum1.charAt(0) == '-'
	            && tempnum2.charAt(0) != '-') {
	            product = new StringBuffer(product)
	                          .insert(0, '-')
	                          .toString();
	        }
	        else if (tempnum1.charAt(0) != '-'
	                 && tempnum2.charAt(0) == '-') {
	            product = new StringBuffer(product)
	                          .insert(0, '-')
	                          .toString();
	        }
	        else if (tempnum1.charAt(0) == '-'
	                 && tempnum2.charAt(0) == '-') {
	            product = product;
	        }
	        System.out.println("Product of the two numbers is :"
	                           + "\n" + product);
	    }
	}
