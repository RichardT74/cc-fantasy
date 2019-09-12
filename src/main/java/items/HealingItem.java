package items;

public enum HealingItem {
    POTION(20),
    HERBS(5),
    HOLYWATER(10);

    private final int value;

    HealingItem(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
