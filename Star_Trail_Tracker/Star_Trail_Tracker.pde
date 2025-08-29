// Declaration of two arrays of type floats
float[] xPos;
float[] yPos;

//Declaration for x and y position of the star
float starXPos;
float starYPos;

//Declaring and initializing two variables of type float, to use for ellipse movement
float starXSpeed = random(-1,1);
float starYpSpeed = random(-1,1);



void setup() {
  //The size of the canvas
  size(1000, 1000);

  //Intializing the array and the size of the array
  xPos = new float[50];
  yPos = new float[50];

  //A for loop to go through each index of the array and put the value 0,0;
  for (int i = 0; i < xPos.length; i++) {
    xPos[i] = 0;
    yPos[i] = 0;
  }

  //Intializing the x and y postion of the star
  starXPos = width/2;
  starYPos = height/2;
}


void draw() {

  //Method to call trailEffect
  trailEffect();
  
  //Method call pushOlderPositionsForward
  pushOlderPositionsForward();

  //Method call assignXAndYLastIndexSpot
  assignXAndYLastIndexSpot();

  //Method call drawEllipsePlusPosition
  drawEllipsePlusPosition();

  //Method call elipseMovement
  ellipseMovement();

  //Method call bounceEllipse
  bounceEllipse();
}

void trailEffect() {
  //Trail affect
  noStroke();
  fill(255, 255, 255, 12);
  rect(0, 0, width, height);
}


//Method to push old array position forward
void pushOlderPositionsForward() {
  /*This for loop is to push "older" positions forward, so the last one can go in the last spot
   and the reason for why is say "xPos.length - 1", is because i want to keep the last index spot empty, so the
   new value can get in their, and this will keep hapining in the draw loop */
  for (int i = 0; i < xPos.length - 1; i++) {
    xPos[i] = xPos[i + 1];
    yPos[i] = yPos[i + 1];
  }
}


//Method to assign StarPos x and y to the last spot in the array
void assignXAndYLastIndexSpot() {
  //Here i assign starXPos and starYPos, the last spot in the array, and when i get a new one, it pushes the one before forward and puts the new one last
  xPos[xPos.length-1] = starXPos;
  yPos[yPos.length-1] = starYPos;
}


//Method to draw ellipse
void drawEllipsePlusPosition() {
  /* This loop goes through every index of the xPos and yPos arrays.
   For each index i:
   - fill(0) sets the color to black
   - ellipse(xPos[i], yPos[i], 10, 10) draws a small circle at that position
   In other words, each pair (xPos[i], yPos[i]) represents the coordinates of one ellipse.
   */

  for (int i = 0; i < xPos.length; i++) {
    fill(0);
    ellipse(xPos[i], yPos[i], 10, 10);
  }
}


//Method to make ellipse dynamic
void ellipseMovement() {
  //This allows the ellipse to move horizontally and vertically
  starXPos += starXSpeed;
  starYPos += starYpSpeed;
}


//Method to bounce the ellipse
void bounceEllipse() {
  //Checks if the ellipse is greater than width or less than 0, then bounces
  if ((starXPos >= width) || (starXPos <= 0)) {
    starXSpeed *= -1;
  }

  //Checks if the ellipse is greater than height or less than 0, then bounces
  if ((starYPos >= height) || (starYPos <= 0)) {
    starYpSpeed *= -1;
  }
}
