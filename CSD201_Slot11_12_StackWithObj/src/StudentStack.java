
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khoac
 */
public class StudentStack {

    Node top;

    public StudentStack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public void clear() {
        this.top = null;
    }

    void ftraverse(RandomAccessFile f) throws Exception {
        Node p = top;
        while (p != null) {
            f.writeBytes(p.info.toString()); // write data in the node p to the file f
            p = p.next;
        }

        f.writeBytes("\r\n");
    }

    void loadData(int k) {
        String[] a = Lib.readLineToStrArray("data.txt", k);
        String[] b = Lib.readLineToStrArray("data.txt", k + 1);
        String[] c = Lib.readLineToStrArray("data.txt", k + 2);
        String[] d = Lib.readLineToStrArray("data.txt", k + 3);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int age = Integer.parseInt(c[i]);
            double gpa = Double.parseDouble(d[i]);
            push(a[i], b[i], age, gpa);
        }
    }

    public void push(String id, String name, int age, double gpa) {
        Node newNode = new Node(new Student(id, name, age, gpa));
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public Student pop() {
        if (!isEmpty()) {
            Student stu = top.info;
            top = top.next;
            return stu;
        } else {
            System.out.println("Stack is empty!");
            return null;
        }
    }

    public Student peek() {
        if (!isEmpty()) {
            return top.info;
        } else {
            System.out.println("Stack is empty!");
            return null;
        }
    }

    // f1: Load data from file and display all students
    void f1() throws Exception {
        clear();
        loadData(0);
        String fname = "f1.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        ftraverse(f);
        f.close();
    }

    // f2: Add a new student from console input
    void f2() throws Exception {
        clear();
        loadData(0);
        String fname = "f2.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        ftraverse(f);
        //------
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID: ");
        String newId = sc.nextLine();
        System.out.println("Input name: ");
        String newName = sc.nextLine();
        System.out.println("Input age: ");
        int newAge = sc.nextInt();
        System.out.println("Input gpa: ");
        double newGpa = sc.nextDouble();
        push(newId, newName, newAge, newGpa);
        //------
        ftraverse(f);
        f.close();
    }

    // f3: Calculate average GPA of all students (using pop)
    void f3() throws Exception {
        clear();
        loadData(0);
        String fname = "f3.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        ftraverse(f);
        double average = 0;
        //---------
        int count = 0;
        double sum = 0;
        StudentStack stack = this;
        while (!stack.isEmpty()) {
            Student st = stack.pop();
            sum += st.getGpa();
            count++;
        }
        count = (count == 0) ? 1 : count;
        average = sum / count;
        //---------
        f.writeBytes("Average GPA: " + average + "\r\n");
        f.close();

    }
}
