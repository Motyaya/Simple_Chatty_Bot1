import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), count=1;
        while (count<=x){
            if (count*count<=x){
                System.out.println(count*count);
            }
            count++;
        }
    }
}