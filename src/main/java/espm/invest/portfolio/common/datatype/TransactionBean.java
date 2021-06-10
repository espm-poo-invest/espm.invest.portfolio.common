package espm.invest.portfolio.common.datatype;

public class TransactionBean {

    private String name;
    private double amount;
    private double max;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQtd() {
        return amount;
    }

    public void setQtd(double amount) {
        this.amount = amount;
    }

    public double getLimite() {
        return max;
    }

    public void setLimite(double max) {
        this.max = max;
    }
}
