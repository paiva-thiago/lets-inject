package br.com.letscode.bb.inject.repository;

import br.com.letscode.bb.inject.model.Jogador;

import java.util.ArrayList;
import java.util.List;

public class JogadorRepository implements Repository {
    private List<Jogador> lista;

    public JogadorRepository(){
        lista = new ArrayList();
    }
    @Override
    public void save(Jogador jogador) {
        if(Long.valueOf(0).equals(jogador.getId())) {
            Long newId = Long.valueOf(lista.size() + 1);
            jogador.setId(newId);
            lista.add(jogador);
        }else{
            for(int idx=0;idx<lista.size();idx++){
                if(lista.get(idx).getId().equals(jogador.getId())){
                    lista.set(idx,jogador);
                    return;
                }
            }
        }

    }

    @Override
    public void remove(Jogador jogador) {
        for(int idx=0;idx<lista.size();idx++){
            if(lista.get(idx).getId().equals(jogador.getId())){
                lista.remove(idx);
                return;
            }
        }
    }

    @Override
    public Jogador getById(Long id) {
        for (int idx = 0; idx < lista.size(); idx++) {
            if (lista.get(idx).getId().equals(id)) {
                return lista.get(idx);
            }
        }
        return null;
    }

    @Override
    public List<Jogador> getAll() {
        return lista;
    }
}
