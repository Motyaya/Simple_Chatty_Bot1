import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x1 = n%10;
        int x2 = (n/10)%10;
        int x3 = (n/100)%10;
        int x4 = (n/1000)%10;
        if (x1==x4 && x3==x2) {
            System.out.println(1);
        } else System.out.println(37);
    }
}