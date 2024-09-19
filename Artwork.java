public class Artwork{

	private String title;
	private int year;
	private Artist artist;

	Artwork(String title, int year, Artist artist){

		this.title=title;
		this.year=year;
		this.artist= artist;	
	}
	Artwork(String title, int year){
		this.title=title;
		this.year=year;
		artist= new Artist("Unknown Artist");
		
	}

	public void setTitle(String title){
		this.title= title;
	}
	public void setYear(int year){
		this.year=year;
	}
	public String getTitle(){
		return title;
	}
	public int getYear(){
		return year;
	}

	public Artist getArtist(){
		return artist;
	}
	public void display(){
		System.out.println("Artwork Title: "+title);
		System.out.println("Year: "+year);
		System.out.println("Artist: "+artist.getName());

	}

}