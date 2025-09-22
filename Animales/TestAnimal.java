public class TestAnimal{
    public staticvoid main (String[] args){
        Pez MiPrimerPez = new Pez("Charalin", "Pejelagarto", "Dulce", "Verde");

        System.out.println("Nombre del pez:" + MiPrimerPez.getNombre());
        System.out.println("Tipo de pez:" + MiPrimerPez.getRaza());
        System.out.println("Tipo de Agua:" + MiPrimerPez.getTipoAgua());
        System.out.println("Color:" + MiPrimerPez.getColor());


       Perro perro1 = new Perro("Rocky", "boxer", 50);
       
       System.out.println("Nombre de Perro : " + perro1.getNombre());
       System.out.println("Raza de Perro : " + perro1.getRaza());
       System.out.println("Ladrido: ");
       perro1.ladrar();
       System.out.println("Peso de Perro: " + perro1.getPeso());
    }
}