import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0,x;
        do {
             x = scanner.nextInt();
            if (x>max){
                max=x;
            }
        } while(x!=0);
        System.out.println(max);
    }
}