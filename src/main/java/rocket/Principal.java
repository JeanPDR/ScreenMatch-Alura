package rocket;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setTitulo("A Origem");
        meuFilme.setAnoLancamento(2010);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(148);

        meuFilme.exibeFichaTecnica();
        // Exibe a ficha técnica do filme
        // O método exibeFichaTecnica() imprime as informações do filme no console.
        meuFilme.avaliacao(5.0);
        meuFilme.avaliacao(4.5);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }
}
