public abstract class Consolas{

    private String pais;
    private String marca;

    public Consolas(String pais, String marca){

        this.pais = pais;
        this.marca = marca;
    }

    public String getPais() {
        return pais;
    }

    public String getMarca() {
        return marca;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract String tipoConsola();
  


}