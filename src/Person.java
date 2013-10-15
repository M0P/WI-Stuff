public class Person {
    private int lfdnr;
    private int alter;
    private String vorname;
    private String nachname;
    private boolean maennlich;

    public Person(int id) {
        this.lfdnr = id;
        vorname = MyMethods.readString("Wie lautet der Vorname der " + id + ". Person?");
        nachname = MyMethods.readString("Wie lautet der Nachname der " + id + ". Person?");
        alter = MyMethods.readInt("Wie alt ist die " + id + ". Person?");
        maennlich = MyMethods.readBoolean("Ist die " + id + ". Person männlich?");
    }


    public int getLfdnr() {
        return lfdnr;
    }

    public int getAlter() {
        return alter;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public boolean isMaennlich() {
        return maennlich;
    }
}
