package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificassao() >= 4){
            System.out.println("Esta entre os preferidos");
        } else if (classificavel.getClassificassao() >= 2) {
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Assista depois");
        }
    }
}
