import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(), rez=0;
        for (int i=0;i!=size;i++){
            int x = scanner.nextInt();
            if (x%6==0){
                rez+=x;
            }
        }
        System.out.println(rez);
    }
}