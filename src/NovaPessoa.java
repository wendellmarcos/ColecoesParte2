public class NovaPessoa implements Comparable<NovaPessoa> {

    private String name;
    private String sexo;


    public NovaPessoa(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;

    }



    @Override
    public String toString() {
        return name + ", sexo: " + sexo + "";

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

    @Override
    public int compareTo(NovaPessoa cadastroPessoa) {

        return name.compareTo(cadastroPessoa.getName());
    }

    public int compareTo1(NovaPessoa cadastroPessoa) {

        return sexo.compareTo(cadastroPessoa.getSexo());
    }
}
