package Factory;

abstract class ISP {
    protected int speed;
    abstract void getSpeed();

    public void calculatePrice(int months) {
        System.out.println(speed/months);
    }
}
