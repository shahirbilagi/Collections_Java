import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class CollectionList {
    public CollectionList() {
    }

    public static void main(String[] args) {
        arraylistexp a = new arraylistexp();
        a.listExample();
        vectorlist v = new vectorlist();
        v.listExample();
        stackexample s1 = new stackexample();
        s1.stackExample();
        LinkedlistExamlpe l1 = new LinkedlistExamlpe();
        l1.listExample();
    }

    public static class arraylistexp {
        public arraylistexp() {
        }

        public void listExample() {
            ArrayList<Integer> a1 = new ArrayList();
            a1.add(1);
            a1.add(2);
            a1.set(1, 4);
            System.out.println("ArrayList:" + String.valueOf(a1));
        }
    }

    public static class vectorlist {
        public vectorlist() {
        }

        public void listExample() {
            Vector<Integer> v1 = new Vector();
            v1.addElement(4);
            v1.addElement(4);
            v1.addElement(4);
            v1.remove(2);
            System.out.print("Vector:");

            for(Integer i : v1) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static class stackexample {
        public stackexample() {
        }

        public void stackExample() {
            Stack<Integer> s1 = new Stack();
            s1.push(1);
            s1.push(2);
            s1.push(3);
            s1.pop();
            s1.push(3);
            System.out.println("Stack Example:" + String.valueOf(s1));
        }
    }

    public static class LinkedlistExamlpe {
        public LinkedlistExamlpe() {
        }

        public void listExample() {
            LinkedList<String> l1 = new LinkedList();
            l1.add("1");
            l1.add("2");
            l1.add("3");
            l1.add("Shahir");
            l1.removeFirst();
            System.out.println("LinkedList:" + String.valueOf(l1));
        }
    }
}
