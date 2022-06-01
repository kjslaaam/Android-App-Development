public class Heart extends Patient{
    String medicalCondition;
    int heartRate;

    public Heart(String name, int age, String medicalCondition, int heartRate) {
        super(name, age);
        this.medicalCondition = medicalCondition;
        this.heartRate = heartRate;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
        System.out.println("Heart rate changed to "+this.heartRate);
    }
    public void GetHeartInfo()
    {
        System.out.println("Name: Heart");
        System.out.println("Medical Condition: "+this.medicalCondition);
        System.out.println("Heart rate: "+ this.heartRate);
    }
}
