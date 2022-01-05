public class DeleteNode  {
    
    public ListNode head;

    public static class ListNode {
        
        public int data;
        
        public ListNode next;

        public ListNode(int data) {
            
            this.data = data;
            
            this.next = null;
        }
        
        public static void main(String[] args) {
            
            DeleteNode  lists = new DeleteNode ();

            lists.head = new ListNode(50);
            
            ListNode secondNode = new ListNode(70);
            
            ListNode thirdNode = new ListNode(30);
            
            lists.head.next = secondNode;
            
            secondNode.next = thirdNode;
            
            System.out.println("before removing any node from the list.");
            
            lists.print();
            
            lists.print();
            
            search(lists, 30);
            
            lists.insert(40,30);
            
            lists.print();
            
            lists.delete(40);
            
            lists.print();
        }
        
        private static void search(DeleteNode lists ,int data) {
            
            ListNode currentNode = lists.head , previousNode = null;
            
            while ( currentNode != null && currentNode.data != data){

                currentNode = currentNode.next;
            }
            
            System.out.println("node is found with data 30 :: "+currentNode.data);
        }

    }

    private void delete(int whatToDelete) {
        
        ListNode currentNode = head, previousNode = null;
        
        while (currentNode != null && currentNode.data != whatToDelete) {
            
            previousNode = currentNode;
            
            currentNode = currentNode.next;

        }
        
        if (currentNode != null) {
            
            System.out.println( whatToDelete+" node deleted successfully..... ");
            
            previousNode.next = currentNode.next;
        }
    }

    private void insert(int whatToInsert, int afterWhatToInsert) {
        
        ListNode currentNode = head;
        
        while (currentNode !=null && currentNode.data != afterWhatToInsert ) {
            
            currentNode = currentNode.next;
        }
        
        currentNode.next = new ListNode(40);
    }

    private void pop(ListNode node, DeleteNode lists) {
        
        ListNode courser = head;
        
        System.out.println("after removing head node from link list.");

    }
    private void print() {
        
        ListNode pointer = head;
        
        while (pointer != null){
            
            System.out.print(pointer.data+ "->");
            
            pointer = pointer.next;

        }
        System.out.println("null");
    }
}
