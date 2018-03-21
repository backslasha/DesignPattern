package pro;

import example.huawei.Honor6S;
import example.meizu.MeilanNote5;
import example.phone_criterion.ThousandPhone;
import example.xiaomi.Redmi3;

public class PhoneAccess {
//    private static final String brand = "xiaomi";
//    private static final String brand = "huawei";
    private static final String brand = "meizu";

    public static ThousandPhone getThousandPhone() {
        ThousandPhone phone = null;
        switch (brand){
            case "xiaomi":
                phone = new Redmi3();
                break;
            case "huawei":
                phone = new Honor6S();
                break;
            case "meizu":
                phone = new MeilanNote5();
                break;
        }
        return phone;
    }
}
