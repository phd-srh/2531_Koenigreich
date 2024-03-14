import java.util.Scanner;

public class Königreich {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        while (true) {
            System.out.print("Welche Bevölkerungsgruppe (K, A, B, L): ");
            char bevölkerungsgruppe = eingabe.next().toUpperCase().charAt(0);
            if (bevölkerungsgruppe != 'K' && bevölkerungsgruppe != 'A'
                && bevölkerungsgruppe != 'B' && bevölkerungsgruppe != 'L') break;

            eingabe.nextLine(); // flush
            System.out.print("Wie heißt der Einwohner: ");
            String name = eingabe.nextLine();

            System.out.print("Wie viel verdient der Einwohner (im Jahr): ");
            int einkommen = eingabe.nextInt();

            Einwohner einwohner;
            if (bevölkerungsgruppe == 'K') {
                einwohner = new König(name, einkommen);
            }
            else if (bevölkerungsgruppe == 'A') {
                einwohner = new Adel(name, einkommen);
            }
            else if (bevölkerungsgruppe == 'B') {
                einwohner = new Bauer(name, einkommen);
            }
            else {
                einwohner = new Leibeigen(name, einkommen);
            }
            System.out.println("Der Einwohner " + name + " muss " + einwohner.steuer() +
                    " Taler Steuern zahlen.");
        }

        System.out.println("Vielen Dank und auf Wiedersehen!");
    }
}
