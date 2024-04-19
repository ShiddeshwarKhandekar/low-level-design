package LLD6.TicTacToe.Models;

import java.util.Scanner;

public class HumanPlayer extends Player{
    private User user;
    public static Builder getBuilder(User user){
        return new Builder(user);
    }
    public static class Builder{
        HumanPlayer humanPlayer;
        Builder(User user){
            humanPlayer = new HumanPlayer();
            this.humanPlayer.user = user;
        }
        public Builder setSymbol(char symbol){
            this.humanPlayer.symbol = new Symbol(symbol);
            return this;
        }
        public HumanPlayer build(){
            return this.humanPlayer;
        }
    }
    @Override
    public void makeMove(Game game) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert row:");
        int x = 0;
        int y = 0;
        if(sc.hasNextInt()){
            x = sc.nextInt();
        }
        System.out.println("insert column:");
        if(sc.hasNextInt()){
            y = sc.nextInt();
        }
        //System.out.println(x + y);
        if(game.getBoard().checkEmpty(x, y)){
            game.getBoard().setCell(x, y, this.symbol);
        }
        sc.close();
    }
}
