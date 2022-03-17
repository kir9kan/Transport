public class AitTransport extends Transport{
    private int wingsFrame;
    private int minRunwayLength;

    public AitTransport(int power, double maxSpeed, int weight, String carBrand, int wingsFrame, int minRunwayLength) {
        super(power, maxSpeed, weight, carBrand);
        this.wingsFrame = wingsFrame;
        this.minRunwayLength = minRunwayLength;
    }

    public int getWingsFrame() {
        return wingsFrame;
    }

    public void setWingsFrame(int wingsFrame) {
        this.wingsFrame = wingsFrame;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }

    public void setMinRunwayLength(int minRunwayLength) {
        this.minRunwayLength = minRunwayLength;
    }
}
