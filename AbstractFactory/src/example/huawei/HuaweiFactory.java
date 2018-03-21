package example.huawei;

import example.phone_criterion.OutOfStock;
import example.phone_criterion.PhoneFactory;
import example.phone_criterion.Phone;

public class HuaweiFactory extends PhoneFactory {
    @Override
    public Phone createThousandPhone() {
        return new Honor6S();
    }

    @Override
    public Phone createMediumPhone() {
        return new OutOfStock();
    }

    @Override
    public Phone createHighEndPhone() {
        return new OutOfStock();
    }

    @Override
    public Phone createLuxuryPhone() {
        return new OutOfStock();
    }
}
