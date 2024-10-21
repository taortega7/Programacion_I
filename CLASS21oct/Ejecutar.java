public class Ejecutar{
    public static void main(String[] args) {
        //creacion del objeto
        Persona objP1 = new Persona("tati", 1.60,20, 17);
        objP1.caminar();

        String respuesta = objP1.IMC();

        System.out.println(respuesta);
        System.out.println(objP1.mayorEdad((10)));
    }
}