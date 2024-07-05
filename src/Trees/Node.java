package Trees;

public class Node {
    int data;
    Node right;//self ref structure
    Node left;

    Node(int data) {
        this.data = data;
        this.right = this.left = null
        ;//next=null;
    }
}
