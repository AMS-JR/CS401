package partC.payroll;

public record Paycheck(double grossPay, double FICA,
                       double state, double local,
                       double medicare, double socialSecurity) {
    public double getNetPay() {
        double netPay = grossPay - (FICA + state + local + medicare + socialSecurity);
        return Math.round(netPay * 100.0) / 100.0;
    }
    public String print(){
        return "Gross Pay: " + grossPay + "\nNet Pay: " + getNetPay();
    }
}
