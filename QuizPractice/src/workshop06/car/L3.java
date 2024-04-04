package workshop06.car;

public class L3 extends Car implements Temp {
    public L3() {
        super();
    }

    public L3(String name, String engine, int oilTank, int oilSize, int distance) {
        super(name, engine, oilTank, oilSize, distance);
    }

    @Override
    public int getTempGage() {
        return getDistance()/10;
    }

    @Override
    public void go(int distance) {
        setDistance(getDistance()+distance);
        int minus = distance / 10;
        this.setOilSize(getOilSize() - minus);
    }

    @Override
    public void setOil(int oilSize) {
        setOilSize(getOilSize()+oilSize);
    }
}
