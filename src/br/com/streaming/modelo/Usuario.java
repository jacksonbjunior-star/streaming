package br.com.streaming.modelo;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private ArrayList<Conteudo> favoritos; // Guarda Filmes, Séries e Documentários juntos

    // Construtor da classe
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.favoritos = new ArrayList<>(); // Inicializa a lista vazia
    }

    // Método para adicionar um conteúdo aos favoritos
    public void adicionarFavorito(Conteudo conteudo) {
        if (conteudo != null) {
            this.favoritos.add(conteudo);
            System.out.println("\"" + conteudo.getTitulo() + "\" foi adicionado aos seus favoritos!");
        }
    }

    // Método para listar todos os conteúdos favoritos
    public void listarFavoritos() {
        System.out.println("\n--- Lista de Favoritos de " + this.nome + " ---");
        if (this.favoritos.isEmpty()) {
            System.out.println("Sua lista de favoritos está vazia.");
        } else {
            for (Conteudo conteudo : this.favoritos) {
                // Exibe o título do conteúdo e o tipo de classe filha (Filme, Serie, etc.)
                System.out.println("- " + conteudo.getTitulo() + " [" + conteudo.getClass().getSimpleName() + "]");
            }
        }
        System.out.println("----------------------------------------");
    }

    // Método para reproduzir um conteúdo diretamente pelo usuário
    public void reproduzirConteudo(Conteudo conteudo) {
        if (conteudo != null) {
            System.out.print("[Usuário: " + this.nome + "] ");
            conteudo.reproduzir(); // Polimorfismo em ação!
        }
    }

    // Getters e Setters para manutenção dos atributos privados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Conteudo> getFavoritos() {
        return favoritos;
    }
}