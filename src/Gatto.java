public class Gatto extends Animale{
    public Gatto(String nome, String razza, String colore) {
        super(nome, razza, colore);
    }

    @Override
    public void faiVerso() {
        System.out.println("miagola");
    }

}
