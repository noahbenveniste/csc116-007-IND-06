/**
 * Object class for movies.
 * @author Jose Quinones
 * @author Noah Benveniste
 */
public class Movie implements Comparable<Movie> {
	
	private String title;
	private String director;
	private int releaseYear;
	
   /**
    * Constructor
    */
	public Movie(String title, String director, int releaseYear) {
		setTitle(title);
		setDirector(director);
		setReleaseYear(releaseYear);
	}
   
   /**
    * Returns the value of the title field.
    * @return title the title field
    */
	public String getTitle() {
		return title;
	}
   
   /**
    * Sets the title field
    */
	public void setTitle(String title) {
		if(title == null)
		{
			throw new IllegalArgumentException("Title cannot be null");
		}
		this.title = title;
	}
   
  /** 
   * Returns the value of the director field.
   * @return director the director field
   */
	public String getDirector() {
		return director;
	}
   
   /**
    * Sets the director field.
    */
	public void setDirector(String director) {
		if(director == null)
		{
			throw new IllegalArgumentException("Director cannot be null");
		}
		this.director = director;
	}

   /**
    * Returns the value of the releaseYear field.
    * @return releaseYear the releaseYear field
    */
	public int getReleaseYear() {
		return releaseYear;
	}

   /**
    * Sets the value of the releaseYear field.
    */
	public void setReleaseYear(int releaseYear) {
		if(releaseYear < 1900 || releaseYear > 2020)
		{
			throw new IllegalArgumentException("Release Year cannot be < 1900 or > 2020");
		}
		this.releaseYear = releaseYear;
	}

   /**
    * Compares the fields of two Movie objects for equality.
    * @return true if all fields are equal, false if one or more fields are not equal or the other object is not of type Movie.
    */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Movie))
			return false;         
		Movie other = (Movie) obj;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (releaseYear != other.releaseYear)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
   
   /**
    * Compares two movie objects based on title, director and release year.
    * @return an integer value representing whether one movie object is greater than,
    * less than or equal to the other. The integer is negative if the first movie object
    * is less than the second, zero if they are equal, and a positive integer if the first
    * object is greater than the second.
    */
   public int compareTo(Movie other) {
       if (!this.title.equals(other.getTitle())) {
           return this.title.compareTo(other.getTitle());
       } else if(!this.director.equals(other.getDirector())) {
           return this.director.compareTo(other.getDirector());
       } else {
           return (this.releaseYear - other.getReleaseYear());
       }
   }
   

   
}
