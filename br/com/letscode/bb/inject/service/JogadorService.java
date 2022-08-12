package br.com.letscode.bb.inject.service;

import br.com.letscode.bb.inject.model.Jogador;
import br.com.letscode.bb.inject.repository.JogadorRepository;

import java.util.List;

public class JogadorService {
    private final JogadorRepository repo = new JogadorRepository();

    public Jogador getById(Long id){
        return this.repo.getById(id);
    }

    public void incluirNovoJogador(String nome, String jogo){
        Jogador novo = new Jogador();
        novo.setNome(nome);
        novo.setJogo(jogo);
        this.repo.save(novo);
    }
    public void removerJogador(Jogador jogador){
        this.repo.remove(jogador);
    }
    public void atualizarJogador(Jogador jogador){
        this.repo.save(jogador);
    }
    public void exibeJogadores() {
        List<Jogador> jogadores = repo.getAll();
        for(Jogador jogador:jogadores){
            System.out.println(jogador);
        }
    }
}
