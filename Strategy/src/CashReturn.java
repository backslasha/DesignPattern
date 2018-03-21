public class CashReturn extends CashSuper {

    double moneyCondition = 0.0d;
    double moneyReturn = 0.0d;


    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    double acceptCash(double money) {
        if (money > moneyCondition)
            return money - Math.floor(money / moneyCondition) * moneyReturn;
        return money;
    }
}
