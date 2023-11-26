public class Animale {
    private String nome;
    private String razza;
    private String colore;

    public Animale(String nome, String razza, String colore){
        this.nome = nome;
        this.razza = razza;
        this.colore = colore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
    public void  faiVerso(){
        System.out.println("verso generico");
    }

    @Override
    public String toString() {
        return "Animale{" +
                "nome='" + nome + '\'' +
                ", razza='" + razza + '\'' +
                ", colore='" + colore + '\'' +
                '}';
    }
}
