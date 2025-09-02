//

//Declaring an array of object Song, and initializing the size of the array to 5
Song[] songs = new Song[5];


//HashMap to store key-value pairs, to color the "bar" based on mood
HashMap <String, Integer> moodColors = new HashMap<>();

//Font
PFont  a;

//
boolean hPressed = false;

//
int highlightedIndex = -1; // -1 means nothing is selected



void setup() {
  //size of the canvas
  size(1000, 1000);

  //Font creation
  a = createFont("Arial", 25, true);

  //Instancing the arrays
  songs[0] = new Song("pubg", "Lolo", 340, "HipHop", "chill", 200, 200);
  songs[1] = new Song("Finer Things", "Polo G", 259, "HipHop", "chill", 700, 150);
  songs[2] = new Song("Thriller", "Micheal Jackson", 410, "Pop", "happy", 600, 550);
  songs[3] = new Song("Locked up", "Akon", 210, "R&B", "angry", 800, 850);
  songs[4] = new Song("Deep wounds", "Polo G", 301, "Rap", "sad", 200, 800);

  //Adding key-pair values to hashMap
  moodColors.put("chill", color(209, 223, 246));
  moodColors.put("happy", color(255, 255, 0));
  moodColors.put("angry", color(255, 0, 0));
  moodColors.put("sad", color(0, 0, 139));
}


void draw() {
  //Background
  background(255);

  //For loop to loop through the array
  for (int i = 0; i < songs.length; i++) {
    //Colors the circle based on mood (Using hashMaps)
    fill(moodColors.get(songs[i].mood));
    //Displays the circles
    songs[i].circleDisplay();
    //Shows info about artist,tittle etc when hovering the circle
    songs[i].infoHover(mouseX, mouseY, a);

    //Checks if the button is pressed
    if (hPressed == true) {
      //
      if (i == highlightedIndex) {
        strokeWeight(4);
        stroke(255, 0, 0);
      } else {
        strokeWeight(1);
        stroke(0);
      }
    }
  

  }
}

//Pressing keyboard button method
void keyPressed() {
  if (key == 'h') {
    //sets highLightedIndex to a random index from the array
    highlightedIndex = int(random(0, songs.length));
    hPressed = true;
  }
}
