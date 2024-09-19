public class Main{

	public static void main(String []arg){

		Artist a = new Artist("Aleesha");
		Artwork art1 = new Artwork("Sea",2024, a);
		art1.display();
		Artwork art2 = new Artwork("Sky",2023);
		art2.display();
	}


}