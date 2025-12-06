/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session4.tree.bst;

/**
 *
 * @author khoac
 */
public class Student implements Comparable<Student>{
    int id;
    String name;
    double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", score=" + score + '}';
    }
    
    
}
