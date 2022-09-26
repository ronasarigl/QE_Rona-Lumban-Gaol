import java.util.Scanner;

public class AngkaMunculSekali {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        input = input.replace(" ", "");
        input = input.replace("[", "");
        input = input.replace("]", "");
        input = input.replace("\"", "");
        int num[] = new int[100];

        System.out.print("[");
        int printed = 0;
        for (int i = 0; i < input.length(); i++) {
            int stoploop = 0;
            for (int j = 0; j < input.length(); j++) {
                if (j == i) {
                    continue;
                }
                if (input.charAt(i) == input.charAt(j)) {
                    stoploop = 0;
                    break;
                } else {
                    stoploop = 1;
                }
            }
            if (stoploop == 1) {
                if (printed == 0) {
                    System.out.print(input.charAt(i));
                    printed = 1;
                } else {
                    System.out.print(", " + input.charAt(i));
                }
            }
        }

        System.out.print("]");
    }
}
