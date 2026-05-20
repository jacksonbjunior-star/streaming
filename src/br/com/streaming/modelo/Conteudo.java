package br.com.streaming.modelo;

public abstract class Conteudo {
    private String titulo;
    private int duracao; //em minutos
    private int classificacaoIndicativa; //em anos

    public Conteudo(String titulo, int duracao, int classificacaoIndicativa) {
        this.titulo = titulo;
        setDuracao(duracao);
        setClassificacaoIndicativa(classificacaoIndicativa);
    }

    public abstract void exibirDetalhes();

    public abstract void reproduzir();

    public String getTitulo() {
        return titulo;
    }

    public void setDuracao(int duracao) {
        if (duracao > 0) {
            this.duracao = duracao;
        } else {
            System.out.println("Erro. Duração deve ser maior que zero.");
        }
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }
    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        if (classificacaoIndicativa >= 0) {
            this.classificacaoIndicativa = classificacaoIndicativa;
        } else {
            System.out.println("Erro. Classificação indicativa deve ser maior ou igual a zero.");
        }
    }
}
