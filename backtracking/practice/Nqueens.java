package backtracking.practice;

public class Nqueens {

    public static boolean isSafe(int board[][], int row, int col, int n){
        for(int i = row-1, j = col - 1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 1){
                return false;
            }
        }

        for(int i = row -1, j = col+1; i>=0 && j<n; i--, j++){
            if(board[i][j] == 1){
                return false;
            }
        }

        for(int i = row  + 1, j = col-1; i<0 && j>=0; i++, j--){
            if(board[i][j] == 1){
                return false;
            }
        }

        for(int i = row  + 1, j = col+1; i<n && j<n; i++, j++){
            if(board[i][j] == 1){
                return false;
            }
        }

        for(int i = row - 1; i>=0; i--){
            if(board[i][col] == 1){
                return false;
            }
        }

        for(int i = row + 1; i<n; i++){
            if(board[i][col] == 1){
                return false;
            }
        }


        return true;
    }

    public static void placeQueen(int board[][], int row, int n){
        if(row == n){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for(int col=0; col<n; col++){
            if(isSafe(board, row, col, n)){
                board[row][col] = 1;
                placeQueen(board, row+1, n);
                board[row][col] = 0; 
            }
        }

    }

    public static void NQueens(int n){
        int borad[][] = new int[n][n];
        placeQueen(borad, 0, n);
    }

    public static void main(String[] args) {
        NQueens(4);
    }
}
