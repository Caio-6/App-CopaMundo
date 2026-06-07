package com.example.appcopa; // Substitua pelo package real do seu projeto

public class LinguaPojo {

    private int id;
    private String nome;
    private int escolha; // 1 para o idioma ativo, 0 para inativo

    // Construtor Vazio
    public LinguaPojo() {
    }

    // Construtor Completo
    public LinguaPojo(int id, String nome, int escolha) {
        this.id = id;
        this.nome = nome;
        this.escolha = escolha;
    }

    // --- MÉTODOS GETTERS E SETTERS ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    // Método toString para ajudar nos logs/debugs do grupo
    @Override
    public String toString() {
        return "LinguaPojo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", escolha=" + escolha +
                '}';
    }
}