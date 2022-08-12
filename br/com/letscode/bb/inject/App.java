package br.com.letscode.bb.inject;

import br.com.letscode.bb.inject.model.Jogador;
import br.com.letscode.bb.inject.service.JogadorService;

public class App {
    public static void main(String[] args){
        System.out.println("Vamos  ver um negócio de injeção aqui rapidão, com uma lista de Jogadores!");

        JogadorService service = new JogadorService();

        service.incluirNovoJogador("Fulano","CSGO");
        service.incluirNovoJogador("Beltrano","FIFA");
        service.incluirNovoJogador("Julio","Sonic Mania");

        System.out.println("Exibindo jogadores criados:");
        service.exibeJogadores();

        System.out.println("Exibindo jogador buscando pelo id:");
        Jogador jogador = service.getById(2L);

        System.out.println(jogador);

        System.out.println("Atualizando este jogador:");
        jogador.setNome("Zé");
        jogador.setJogo("PES");
        service.atualizarJogador(jogador);
        System.out.println("Jogador Atualizado:");
        System.out.println(jogador);
        service.removerJogador(jogador);
        System.out.println("Removi este jogador, sem gamer de esporte aqui!");
        service.exibeJogadores();



    }
}
