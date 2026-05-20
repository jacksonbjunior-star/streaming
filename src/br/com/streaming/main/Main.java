package br.com.streaming.main;

import br.com.streaming.modelo.Filme;
import br.com.streaming.modelo.Serie;
import br.com.streaming.modelo.Documentario;
import br.com.streaming.modelo.Usuario;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("   INICIALIZANDO SISTEMA DE STREAMING    ");
        System.out.println("=========================================\n");

        // 1. Instanciando os conteúdos (Polimorfismo e Herança)
        Filme filme = new Filme("B13", 148, 14, "Ação/Crime");
        Serie serie = new Serie("JoJo's Bizarre Adventure", 30, 16, 7, 24);
        Documentario doc = new Documentario("Nosso Planeta", 60, 0, "Natureza");

        // 2. Criando o usuário conforme os novos requisitos
        Usuario usuario = new Usuario("Jackson", "jackson@email.com");

        // 3. Exibindo os detalhes de cada um para testar a Sobrescrita (Polimorfismo)
        filme.exibirDetalhes();
        System.out.println();
        serie.exibirDetalhes();
        System.out.println();
        doc.exibirDetalhes();
        System.out.println();

        // 4. Testando o método de reprodução de conteúdos
        usuario.reproduzirConteudo(filme);
        usuario.reproduzirConteudo(serie);

        // 5. Testando o sistema de favoritos (Lista Dinâmica e Verificação de Vazio)
        System.out.println("\n--- [TESTE] Listando Favoritos Antes de Adicionar ---");
        usuario.listarFavoritos(); 

        System.out.println("\n--- [TESTE] Adicionando Itens aos Favoritos ---");
        usuario.adicionarFavorito(filme);
        usuario.adicionarFavorito(serie);
        usuario.adicionarFavorito(doc);

        System.out.println("\n--- [TESTE] Listando Favoritos Depois de Adicionar ---");
        usuario.listarFavoritos(); 
        
        System.out.println("\n=========================================");
        System.out.println("           FIM DOS TESTES                ");
        System.out.println("=========================================");
    }
}
