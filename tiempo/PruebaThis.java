// Uso implícito y explícito de this para hacer referencia a los miembros de un objeto

public class PruebaThis {
    public static void main(String[] args) {
        TiempoSimple tiempo = new TiempoSimple(15, 30, 19);
        System.err.println(tiempo.crearString());
    }
}

// La clase TiempoSimple demuestra la referencia "this".


//se declaran las variables en privado 
class TiempoSimple {
    private int hora;
    private int minuto;
    private int segundo;

//se declara el constructor y con el this se da a entender que nos referimos a la variable de la primera clase para que no se confunda con algo nuevo y marque error
    public TiempoSimple(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String crearString() {
        return String.format("%24s: %s%n%24s: %s",
            "this.aStringUniversal()", this.aStringUniversal(),
            "aStringUniversal()", aStringUniversal());
    }

    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d",
            this.hora, this.minuto, this.segundo);
    }
}