public class TestBiblioteki {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Zbrodnia i Kara",1866, "Fiodor Dostojewski", 500);
        Ksiazka ksiazka2 = new Ksiazka("Sklepy cynamonowe", 1934, "Bruno Schulz", 200);
        Film film1 = new Film("Anora",2024, "Sean Baker", 139);
        Film film2 = new Film("Substancja",2024, "Coralie Fargeat", 119);

        MediaBiblioteczne[] mediaArray = new MediaBiblioteczne[4];
        mediaArray[0] = ksiazka1;
        mediaArray[1] = ksiazka2;
        mediaArray[2] = film1;
        mediaArray[3] = film2;

        System.out.println("===== INFORMACJE O WSZYSTKICH MEDIACH =====");
        for (MediaBiblioteczne media : mediaArray) {
            media.wyswietlInformacje();
            System.out.println("-------------------");
        }
        System.out.println("\n====== OPERACJE WYPOŻYCZANIA I ZWRACANIA =====");
        ksiazka1.wypozycz();
        ksiazka1.wypozycz();
        ksiazka1.zwroc();

        System.out.println("\n===== METODY SPECYFICZNE DLA TYPÓW =====");
        ksiazka1.sprawdzLiczbeStron();
        film1.sprawdzCzasTrwania();

        System.out.println("\"n ===== RZUTOWANIE TYPÓW =====");
        for (MediaBiblioteczne media : mediaArray) {
            if(media instanceof Ksiazka){
                Ksiazka k = (Ksiazka) media;
                k.sprawdzLiczbeStron();
            }else if(media instanceof Film){
                Film f = (Film) media;
                f.sprawdzCzasTrwania();
            }
        }
}
}
