package br.com.streaming.modelo;

public class Documentario extends Conteudo {
    private String tema;

    public Documentario(String titulo, int duracao, int classificacaoIndicativa, String tema) {
        super(titulo, duracao, classificacaoIndicativa);
        this.tema = tema;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Documentário:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Tema: " + tema);
        System.out.println("Classificação Indicativa: " + getClassificacaoIndicativa() + " anos");
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("-----------------------------");
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo o documentário \"" + getTitulo() + "\" sobre " + tema + ".");
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
