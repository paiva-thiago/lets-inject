package br.com.letscode.bb.inject;

import br.com.letscode.bb.inject.model.Jogador;
import br.com.letscode.bb.inject.service.JogadorService;

public class App {
    public static void main(String[] args){
        System.out.println("Vamos  ver um negócio de injeção aqui rapidão.");
        JogadorService service = new JogadorService();
        Jogador joga = new Jogador();
        joga.setNome("Fulano");
        joga.setJogo("CSGO");
        service.getRepo().save(joga);

    }
}
