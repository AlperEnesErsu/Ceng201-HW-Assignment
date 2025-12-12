public class Patient {
    int id;
    String name;
    int severity;
    int age;
    //Requirements for patients

    public Patient(int id,String name,int severity,int age) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }
    public String toString(){
        return "ID: " + id + ", İsim: " + name + ", Ciddiyet: " + severity + ", Yaş: " + age;
    }
}
