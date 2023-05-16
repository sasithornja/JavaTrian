package mobile;

public class Iphone extends SmartPhone implements MediaPlayer,GPS{
	public void installApplication(String appName) {
		System.out.println("Install Application : "+appName);
	}
	public String playSong(String songName) {
		return "Song play ~"+songName;
	}
	public String playVideo(String videoname) {
		return "Video play -"+videoname;
	}
	public String getLocation() {
		return "Minburi Bangkok";
	}
}
