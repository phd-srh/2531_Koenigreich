import java.util.Scanner;

public class Königreich {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        while (true) {
            System.out.print("Welche Bevölkerungsgruppe (K, A, B, L): ");
            char bevölkerungsgruppe = eingabe.next().toUpperCase().charAt(0);
            if (bevölkerungsgruppe != 'K' && bevölkerungsgruppe != 'A'
                && bevölkerungsgruppe != 'B' && bevölkerungsgruppe != 'L' ) break;

            System.out.print("Wie heißt der Einwohner: ");
            String name = eingabe.nextLine();

            System.out.print("Wie viel verdient der Einwohner (im Jahr): ");
            int einkommen = eingabe.nextInt();

        }

        System.out.println("Vielen Dank und auf Wiedersehen!");
    }
}
