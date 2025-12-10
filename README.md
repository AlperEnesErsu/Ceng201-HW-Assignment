# Hospital Management System 🏥

This project is a **Hospital Management System** developed as part of the **CENG 201 (Data Structures)** course assignment. It simulates a hospital environment using fundamental data structures in Java without using built-in collection classes (except HashMap).

## 🚀 Features

* **Patient Management (Linked List):** Stores admitted patients dynamically.
* **Treatment Queue (Priority Queue):** Manages treatment requests.
* **Priority Logic:** Emergency patients skip the line and are placed ahead of normal patients but behind existing emergency cases.
* **Discharge History (Stack - LIFO):** Tracks discharged patients. The most recently discharged patient is accessed first.
* **Fast Access (HashMap):** Uses `HashMap` for O(1) access to patient details by ID.
* **Sorting (Bubble Sort):** Sorts patients by severity level (High to Low).

## 📂 Project Structure

* `Main.java` -> Contains the test scenario (Task 4 Integration).
* `HospitalSystem.java` -> The central controller that integrates List, Queue, and Stack.
* `PatientList.java` -> Custom Singly Linked List implementation.
* `TreatmentQueue.java` -> Custom Queue implementation with **Priority Support**.
* `DischargeStack.java` -> Custom Stack implementation.
* **Data Classes:** `Patient.java`, `TreatmentRequest.java`, `DischargeRecord.java`.

## 👤 Author

**Alper Enes Ersü**
* **Student ID:** 230444040
* **Course:** CENG 201 - Data Structures
