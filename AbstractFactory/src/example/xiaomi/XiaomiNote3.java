package example.xiaomi;

import example.phone_criterion.MediumPhone;

public class XiaomiNote3 extends MediumPhone {
    private final String mSpecification = "主屏尺寸：5.5英寸主屏分辨率：1920x1080像素后置摄像头：双1200万像素前置摄像头：1600万像素电池容量：3500mAh电池类型：暂无数据核心数：暂无数据CPU型号：高通 骁龙660CPU频率：2.2GHzROM容量：64GB/128GB内存：6GB屏幕密度：401ppi重量：163g";

    @Override
    public String getSpecification() {
        return mSpecification;
    }

    @Override
    public String toString() {
        return mSpecification;
    }
}
