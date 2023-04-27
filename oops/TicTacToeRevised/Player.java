package oops.TicTacToeRevised;

public class Player {
    private String name;
    private char symbol;

    Player(String name, char symbol){
        setName(name);
        setSymbol(symbol);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setSymbol(char symbol){
        this.symbol = symbol;
    }

    public char getSymbol(){
        return this.symbol;
    }
}
