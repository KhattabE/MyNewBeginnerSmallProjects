class Song {

  //Declaring class variables
  String title;
  String artist;
  float duration;
  String genre;
  String mood;
  float x;
  float y;





  //Class constructor
  Song(String tempTitle, String tempArtist, float tempDuration, String tempGenre, String tempMood, float tempX, float tempY) {
    title = tempTitle;
    artist = tempArtist;
    duration = tempDuration;
    genre = tempGenre;
    mood = tempMood;
    x = tempX;
    y = tempY;
  }

  //method to draw the circles
  void circleDisplay() {
    stroke(0);
    ellipse(x, y, duration, duration);
  }


  //Method to show info when hovering over
  void infoHover(float mx, float my, PFont f) {

    //Checks the distance from the circle center (x,y) and checks the diameter(duration) and then findes the radius by dividing the diamter(duration) by 2
    if (dist(mx, my, x, y) < duration / 2) {
      textFont(f);
      fill(0);
      text("Title: " + title + "\nArtist: " + artist + "\nGenre: " + genre +  "\nMood: " + mood, x + 20, y);
    }
  }
}
