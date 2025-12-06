/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session5.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author khoac
 */
public class Graph {

    Map<Integer, Vertex> map;

    public Graph() {
        this.map = new HashMap<>();
    }

    public Vertex addVertex(Integer id) {
        this.map.putIfAbsent(id, new Vertex(id));
        return this.map.get(id);
    }

    public void addEdge(Integer id1, Integer id2) {
        Vertex v1 = this.addVertex(id1);
        Vertex v2 = this.addVertex(id2);
        v1.list.add(v2);
    }

    public void show() {
        for (Integer id : this.map.keySet()) {
            System.out.printf("%d: ", id);
            System.out.println(this.map.get(id).list);
        }
    }

    public List<Vertex> BFS(Vertex root) {
        List<Vertex> visitedList = new LinkedList<>();
        Queue<Vertex> queue = new LinkedList<>();
        visitedList.add(root);
        queue.add(root);
        while (!queue.isEmpty()) {
            Vertex vertex = queue.remove();
            for (Vertex v : vertex.list) {
                if (!visitedList.contains(v)) {
                    visitedList.add(v);
                    queue.add(v);
                }
            }
        }
        return visitedList;
    }

    public List<Vertex> DFS(Vertex root) {
        List<Vertex> visitedList = new LinkedList<>();
        Stack<Vertex> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Vertex vertex = stack.pop();
            if (!visitedList.contains(vertex)) {
                visitedList.add(vertex);
                for (Vertex v : vertex.list) {
                    stack.push(v);
                }
            }
        }
        return visitedList;
    }
}
