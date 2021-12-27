package enums;

public enum Emotion {
    NOTFEAR(" не боится "),
    FEAR("страшно "),
    SADNESS("грустно "),
    PITY("жалко "),
    NEUTRAL(" ");
    
    private String description;
    Emotion(String description) {
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
