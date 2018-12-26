
import java.util.ArrayList;
import java.util.Iterator;

public class MovieDetailsList {

	ArrayList<MovieDetails> movies;

	public MovieDetailsList() {
		super();
		if(movies==null)
			movies=new ArrayList<MovieDetails>();
	}
	
	public boolean addMovie(MovieDetails movie){
		
		movies.add(movie);
		
		return true;
	}
	
	public boolean removeMovie(MovieDetails movie){
		return movies.remove(movie);
	}
	
	public void removeAllMovies(){
		movies.clear();
	}
	
	public String findMovieByMovieName(String movieName){
		
		Iterator<MovieDetails> iterator= movies.iterator();
		
		while(iterator.hasNext()){
			MovieDetails movieDetail=iterator.next();
			if(movieName.equals(movieDetail.getMovieName())){
				
				return movieDetail.toString();
			}
		}
		return null;
	}
	
public String findMovieByGenre(String genre){
		
		Iterator<MovieDetails> iterator= movies.iterator();
		
		while(iterator.hasNext()){
			MovieDetails movieDetail=iterator.next();
			if(genre.equals(movieDetail.getGenre())){
				
				return movieDetail.toString();
			}
		}
		return null;
	}

@Override
public String toString() {
	return "[movies=" + movies + "]";
}

	
	
}