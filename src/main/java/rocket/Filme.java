package rocket;

public class Filme {

    private String titulo;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDeAvaliacoes;
    private int duracaoEmMinutos;
    private int totalDeAvaliacoes;

    //Método para exibir a ficha técnica do filme
    // O método exibeFichaTecnica() imprime as informações do filme no console.
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Incluído no Plano: " + incluidoNoPlano);
        System.out.println("Avaliação: " + somaDeAvaliacoes);
        System.out.println("Duração em Minutos: " + duracaoEmMinutos);
        System.out.println("Total de Avaliações: " + totalDeAvaliacoes);
    }

    public void avaliacao(double nota) {
        somaDeAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return somaDeAvaliacoes / totalDeAvaliacoes;
    }

}
