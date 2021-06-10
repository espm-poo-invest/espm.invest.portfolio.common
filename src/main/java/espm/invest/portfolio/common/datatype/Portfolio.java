package espm.invest.portfolio.common.datatype;

import java.util.List;

public class Portfolio {
    private String id;
//    private User user;
    private Double balance; //saldo
    private List<StockTransaction> stockTransaction;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<StockTransaction> getStockTransaction() {
        return stockTransaction;
    }

    public void setStockTransaction(List<StockTransaction> stockTransaction) {
        this.stockTransaction = stockTransaction;
    }
}
