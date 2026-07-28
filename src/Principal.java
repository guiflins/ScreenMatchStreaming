import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(8);


        System.out.println("Média de avaliações do filme: "+ meuFilme.pegaMedia());


    }
}