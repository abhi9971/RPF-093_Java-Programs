public class AppendLinkedList {
    
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
            
            appendList(30);
            
            appendList(70);
            
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

    public static void appendList(int data) {
        
        Node newNode = new Node(data);
        
        newNode.next = null;

        if(head == null) {
            
            head = newNode;
        }
        
        else {
            
            Node currentNode = head;
            
            while(currentNode.next != null) {
                
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
}
