import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String string1 = string.toLowerCase();
        System.out.println(string1.startsWith("j"));
    }
}