import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            int x = scanner.nextInt();
            if (x==0) break;
            else if (x%2==0) System.out.println("even");
            else if (x%2!=0) System.out.println("odd");
        } while (true);
    }
}