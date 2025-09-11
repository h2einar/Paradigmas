public class TestConsolas {

    public static void main(String[] args) {

        // Instancias de consolas
        Ps5 ps5 = new Ps5("Japón", "Sony", "Acción", "Sobremesa");
        NintendoSwitch switchN = new NintendoSwitch("Japón", "Nintendo", "Aventura", "Portátil");
        XboxX xbox = new XboxX("EE.UU.", "Microsoft", "Shooter", "Sobremesa");
        ROGXbox rog = new ROGXbox("EE.UU.", "Microsoft", "Shooter", "Sobremesa", "Portátil");

        // Array de consolas y polimorfismo
        Consolas[] consola= new Consolas[4];

        consola[0] = switchN;
        consola[1] = ps5;
        consola[2] = xbox;
        consola[3] = rog;

        System.out.println("");

        // Mostrar información
        for (Consolas consolas : consola) {
            System.out.println("Marca: " + consolas.getMarca());
            System.out.println("País: " + consolas.getPais());
            System.out.println("Tipo: " + consolas.tipoConsola());
         
            if (consolas instanceof Ps5) {
               Ps5  play = (Ps5) consolas;
            
               System.out.println("juegos: " + play.getJuegos());
            }
        }
    }
}