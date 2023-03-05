import java.util.Arrays;

public class WashingMashine implements Rejim {
    private String brand;
    private String model;
    private double availableWeight;
    private EnumOption color;
    private String status;
    private Clothe[] clothes;
    private int spin;
    private int temperature;


    public WashingMashine() {
    }

    public WashingMashine(String brand, String model, double availableWeight, EnumOption color, Clothe[] clothes, int spin, int temperature) {
        this.brand = brand;
        this.model = model;
        this.availableWeight = availableWeight;
        this.color = color;
        this.clothes = clothes;
        this.spin = spin;
        this.temperature = temperature;
    }

    public WashingMashine(String brand, String model, double availableWeight, EnumOption color, Clothe[] clothes) {
        this.brand = brand;
        this.model = model;
        this.availableWeight = availableWeight;
        this.color = color;
        this.clothes = clothes;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getAvailableWeight() {
        return availableWeight;
    }

    public void setAvailableWeight(double availableWeight) {
        this.availableWeight = availableWeight;
    }

    public EnumOption getColor() {
        return color;
    }

    public void setColor(EnumOption color) {
        this.color = color;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Clothe[] getClothes() {
        return clothes;
    }

    public void setClothes(Clothe[] clothes) {
        this.clothes = clothes;
    }

    public int getSpin() {
        return spin;
    }

    public void setSpin(int spin) {
        this.spin = spin;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void veryDirty() {
        System.out.println("Time of washing is: 120 min");
    }

    @Override
    public void fast30() {
        System.out.println("Time of washing is: 30 min");
    }

    @Override
    public void spin() {
        System.out.println("Time of spining is: 15 min");
    }

    @Override
    public void rinsingSpin() {
        System.out.println("Time of rinsing is: 25 min");
    }

    @Override
    public void cotton() {
        System.out.println("Time of washing is: 50 min");
    }

    @Override
    public void synthetic() {
        System.out.println("Time of washing is: 60 min");
    }

    @Override
    public void handWashingOfWool() {
        System.out.println("Time of washing is: 90 min");
    }

    @Override
    public void kids() {
        System.out.println("Time of washing is: 70 min");
    }

    @Override
    public String toString() {
        return "WashingMashine{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", availableWeight=" + availableWeight +
                ", color=" + color +
                ", status='" + status + '\'' +
                ", clothes=" + Arrays.toString(clothes) +
                ", spin=" + spin +
                ", temperature=" + temperature +
                '}';
    }
}
