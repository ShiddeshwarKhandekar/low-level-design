package LLD6.TicTacToe.Models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;
    Board(int rows, int columns){
        board = new ArrayList<>();
        for(int i = 0; i < rows; i++){
            List<Cell> temp = new ArrayList<>();
            for(int j = 0; j < columns; j++){
                temp.add(new Cell(i,j));
            }
            board.add(temp);
        }        
    }
    public void printBoard(){
        for(int i = 0; i < this.board.size(); i++){
            for(int j = 0; j < this.board.get(0).size(); j++){
                System.out.print(this.board.get(i).get(j).getSymbol().getSymbol());
            }
            System.out.println();
        }
    }
    public boolean checkEmpty(int x, int y){
        if(board.get(x).get(y).symbol.getSymbol() == 'i'){
            return true;
        }
        return false;
    }
    public Symbol getCell(int x, int y){
        return this.board.get(x).get(y).getSymbol();
    }
    public void setCell(int x, int y, Symbol symbol){
        this.board.get(x).get(y).setSymbol(symbol);
    }
    public int getSize(){
        return board.size() + board.get(0).size();
    }
}
