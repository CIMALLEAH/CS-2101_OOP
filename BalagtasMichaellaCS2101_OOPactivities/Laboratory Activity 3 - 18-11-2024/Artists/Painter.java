package Artists;

public class Painter extends Artist {
    private Medium medium;

    public Painter(String name, String nationality, int age, Medium medium) {
        super(name, nationality, age, "Painting");
        this.medium = medium;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nPainter's Info:");
        System.out.println("Artist Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Nationality: " + getNationality());
        System.out.println("Specialty: " + getSpecialty());
        System.out.println("Medium: " + medium);
    }

    public enum Medium {
        OIL,
        WATERCOLOR,
        ACRYLIC,
        PENCIL,
        CHARCOAL
    }
}
