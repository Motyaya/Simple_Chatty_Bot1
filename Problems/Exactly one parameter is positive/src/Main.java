import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        boolean rez = ((x1>0)&&(x2<=0)&&(x3<=0))||((x1<=0)&&(x2>0)&&(x3<=0)) ||((x1<=0)&&(x2<=0)&&(x3>0));
        System.out.println(rez);
    }
}