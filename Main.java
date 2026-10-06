import java.util.*;

class Node{
    Object data;
    Node nextNode=null;
    Node(){
    }
    Node(Object data){
        this.data=data;
    }
}
class MyLinkedList{
    Integer length=0;
    Node LinkedListNode;
    //////////////////////   CONSTRUCTORS   //////////////////////////
    MyLinkedList(Object data){
        LinkedListNode = new Node(data);
        length++;
    }
    MyLinkedList(){
        LinkedListNode = new Node();
    }
    /////////////////////////////////////////////////////////////////
    public void addLast(Node source , Object data){
        if(source.nextNode==null){
            source.nextNode=new Node(data);
            length++;
        }
        else{
            addLast(source.nextNode,data);
        }
    }
    public void addLast(Object data){
        addLast(LinkedListNode,data);
    }
    ///////////////////////////////////////////////////////////////////
    public void print(){
        Node temp=LinkedListNode;
        while(temp!=null){
            System.out.print(temp.data + " => ");
            temp = temp.nextNode;
        }
    }
    ///////////////////////////////////////////////////////////////////
    public void delete(Node source ,Object data){
        if(source.nextNode.data==data){
            source.nextNode=source.nextNode.nextNode;
            length--;
        }
        else{
            delete(source.nextNode,data);
        }
    }
    public void delete(Object data){
        delete(LinkedListNode,data);
    }

}

public class Main{
    public static void main(String args[]){
        MyLinkedList vinod = new MyLinkedList(55);
        vinod.addLast("Vinod");
        vinod.addLast(30);
        vinod.addLast(340.35);
        vinod.addLast(true);
        System.out.println(vinod.length);
        vinod.print();
        vinod.delete(30);
        System.out.println(vinod.length);
        vinod.print();
    }
}