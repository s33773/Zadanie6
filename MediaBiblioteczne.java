public class MediaBiblioteczne {
    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny = true;

    public MediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.dostepny = true;
    }

    public void wypozycz() {
        if (dostepny) {
            System.out.println("Tytuł: " + tytul + " został przez Ciebie wypożyczony");
            dostepny = false;
        } else {
            System.out.println("Tytuł: " + tytul + " niedostępny");
        }
    }

    public void zwroc() {
        if (!dostepny) {
            dostepny = true;
            System.out.println("Tytuł: "+tytul+" został zwrócony");
        }else{
            System.out.println("Tytuł: "+tytul+" nie został wypożyczony");
        }

    }
    public void wyswietlInformacje(){
        System.out.println("Tytuł: "+tytul);
        System.out.println("Rok wydania: "+rokWydania);
        System.out.println("Dostepność: "+(dostepny? "Dostępne": "Wypożyczone"));
    }
}
