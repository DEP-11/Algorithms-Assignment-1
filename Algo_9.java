import java.util.Scanner;

public class Algo_9 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loop:
        do{
            System.out.print("Enter a word: ");
            String word = scanner.nextLine().strip();
            for (int i = 0; i < word.length(); i++) {
                if(word.charAt(i)==' '){
                    System.out.println("Invalid word! Try again");
                    continue loop;
                }
            }
            String temp = "";
            char[] wordArr = word.toCharArray();
            for (int i = 0; i < wordArr.length; i++) {
                temp = wordArr[i] + temp; 
            }
            if(temp.equals(word)){
                System.out.println("This is a Palindrome");
            } 
            else{
                System.out.println("This is not a Palindrome");
            }   
            

        }while(true);
    }
}
