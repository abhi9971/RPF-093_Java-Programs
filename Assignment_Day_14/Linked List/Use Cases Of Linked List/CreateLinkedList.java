public class CreateLinkedList {

    private static Node head;

    public static class Node {

        private int data;
        
        private Node next;

        public Node(int data) {
            
            this.data = data;
            
            this.next = null;
        }

        public static void main(String[] args) {
            
            CreateLinkedList linkedList = new CreateLinkedList();
            
            CreateLinkedList.head = new Node(56);
            
            Node secondNode = new Node(30);
            
            Node thirdNode = new Node(70);
            
            linkedList.head.next = secondNode;
            
            secondNode.next = thirdNode;
            
            printList();
        }
    }


    public static void printList()
    {
        Node currNode = head;

        System.out.print("LinkedList: ");

        while (currNode != null) {
            
            System.out.print(currNode.data + "-->");
            
            currNode = currNode.next;
        }
        
        System.out.println(currNode);
    }
}
