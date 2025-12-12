public class Main {
    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println("   HOSPİTAL MANAGEMENT SYSTEM (TASK 4 INTEGRATİON)  ");
        System.out.println("=================================================");

        HospitalSystem hospital = new HospitalSystem();
        //We are creating a Hospital

        //Adding Patient
        System.out.println("\n>>> 1. Step: 10 Patient Adding The System...");

        // Adding Patient (ID, Name, Severity, Age)
        hospital.addPatient(100, "Ahmet Yilmaz", 3, 30);
        hospital.addPatient(101, "Ayse Demir", 8, 45);
        hospital.addPatient(102, "Mehmet Oz", 5, 32);
        hospital.addPatient(103, "Fatma Kaya", 9, 60);
        hospital.addPatient(104, "Ali Celik", 2, 19);
        hospital.addPatient(105, "Zeynep Isik", 6, 28);
        hospital.addPatient(106, "Caner Erkin", 1, 22);
        hospital.addPatient(107, "Burak Yilmaz", 4, 35);
        hospital.addPatient(108, "Volkan Demirel", 7, 50);
        hospital.addPatient(109, "Samet İpek", 2, 24);

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

        //
        System.out.println("\n--- Queue Control ---");
        hospital.printSystemState();

        // Step 3: 2 Adding discharge
        System.out.println(">>> STEP 3: Adding Old Discharge Records...");

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