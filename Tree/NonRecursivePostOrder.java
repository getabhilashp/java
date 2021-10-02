//very important postorder
// Single stack approach
//Two stack approaches 

import java.util.*;

class Node {
    int data;
    Node leftNode;
    Node rightNode;

    public Node(int data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }
}

class NonRecursivePostOrder {
    public static void main(String args[]) {
        Node root = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Hi Welcome to Binary Search Tree // DS \n 1.ADD \n 2.Non Recursive Inorder\n 3.exit");
            int n = sc.nextInt();
            if (n == 1) {
                int data = sc.nextInt();
                root = add_node(root, data);
            } else if (n == 2) {
                retireval_postrder(root);
                System.out.println("done");
                retireval_postrderII(root);

            } else {
                return;
            }
            /*
             * root = newNode(7); root.leftNode = newNode(8); root.rightNode = newNode(10);
             * root.leftNode.rightNode = newNode(4); root.rightNode.leftNode = newNode(20);
             * root.rightNode.leftNode.rightNode = newNode(21);
             * root.rightNode.leftNode.rightNode.leftNode = newNode(22);
             * root.leftNode.rightNode.leftNode = newNode(2);
             */
            // retireval_preorder(root);
            // sc.close();
        }
    }

    public static Node add_node(Node head, int data) {
        if (head == null) {
            head = newNode(data);
        } else {
            Node temp = head;
            while (true) {
                if (temp.data > data) {
                    if (temp.leftNode == null) {
                        temp.leftNode = newNode(data);
                        break;
                    }
                    temp = temp.leftNode;
                } else {
                    if (temp.rightNode == null) {
                        temp.rightNode = newNode(data);
                        break;
                    }
                    temp = temp.rightNode; // equal and as well as smaller
                }

            }
        }
        return head;

    }

    public static Node newNode(int data) {
        Node node = new Node(data);
        return node;
    }

    public static void retireval_postrder(Node root) {
        if (root == null) {
            System.out.println("==================== Empty Tree ===================");
        } else {
            Stack<Node> st = new Stack<Node>();
            Node temp = root;
            while (true) {
                while (temp != null) {
                    st.push(temp);
                    st.push(temp);
                    temp = temp.leftNode;

                }
                if (st.isEmpty()) {
                    break;
                }
                temp = st.pop();
                if (!st.empty() && st.peek() == temp)
                    temp = temp.rightNode;
                else {
                    System.out.println(temp.data);
                    temp = null;
                }

            }

        }
    }

    public static void retireval_postrderII(Node root) {
        if (root == null) {
            System.out.println("==================== Empty Tree ===================");
        } else {
            Stack<Node> st1 = new Stack<Node>();
            Stack<Node> st2 = new Stack<Node>();

            Node temp = root;
            st1.push(temp);
                while (!st1.isEmpty()) {
                    
                    Node t = st1.pop();
                    if (t.leftNode != null)
                        st1.push(t.leftNode);
                    if (t.leftNode != null)
                        st1.push(t.rightNode);
                    st2.push(t);

                }
                System.out.println("Here");
                while (!st2.isEmpty()) {
                    Node t = st2.peek();
                    System.out.print(t.data + " ");
                    st2.pop();
                }

            

        }

    }
}
