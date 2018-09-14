package Pieces;

import java.awt.*;
import java.util.ArrayList;

import Tables.Board;
import Tables.Cell;

public abstract class Piece {

    protected int ROW;
    protected int COL;
    
    protected Board board;
    

    protected String NameOfPiece;

    protected ArrayList<Cell> ValidCells = new ArrayList<>();

    protected Cell OnWhichCell;

    private Color color;

    public Piece(Board board) {
   this.board = board;
    }

<<<<<<< HEAD
    public void setROW(int i) {
    	ROW = i;
    }
    
    public void setCOL(int i) {
    	COL = i;
    }
    
    public int getROW() {
    	return ROW;
    }
    
    public int getCOL() {
    	return COL;
    }
    
=======
    public Color getColor() {
    	return color;
    }
>>>>>>> 43dc427d6ac0d20342ab009efd431529ddd2c498

    public abstract void Move(int x, int y);

    public abstract String PieceName();

    public abstract void NameUpper();
    
    public abstract void ValidCells(Cell[][] C);

	public abstract boolean  CanMove(Cell cell);
}
