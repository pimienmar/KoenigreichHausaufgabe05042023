public class Einwohner {

    private String name;
    private int einkommen; //Jahreseinkommen

    public Einwohner(String name, int einkommen) {
        this.name = name;
        this.einkommen = einkommen;
    }

    public int zuVersteuern (){
        return einkommen;
    }

    public int steuer (){
        int steuerErgebniss;
        steuerErgebniss = zuVersteuern()/10;
        if (steuerErgebniss <= 1) {
            return 1;
        }
        return steuerErgebniss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEinkommen() {
        return einkommen;
    }

    public void setEinkommen(int einkommen) {
        this.einkommen = einkommen;
    }
}
