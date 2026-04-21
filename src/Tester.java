public class Tester extends Employee {

    private boolean automationTester;
    private int scenarioCount;

    public Tester(String employeeId, String firstName, String lastName, double baseSalary, boolean automationTester, int scenarioCount) {

        super(employeeId, firstName, lastName, baseSalary);
        this.automationTester = automationTester;
        this.scenarioCount = scenarioCount;

    }
    public int getScenarioCount() {
        return scenarioCount;
    }

    public boolean getAutomationTester() {
        return automationTester;
    }

    public void setAutomationTester(boolean automationTester) {
        this.automationTester = automationTester;
    }

    @Override
    public double calculateMonthlyCost() {
        if (automationTester) {
            return getBaseSalary() * 1.15 + 5*scenarioCount;
        } else {
            return getBaseSalary() + 5*scenarioCount;
        }
    }

    @Override
    public String introduceYourself() {
        if (automationTester) {
            return super.introduceYourself() + " I'm an Automation Tester.";
        } else  {
            return super.introduceYourself() + " I'm a Tester.";
        }
    }

    @Override
    public String toString() {
        if (automationTester) {
            return "Automation Tester - " + scenarioCount + " scenarios." + super.toString();
        } else {
            return "Tester - " + scenarioCount + " scenarios." + super.toString();
        }
    }
    public void runTestingReport() {

        System.out.println("Testing report: " + "\n" + "Scenarios ran: " + scenarioCount);

    }
}
