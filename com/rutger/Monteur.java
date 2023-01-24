package kermis.com.rutger;

class Monteur {
    public static boolean isDefect;

    void voerOpstellingsKeuringUit() {
        System.out.println("Monteur        : Hoho niet zo snel, dit is wel een \"risico Attractie\"");
        System.out.println("Monteur        : Omdat hij nu voor de eerste keer gaat draaien");
        System.out.println("Monteur        : Moet ik eerst even kijken of alles wel veilig is.");

        double gefixtOfNiet;
        int counter = 0;

        do {
            gefixtOfNiet = Math.random();
            if (gefixtOfNiet < 0.5) {
                this.geefAttractieVrij();
            } else if (counter == 0) {
                System.out.println("Monteur        : Kun je dat daar niet even anders doen?");
                counter++;
            } else if (counter == 1) {
                System.out.println("Monteur        : En dat daar ook even...");
            }
        } while (gefixtOfNiet >= 0.5);
    }

    void voerPeriodiekeKeuringUit() {
        System.out.println("Monteur        : Sorry even snel een periodieke keuring.");

        double gefixtOfNiet;
        int counter = 0;

        do {
            gefixtOfNiet = Math.random();
            if (gefixtOfNiet < 0.5) {
                this.geefAttractieVrij();
            } else if (counter == 0) {
                System.out.println("Monteur        : Ai daar zie ik ook nog iets.");
                counter++;
            } else if (counter == 1) {
                System.out.println("Monteur        : En dat daar...");
            }
        } while (gefixtOfNiet >= 0.5);
    }

    void storingsMeldingAfhandelen() {
        System.out.println("Monteur        : U heeft de storing gemeld?");
        System.out.println("Monteur        : Hij is er zo mee opgehouden zegt u?");
        System.out.println("Monteur        : Laat mij maar eens even kijken.");

        double gefixtOfNiet;
        int counter = 0;

        do {
            gefixtOfNiet = Math.random();
            if (gefixtOfNiet < 0.5) {
                this.geefAttractieVrij();
            } else if (counter == 0) {
                System.out.println("Monteur        : Hier zo en daar zus..");
                counter++;
            } else if (counter == 1) {
                System.out.println("Monteur        : En dat daar ook even...");
            }
        } while (gefixtOfNiet >= 0.5);
    }

    void storing() throws MonteursException {
        System.out.println("Monteur        : Moment er is een onvoorziene storing");
        Monteur.isDefect = true;
        try {
            System.out.println("Omroeper       : Roep de monteur (m) of kies een andere Attractie");
            Kermis.keuzeMenu();
        } catch (Exception e) {
            System.out.println("Monteur        : Sorry, deze Attractie is afgeschreven");
        }
    }

    void geefAttractieVrij() {
        System.out.println("Monteur        : OK, ziet er weer goed uit, u kunt de attractie starten!");
        Monteur.isDefect = false;
    }
}

class MonteursException extends Exception {
    public MonteursException() {
        super();
    }
}