import java.util.Scanner;

public class Algo_7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        loop:
        do{
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine().strip();
            if(sentence.isBlank()){
                System.out.println("Empty text! Enter again");
                continue loop;
            }
            //String sentence = "my name is nilan dinushka ranathunga";
            String temp = "";
            int maxLength = 0;
            int minLength = 0;
            String maxString="";
            String minString="";
            char[] senToChar = sentence.toCharArray();
            for (int i = 0; i < senToChar.length; i++) {
                if(senToChar[i] != ' '){
                    temp = temp+senToChar[i];
                }
                if(senToChar[i]==' ' || i==senToChar.length-1){
                    if(minString.equals("")){
                        minString = temp;
                        minLength = minString.length();
                    }
                    if(temp.length()<minLength){
                        minLength = temp.length();
                        minString = temp;
                    }
                    if(temp.length()>maxLength){
                        maxLength = temp.length();
                        maxString = temp;
                    }
                    temp = "";
                    
                }
                
                
                
            }
            System.out.println("Maximum length word is "+maxString +" and Maximum lenghth is "+maxLength);
            System.out.println("Minimum length word is "+minString +" and Minimum lenghth is "+minLength);


        }while(true);
        
    }
}
