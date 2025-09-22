public class Perro extends Animal{
private double peso;
private String ladrido = "Woof";


public Perro(String nombre, String raza, double peso, String color){
    super(nombre, raza, color);
    this.peso = peso;
}

//segundo constructor
public Perro(String nombre, String raza, double peso, String color, String ladrido){
    super(nombre, raza, peso);
    this.peso = peso;
    this.ladrido = ladrido;
}
// set y get de peso
public double getPeso(){
    returnpeso;
}
public void setPeso(double peso){
    this.peso = peso;
}

//metodo funcional
public void ladrar(){
    System.out.println(ladrido);
}

//segundo metodo 
public void ladrar(String ladrido){
    System.out.println(ladrido);
}


}