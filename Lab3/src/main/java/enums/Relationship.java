package enums;

public enum Relationship {
    CLOSEFRIEND(", ближайший друг"),
    BESTFRIEND(", лучший друг"),
    FRIEND(", друг"),
    PARENT(", родитель");

    private String description;
    Relationship(String description) {
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
