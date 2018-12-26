
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieDetailsList movieDetailsList=new MovieDetailsList();
		movieDetailsList.addMovie(new MovieDetails("Dabang","Salman","Sonakshi","Action movie"));
		movieDetailsList.addMovie(new MovieDetails("DDLJ","Shahruk","Kajol","Love Movie"));
		movieDetailsList.addMovie(new MovieDetails("Tiger","Salman Khan","Katrina","Spy movie"));
		movieDetailsList.addMovie(new MovieDetails("Annabell","abc","Annabell","Horror movie"));
		
		System.out.println(movieDetailsList);
		System.out.println(movieDetailsList.findMovieByMovieName("Annabell"));
	}

}