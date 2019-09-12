package items;

public enum Pet {

    DRAGON(10),
    CAT(5),
    BAT(2);
    private final int value;

    Pet(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}



