package enumaration;

public enum Seasons {
    SUMMER("Summer",24, 12),
    SPRING("Spring",20,98),
    AUTUMN("Autumn",16,123),
    WINTER("Winter",7,45);

    private String name;
    private int averageTemp;
    private int mmRain;

    Seasons(String name, int averageTemp, int mmRain) {
        this.name = name;
        this.averageTemp = averageTemp;
        this.mmRain = mmRain;
    }
}
