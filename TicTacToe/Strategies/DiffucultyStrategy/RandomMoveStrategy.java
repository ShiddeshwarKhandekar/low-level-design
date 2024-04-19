package LLD6.TicTacToe.Strategies.DiffucultyStrategy;

import java.util.Random;

import LLD6.TicTacToe.Models.Move;

public class RandomMoveStrategy implements IAutoMoveStrategy{

    @Override
    public Move move() {
        // TODO Auto-generated method stub
        
        Random rand  = new Random();
        int x = rand.nextInt(3);
        int y = rand.nextInt(3);
        return new Move(x,y);
    }

}
