/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session5.graph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khoac
 */
public class Vertex {

    Integer id;
    Object data;
    List<Vertex> list;

    public Vertex() {
        this.id = null;
        this.data = null;
        this.list = new ArrayList<>();
    }

    public Vertex(Integer id) {
        this.id = id;
        this.data = data;
        this.list = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("%d", id);
    }

}
