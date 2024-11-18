package Artists;

public class Singer extends Artist {
    private Genre genre;

    // Constructor to initialize name, age, and genre
    public Singer(String name, String nationality, int age, Genre genre) {
        super(name, nationality, age, "Singing");  // Calling the constructor of the base class
        this.genre = genre;
    }

    // Getter for genre
    public Genre getGenre() {
        return genre;
    }

    // Setter for genre
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nSinger's Info:");
        System.out.println("Artist Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Nationality: " + getNationality());
        System.out.println("Specialty: " + getSpecialty());
        System.out.println("Genre: " + genre);
    }

    public enum Genre {
        POP,
        ROCK,
        CLASSICAL,
        JAZZ,
        HIPHOP,
        RNB
    }
    
}
