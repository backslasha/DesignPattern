package example.xiaomi;

import example.phone_criterion.ThousandPhone;

public class Redmi3 extends ThousandPhone {
    private final String mSpecification = "3GB 内存 + 32GB 闪存\n" +
            "MTK Helio X20 10核 最高主频 2.1GHz\n" +
            "Mali T880 MP4 700MHz";

    @Override
    public String getSpecification() {
        return mSpecification;
    }

    @Override
    public String toString() {
        return mSpecification;
    }
}
