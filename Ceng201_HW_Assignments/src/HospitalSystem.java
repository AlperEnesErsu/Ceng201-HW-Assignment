import java.util.HashMap;

public class HospitalSystem {
    public PatientList patientList; //Stores all the patients
    public TreatmentQueue treatmentQueue; // Manages treatment order
    public DischargeStack dischargeStack; //Stores history of discharged patients

    public HashMap<Integer,Patient> patientMap;

    public HospitalSystem(){
        //Constructor
        this.patientList = new PatientList();
        this.treatmentQueue = new TreatmentQueue();
        this.dischargeStack = new DischargeStack();
        this.patientMap = new HashMap<>();
    }

    public void addPatient(int id, String name, int severity, int age){
        Patient newPatient = new Patient(id, name, severity, age);
        patientList.addPatient(newPatient); //Adding a new patient by using addPatient method
        patientMap.put(id,newPatient);

        System.out.println("Patient is registered in the system: "+ name);

    }

    public void addTreatmentRequest(int patientId,boolean isPriority){
        if (!patientMap.containsKey(patientId)){
            System.out.println("Warning: "+patientId+" patient is not registered!");
            return;
        }
        TreatmentRequest request = new TreatmentRequest(patientId,isPriority);
        treatmentQueue.enqueue(request); //Receive new request by using enqueue method

        System.out.println("Treatment request received. Patient ID: "+patientId+(isPriority? "(Emergency)":"(Normal)"));
    }

    public void processTreatment(){
        TreatmentRequest request = treatmentQueue.dequeue();  //Leaving the queue

        if (request==null){
            System.out.println("There are no patients to treat.");
            return;
        }

        DischargeRecord record = new DischargeRecord(request.patientId);
        dischargeStack.push(record); //Pushing treatment by using push method

        Patient p = patientMap.get(request.patientId);
        if (p!=null){
            System.out.println("Treatment is completed "+p.name+" is discharged");
        }else{
            System.out.println("Treatment is completed, ID: "+ request.patientId+" Patient is discharged");
        }
    }

    public void sortPatients() {
        patientList.sortPatientBySeverity(); //Sorting patients
    }

    public void printSystemState(){
        System.out.print("----------System Report----------");

        System.out.println("\n1-)Admitted Patient List: ");
        patientList.printList();

        System.out.println("\n2-)Waiting Treatment Queue: ");
        treatmentQueue.printQueue();

        System.out.println("\n3-)Discharge History: ");
        dischargeStack.printStack();

        System.out.println("---------------------------------");

    }
}
