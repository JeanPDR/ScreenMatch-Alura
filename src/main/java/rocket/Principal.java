package rocket;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.titulo = "A Origem";
        meuFilme.anoLancamento = 2010;
        meuFilme.incluidoNoPlano = true; 
        meuFilme.duracaoEmMinutos = 148;

        meuFilme.exibeFichaTecnica();
        // Exibe a ficha técnica do filme
        // O método exibeFichaTecnica() imprime as informações do filme no console.
        meuFilme.avaliacao(5.0);
        meuFilme.avaliacao(4.5);

        System.out.println(meuFilme.somaDeAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}