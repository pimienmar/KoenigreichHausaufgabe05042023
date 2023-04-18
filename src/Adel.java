public class Adel extends Einwohner{

    public Adel(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int steuer (){
        int steuerErgebniss;
        steuerErgebniss = zuVersteuern()/10;
        if (steuerErgebniss <= 20) {
            return 20;
        }
        return steuerErgebniss;
    }
}

/*
    while (steuerErgebniss%10 != 0) {
    steuerErgebniss = steuerErgebniss - 0.1;
    }
    */
