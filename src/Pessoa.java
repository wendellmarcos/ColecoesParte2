public class Pessoa {


    private String name;
    private String sexo;


    public Pessoa() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public Pessoa(String name, String sexo) {
        super();
        this.name = name;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa [name=" + name + ", sexo=" + sexo + "]";
    }


}
