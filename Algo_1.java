import java.util.Scanner;

public class Algo_1{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.print("Enter a positive Integer: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            if(num>0){
                long a = 0;
                long b= 0;
                long c=1;
                int d = 1;
                do{
                    
                    a = b;
                    b = c;
                    c = a+b;
                }while(d++<num);
                System.out.println(a);
                
            }else System.out.println("Invalid number! Enter a valid number");

        }while(true);
    }
}