import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int perfect=0, fix = 0, delete=0;
        for (int i=0;i!=size;i++){
            int x = scanner.nextInt();
            if (x==0){
                perfect++;
            } else if (x==1) fix++;
            else if (x==-1) delete++;
        }
        System.out.println(perfect + " " + fix + " " + delete);
    }
}