public class Player {
    private String colour;
    Piece king;
    Piece queen;
    Piece bishop1;
    Piece bishop2;
    Piece knight1;
    Piece knight2;
    Piece rook1;
    Piece rook2;
    Piece pawn1;
    Piece pawn2;
    Piece pawn3;
    Piece pawn4;
    Piece pawn5;
    Piece pawn6;
    Piece pawn7;
    Piece pawn8;

    public Player(String color){
        this.colour = color;
        if(color.equals("white")){
            //set white pieces
            queen = new Piece("Queen", colour,3,0);
            king = new Piece("King", colour,4,0);
            pawn1 = new Piece("Pawn", colour,0,1);
            pawn2 = new Piece("Pawn", colour,1,1);
            pawn3 = new Piece("Pawn", colour,2,1);
            pawn4 = new Piece("Pawn", colour,3,1);
            pawn5 = new Piece("Pawn", colour,4,1);
            pawn6 = new Piece("Pawn", colour,5,1);
            pawn7 = new Piece("Pawn", colour,6,1);
            pawn8 = new Piece("Pawn", colour,7,1);
            rook1 = new Piece("Rook", colour,0,0);
            rook2 = new Piece("Rook", colour,7,0);
            bishop1 = new Piece("Bishop", colour,2,0);
            bishop2 = new Piece("Bishop", colour,5,0);
            knight1 = new Piece("Knight", colour,1,0);
            knight2 = new Piece("Knight", colour,6,0);
        }else{
            //set black pieces opposite to these
            queen = new Piece("Queen", colour,3,7);
            king = new Piece("King", colour,4,7);
            pawn1 = new Piece("Pawn", colour,0,6);
            pawn2 = new Piece("Pawn", colour,1,6);
            pawn3 = new Piece("Pawn", colour,2,6);
            pawn4 = new Piece("Pawn", colour,3,6);
            pawn5 = new Piece("Pawn", colour,4,6);
            pawn6 = new Piece("Pawn", colour,5,6);
            pawn7 = new Piece("Pawn", colour,6,6);
            pawn8 = new Piece("Pawn", colour,7,6);
            rook1 = new Piece("Rook", colour,0,7);
            rook2 = new Piece("Rook", colour,7,7);
            bishop1 = new Piece("Bishop", colour,2,7);
            bishop2 = new Piece("Bishop", colour,5,7);
            knight1 = new Piece("Knight", colour,1,7);
            knight2 = new Piece("Knight", colour,6,7);
            
        }
        

    }
    //get each peice, 1 queen, 1 king, 8 pawns, 2 rooks, 2 bishops, 2 knights

    
}
