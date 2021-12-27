package enums;

public enum BodyPart {
    PAW(" лапка"),
    MOUTH(" рот"),
    EYE(" глаз"),
    HEAD(" голова");

    private String description;
    BodyPart(String description) {
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    @Override
    public String toString() {
        return "Enum.EnumColor{" +
                "description='" + description + '\'' +
                '}';
    }
}
