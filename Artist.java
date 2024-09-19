public class Artist{
	private String name;
	
	Artist(String name){
	
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void displayinfo(){
		System.out.println("Artist Name: "+name);
	}

}