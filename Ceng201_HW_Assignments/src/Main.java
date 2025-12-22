public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   TASK 1 TEST: PATİENT LİST(LİNKED LİST)  ");

        PatientList pList = new PatientList();

        //Adding Patient:
        System.out.println();
        System.out.println("Adding Patients...");
        pList.addPatient(new Patient(1,"John",31,3));
        pList.addPatient(new Patient(2,"Merab",26,6));
        pList.addPatient(new Patient(3,"Tom",28,8));
        pList.addPatient(new Patient(4,"Conor",35,5));
        pList.addPatient(new Patient(5,"Khamzat",32,7));

        //Printing List:
        pList.printList();

        //Deleting Test:
        System.out.println();
        System.out.println("Removing Patient That Id:3");
        pList.removePatient(3);
        pList.printList(); //Id 3 must be deleted.

        //Finding Test:
        System.out.println();
        System.out.println("Finding Patient That Id:5");
        Patient p = pList.findPatient(5);
        System.out.println();
        System.out.println("=================================================");

        System.out.println();
        System.out.println();


        System.out.println("=================================================");
        System.out.println("   TASK2 TEST: TREATMENT QUEUE (PRIORITY)  ");

        TreatmentQueue testQueue = new TreatmentQueue();


        Patient p1 = new Patient(10, "Alper", 22, 7);

        testQueue.enqueue(new TreatmentRequest(10, true));

        Patient p2 = new Patient(11, "Salih", 18, 15);
        testQueue.enqueue(new TreatmentRequest(11, false));

        Patient p3 = new Patient(12, "Yunus", 15, 2);
        testQueue.enqueue(new TreatmentRequest(12, false));

        Patient p4 = new Patient(13, "Ahmet", 16, 4);
        testQueue.enqueue(new TreatmentRequest(13, false));

        Patient p5 = new Patient(14, "Yusuf", 25, 5);
        testQueue.enqueue(new TreatmentRequest(14, true));

        Patient p6 = new Patient(15, "Muhammed", 28, 9);
        testQueue.enqueue(new TreatmentRequest(15, true));

        Patient p7 = new Patient(16, "Pelin", 32, 12);
        testQueue.enqueue(new TreatmentRequest(16, false));

        Patient p8 = new Patient(17, "Göktuğ", 29, 10);
        testQueue.enqueue(new TreatmentRequest(17, false));

        System.out.println("\n--- Queue Before Dequeue ---");
        testQueue.printQueue();

        System.out.println("\nProcessing (Dequeue) 3 Requests...");
        System.out.println();

        //Leaving 3 People In The List
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();


        //Last List
        System.out.println("\n--- Remaining Queue ---");
        testQueue.printQueue();

        System.out.println("=================================================");

        System.out.println();
        System.out.println();

        System.out.println("=================================================");
        System.out.println("            Task3 Discharge Stack                ");

        DischargeStack testStack = new DischargeStack();
        System.out.println();

        System.out.println("Pushing Patients");
        testStack.push(new DischargeRecord(101));
        testStack.push(new DischargeRecord(102));
        testStack.push(new DischargeRecord(103));
        testStack.push(new DischargeRecord(104));
        testStack.push(new DischargeRecord(105));

        testStack.printStack();

        //Pop 3 patients
        testStack.pop();
        testStack.pop();
        testStack.pop();

        //Printing Last List
        testStack.printStack();

        System.out.println("=================================================");

        System.out.println();
        System.out.println();

        System.out.println("=================================================");
        System.out.println(" HOSPİTAL MANAGEMENT SYSTEM (TASK 4 INTEGRATİON) ");
        System.out.println("=================================================");

        HospitalSystem hospital = new HospitalSystem();
        //We are creating a Hospital

        //Adding Patient
        System.out.println("\n>>> 1. Step: 10 Patient Adding The System...");

        // Adding Patient (ID, Name, Age, Severity)
        hospital.addPatient(100, "Ahmet Yilmaz", 17,1);
        hospital.addPatient(101, "Ayse Demir", 18, 8);
        hospital.addPatient(102, "Mehmet Oz", 14, 6);
        hospital.addPatient(103, " Kaya", 20, 8);
        hospital.addPatient(104, "Ali Celik", 26, 4);
        hospital.addPatient(105, "Zeynep Isik",30, 2);
        hospital.addPatient(106, "Caner Erkin", 19, 3);
        hospital.addPatient(107, "Burak Yilmaz",34, 9);
        hospital.addPatient(108, "Volkan Demirel",45 , 5);
        hospital.addPatient(109, "Samet İpek", 32, 4);

        // STEP 2: ADD TREATMENT REQUESTS (5 Normal, 3 Priority)
        System.out.println("\n>>> Step 2: Treatment Requests Are Being Added to the Queue...");

        hospital.addTreatmentRequest(100, false); // Adding First Normal Patient
        hospital.addTreatmentRequest(102, false); // Adding Second Normal Patient
        hospital.addTreatmentRequest(104, false); // Adding Third Normal Patient

        hospital.addTreatmentRequest(101, true);  // Priority 1
        hospital.addTreatmentRequest(103, true);  // Priority 2
        hospital.addTreatmentRequest(108, true);  // Priority 3

        hospital.addTreatmentRequest(106, false); // Normal 4
        hospital.addTreatmentRequest(107, false); // Normal 5

        System.out.println("\n--- Queue Control ---");
        hospital.printSystemState();

        // Step 3: 2 Adding discharge
        System.out.println(">>> STEP 3: Adding Old Discharge Records...");
        //treatmentQueue.dequeue() Works and patient will discharge
        hospital.processTreatment(); // 1. Person Discharge
        hospital.processTreatment(); // 2. Person Discharge

        // Step 4: PROCESS 4 MORE REQUESTS (PROCESS)
        System.out.println("\n>>> Step 4:  PROCESS 4 MORE REQUEST (Dequeue & Stack)...");

        hospital.processTreatment();
        hospital.processTreatment();
        hospital.processTreatment();
        hospital.processTreatment();

        System.out.println("\n>>>Patients sorted by severity (High to Low)..");
        hospital.sortPatients();

        // Step 5: FİNAL RAPOR
        System.out.println("\n>>> Step 5: LATEST STATUS OF THE SYSTEM");
        //Printing System...
        hospital.printSystemState();

        System.out.println("=================================================");
    }
}