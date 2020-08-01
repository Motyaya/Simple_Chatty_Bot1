import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int rez = 0;
        do{
             x = scanner.nextInt();
             rez+=x;
             if (rez>=1000){
                 System.out.println(rez-1000);
                 break;
             } else
             if (x==0){
                 System.out.println(rez);
                 break;
             }

        }while (true);
    }
}