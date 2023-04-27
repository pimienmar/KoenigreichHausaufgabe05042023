import java.util.Scanner;

public class Königreich {

    public static void erzeugeEinwohner(String bevölkerungstyp) {
        System.out.println("Ein neuer "+bevölkerungstyp+" soll erschaffen werden");
        System.out.println("Wie soll dieser heißen?: ");
        Scanner eingabe = new Scanner(System.in);
        String name = eingabe.nextLine();
        System.out.println("Der "+bevölkerungstyp+" wird bald " + name + " heißen");

        System.out.println("Bitte Einkommen des "+bevölkerungstyp+"s eingeben: ");
        int einkommen = eingabe.nextInt();

        Einwohner einwohner = null;
        if (bevölkerungstyp.equals("König"))
             einwohner = new König(name, einkommen);
        else if (bevölkerungstyp.equals("Adel"))
            einwohner = new Adel(name, einkommen);

        if (einwohner != null)
            System.out.println("Der "+bevölkerungstyp+" " + einwohner.getName() + " muss " + einwohner.steuer() + " Taler als Steuer zahlen. ");
    }


    public static void main(String[] args) {

        int auswahl;
        do {
            System.out.println("Starte Matrix... ");
            System.out.println("Neuer Einwohner wird erschaffen... ");
            System.out.println("Bitte Bevölkerungsgruppe wählen: ");
            System.out.println("1: König ");
            System.out.println("2: Adel ");
            System.out.println("3: Bauer ");
            System.out.println("4: Leibeigen ");
            System.out.println("5: Zufällige Gruppe ");


            Scanner eingabe = new Scanner(System.in);
            auswahl = eingabe.nextInt();
            if (auswahl == 5) {
                auswahl = (int)(Math.random()*4)+1;
                System.out.println(auswahl);
            }
        } while (auswahl <= 0 || auswahl >= 6);

        if (auswahl == 1) {
            erzeugeEinwohner("König");
        }
        if (auswahl == 2) {
            erzeugeEinwohner("Adel");
        }
        if (auswahl == 3) {
            Einwohner e1 = new Bauer ("leer", 0);

            System.out.println("Ein neuer Bauer wurde erschaffen");
            System.out.println("Wie soll dieser heißen?: ");
            Scanner eingabe2 = new Scanner(System.in);
            e1.setName(eingabe2.nextLine());
            System.out.println("Der Bauer heißt nun " + e1.getName());

            System.out.println("Bitte Einkommen des Bauers eingeben: ");
            Scanner eingabe3 = new Scanner(System.in);
            e1.setEinkommen(eingabe3.nextInt());
            System.out.println("Der Bauer " + e1.getName() + " muss " + e1.steuer() + " Taler als Steuer zahlen. ");
        }
        if (auswahl == 4) {
            Einwohner e1 = new Leibeigen ("leer", 0);

            System.out.println("Ein neuer Leibeigener wurde erschaffen");
            System.out.println("Wie soll dieser heißen?: ");
            Scanner eingabe2 = new Scanner(System.in);
            e1.setName(eingabe2.nextLine());
            System.out.println("Der Leibeigene heißt nun " + e1.getName());

            System.out.println("Bitte Einkommen des Leibeigenen eingeben: ");
            Scanner eingabe3 = new Scanner(System.in);
            e1.setEinkommen(eingabe3.nextInt());
            System.out.println("Der Leibeigene " + e1.getName() + " muss " + e1.steuer() + " Taler als Steuer zahlen. ");
        }




}}