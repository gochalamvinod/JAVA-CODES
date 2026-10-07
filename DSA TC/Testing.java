public class Testing{
    public static void main(String args[]){
        // DemoSingleLinkedList vinod = new DemoSingleLinkedList(12);
        // vinod.addLast(200);
        // vinod.addLast(100);
        // vinod.addFirst(10);
        // vinod.print();
        DemoDoubleLinkedList vinod = new DemoDoubleLinkedList(34);
        vinod.addFirst(200);
        vinod.addFirst(200);
        vinod.addLast(57);
        vinod.insert(2,69);
        vinod.print();
        // System.out.print(vinod.length);


    }
}