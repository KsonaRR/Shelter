package enums;

public enum Other {
    vaccinated("Привит"),
    serilized ("Стерилизован"),
    castrated("Кастрирован");

    private String title;

    Other(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
