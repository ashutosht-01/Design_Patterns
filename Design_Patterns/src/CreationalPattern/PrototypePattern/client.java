package CreationalPattern.PrototypePattern;

public class client {
    public static void main(String[] args) {
        GamePiece black = new GamePiece("Black",5);
        GamePiece white = new GamePiece("white",6);
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(black);
        gameBoard.addPiece(white);
        gameBoard.showBoardState();
        //we want to create copy obj of current state
        //each object should know how to clone itself. decouple complexity of cloning from client
       GameBoard copyBoard =  gameBoard.clone();
      copyBoard.showBoardState();
    }

}
