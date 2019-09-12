package items;

public enum Weapon {
    CLUB(5),
    AXE(10),
    SWORD(15);

    private final int value;

    Weapon(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}