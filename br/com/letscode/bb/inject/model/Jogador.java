package br.com.letscode.bb.inject.model;

public class Jogador {
    private Long id;
    private String nome;
    private String jogo;

    public Jogador(){
        this.id= 0L;
    }
    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", nome='" + getNome() + '\'' +
                ", jogo='" + getJogo() + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }
}
