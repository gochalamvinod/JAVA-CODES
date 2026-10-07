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

    public void insertFromFirst(int index , Object data){
            if(index==0){
                addFirst(data);
            }
            else if(index==length-1){
                addLast(data);
            }
            else if(index<length){
                temp = new Node(data);
                Node temp_head = head;
                Node temp_tail = tail;
                for(int i = 0 ; i<index ;i++){
                    temp_head = temp_head.nextNode;
                }
                for(int j = length ; j > index ; j--){
                    temp_tail = temp_tail.previousNode;
                }
                temp.nextNode = temp_head;
                temp.previousNode = temp_tail;
                temp_tail.nextNode = temp;
                temp_head.previousNode = temp;
                if(index == 0){
                    head = temp;
                }
                length++;
            }
            else{
                System.out.println("Index OutOfBound");
            }
        }

    public void insertFromLast(int index , Object data){

            if(index==0){
                addFirst(data);
            }
            else if(index==length-1){
                addLast(data);
            }
            else if(index<length){
            temp = new Node(data);
            Node temp_head = head;
            Node temp_tail = tail;
            for(int i = 0 ; i<index ;i++){
                temp_head = temp_head.nextNode;
            }
            for(int j = length ; j > index ; j--){
                temp_tail = temp_tail.previousNode;
            }
            temp.nextNode = temp_head;
            temp.previousNode = temp_tail;
            temp_tail.nextNode = temp;
            temp_head.previousNode = temp;
            if(index == 0){
                head = temp;
            }
            length++;
        }
        else{
            System.out.println("Index OutOfBound");
        }
    }
    
    public void deleteFirst(){
        head = head.nextNode;
        head.previousNode = null;
        length--;
    }

    public void deleteLast(){
        tail = tail.previousNode;
        tail.nextNode=null;
        length--;
    }

    public void deleteIndex(int index){
        if(index==0){
            deleteFirst();
        }
        else if(index==length-1){
            deleteLast();
        }
        else{
            Node temp_head = head;
            Node temp_tail = tail;
            for(int i = 0 ; i < index ; i++){
                temp_head=temp_head.nextNode 
            }
        }
    }

    public void print(){
        temp=head;
        System.out.println("");
        while(temp!=null){
            System.out.print(temp.data + " => ");
            temp=temp.nextNode;
        }
    }

}