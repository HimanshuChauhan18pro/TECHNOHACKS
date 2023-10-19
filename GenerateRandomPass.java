import java.util.Scanner;

public class GenerateRandomPass {

    public static void lowComp(int len, String digit) { // low level complexity
        StringBuilder pass = new StringBuilder("");
        int min = 0, max = digit.length() - 1;
        for (int i = 0; i < len; i++) {
            int b = (int) (Math.random() * (max - min + 1) + min);
            pass.append(digit.charAt(b));
        }
        System.out.println(pass);
    }

    public static void mediumComp(int len, String str) { // medium level complexity
        StringBuilder pass = new StringBuilder("");
        int min = 0;
        int max = str.length() - 1;
        for (int i = 0; i < len; i++) {
            int b = (int) (Math.random() * (max - min + 1) + min);
            pass.append(str.charAt(b));
        }
        System.out.println(pass);
    }

    public static void highComp(int len, String str) { // High level complexity
        StringBuilder pass = new StringBuilder("");
        int min = 0;
        int max = str.length() - 1;
        for (int i = 0; i < len; i++) {
            int b = (int) (Math.random() * (max - min + 1) + min);
            pass.append(str.charAt(b));
        }
        System.out.println(pass);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------ Random Password Generator -------");

        String ch = "qwertyuiopasdfghjklzxcvbnm";
        String symbol = "!@#$%^&";
        String digit = "1234567890";

        System.out.println("Enter length of Password : ");
        int len = sc.nextInt();
        sc.nextLine(); //
        System.out.println("Enter Complixity (like ; Low / Medium / High) : ");
        String comp = sc.nextLine();

        if (comp.toLowerCase().equals("low")) {
            lowComp(len, digit);
        } else if (comp.toLowerCase().equals("medium")) {
            String nstr = digit + ch;
            mediumComp(len, nstr);
        } else if (comp.toLowerCase().equals("high")) {
            String Nstr = digit + ch + symbol;
            highComp(len, Nstr);
        }

        sc.close();
    }
}
