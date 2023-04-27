package oops.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    private Player player1, player2;
    private Board board;

    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.startGame();
    }

    public void startGame(){
        Scanner sc = new Scanner(System.in);
        //Player Input
        player1 = takPlayerInput(1);
        player2= takPlayerInput(2);
        while(player1.getSymbol() == player2.getSymbol()){
            System.out.println("Symbol already taken!! Pick another symbol");
            char symbol = sc.next().charAt(0);
            player2.setSymbol(symbol);
        }

        //create Board
        board = new Board(player1.getSymbol(), player2.getSymbol());

        //Conduct the game
        boolean player1Turn = true;
        int status = Board.Incomplete;
        while(status ==  Board.Incomplete || status == Board.Invalid){
            if(player1Turn){
                System.out.println("Player 1 " + player1.getName() + "'s turn");
                System.out.println("Enter x: ");
                int x = sc.nextInt();
                System.out.println("Enter y: ");
                int y = sc.nextInt();

                status = board.move(player1.getSymbol(), x,y);
                if(status != Board.Invalid){
                    player1Turn = false;
                    board.print();
                }else{
                    System.out.println("Invalid Move !! Try again");
                }

            }else{
                System.out.println("Player 2 " + player2.getName() + "'s turn");
                System.out.println("Enter x: ");
                int x = sc.nextInt();
                System.out.println("Enter y: ");
                int y = sc.nextInt();

                status = board.move(player2.getSymbol(), x,y);
                if(status != Board.Invalid){
                    player1Turn = true;
                    board.print();
                }else{
                    System.out.println("Invalid Move !! Try again");
                }
            }
        }
        if(status == Board.Player_1_wins){
            System.out.println("Player 1 - " + player1.getName() + " wins !!");
        }else if(status == Board.Player_2_wins){
            System.out.println("Player 2 - " + player2.getName() + " wins !!");
        }else{
            System.out.println("Draw !!");
        }

    }

    private Player takPlayerInput(int num){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player " + num +" name: ");
        String name = sc.nextLine();

        System.out.println("Enter Player " + num + " symbol: ");
        char symbol = sc.next().charAt(0);

        Player p = new Player(name, symbol);
        return p;
    }
}
 