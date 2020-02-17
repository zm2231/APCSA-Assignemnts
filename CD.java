
import java.text.NumberFormat;

public class CD
 {
  private String title, artist;
  private double cost;
  private int track;
  
  public CD (String title, String artist, double cost, int track)
  {
   this.title = title;
   this.artist = artist;
   this.cost = cost;
   this.track = track;
  }
  
  public String toString()
  {
   NumberFormat fmt = NumberFormat.getCurrencyInstance();
   
   String description;
   
   description = fmt.format(cost) + "\t" + track + "\t" + title + "\t" + artist;
   
   return description;
  }
  
  public String getArtist() {
   return artist;
  }
  
  public String getTitle() {
   return title;
  }
  
  public String play() {
  
   return ("Singing in " + artist + "'s voice: humm humm humm");
  
  }
  
  
 }
