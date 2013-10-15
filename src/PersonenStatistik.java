public class PersonenStatistik {
    int[] personenAlter;

    PersonenStatistik(Person[] personenListe) {
        personenAlter = new int[personenListe.length];
        for (int i = 0; i < personenListe.length; i++)
            personenAlter[i] = personenListe[i].getAlter();
        maximalAlter();
        minimumAlter();
        mittelwertAlter();
        varianzAlter();
    }

    public void varianzAlter() {
        System.out.println("Varianz der Altersangaben:" + ((1 / personenAlter.length) * altersVarianz()));
    }

    private int altersVarianz() {
        int summe = 0;
        int alterssumme = altersSumme();
        for (int i : personenAlter)
            summe += (i - alterssumme) * (i - alterssumme);
        return summe;
    }

    public void mittelwertAlter() {
        System.out.println("Mittelwert der Altersangaben:" + ((1 / personenAlter.length) * altersSumme()));
    }

    private int altersSumme() {
        int summe = 0;
        for (int i : personenAlter)
            summe += i;
        return summe;
    }

    public void minimumAlter() {
        int minAlter = Integer.MAX_VALUE;
        for (int i : personenAlter)
            minAlter = Math.min(minAlter, i);
        System.out.println("Minumum der Altersangaben:" + minAlter);
    }

    public void maximalAlter() {
        int maxAlter = 0;
        for (int i : personenAlter)
            maxAlter = Math.max(maxAlter, i);
        System.out.println("Maximum der Altersangaben:" + maxAlter);

    }

}
