public class PruebaAnimal
{
    public static void main(String[] args){
    
        Perro perro1 = new Perro("Rocky", "boxer", 50);

        Perro perro2 = new Perro("Ash", "Wan-Wan","Gran Danes", 80);
    

    //Campos de instancia
    System.out.println("Nombre de Perro : " + perro1.getNombre());
    System.out.println("Raza de Perro : " + perro1.getRaza());
    System.out.println("Ladrido: ");
    perro1.ladrar();
    System.out.println("Peso de Perro: " + perro1.getPeso());

    //Perro 2
    System.out.println("Nombre de Perro : " + perro2.getNombre());
    System.out.println("Raza de Perro : " + perro2.getRaza());
    System.out.println("Ladrido: ");
    perro2.ladrar();
    System.out.println("Peso de Perro: " + perro2.getPeso());
    
    System.out.println("Cambiamos el ladrido del perro2: ");
    perro2.ladrar("bark-bark");
    
    }

}