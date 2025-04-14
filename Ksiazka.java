public class Ksiazka extends MediaBiblioteczne {
    private String autor;
    private int liczbaStron;


    public Ksiazka(String tytul, int rokWydania, String autor, int liczbaStron) {
        super(tytul, rokWydania);
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Autor: "+autor);
        System.out.println("Liczba stron: "+liczbaStron);
    }
    public void sprawdzLiczbeStron(){
        if(liczbaStron> 0) {
            System.out.println("Długa książka, liczba stron: "+liczbaStron);
        }else{
            System.out.println("Standardowa liczba stron, liczbaStron: "+liczbaStron);
        }
    }
}
