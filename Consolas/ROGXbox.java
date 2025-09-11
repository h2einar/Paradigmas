public class ROGXbox extends XboxX{
    
    String portatil;

    public ROGXbox(String pais, String marca, String juegos, String sobreMesa,String portatil ){

        super(pais, marca, juegos, sobreMesa);

            this.portatil = portatil;
    }

    public String getPortatil() {
        return portatil;
    }

    public void setPortatil(String portatil) {
        this.portatil = portatil;
    }

    @Override
    public String tipoConsola(){
        return getPortatil();
    }
}