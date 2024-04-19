package LLD6.TicTacToe.Models;

import java.util.ArrayList;
import java.util.List;

import LLD6.TicTacToe.Exeptions.MinimumPlayerCountError;
import LLD6.TicTacToe.Strategies.WinningStrategy.IWinningStrategy;

public class Game {
    private Board board;
    private List<Player> Players;
    private List<IWinningStrategy> winningStrategies;
    public void printBoard(){
        this.board.printBoard();
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    public static class Builder{
        Game game;
        int rows;
        int columns;
        Builder(){
            this.game = new Game();
            this.game.Players = new ArrayList<>();
            this.game.winningStrategies = new ArrayList<>();
        }
        public Builder addPlayer(Player player){
            this.game.Players.add(player);
            return this;
        }
        public Builder addWinningStratergy(IWinningStrategy winningStrategy){
            this.game.winningStrategies.add(winningStrategy);
            return this;
        }
        public Builder setRows(int rows){
            this.rows = rows;
            return this;
        }
        public Builder setColumns(int columns){
            this.columns = columns;
            return this;
        }
        public void validate(){
            if(this.game.Players.size() < 2){
                throw new MinimumPlayerCountError();
            }
        }
        public Game build(){
            validate();
            this.game.board = new Board(this.rows,this.columns);
            return this.game;
        }
    }

    public Board getBoard() {
        return this.board;
    }

    public List<Player> getPlayers() {
        return this.Players;
    }


    public List<IWinningStrategy> getWinningStrategies() {
        return this.winningStrategies;
    }


}
