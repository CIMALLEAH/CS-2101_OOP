package Artists;

public class Dancer extends Artist {
    private DanceStyle danceStyle;

    
    public Dancer(String name, String nationality, int age, DanceStyle danceStyle) {
        super(name, nationality, age, "Dancing");  
        this.danceStyle = danceStyle;
    }

    public DanceStyle getDanceStyle() {
        return danceStyle;
    }

    public void setDanceStyle(DanceStyle danceStyle) {
        this.danceStyle = danceStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nDancer's Info:");
        System.out.println("Artist Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Nationality: " + getNationality());
        System.out.println("Specialty: " + getSpecialty());
        System.out.println("Dance Style: " + danceStyle);

    }

    public enum DanceStyle {
        BALLET,
        HIPHOP,
        JAZZ,
        CONTEMPORARY
    }
    
}
