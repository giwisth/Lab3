package enums;

public enum Feeling {
    COLD("холодно"),
    NEUTRAL(" ");
    
    private final String description;
    Feeling(String description) {
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
