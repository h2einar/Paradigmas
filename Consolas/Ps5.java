public class Ps5 extends Consolas{
    private String juegos;
    private String sobreMesa;

    public Ps5(String pais, String marca, String juegos, String sobreMesa){

        super(pais, marca);

            this.juegos = juegos;
            this.sobreMesa = sobreMesa;
    }

    public String getJuegos() {
        return juegos;
    }

    public void setJuegos(String juegos) {
        this.juegos = juegos;
    }

     public String getSobreMesa() {
        return sobreMesa;
    }

    
    public void setSobreMesa(String sobreMesa) {
        this.sobreMesa = sobreMesa;
    }

    @Override
    public String tipoConsola(){
        return getSobreMesa();
    }


   
}