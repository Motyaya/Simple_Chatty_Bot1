import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine().replace(" ","");
        String string2 = scanner.nextLine().replace(" ","");
        System.out.println(string1.equals(string2));
    }
}