
public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        
        int i=0;
        for(Node n = head.next; n!= head; n=n.next){
            i++;
        }
        
        return i;
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        
        for(Node n = head.next; n != head; n=n.next){
            
            System.out.print(n.element+" ");
        }
        System.out.println();
    }
    
    public void backwardprint(){
        
        for(Node n = head.prev; n != head; n=n.prev){
            
            System.out.print(n.element+" ");
        }
        
        System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        
        if(idx < -1 || idx > countNode()+1){
            
            return null;
        }
        
        if(idx == -1){
            
            return head;
        }
        
        if(idx == countNode()+1){
            
            return head;
        }
        
        
        Node n = head.next;
        int i=0;
        for(; n != head; n=n.next, i++){
            
            if(i == idx){
                return n;
            }
        }
        
        return null;
        
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        
        Node n = head.next;
        int i=0;
        for(; n != head; n=n.next, i++){
            
            if(n.element.equals(elem)){
                return i;
            }
        }
        
        return -1;        
        
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        
        if(!(idx < 0)){
            
            Node pred = nodeAt(idx-1);
            
            if(pred != null ){

                Node postNode = new Node(elem, null, null);
                
                postNode.next = pred.next;
                postNode.next.prev = postNode;
                
                pred.next = postNode;
                postNode.prev = pred;
            }
        }
        
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        
        if(index < 0){
            
            return null;
        }
        
        Node pred = nodeAt(index-1);
        Object turn = null;
        if(pred != null){
            
            turn = pred.next.element;
            pred.next = pred.next.next;
            pred.next.prev = pred;
            
            return turn;
        }
        
        return null;
    }
    
}
    
    
    