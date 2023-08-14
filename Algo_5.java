import java.util.Scanner;

public class Algo_5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        loop:
        do{
            System.out.print("Enter the text: ");
            String text = scanner.nextLine().strip();
            if(text.isBlank()){
                System.out.println("Invali Text! Enter again to invert.");
                continue loop;
            }
            char[] textToChar = text.toCharArray();
            String invertText = "";
            for (int i = 0; i < textToChar.length; i++) {
                if(textToChar[i] > 128){
                    System.out.println("Only ASCII characters. Enter again.");
                    continue loop;
                }
            }
            for (int i = 0; i < textToChar.length; i++) {
                invertText = invertText + textToChar[textToChar.length-1-i];
                
            }
            System.out.println(invertText);


        }while(true);
    }
}
