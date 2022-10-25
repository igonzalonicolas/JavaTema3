package EjerciciosTema3;

public class EjerciciosTema3 {
    public static void main(String[] args) {
        String[] nombres = {"Gonzalo", "Martini", "Nicolas", "Ezequiel"};

        String texto="";

        for (int i = 0; i < nombres.length; i++){
            texto += " " + nombres[i];
        }
        System.out.println(texto);

    }
}