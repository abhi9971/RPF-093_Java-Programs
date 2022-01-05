class QueueNode {
    
    int data;
    
    QueueNode next;

    public QueueNode(int data) {
        
        this.data = data;
        
        this.next = null;
    }

}
class MyQueue {
    
    QueueNode start, end;

    public void enQueueNumber(int data) {
        
        QueueNode newNode = new QueueNode(56);

        if(end == null) {
            
            end = start = newNode;
        }
        
        else {
            
            end.next = newNode;
            
            end = newNode;
        }
    }
    
    public void deQueue() {
        
        if (start == null) {
            
            System.out.println("queue is empty ::");
        }
        
        QueueNode temp = start;
        
        start = start.next;

        if (start == null ) {
            
            end = null;
        }
    }
}

public class QueueByLinkedList {
    
    public static void main(String[] args) {
        
        System.out.println("******welcome to queue by link list*********");
        
        MyQueue queue = new MyQueue();
        
        queue.enQueueNumber(56);
        
        queue.enQueueNumber(30);
        
        queue.enQueueNumber(70);
        
        queue.deQueue();
        
        System.out.println("********** operations done **********");
    }
    }
