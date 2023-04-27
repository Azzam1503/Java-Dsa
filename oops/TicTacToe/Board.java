package oops.TicTacToe;

public class Board {
    private char board[][];
    private int boardSize = 3;
    public static final int Player_1_wins = 1;
    public static final int Player_2_wins = 2;
    public static final int Draw = 3;
    public static final int Incomplete= 4;
    public static final int Invalid = 5;

    private char p1Symbol, p2Symbol;
    private int count;

    public Board(char p1Symbol, char p2Symbol){
        board = new char[boardSize][boardSize];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                board[i][j]=' ';
            }
        }

        this.p1Symbol = p1Symbol;
        this.p2Symbol = p2Symbol;
    }

    public int move(char symbol, int x, int y){
        if(x<0 || x>=boardSize || y<0 || y>=boardSize  || board[x][y] != ' '){
            return Invalid;
        }

        board[x][y] = symbol;
        count++;

        //For row
        if(board[x][0] == board[x][1] && board[x][0] == board[x][2]){
            return symbol == p1Symbol ? Player_1_wins : Player_2_wins;
        }

        //For column
        if(board[0][y] == board[1][y] && board[0][y] == board[2][y]){
            return symbol == p1Symbol ? Player_1_wins : Player_2_wins;
        }

        //For diagonals
        if(board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]){
            return symbol == p1Symbol ? Player_1_wins : Player_2_wins;
        } 

        if(board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0]){
            return symbol == p1Symbol ? Player_1_wins : Player_2_wins;
        }

        if(count == boardSize * boardSize){
            return Draw;
        }

        return Incomplete;
    }

    public void print(){
        System.out.println("---------------");

        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                System.out.print("| "+board[i][j] + " |");
            }
            System.out.println();
        }

        System.out.println("---------------");
    }
}
