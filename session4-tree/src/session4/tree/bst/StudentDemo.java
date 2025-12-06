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
public class StudentDemo {

    public static void main(String[] args) throws Exception {
        BST<Student> tree = new BST<>();
        tree.insert(
                new Student(1, "Cao Do Dang Khoa", 10),
                new Student(2, "Le Duc Thinh", 10),
                new Student(3, "Ho Gia Bao Huy", 10)
        );
        tree.show();
        tree.LNR();
    }
}
