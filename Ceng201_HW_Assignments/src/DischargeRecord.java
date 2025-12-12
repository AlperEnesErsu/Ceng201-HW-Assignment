public class DischargeRecord {
    int patientId;
    long dischargeTime; //Timestamp of the discharge event

    public DischargeRecord(int patientId){
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }

    public String toString(){
        return "Discharge Id: " + patientId + ", Time: " + dischargeTime;
    }
}
