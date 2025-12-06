/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session5.graph;

import java.util.List;

/**
 *
 * @author khoac
 */
public class Demo {

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 0);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        g.addEdge(5, 1);
        g.show();

        List<Vertex> visitedList = g.BFS(g.map.get(0));
        System.out.println(visitedList);

        visitedList = g.DFS(g.map.get(0));
        System.out.println(visitedList);
    }
}
