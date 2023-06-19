public class WaterBottle {
    private int currentVolume;
    private int maxVolume;

    public WaterBottle (int currentVolume, int maxVolume) {
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
    }

    public int getVolume(){
        return this.currentVolume;
    }

    public void drink(){
        this.currentVolume -= 10;
    }

    public void empty(){
        this.currentVolume = 0;
    }

    public void fill(){
        this.currentVolume = this.maxVolume;
    }
}
