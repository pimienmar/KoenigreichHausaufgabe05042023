public class Bauer extends Einwohner{

    public Bauer(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int steuer (){
        int steuerErgebniss;
        steuerErgebniss = zuVersteuern()/10;
        if (steuerErgebniss == 0) {
            steuerErgebniss++;
        }
        return steuerErgebniss;
    }
}
