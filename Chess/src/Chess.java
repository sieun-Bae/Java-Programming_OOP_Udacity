class Position{
    int row;
    int column;
    // Constructor using row and column values

    Position(int r, int c){
        this.row = r;
        this.column = c;
    }
}

class Piece {
    Position position;
    boolean isValidMove(Position newPosition){
        if(newPosition.row>0 && newPosition.column >0
        && newPosition.row<8 && newPosition.column<8) {
            return true;
        }
        else {
            return false;
        }
    }
}

class Rock extends Piece {
    boolean isValidMove(Position newPosition){
        // First call the parent's method to check for the board bounds
        if(!super.isValidMove(position)){
            return false;
        }
        // if we passed the first test then check for the specific rock movement
        if(newPosition.column == this.position.column || newPosition.row == this.position.row) {
            return true;
        }
        else {
            return false;
        }
    }
}

class Bishop extends Piece {
    boolean isValidMove(Position newPosition){
        if(!super.isValidMove(position)){
            return false;
        }
        if(Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row)){
            return true;
        }
        else{
            return false;
        }
    }
}
class Queen extends Piece {
    boolean isValidMove(Position newPosition){
        if(!super.isValidMove(position)){
            return false;
        }
        if(Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row)
        || newPosition.column == this.position.column || newPosition.row == this.position.row) {
            return true;
        }
        else {
            return false;
        }
    }
}

class Game{
    Piece [][] board;
    // Constructor creates an empty board

    Game(){
        board = new Piece[8][8];
    }
}



public class Chess {
    public static void main(String [] args){

    }
}
