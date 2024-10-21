public class Persona {
    private String nombre;
    private double altura;
    private double peso;
    private int edad;

    // constructor
    public Persona(String nombre, double altura, double peso, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;

    }

    public void caminar() {
        System.out.println("caminando...");
    }

    public String IMC() {
        double indice = peso / (altura * altura);
        String msg = "IMC = " + indice;
        return msg;
    }

    public String mayorEdad(int edad) {
        String msg = "Mayor de Edad";
        if (edad >= 18) {
        } else {
            msg = "Menor de Edad";
        }
        return msg;
    }
}
