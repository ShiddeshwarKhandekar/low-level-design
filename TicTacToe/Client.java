package LLD6.TicTacToe;

import LLD6.TicTacToe.Controller.GameController;
import LLD6.TicTacToe.Factory.PlayerFactory;
import LLD6.TicTacToe.Models.Bot;
import LLD6.TicTacToe.Models.Game;
import LLD6.TicTacToe.Models.HumanPlayer;
import LLD6.TicTacToe.Models.User;
import LLD6.TicTacToe.Strategies.DiffucultyStrategy.RandomMoveStrategy;
import LLD6.TicTacToe.Strategies.WinningStrategy.EasyWinningStrategy;

public class Client {
    // Game game = Game.getBuilder()
    //             .addPlayer(HumanPlayer.getBuilder(
    //                                         User.getBulder()
    //                                         .setName("Akash")
    //                                         .setEmailId("Akash@hotmail.com")
    //                                         .build())
    //                                     .setSymbol('X')
    //                                     .build())
    //             .addPlayer(Bot.getBulder()
    //                             .setWinningStrategy(new RandomMoveStrategy())
    //                             .setSymbol('O')
    //                             .build())
    //             .setRows(3)
    //             .setColumns(3)
    //             .addWinningStratergy(new EasyWinningStrategy())
    //             .build();
    public static void main(String[] args){
        Game game = Game.getBuilder()
        .addPlayer(PlayerFactory.getHumanPlayer(
                                    User.getBulider()
                                    .setName("Akash")
                                    .setEmailId("Akash@hotmail.com")
                                    .build())
                                .setSymbol('X')
                                .build())
        .addPlayer(PlayerFactory.getBot()
                        .setAutoMoveStrategy(new RandomMoveStrategy())
                        .setSymbol('O')
                        .build())
        .setRows(3)
        .setColumns(3)
        .addWinningStratergy(new EasyWinningStrategy())
        .build();
        System.out.println("abcd");
        GameController.run(game);
    }

}
