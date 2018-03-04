package edu.gcccd.csis;

public class Organization{

        //instance variables
        private String orgName;
        private int numberOfEmployees;

        public Organization(String orgName, int numberOfEmployees){
            this.orgName=orgName;
            this.numberOfEmployees=numberOfEmployees;
        }

        public Organization(){
            this.orgName=null;
            this.numberOfEmployees=0;
        }

        public String getOrgName() {
            return orgName;
        }

        public void setOrgName(String orgName) {
            this.orgName = orgName;
        }

        public int getNumberOfEmployees() {
            return numberOfEmployees;
        }

        public void setNumberOfEmployees(int numberOfEmployees) {
            this.numberOfEmployees = numberOfEmployees;
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof Organization) {
                Organization org1 = (Organization) o;
                if (this.orgName.equals(org1.getOrgName()) && this.numberOfEmployees == org1.getNumberOfEmployees()) {
                    return true;
                }
            } return false;
        }

        @Override
        public String toString(){
            return String.format("Company: "+orgName+"\n"+"Number of Employees: "+numberOfEmployees);
        }
}
