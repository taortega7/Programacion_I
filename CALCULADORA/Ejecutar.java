import java.util.Scanner; 

public class Ejecutar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        OperacionesMatematicas operaciones = new OperacionesMatematicas();

        System.out.println("Holi, soy tu calculadora");
        System.out.println("Ingresa tu primer nùmero: ");
        double num1 = scanner.nextDouble(); 
        
        System.out.println("Ingresa tu segundo nùmero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Selecciona que operacion es: ")
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicaciòn");
        System.out.println("4: Divisiòn");

        int opcion = scanner.nextInt();
        double resultado = 0; 

        switch (opcion) {
            case 1:
                resultado = operaciones.sumar(num1, num2);
                break;

            case 2:
                resultado = operaciones.restar(num1, num2);
                break;

            case 3:
                resultado = operaciones.multiplicar(num1, num2);
                break;

            case 4:
                resultado = operaciones.dividir(num1, num2);
                break;

            default:
                System.out.println("Opción no válida.");
                return;
        }
        
        System.out.println("El resultado total es: " + resultado);

    }
}
