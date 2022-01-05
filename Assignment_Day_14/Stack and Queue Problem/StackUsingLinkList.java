public class StackUsingLinkList {

    StackNode top;
    
    public class StackNode {
        
        int data;
        
        StackNode node;
    }
    
    public void SStackUsingLinkList() {
        
        this.top = null;
    }
    
    public void push (int number) {
        
        StackNode node = new StackNode();

        node.data = number;
        
        node.node = top;
        
        top = node;
    }

    public boolean isEmpty() {
        
        return top == null;
    }

    public int peek() {
        
        if (!isEmpty()) {

            return top.data;    
        }
        
        else {
            
            System.out.println("stack is empty.");
            
            return -1;
        }

    }
    public void pop() {

        while (top != null) {

            System.out.println("this is peak now :: "+peek());
            
            top = top.node;
            
            System.out.println("one item removed from stack...");
        }
        
        System.out.println("now stack is empty :: ");
    }
    
    public void printStack() {

        StackNode node = top;

        while (node != null) {

            System.out.println( node.data);
            
            node = node.node;

        }
    }


    public static void main(String[] args) {
        
        StackUsingLinkList stackByLinkList = new StackUsingLinkList();

        stackByLinkList.push(56);
        
        stackByLinkList.push(30);
        
        stackByLinkList.push(70);
        
        stackByLinkList.pop();
    }
}
