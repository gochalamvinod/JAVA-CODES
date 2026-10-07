class Node{
    Object data;
    Node nextNode;
    Node previousNode;
    Node(){
        this.nextNode=null;
        this.previousNode=null;
    }
    Node(Object data){
        this.nextNode=null;
        this.previousNode=null;
        this.data = data;
    }
}

class DemoDoubleLinkedList{
    int length=0;
    Node head , tail , temp ;

    DemoDoubleLinkedList(){
        head=tail=temp=null;
    }

    DemoDoubleLinkedList(Object data){
        head = tail = new Node(data);
        length++;
    }

    public void addFirst(Object data){
        temp = new Node(data);
        head.previousNode=temp;
        temp.nextNode = head;
        head=temp;
        length++;
    }

    public void addLast(Object data){
        temp = new Node(data);
        temp.previousNode=tail;
        tail.nextNode=temp;
        tail=temp;
        length++;
    }

    public void insert(int index , Object data){
        temp = new Node(data);
        
    }
    
    // public void deleteValue(Object data){
    //     temp = head;
    //     while(!temp.data.equals(data)){

    //     }
    // }

    public void print(){
        temp=head;
        while(temp!=null){
            System.out.print(temp.data + " => ");
            temp=temp.nextNode;
        }
    }

}