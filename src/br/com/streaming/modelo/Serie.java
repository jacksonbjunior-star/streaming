package br.com.streaming.modelo;

public class Serie extends Conteudo {
    private int temporadas;
    // CORRIGIDO: Padronizado para CamelCase com 'P' maiúsculo
    private int episodiosPorTemporada; 

    public Serie(String titulo, int duracao, int classificacaoIndicativa, int temporadas, int episodiosPorTemporada) {
        super(titulo, duracao, classificacaoIndicativa);
        setTemporadas(temporadas);
        setEpisodiosPorTemporada(episodiosPorTemporada);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes da Série:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episódios por Temporada: " + episodiosPorTemporada);
        System.out.println("Classificação Indicativa: " + getClassificacaoIndicativa() + " anos");
        System.out.println("Duração por Episódio: " + getDuracao() + " minutos");
        System.out.println("-----------------------------");
    }

    @Override // ADICIONADO: Método obrigatório da classe mãe Conteudo
    public void reproduzir() {
        System.out.println("Iniciando a reprodução da série \"" + getTitulo() + "\". Bom maratona!");
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        if (temporadas > 0) {
            this.temporadas = temporadas;
        } else {
            System.out.println("Erro: Uma série deve ter pelo menos 1 temporada.");
            this.temporadas = 1;
        }
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        if (episodiosPorTemporada > 0) {
            this.episodiosPorTemporada = episodiosPorTemporada;
        } else {
            System.out.println("Erro: O número de episódios deve ser maior que 0.");
            this.episodiosPorTemporada = 1;
        }
    }
}
