public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    boolean isPriority;
    //Requirements for TreatmentRequests

    public TreatmentRequest(int patientId, boolean isPriority){
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
        this.isPriority = isPriority;
    }

    public String toString(){
        return "Patient Id: "+patientId+"\nArrival Time: "+arrivalTime+"\nPriority: "+(isPriority ? "Yes":"No");
    }

}
