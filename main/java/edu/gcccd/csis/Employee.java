package edu.gcccd.csis;

public class Employee {

    //instance variables
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String orgOneWorksFor;
    private int bDay; private int bMonth; private int bYear;
    private boolean isAlive;

    public Employee(String firstName, String lastName, String jobTitle, String orgOneWorksFor,
                    int bDay, int bMonth, int bYear, boolean isAlive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.orgOneWorksFor = orgOneWorksFor;
        this.bDay = bDay;
        this.bMonth = bMonth;
        this.bYear = bYear;
        this.isAlive = isAlive;
    }

    public Employee (){
        this.firstName=null;
        this.lastName=null;
        this.jobTitle=null;
        this.orgOneWorksFor=null;
        this.bDay=0;
        this.bMonth=0;
        this.bYear=0;
        this.isAlive=false;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getOrgOneWorksFor() {
        return orgOneWorksFor;
    }

    public void setOrgOneWorksFor(String orgOneWorksFor) {
        this.orgOneWorksFor = orgOneWorksFor;
    }

    public int getbDay() {
        return bDay;
    }

    public void setbDay(int bDay) {
        this.bDay = bDay;
    }

    public int getbMonth() {
        return bMonth;
    }

    public void setbMonth(int bMonth) {
        this.bMonth = bMonth;
    }

    public int getbYear() {
        return bYear;
    }

    public void setbYear(int bYear) {
        this.bYear = bYear;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean alive) {
        this.isAlive = alive;
    }

    public boolean getIsOldEnoughToWork(int day, int month, int year){
        if((year-this.bYear>=16)||(year-this.bYear==15 && month-this.bMonth>=1)||(year-this.bYear==15 &&
            month-this.bMonth==0 && day-this.bDay>=0)){
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o){

        if(o instanceof Employee)
        {Employee e = (Employee) o;

        if(this.firstName.equals(e.getFirstName()) && this.lastName.equals(e.getLastName()) &&
                this.getJobTitle().equals(e.getJobTitle()) && this.orgOneWorksFor.equals(e.orgOneWorksFor)
                && this.bDay==e.bDay && this.bMonth==e.bMonth && this.bYear==e.bYear && this.isAlive==e.isAlive)
        {return true;}}
        return false;
    }

    @Override
    public String toString(){
        return String.format(this.firstName+" "+this.lastName+" is a(n) "+this.jobTitle+" @ "+this.orgOneWorksFor
                                +"\nborn on: "+this.bMonth+"/"+this.bDay+"/"+this.bYear);
    }
}
