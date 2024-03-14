public class Einwohner {
    private String name;
    private int einkommen;

    public Einwohner(String name, int einkommen) {
        this.name = name;
        this.einkommen = einkommen;
    }

    // ist der Getter für "einkommen", aka getEinkommen()
    public int zuVersteuern() {
        return this.einkommen;
    }

    // aka getZuZahlendeSteuern()
    public int steuer() {
        int gesamtesEinkommen = this.zuVersteuern();
        int zuZahlendeSteuern = gesamtesEinkommen * 10 / 100;
        if (zuZahlendeSteuern < 1) {
            zuZahlendeSteuern = 1;
        }
        return zuZahlendeSteuern;
    }
}
