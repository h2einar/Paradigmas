 public class ExcepcionCapturada{

    public static void main(String[] args) {
        int a,b;

        try{
            a = 0;
            b = 10/a; //aqui ocurre la excepcion
            System.out.println("Esta linea de codigo ya no se lee");

        }
        catch(ArithmeticException e){
            System.out.println("Error, Ddivision entre cero" + e );

        }

        System.out.println("Aqui continua el programa despues de la gestion de la excepcion");



      
    }
} 