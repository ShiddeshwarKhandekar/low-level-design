package LLD6.TicTacToe.Models;


import LLD6.TicTacToe.Strategies.DiffucultyStrategy.IAutoMoveStrategy;

public class Bot extends Player{
    private IAutoMoveStrategy autoMoveStrategy;
    public static Builder getBulder(){
        return new Builder();
    }
    public static class Builder{
        Bot bot;
        Builder(){
            bot = new Bot();
        }
        public Builder setAutoMoveStrategy(IAutoMoveStrategy autoMoveStrategy){
            this.bot.autoMoveStrategy = autoMoveStrategy;
            return this;
        }
        public Builder setSymbol(char symbol){
            this.bot.symbol = new Symbol(symbol);
            return this;
        }
        public Bot build(){
            return this.bot;
        }
    }
    @Override
    public void makeMove(Game game) {
        while(true){
            Move move = autoMoveStrategy.move();
            int x = move.getX();
            int y = move.getY();
            if(game.getBoard().checkEmpty(x, y)){
                game.getBoard().setCell(x, y, this.symbol);
                break;
            }
        }
        

    }
}
