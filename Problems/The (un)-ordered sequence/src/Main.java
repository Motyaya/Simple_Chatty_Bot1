import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int i=x;
        int counter1=0, counter2=0, counter3=0;
        do{
            counter3++;
            if (x>=i && x!=0){
                counter1++;
            }
            if (x<=i && x!=0){
                counter2++;
            }
            if (x==0){
                break;
            }
            i=x;
            x = scanner.nextInt();

        }while (true);
        if (counter1==counter3-1 || counter2==counter3-1){
            System.out.println("true");
        } else System.out.println("false");
    }
}