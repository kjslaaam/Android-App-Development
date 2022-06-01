public class Skin extends Patient{
    String medicalCondition;

    public Skin(String name, int age, String medicalCondition) {
        super(name, age);
        this.medicalCondition = medicalCondition;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }
    public void GetSkinInfo()
    {
        System.out.println("Name: Skin");
        System.out.println("Medical Condition: "+this.medicalCondition);
    }
}
