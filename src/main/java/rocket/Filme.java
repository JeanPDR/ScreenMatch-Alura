package rocket;

public class Filme {
     
     String titulo;
     int anoLancamento;
     boolean incluidoNoPlano;
     double somaDeAvaliacoes;
     int duracaoEmMinutos;
     int totalDeAvaliacoes;

     //Método para exibir a ficha técnica do filme
     // O método exibeFichaTecnica() imprime as informações do filme no console.

     void exibeFichaTecnica() {
         System.out.println("Título: " + titulo);
         System.out.println("Ano de Lançamento: " + anoLancamento);
         System.out.println("Incluído no Plano: " + incluidoNoPlano);
         System.out.println("Avaliação: " + somaDeAvaliacoes);
         System.out.println("Duração em Minutos: " + duracaoEmMinutos);
         System.out.println("Total de Avaliações: " + totalDeAvaliacoes);
     }

     void avaliacao (double nota) {
          somaDeAvaliacoes += nota;
          totalDeAvaliacoes++;
     }

     double pegaMedia() {
          return somaDeAvaliacoes / totalDeAvaliacoes;
     }
}

