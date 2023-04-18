import java.util.Scanner;

public class Königreich {

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
            Einwohner e1 = new König ("leer", 0);

            System.out.println("Ein neuer König wurde erschaffen");
            System.out.println("Wie soll dieser heißen?: ");
            Scanner eingabe2 = new Scanner(System.in);
            e1.setName(eingabe2.nextLine());
            System.out.println("Der König heißt nun " + e1.getName());

            System.out.println("Bitte Einkommen des Königs eingeben: ");
            Scanner eingabe3 = new Scanner(System.in);
            e1.setEinkommen(eingabe3.nextInt());
            System.out.println("Der König " + e1.getName() + " muss " + e1.steuer() + " Taler als Steuer zahlen. ");
        }
        if (auswahl == 2) {
            Einwohner e1 = new Adel ("leer", 0);

            System.out.println("Ein neuer Adliger wurde erschaffen");
            System.out.println("Wie soll dieser heißen?: ");
            Scanner eingabe2 = new Scanner(System.in);
            e1.setName(eingabe2.nextLine());
            System.out.println("Der Adlige heißt nun " + e1.getName());

            System.out.println("Bitte Einkommen des Adligen eingeben: ");
            Scanner eingabe3 = new Scanner(System.in);
            e1.setEinkommen(eingabe3.nextInt());
            System.out.println("Der Adlige " + e1.getName() + " muss " + e1.steuer() + " Taler als Steuer zahlen. ");
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