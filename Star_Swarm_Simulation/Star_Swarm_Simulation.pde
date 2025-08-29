//Global scope variables

//Declaring an array og type Star
Star[] stars;

//Declaring and initiazling vaiable of data type int, to be used for amount of stars i want
int amountOfStars = 100;




void setup() {
  //Sets the size of the canvas
  size(1000, 1000);

  //Initializing the array stars
  stars = new Star[amountOfStars];

  //A for loop to fill the index with Star() object
  for (int i = 0; i < stars.length; i++) {
    stars[i]  = new Star();
  }
}



void draw() {
  //Background
  noStroke();
  fill(0, 0, 0, 0);
  rect(width, height, 10, 10);


  //Foor loop
  for (int i = 0; i < stars.length; i++) {
    stars[i].updatePosition();
    stars[i].starBounce();
    stars[i].display();
  }
}
