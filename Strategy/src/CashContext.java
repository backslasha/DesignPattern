public class CashContext {
    private CashSuper todayDiscount;

    public CashContext(String type) {
        switch (type) {
            case "NORMAL":
                todayDiscount = new CashNormal();
                break;
            case "REBATE":
                todayDiscount = new CashRebate(0.8);
                break;
            case "RETURN":
                todayDiscount = new CashReturn(300, 100);
                break;
        }
    }

    public double useTodayDiscount(double money) {
        return todayDiscount.acceptCash(money);
    }
}
