public class CONDICIONALESYCICLOS {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        boolean c = true;

        if (!a && (b && c)) {
            System.out.println("Sentencia if ejecutada");
        } else {
            System.out.println("Sentencia else ejecutada");
        }
    }
}