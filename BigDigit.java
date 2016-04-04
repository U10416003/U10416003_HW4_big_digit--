//U10416003 
import java.util.Scanner;


public class BigDigit {
	//addition
    public static int[] add(int[] x, int[] y){
		int carry = 0;
		int[] z = new int[x.length];
		
		for(int i = x.length - 1; i >= 0; i--){
			z[i] = x[i] + y[i] + carry;
			if(z[i] < 10000){
				carry = 0;
			}	
			else if(z[i] < 1000){
				System.out.print("0");
			}
			else {
				z[i] = z[i] - 10000;
				carry = 1;
			}
		}
		return z;
	}
	//Subtraction
	public static int[] sub(int[] x, int[] y) { 
        int borrow = 0; 
        int[] z = new int[x.length];
        
		for(int i = x.length - 1; i >= 0; i--) { 
        	z[i] = x[i] - y[i] - borrow; 
            	if(z[i] >= 0){ 
                	borrow = 0;
				}	
            	else { 
                	z[i] = z[i] + 10000; 
                	borrow = 1; 
            	} 
        }
        
        return z;
    }
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int[] x = new int[6];
		int[] y = new int[6];
		
		System.out.println("Please Enter 1 Or 2 To Chose The Addtion Or  Subtraction : ");
		int determine = input.nextInt();
		//if enter 1 is addtion
		if(determine == 1){
			System.out.println("\nPlease Enter The Tow Arrylist To add\n");
			System.out.print("Enter first Arrylist :");
			for(int i = 0; i < x.length; i ++){
				x[i] = input.nextInt();
			}
		
			System.out.print("Enter second Arrylist :");
			for(int i = 0; i < y.length; i ++){
				y[i] = input.nextInt();
			}
			System.out.println();
		
			int[] z = BigDigit.add(x, y);
			System.out.print(" X + Y =");
			for(int i = 0; i < z.length; i++) {
				//decide Digit of z 
				if(z[i] < 1000 && z[i] > 100){
					System.out.print("0" + z[i]);
				}
				else if(z[i] < 100 && z[i] > 10){
					System.out.print("00" + z[i]);
				}
				else if(z[i] < 10 && z[i] > 1){
					System.out.print("000" + z[i]);
				}
				else if(z[i] < 1){
					System.out.print("0000");
				}
				else{
					System.out.print(z[i]);
				}
			}
			System.out.println();
		
		}
		//if enter 2 is Subtraction
		else if (determine == 2){
			System.out.println("\nPlease Enter The Tow Arrylist To sub\n");
			System.out.print("Enter first Arrylist :");
			for(int i = 0; i < x.length; i ++){
				x[i] = input.nextInt();
			}
		
			System.out.print("Enter second Arrylist :");
			for(int i = 0; i < y.length; i ++){
				y[i] = input.nextInt();
			}
			System.out.println();
			
			int[] z = BigDigit.sub(x, y);
			System.out.print("X - Y =");
			for(int i = 0; i < z.length; i++) {
				//decide Digit of z 
				if(z[i] < 1000 && z[i] > 100){
					System.out.print("0" + z[i]);
				}
				else if(z[i] < 100 && z[i] > 10){
					System.out.print("00" + z[i]);
				}
				else if(z[i] < 10 && z[i] > 1){
					System.out.print("000" + z[i]);
				}
				else if(z[i] < 1){
					System.out.print("0000");
				}
				else{
					System.out.print(z[i]);
				}
			}
			System.out.println();
		}
		else{
			System.out.println("You enter a wrong number!!");
		}
	}
}

