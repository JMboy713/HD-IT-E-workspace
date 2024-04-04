package workshop05.mobile;

public class Otab extends Mobile{
    public Otab() {
    }

    public Otab(String mobileName, int batterySize, String osType) {
        super(mobileName, batterySize, osType);
    }

    @Override
    public int operate(int time) {
        super.setBatterySize(super.getBatterySize()-12*time);
        return super.getBatterySize()-12*time;
    }

    @Override
    public int charge(int time) {
        super.setBatterySize(super.getBatterySize()+8*time);
        return super.getBatterySize() + 8 * time;
    }


}
