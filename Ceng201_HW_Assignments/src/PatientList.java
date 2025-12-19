public class PatientList {

    private class Node {
        Patient data;
        Node next;

        public Node(Patient data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void addPatient(Patient p){
        Node newNode = new Node(p); //Creating new Node
        if (head ==null){
            head= newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current= current.next;//Current is going to last element
            }
            current.next=newNode;//Adding last node where current.next==null
        }
    }

    public void removePatient(int id) {
        if (head==null){
            return;
            }else if (head.data.id==id){
                    head = head.next;
                    return;
                }else{
                    Node current = head;
                    while(current.next!=null){
                        if (current.next.data.id == id){
                            //Find deleting id
                            current.next = current.next.next;
                            return;
                        }
                        current = current.next;
                    }
                }
            }

    public Patient findPatient(int id) {
        Node current = head;

        while (current != null) {
            if (current.data.id == id) {
                System.out.println(id+" is in the patient list");
                return current.data;
            }
            current = current.next;
        }
        System.out.println("Patient does not find");
        return null;
    }

    public void  sortPatientBySeverity(){
        if(head == null || head.next == null){
            return;
        }

        boolean swapped = true;
        while(swapped){
            swapped = false;
            Node current = head;
            
            while(current.next != null){
                if (current.data.severity < current.next.data.severity){
                    Patient temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    
                    swapped = true;
                    //Sorting patients by using severity
                }
                current = current.next;
            }
        }
    }

    public void printList(){
        Node current = head;
        while(current !=null){
            System.out.println(current.data); //Printing list while current != null
            current = current.next;
        }

    }
}

