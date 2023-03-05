public enum EnumOption {
    BLUE,
    BLACK,
    GRAY,
    RED,
    COTTON,
    SYNTHETIC,
    MAX,
    HOT,
    WARM,
    COLD,
    JACKET,SHORTS,SHIRT,JEANS,SOCKS,
    SPIN(),
    TEMPERATURE;

    EnumOption() {
    }

    EnumOption(int spin) {
        this.spin = spin;
    }

    private int spin;
}
