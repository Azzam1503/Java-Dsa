package Trees;

import java.util.ArrayList;

public class Tree<T> {
    T data;
    ArrayList<Tree<T>> children;

    Tree(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}
