package br.com.letscode.bb.inject.service;

import br.com.letscode.bb.inject.model.Jogador;
import br.com.letscode.bb.inject.repository.JogadorRepository;

import java.util.List;

public class JogadorService {
    private JogadorRepository repo = new JogadorRepository();
    public JogadorRepository getRepo() {
        return repo;
    }
    public Jogador getById(Long id){
        return this.repo.getById(id);
    }
    public List<Jogador> getAll(){
        return this.repo.getAll();
    }
}
