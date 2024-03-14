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

            Einwohner einwohner = null;
            switch (bevölkerungsgruppe) {
                case 'K': einwohner = new König(name, einkommen);
                    break;
                case 'A': einwohner = new Adel(name, einkommen);
                    break;
                case 'B': einwohner = new Bauer(name, einkommen);
                    break;
                case 'L': einwohner = new Leibeigen(name, einkommen);
                    break;
            }
            System.out.println("Der Einwohner " + name + " muss " + einwohner.steuer() +
                    " Taler Steuern zahlen.");
        }

        System.out.println("Vielen Dank und auf Wiedersehen!");
    }
}
