package br.com.letscode.bb.inject.repository;

import br.com.letscode.bb.inject.model.Jogador;

import java.util.List;

public interface Repository {
    public void save(Jogador jogador);
    public void remove(Jogador jogador);
    public Jogador getById(Long id);
    public List<Jogador> getAll();
}
