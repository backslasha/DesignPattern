package example.xiaomi;

import example.phone_criterion.*;

public class XiaoMiFactory extends PhoneFactory {

    @Override
    public ThousandPhone createThousandPhone() {
        return new Redmi3();
    }

    @Override
    public MediumPhone createMediumPhone() {
        return new XiaomiNote3();
    }

    @Override
    public HighEndPhone createHighEndPhone() {
        return new Xiaomi6();
    }

    @Override
    public LuxuryPhone createLuxuryPhone() {
        return new XiaomiMix();
    }

}
