public class main {
    public static void main(String[] args) {
        // Skapa en bil med giltiga värden
        App bil1 = new App("ABC123", "Volvo", "245 GL", 1983);
        System.out.println(bil1);

        // Öka hastigheten
        bil1.ökaHastighet(50);
        System.out.println("Efter att ha ökat hastigheten: " + bil1.getHastighet() + " km/h");

        // Bromsa
        bil1.bromsa(20);
        System.out.println("Efter att ha bromsat: " + bil1.getHastighet() + " km/h");

        // Testa öka hastighet med negativt tal → exception
        try {
            bil1.ökaHastighet(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Fel: " + e.getMessage());
        }

        // Testa skapa bil med ogiltiga värden → exception
        try {
            App bil2 = new App("", "Volvo", "245 GL", 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Fel när bil2 skapades: " + e.getMessage());
        }
    }
}


