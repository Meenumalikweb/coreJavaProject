package javaAssignment;

public class Family {

    private String fatherName, motherName, sonName, daughterName;
    private double fatherSalary, motherSalary, sonFee, daughterFee;
    private int grocery = 500;
    double savings;


    public Family(String fatherName, String motherName, String sonName, String daughterName, double fatherSalary, double motherSalary, double sonFee, double daughterFee) {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.sonName = sonName;
        this.daughterName = daughterName;
        this.fatherSalary = fatherSalary;
        this.motherSalary = motherSalary;
        this.sonFee = sonFee;
        this.daughterFee = daughterFee;
    }
    public String getFatherName(){
        return fatherName;
    }
    public String getMotherName(){
        return motherName;
    }
    public String getSonName(){
        return sonName;
    }
    public String getDaughterName(){
        return daughterName;
    }
    public String displayNames(){
        return "Father Name: "+getFatherName()+"\n"+"Mother Name: "+getMotherName()+"\n"+"Son Name: "+getSonName()+"\n"+"Daughter Name: "+getDaughterName();
    }

    public double getTotalSalary(){
        return fatherSalary+motherSalary;
    }

    public double getTotalFee(){
        return sonFee+daughterFee;
    }
    public double getSavings(){
        savings = getTotalSalary()-getTotalFee()-grocery;
        return savings;
    }
    public void checkSavings(){
        if (getSavings() > 1000){
            System.out.println("Congratulations!"+fatherName+" saved "+savings+".");
        }
        else{
            System.out.println("Dear "+fatherName+" please try to save from next month!");
        }
    }
}
