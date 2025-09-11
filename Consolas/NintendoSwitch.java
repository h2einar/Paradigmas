public class NintendoSwitch extends Consolas{
    
    private String portatil;
    private String juegos;

    public NintendoSwitch(String pais, String marca, String juegos, String portatil){
        super(pais, marca);

            this.juegos = juegos;
            this.portatil = portatil;
    }

    public String getPortatil() {
        return portatil;
    }

    public void setPortatil(String portatil) {
        this.portatil = portatil;
    }

    public String getJuegos() {
        return juegos;
    }

    public void setJuegos(String juegos) {
        this.juegos = juegos;
    }


    @Override
    public String tipoConsola(){
        return getPortatil();
    }


}