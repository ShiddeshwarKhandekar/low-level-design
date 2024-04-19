package LLD6.TicTacToe.Factory;

import LLD6.TicTacToe.Models.Bot;
import LLD6.TicTacToe.Models.HumanPlayer;
import LLD6.TicTacToe.Models.Player;
import LLD6.TicTacToe.Models.User;

public class PlayerFactory {
    public static HumanPlayer.Builder getHumanPlayer(User user){
        return HumanPlayer.getBuilder(user);
    }
    public static Bot.Builder getBot(){
        return Bot.getBulder();
    }
}
