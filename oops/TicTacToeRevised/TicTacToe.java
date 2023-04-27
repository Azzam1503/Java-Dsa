package oops.TicTacToeRevised;

import java.util.Scanner;

public class TicTacToe {
    Player player1, player2;
    Board board;

    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.startGame();
    }

    public void startGame(){
        Scanner s = new Scanner(System.in);
        //Player Input
        player1 = takeInput(1);
        player2 = takeInput(2);
        while(player1.getSymbol() == player2.getSymbol()){
            System.out.println("Symbol already taken please pick another symbol!!");
            char symbol = s.next().charAt(0);
            player2.setSymbol(symbol);
        }
        //create board
        board = new Board(player1.getSymbol(), player2.getSymbol());


        //Conduct game
        boolean player1Turn = true;
        int status = Board.Incomplete;
        while(status == Board.Incomplete || status == Board.Invalid){
            if(player1Turn){
                System.out.println("Player 1- " + player1.getName() + "'s turn");;
                System.out.println("Enter x");
                int x = s.nextInt();
                System.out.println("Enter y");
                int y = s.nextInt();
                
                status = board.move(player1.getSymbol(), x, y);
                if(status != Board.Invalid){
                    player1Turn = false;
                    board.print();
                }else{
                    System.out.println("Invaid move try again");
                }
            }else{
                System.out.println("Player 2- " + player2.getName() + "'s turn");;
                System.out.println("Enter x");
                int x = s.nextInt();
                System.out.println("Enter y");
                int y = s.nextInt();
                
                status = board.move(player2.getSymbol(), x, y);
                if(status != Board.Invalid){
                    player1Turn = true;
                    board.print();
                }else{
                    System.out.println("Invaid move try again");
                }
            }
        }

        if(status == Board.Player_1_wins){
            System.out.println("Player 1 "+ player1.getName() + " wins");
        }else if(status == Board.Player_2_wins){
            System.out.println("Player 2 "+ player1.getName() + " wins");
        }else{
            System.out.println("Draw");
        }
    }

    private Player takeInput(int num){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter player " + num + " name");
        String name = s.nextLine();
        System.out.println("Enter player " + num + " symbol");
        char symbol = s.next().charAt(0);

        Player p = new Player(name, symbol);
        return p;
    }
}
