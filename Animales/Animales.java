public abstract class Animales{
    
    private String especie;
    private String nombre;

    public Animales(String especie, String nombre){
        this.especie = especie;
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}