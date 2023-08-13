import java.util.Scanner;

public class Algo_6 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        loop:
        do{
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().strip();
        if(sentence.isBlank()){
            System.out.println("Empty Text! Enter again to reverse the sentence");
            continue loop;
        }
        char[] senToArray = sentence.toCharArray();
        String temp = "";
        String reversed = "";
        for (int i = 0; i < senToArray.length; i++) {
            if(senToArray[i]==' '){
                reversed = temp+" "+reversed;
                temp = "";
            }
            else{temp = temp + senToArray[i];}
            
        }
        reversed = temp +" "+ reversed;
        System.out.println(reversed);
    }while(true);


        
    }
}
