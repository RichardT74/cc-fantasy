package items;

public enum Spell {
    LIGHTNING(10),
    DEATHRAY(30),
    FIREBALL(5);

    private final int value;

    Spell(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
