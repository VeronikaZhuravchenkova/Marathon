package day10;

public class Test {
    public static void main(String[] args) {
        insertNode(34,new Node());
    }
    public static void insertNode(int value, Node rootNode) {
        Node newnode = new Node();
        if(rootNode == null) {
            rootNode = newnode;
        } else {
            Node currentNode = rootNode;
            Node parentNode;
            while (true) {
                parentNode = currentNode;
                if (value == currentNode.getValue()) {
                    return;
                } else if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeftChild();
                    if (currentNode == null) {
                        parentNode.setLeftChild(newnode);
                        return;
                    }
                }else {
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null) {
                        parentNode.setRightChild(newnode);
                        return;
                    }
                }
            }
        }
    }
}
