package CLASE30sep24;

public class EjercicioDoWhile {
    public static void main(String[] args) {
        /*
         * Do While
         */
        String cad = "Programacion I";
        int j = 1;
        do {
            System.out.println(cad);
            j++;
        } while (j < 5);

        System.out.println("*******************");
        /*
         * while / for
         */
        int l = 1;
        while (l < 5) {
            System.out.println(cad);
            l++;
        }

        System.out.println("****************");

        for (int i = 1; i < 5; i++) {
            System.out.println(cad);
        }

    }
}
