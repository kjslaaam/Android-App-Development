public class Stomach extends Patient {
    String medicalCondition;
    boolean needFeed;

    public Stomach(String name, int age, String medicalCondition) {
        super(name, age);
        this.medicalCondition = medicalCondition;
        this.needFeed = true;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public boolean isNeedFeed() {
        return needFeed;
    }

    public void setNeedFeed(boolean needFeed) {
        this.needFeed = needFeed;
    }
    public void GetStomachInfo()
    {
        System.out.println("Name: Stomach");
        System.out.println("Medical condition: "+this.medicalCondition);
        if(needFeed)
            System.out.println("Need to be fed.");
        else
            System.out.println("No need to be fed.");
    }
    public String Digest()
    {
        if(this.needFeed)
        {
            this.needFeed=false;
            return "Digesting begin...";
        }
        else
            return "No need to be fed.";
    }
}
