package graphs.revision;

import java.util.*;

public class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();

    public DisjointSet(int n) {
        for (int i = 0; i <= n; i++) {
            parent.add(i);
            rank.add(0);
        }
        ;
    };

    public int findParent(int node) {
        if (parent.get(node) == node) {
            return node;
        }
        ;
        int ultimateParent = findParent(parent.get(node));
        parent.set(node, ultimateParent);
        return ultimateParent;
    };

    public void unoin(int n1, int n2) {
        int ulp1 = findParent(n1);
        int ulp2 = findParent(n2);

        if (ulp1 == ulp2)
            return;

        int ulp1Rank = rank.get(ulp1);
        int ulp2Rank = rank.get(ulp2);

        if (ulp1Rank < ulp2Rank) {
            parent.set(ulp1, ulp2);
        } else if (ulp1Rank > ulp2Rank) {
            parent.set(ulp2, ulp1);

        } else {
            parent.set(ulp2, ulp1);
            rank.set(ulp1, rank.get(ulp1) + 1);
        }

    };

    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(7);
        ds.unoin(1, 2);
        ds.unoin(2, 3);
        ds.unoin(4, 5);
        ds.unoin(6, 7);
        ds.unoin(5, 6);

        if (ds.findParent(1) == ds.findParent(2)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
        ;

        if (ds.findParent(1) == ds.findParent(6)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
        ;

        ds.unoin(3, 6);

        if (ds.findParent(1) == ds.findParent(6)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
        ;
    }
}
