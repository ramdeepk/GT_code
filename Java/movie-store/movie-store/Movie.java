public abstract class Movie {

    private String name;
    private String genre;

    public Movie(String name) {
        this(name, "Comedy");
    }

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public abstract int getPrice();

    public String toString() {
        return this.name;
    }

    public boolean equals(Object other) {
        return (this.name.equals(((Movie) other).name)) ? true : false;
    }
}
