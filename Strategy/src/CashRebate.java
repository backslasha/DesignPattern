public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;

    @Override
    double acceptCash(double money) {
        return money * moneyRebate;
    }

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }
}
