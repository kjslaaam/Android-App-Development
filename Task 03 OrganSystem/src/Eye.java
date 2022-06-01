public class Eye extends Patient {
    String name;
    String medicalCondition;
    String colour;
    boolean isClosed;
    public Eye(String name, int age, String name1, String medicalCondition, String colour) {
        super(name, age);
        this.name = name1;
        this.medicalCondition = medicalCondition;
        this.colour = colour;
        this.isClosed=false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void GetEyeInfo()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Medical condition: "+this.medicalCondition);
        System.out.println("Colour: "+this.colour);
    }
    public void OpenEye()
    {
        this.isClosed=false;
        System.out.println(this.name+" eye closed.");
    }
    public void CloseEye()
    {
        this.isClosed=true;
        System.out.println(this.name+" eye closed.");
    }
}
