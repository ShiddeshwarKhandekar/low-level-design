package LLD6.TicTacToe.Models;

public class Cell {
    int x;
    int y;
    Symbol symbol;
    public Cell(int x, int y){
        this.x = x;
        this.y = y;
        symbol = new Symbol('i');
    }
    public Symbol getSymbol(){
        return this.symbol;
    }
    public void setSymbol(Symbol symbol){
        this.symbol = symbol;
    }
}
