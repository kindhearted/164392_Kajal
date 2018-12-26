
import java.util.Comparator;

public class MovieDetails implements Comparator<MovieDetails>{

	private String movieName;
	private String leadActor;
	private String leadActories;
	private String genre;
	

	public MovieDetails(String movieName, String leadActor,
			String leadActories, String genre) {
		super();
		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActories = leadActories;
		this.genre = genre;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public String getLeadActories() {
		return leadActories;
	}

	public void setLeadActories(String leadActories) {
		this.leadActories = leadActories;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int compare(MovieDetails arg0, MovieDetails arg1) {
		// TODO Auto-generated method stub
		int result=arg0.movieName.compareTo(arg1.movieName);
		if(result==0)
			return 0;
		else if(result>0)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "[movieName=" + movieName + ", leadActor="
				+ leadActor + ", leadActories=" + leadActories + ", genre="
				+ genre + "]\n";
	}
	
}