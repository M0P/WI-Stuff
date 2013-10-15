public class Blatt6 {

    private int amountPersons;
    private Person[] personenListe;

    public Blatt6() {
        aufgabe24();

    }

    private void aufgabe24() {
        amountPersons = MyMethods.readInt("Wie viele Personen sollen sortiert werden?");
        personenListe = new Person[amountPersons];
        for (int i = 0; i < personenListe.length; i++) {
            personenListe[i] = new Person(i + 1);
        }
        PersonenSort.sortierePersonen(personenListe);
        System.out.println("Sortierte Liste:");
        for (Person p : personenListe)
            System.out.println(p.getVorname() + " " + p.getNachname() + ", " + p.getAlter() + ", " + (p.isMaennlich() ? "männlich, lfd. Nr. " : "weiblich, lfd. Nr. ") + p.getLfdnr());
        new PersonenStatistik(personenListe);
    }

    public static void main(String[] args) {
        new Blatt6();
    }
}
