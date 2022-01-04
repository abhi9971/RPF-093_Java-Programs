public class DeleteHeadElement {
    private static Node head;

    public static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static void main(String[] args) {
            appendList(56);
            appendList(70);
            insertBetween(56, 30);
            pop();
            printList();
        }
    }

    public static void printList() {
        Node currNode = head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println(currNode);
    }

    public static void insertBetween(int position, int data) {
        Node currentNode = head;
        Node newNode = new Node(data);

        while(currentNode.data != position) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        newNode.next  = currentNode.next;
        currentNode.next = newNode;
    }

    public static void appendList(int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if(head == null)
            head = newNode;
        else {
            Node currentNode = head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public static void pop() {
        Node currentNode = head.next;
        head.next = null;
        head = currentNode;
    }
}