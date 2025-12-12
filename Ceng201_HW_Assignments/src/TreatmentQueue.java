public class TreatmentQueue {

    public Node head;
    public Node tail;

    public class Node {
        TreatmentRequest data;
        Node next;

        public Node(TreatmentRequest data){
          this.data=data;
          this.next=null;
        }
    }

    public void enqueue(TreatmentRequest request){
        //Adding request inside treatment request
        Node newNode = new Node(request);

        if(head ==null){
            head=newNode;
            tail=newNode;
            return;
        } else if (!request.isPriority) {
            tail.next = newNode;
            tail = newNode;
            return;
        } else if (!head.data.isPriority) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null && current.next.data.isPriority){
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;

            if (newNode.next == null){
                tail = newNode;
            }
        }
    }

    public TreatmentRequest dequeue() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return null;
        }

        TreatmentRequest processedRequest = head.data;
        head = head.next;
        // We change head then last head deleting by garbage collector.
        if (head == null) {
            tail = null;
        }

        return processedRequest;
    }

    public int size(){
        int count=0;
        Node current = head;

        while (current!=null){
            count++; //Size increasing while current!=null
            current=current.next;
        }
        return count;
    }

    public void printQueue(){
        if (head==null) {
            System.out.println("Queue is empty");
        }
        Node current = head;
        System.out.println("Queue List: \n");
        while (current!=null){
            //Printing queue while current!=null
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println("--------------------------------");
    }

}

