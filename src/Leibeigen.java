public class Leibeigen extends Bauer{


    public Leibeigen(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int steuer (){
        int steuerErgebniss;
        steuerErgebniss = zuVersteuern()/10;
        if (steuerErgebniss <= 12) {
            return 0;
        }
        return steuerErgebniss-12;
    }
}
