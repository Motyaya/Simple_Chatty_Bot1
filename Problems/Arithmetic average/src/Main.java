import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt(), b = scanner.nextInt();
        double rez = 0, count =0;
        for (;a<=b;a++){
            if (a%3==0){
                rez+=a;
                count++;
            }
        }
        System.out.println(rez/count);
    }
}