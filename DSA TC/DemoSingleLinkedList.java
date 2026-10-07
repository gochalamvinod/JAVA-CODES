class Node{
    Object data;
    Node nextNode=null;
    Node(){
    };
    Node(Object data){
        this.data=data;
        this.nextNode=null;
    }
}

class DemoSingleLinkedList{
    int length=0;
    Node head , tail , temp;
    DemoSingleLinkedList(){
        head = tail=temp= null;
    }
    DemoSingleLinkedList(Object data){
        head = tail = new Node(data);
        length++;
    }
    public void addLast(Object data){
        if(head==null){
            head=tail= new Node(data);
        }
        else{
            temp = new Node(data);
            tail.nextNode = temp;
            tail = temp;
        }
    }
    public void addFirst(Object data){
        if(head==null){
            head=tail=new Node(data);
        }
        else{
            temp = new Node(data);
            temp.nextNode = head;
            head = temp;
        }
    }
    public void deleteIndex(int index){
        //
    }
    public void deleteValue(int index){
        //
    }
    public void print(){
        temp=head;
        while(temp!=null){
            System.out.print(temp.data + "=>");
            temp=temp.nextNode;
        }
        //
    }
    public void sort(){
        //
    }
}

