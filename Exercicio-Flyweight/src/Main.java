public class Main {
    public static void main(String[] args) {
        FormaManager formaManager = new FormaManager();

        formaManager.addForma("Vermelho", "0,0", 10);
        formaManager.addForma("Azul", "1,1", 15);
        formaManager.addForma("Verde", "2,2", 20);

        formaManager.addForma("Vermelho", "3,3", 25);
        formaManager.addForma("Azul", "4,4", 30);

        formaManager.apresentar();
    }
}
