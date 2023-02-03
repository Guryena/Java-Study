package Song;

public class Song {
	String title;
	String artist;
	String album;
	String composer;
	int year;
	String nationality;
	int track;

	public Song(String title, String artist, int year, String nationality) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.nationality = nationality;
		this.track = track;
		this.show();
	}

	void Song() {
		System.out.println("default생성자"); 		
	}
	private void show() {
		System.out.println(year + "년 " + nationality + "국적의 " + artist + "가 부른 " + title);
	}

//	String show() {
//		return (this.year + "년 "+ this.nationality + "국적의 "+this.artist + "가 부른 " + this.title);
//	}
}
