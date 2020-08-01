import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        int count=0;
       for (int i = 1; i<=number;i++){
           if (number%i==0) count++;
        }
       if (count==2 || count==1) return false;
       return true;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}