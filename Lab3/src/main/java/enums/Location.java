package enums;

public enum Location {
    FOREST ("Лес"),
    RABBITHOUSE("Дом Кролика"),
    KENGAHOUSE("Дом Кенги"),
    UNKNOWN(" "),
    POOHHOUSE("Дом Пуха");
   
    private String description;
    Location(String description) {
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
