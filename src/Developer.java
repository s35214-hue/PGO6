public class Developer extends Employee {

    private String mainLanguage;
    private int repositoryCount;

    public Developer(String employeeId, String firstName, String lastName, double baseSalary, String mainLanguage, int repositoryCount) {

        super(employeeId, firstName, lastName, baseSalary);
        this.mainLanguage = mainLanguage;
        this.repositoryCount = repositoryCount;


    }
    public String getMainLanguage() {
        return mainLanguage;
    }

    public int getRepositoryCount() {
        return repositoryCount;
    }

    public void addRepository() {
        repositoryCount++;
    }

    public void removeRepository() {
        repositoryCount--;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    @Override
    public double calculateMonthlyCost() {
        return getBaseSalary() + 5*repositoryCount;
    }

    @Override
    public String introduceYourself() {
        return super.introduceYourself() + " I'm a Developer.";
    }

    public String printTechnologies() {
        //I don't really know what this method should print, so I just made it return the developer's main language :/
        return "Technologies: " + "\n" + mainLanguage;

    }

    @Override
    public String toString() {
        return mainLanguage + " Developer - " + repositoryCount + " repositories." + super.toString();
    }



}
