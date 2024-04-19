package LLD6.TicTacToe.Controller;

import LLD6.TicTacToe.Models.Game;

public class GameController {
    public static void run(Game game){
        int count = 0;
        int max = game.getBoard().getSize();
        while(count < max){
            System.out.println();
            game.printBoard();
            System.out.println();
            game.getPlayers().get(0).makeMove(game);
            System.out.println();
            game.printBoard();
            System.out.println();
            game.getPlayers().get(1).makeMove(game);
            count++;
        }
        
    }
}
