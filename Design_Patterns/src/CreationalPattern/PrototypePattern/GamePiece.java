package CreationalPattern.PrototypePattern;

public class GamePiece implements  Prototype<GamePiece>{
    public String color;
    public  int position;
    public GamePiece(String color,int pos){
        this.color = color;
        this.position = pos;
    }

    public GamePiece() {

    }

    @Override
    public GamePiece clone() {
        GamePiece piece = new GamePiece();
        piece.color = this.color;
        piece.position=this.position;
        return piece;
    }
}
