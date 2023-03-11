import java.util.Scanner;

public class palkelime {
	
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sayac = 0;
        System.out.print("Enter a word");
        String word = sc.nextLine();
        String reversed = "";
         
        for(int i = (word.length()-1); i >= 0; i--)
        {
            reversed += word.charAt(i);
        }
        if(reversed.equals(word)) {
            System.out.println("It is a palindrome word.");
        }
        else {
            System.out.println("It is not a palindrome word.");
        }
    }
}
