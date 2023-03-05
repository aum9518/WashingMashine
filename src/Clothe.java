import java.security.PrivateKey;

public class Clothe {
    private EnumOption name;
    private EnumOption color;
    private double wight;
    private EnumOption textile;
    private EnumOption temperature;

    public EnumOption getName() {
        return name;
    }

    public void setName(EnumOption name) {
        this.name = name;
    }

    public EnumOption getColor() {
        return color;
    }

    public void setColor(EnumOption color) {
        this.color = color;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public EnumOption getTextile() {
        return textile;
    }

    public void setTextile(EnumOption textile) {
        this.textile = textile;
    }

    public EnumOption getTemperature() {
        return temperature;
    }

    public void setTemperature(EnumOption temperature) {
        this.temperature = temperature;
    }

    public Clothe(EnumOption name, EnumOption color, double wight, EnumOption textile, EnumOption temperature) {
        this.name = name;
        this.color = color;
        this.wight = wight;
        this.textile = textile;
        this.temperature = temperature;
    }

    public Clothe() {
    }

    @Override
    public String toString() {
        return "Clothe{" +
                "name=" + name +
                ", color=" + color +
                ", wight=" + wight +
                ", textile=" + textile +
                ", temperature=" + temperature +
                '}';
    }
}
