//Global Scope

//Declaring an array of Song objects
Song[] songs = new Song[10];

//RGB variables
float r = random(0, 255);
float g = random(0, 255);
float b = random(0, 255);

//Declaring a hashMap
HashMap <String, Integer> colorGenre = new HashMap<>();

//declaring and intializing a variable of data type int, and assigning it the value -1
int highlightedIndex = -1;  // -1 means no song is selected yet

//Fonts
PFont a;

//Boolean for key pressing
boolean dPressed = false;
boolean hPressed = false;

// Tracks how many songs are currently in the playlist
int activeSongs = 6; 



void setup() {
  //size of the canvas
  size(1000, 1000);

  //Creates a font
  a = createFont("Arial", 16, true);


  //Adding values to every array index
  songs[0] = new Song("RockNRoll", "Mojo Jojo", 195, "Rock");
  songs[1] = new Song("Pop Star", "Swifting Taylor", 60, "Pop");
  songs[2] = new Song("InDaHood", "ThreePack", 240, "HipHop");
  songs[3] = new Song("The Farm", "BillyMilly", 120, "Country");
  songs[4] = new Song("Rhythmn and blues", "Jackson Micheals", 134, "R&B");
  songs[5] = new Song("MoneyMan", "Smalls Biggie", 150, "HipHop");
  songs[6] = new Song("Gods Plan", "Frake", 30, "HipHop");

  //Adding the key-value to the hashmap "colorGenre"
  colorGenre.put("Rock", color(255, 0, 0));
  colorGenre.put("Pop", color(255, 105, 180));
  colorGenre.put("HipHop", color(255, 165, 0));
  colorGenre.put("Country", color(120, 255, 45));
  colorGenre.put("R&B", color(255, 0, 255));
}



void draw() {
  //White Background
  background(255);

  //A for loop to draw the bars
  for (int i = 0; i < activeSongs; i++) {
    stroke(0);
    //Colors the rectangle based on the genre of the music
    fill(colorGenre.get(songs[i].musicGenre));
    //Draws a rectangle, with spacing horizontaly, and access the Song object to draw the width of the rectangle
    rect(100, i * 120, songs[i].durationInSeconds, 50);

    //Highlights a random song when a key is pressed
    if (i == highlightedIndex) {
      strokeWeight(4);
      stroke(255, 0, 0);
    } else {
      strokeWeight(1);
      stroke(0); // Black border
    }

    //Checks if the mouse position is within the "bar" if it is it will display info about the song
    if ((mouseX >= 100) && (mouseX <= 100 + songs[i].durationInSeconds) && (mouseY >= i * 120) && (mouseY <= i * 120 + 50)) {
      textSize(20);
      fill(0);
      text("Arist Name: " + songs[i].artistName + "\nGenre: " + songs[i].musicGenre, 500, 500);
    }
  }
  
  //Checks if the button d is pressed and that highlightedIndex is less then or equal
  if (dPressed == true && highlightedIndex >= 0) {

  // Shift all songs left from the one that was highlighted
  for (int i = highlightedIndex; i < activeSongs - 1; i++) {
    songs[i] = songs[i + 1];
  }

  // Set the last song to null
  songs[activeSongs - 1] = null;

  // Decrease the count of active songs
  activeSongs--;

  // Reset highlight and flag
  highlightedIndex = -1;
  dPressed = false;
}

  
  
  
}


void keyPressed() {

  if (hPressed == false) {
    hPressed = true;
    //Will pick a random song from the array when a key is pressed
    highlightedIndex = int(random(0, 6));
  }
  //Checks if the d button is pressed
  if (dPressed == false) {
    dPressed = true;
  }
}
