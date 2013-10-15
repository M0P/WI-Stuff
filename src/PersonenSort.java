public class PersonenSort {

    public static void sortierePersonen(Person[] personenListe) {
        boolean unsortiert = true;
        Person temp;

        while (unsortiert) {
            unsortiert = false;
            for (int i = 0; i < personenListe.length - 1; i++)
                if (personenListe[i].getAlter() > personenListe[i + 1].getAlter()) {
                    temp = personenListe[i];
                    personenListe[i] = personenListe[i + 1];
                    personenListe[i + 1] = temp;
                    unsortiert = true;
                }
        }
    }

}
