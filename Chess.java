import java.util.Scanner;

//chess game 2 players
public class Chess {
    public static void main(String[] args) {
        //start menu
        System.out.println("Welcome to Chess!");
        //create players
        Player player1 = new Player("white");
        Player player2 = new Player("black");
        //create board which is 8x8 Piece array
        Piece[][] board = new Piece[8][8];
        //set Player Pieces on Board
        board[0][0] = player1.rook1;
        board[0][7] = player1.rook2;
        board[0][1] = player1.knight1;
        board[0][6] = player1.knight2;
        board[0][2] = player1.bishop1;
        board[0][5] = player1.bishop2;
        board[0][3] = player1.queen;
        board[0][4] = player1.king;
        board[1][0] = player1.pawn1;
        board[1][1] = player1.pawn2;
        board[1][2] = player1.pawn3;
        board[1][3] = player1.pawn4;
        board[1][4] = player1.pawn5;
        board[1][5] = player1.pawn6;
        board[1][6] = player1.pawn7;
        board[1][7] = player1.pawn8;

        board[7][0] = player2.rook1;
        board[7][7] = player2.rook2;
        board[7][1] = player2.knight1;
        board[7][6] = player2.knight2;
        board[7][2] = player2.bishop1;
        board[7][5] = player2.bishop2;
        board[7][3] = player2.queen;
        board[7][4] = player2.king;
        board[6][0] = player2.pawn1;
        board[6][1] = player2.pawn2;
        board[6][2] = player2.pawn3;
        board[6][3] = player2.pawn4;
        board[6][4] = player2.pawn5;
        board[6][5] = player2.pawn6;
        board[6][6] = player2.pawn7;
        board[6][7] = player2.pawn8;

        //print board
        printBoard(board);
        
        //game loop
        while(true){
            //player 1 turn
            System.out.println("Player 1 turn");
            //get input
            selectPiece(board);
            // end turn
            printBoard(board);

        }

    }
    public static void printBoard(Piece[][] board){
        //print the name of piece on each square of board
        System.out.println("  a0 \tb1 \tc2 \td3 \te4 \tf5 \tg6 \th7");
        for(int i = 7; i >= 0; i--){
            System.out.print(i + " ");
            for(int j = 0; j < 8; j++){
                if(board[i][j] == null){
                    System.out.print("\t");
                }else{
                    System.out.print(board[i][j].name + " \t");
                }
            }
            System.out.println();
        }
    }
    public static void makeMove(Piece[][] board, int x, int y, int new_x, int new_y){
        //move piece from x,y to new_x,new_y

        if(board[x][y].moveLegality(new_x, new_y)){
            board[new_x][new_y] = board[x][y];
            board[x][y] = null;
        }
        
    }

    public static void selectPiece(Piece[][] board){
        // Get x,y as input from user
        int x,y;
        Scanner piece_input = new Scanner(System.in);
        System.out.println("Select a piece to move");
        System.out.println("Enter x coordinate");
        x = piece_input.nextInt();
        System.out.println("Enter y coordinate");
        y = piece_input.nextInt();
        // select piece at x,y
        Piece selectedPiece = board[x][y];
        if(selectedPiece != null){
            System.out.println("You selected " + selectedPiece.name);
            selectDestination(board, x, y);
        }else{
            System.out.println("You selected an empty square");
            return;
        }
    }

    public static void selectDestination(Piece[][] board, int x, int y){
        // Get x,y as input from user
        int new_x,new_y;
        Scanner piece_input = new Scanner(System.in);
        System.out.println("Select a destination");
        System.out.println("Enter x coordinate");
        new_x = piece_input.nextInt();
        System.out.println("Enter y coordinate");
        new_y = piece_input.nextInt();
        // move piece from x,y to new_x,new_y
        makeMove(board, x, y, new_x, new_y);
    }

}
