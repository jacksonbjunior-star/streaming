package br.com.streaming.modelo;

public class Filme extends Conteudo {
    //atributo somente do filme
    private String genero;

    public Filme(String titulo, int duracao, int classificacaoIndicativa, String genero) {
        super(titulo, duracao, classificacaoIndicativa);
        this.genero = genero;
    }

    @Override//sobrescreve o método abstrato da classe mãe
    public void exibirDetalhes() {
        System.out.println("Detalhes do Filme:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Gênero: " + genero);
        System.out.println("Classificação Indicativa: " + getClassificacaoIndicativa() + " anos");
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("-----------------------------");
    }

    @Override // ADICIONADO: Faltava implementar este método abstrato da classe mãe
    public void reproduzir() {
        System.out.println("Iniciando o filme: " + getTitulo() + " [" + genero + "]. Prepare a pipoca!");
    }
    //getters e setters para atributo somente do filme
    public  String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
