import java.util.Scanner;

public class randomnumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double d = Math.random();
		int rnd = (int)(Math.random()*101);
		System.out.println("Enter a number between 1-100");
		int guess = sc.nextInt();
		int count=0;
		while (guess != rnd) {
			
			if (guess < rnd) {
                System.out.println("Too low, try again");
                guess = sc.nextInt(); 
                
                }

            else if(rnd < guess){
                System.out.println("Too high, try again");
                guess = sc.nextInt();
                
                }
			count++;
        }
		while(guess != rnd);
        System.out.println(+ count + ".try,you found the number");
    }				
}


