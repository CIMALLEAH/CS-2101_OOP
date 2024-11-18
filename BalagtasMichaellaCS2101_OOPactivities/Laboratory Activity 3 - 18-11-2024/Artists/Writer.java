package Artists;

public class Writer extends Artist {
    private WritingStyle writingStyle;

    // Constructor to initialize name, age, and writing style
    public Writer(String name, String nationality, int age, WritingStyle writingStyle) {
        super(name, nationality, age, "Writing");  // Calling the constructor of the base class
        this.writingStyle = writingStyle;
    }

    // Getter for writingStyle
    public WritingStyle getWritingStyle() {
        return writingStyle;
    }

    // Setter for writingStyle
    public void setWritingStyle(WritingStyle writingStyle) {
        this.writingStyle = writingStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nWriter's Info:");
        System.out.println("Artist Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Nationality: " + getNationality());
        System.out.println("Specialty: " + getSpecialty());
        System.out.println("Writing Style: " + writingStyle);
    }

    public enum WritingStyle {
        FICTION,
        NONFICTION,
        POETRY,
        DRAMA
    }
    
}
