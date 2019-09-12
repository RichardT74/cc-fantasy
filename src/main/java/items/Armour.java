package items;

public enum Armour {
    CHAIN(5),
    PLATE(10);

    private final int value;

    Armour(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
