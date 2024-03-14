public class Adel extends Einwohner {

    public Adel(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int steuer() {
        int zuZahlendeSteuern = super.steuer();
        if (zuZahlendeSteuern < 20) {
            zuZahlendeSteuern = 20;
        }
        return zuZahlendeSteuern;
    }
}
