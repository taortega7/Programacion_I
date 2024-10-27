public class OperacionesMatematicas {
    public double sumar (double a, double b){
        return a + b;
    }

    public double restar (double a, double b){
        return a - b; 
    }

    public double multiplicar (double a, double b){
        return a * b; 
    }

    public double dividir (double a, double b){
        if ( b == 0){
            System.out.println("Error");
            return 0; 
        }
        return a / b; 
    }
}