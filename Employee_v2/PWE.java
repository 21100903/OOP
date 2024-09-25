public class PWE extends Employee {

    private int totalpcsFinished;
    private float rateperHr;

    public PWE() {

    }

    
    public PWE(float RatePerHr){
        this.rateperHr = RatePerHr;
    }

    public PWE(int totalpcsFinished, float rateperHr) {
        this.totalpcsFinished = totalpcsFinished;
        this.rateperHr = rateperHr;
    }

    public PWE(int empID, int totalpcsFinished, float rateperHr) {
        super(empID);
        this.totalpcsFinished = totalpcsFinished;
        this.rateperHr = rateperHr;
    }

    public PWE(int empID, String empName, int totalpcsFinished, float rateperHr) {
        super(empID, empName);
        this.totalpcsFinished = totalpcsFinished;
        this.rateperHr = rateperHr;
    }

    public int getTotalpcsFinished() {
        return totalpcsFinished;
    }

    public void setTotalpcsFinished(int totalpcsFinished) {
        this.totalpcsFinished = totalpcsFinished;
    }

    public float getRateperHr() {
        return rateperHr;
    }

    public void setRateperHr(float rateperHr) {
        this.rateperHr = rateperHr;
    }

    public float computeSalary() {
        return totalpcsFinished * rateperHr;
    }


    public void displayEmployee() {
        System.out.println(toString() + computeSalary());
    }

    @Override
    public String toString() {
        return String.format("Employee ID: %d\nEmployee Name: %s\nTotal Pieces Finished: %d\nRate Per Hour: %.2f\n",
            getEmpID(), getEmpName(), totalpcsFinished, rateperHr);
    }
}
