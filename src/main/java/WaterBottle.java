public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int drink() {
        if (this.volume >= 0) {
            this.volume = volume - 10;
        } return volume;

    }

    public void empty(){
        volume = 0;
    }

    public void refill(){
        volume = 100;
    }

}
