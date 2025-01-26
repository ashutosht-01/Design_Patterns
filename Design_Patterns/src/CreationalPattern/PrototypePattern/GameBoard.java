package CreationalPattern.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard> {
    public List<GamePiece> pieces = new ArrayList<>();
    public  void addPiece(GamePiece piece){
        this.pieces.add(piece);
    }
    public void showBoardState(){
        for(GamePiece piece:pieces){
            System.out.println("color: "+piece.color+ " pos: "+piece.position);
        }
    }

    @Override
    public GameBoard clone() {
        GameBoard newBoard = new GameBoard();
        for(GamePiece piece : this.pieces){
            newBoard.addPiece( piece.clone());
        }
        return newBoard;
    }
}
