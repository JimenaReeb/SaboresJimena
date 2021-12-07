package saboresjimena;

public class SaboresJimena {

    public static void main(String[] args) {
        String sabores[] = {"Dulce", "Salado", "Amargo", "Acido", "Umami", "Picante", "Astringente", "Starchy", "Adiposo", "Nada"};
        for (int i = 1; i < sabores.length; i++) {
            System.out.println("Sabor: " + sabores[i]);
        }
    }
}