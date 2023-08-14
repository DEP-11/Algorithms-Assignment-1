import java.util.Scanner;

public class Algo_10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loop:
        do{
        System.out.print("Enter the phone number in either of these formats +94 XX XXX XXXX or 0XX-XXXXXXX: ");
        String number = scanner.nextLine().strip();
        if (number.isBlank()){
            System.out.println("Telephone number can't be empty.");
            continue loop;
        }
        int totalDigit = 0;
       
        if((number.charAt(0)=='+' && number.charAt(3)==' ' && 
        number.charAt(6)==' ' && number.charAt(10)==' ') || 
        (number.charAt(0)=='0' && number.charAt(3)=='-')){
            if(number.length()==15 || number.length()==11){
                char[] numArr = number.toCharArray();
                if(numArr[0]=='+'){
                    for (int i = 4; i < numArr.length; i++) {
                        if(Character.isDigit(numArr[i])){
                            totalDigit++;
                        }
                        else continue;
                    
                    }
                }
                else if(numArr[0]=='0'){
                    for (int i = 1; i < numArr.length; i++) {
                        if(Character.isDigit(numArr[i])){
                            totalDigit++;
                        }
                        else continue;
                    
                    }
                }
            }else {
                System.out.println("Invalid phone number.");
                continue loop;
            }

        }else{
            System.out.println("Invalid phone number.");
            continue loop;
        }
        if(totalDigit == 9){
            System.out.println("Number is validated.");
        }else System.out.println("Invalid phone number.");
        
    }while(true);
    }
}
