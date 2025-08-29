class Star {

  //Class variables

  //Declaring star x and y current position variable of data type float
  float currentXPos;
  float currentYPos;

  //Declaring x and y speed variable og data type float
  float xSpeed;
  float ySpeed;

  //Declaring an x and y position array of integers, and initializing and setting the size of the array to 50
  float[] previousXPos = new float[50];
  float[] previousYPos = new float[50];
  
  float r = random(0,255);
  float g = random(0,255);
  float b = random(0,255);


  //Class constructor
  Star() {
    //Randomizses the position of x and y
    this.currentXPos = random(0, 1000);
    this.currentYPos = random(0, 1000);
    //Gives random speed, will be used for movement later
    this.xSpeed = random(-1, 1);
    this.ySpeed = random(-1, 1);
    //Puts the current position of x and y at index 0 of the array
    previousXPos[0] = currentXPos;
    previousYPos[0] = currentYPos;
    
  }



  //Method to update stars position, so it gives it movement
  void updatePosition() {

    //For movemnt
    currentXPos += xSpeed;
    currentYPos += ySpeed;
    //For loop, to loop through the entire array, expet the last one
    for (int i = 0; i < previousXPos.length - 1; i++) {
      //Shifts all the old positions in the rail on step forward
      previousXPos[i] = previousXPos[i + 1];
      previousYPos[i] = previousYPos[i + 1];
    }

    //Puts the new current of x and y into the last index of the array
    previousXPos[previousXPos.length - 1] = currentXPos;
    previousYPos[previousYPos.length - 1] = currentYPos;
  }


  //Method to bounce stars if they hit any edge of the canvas
  void starBounce() {
    //Checks if the current position of x is greater than width or less than 0, if it is, it bounces the other way
    if ((currentXPos >= width) || (currentXPos <= 0)) {
      xSpeed *= - 1;
    }
    //Checks if the current position of y is greater than height or less than 0, if it is, it bounces the other way
    if ((currentYPos >= height) || (currentYPos <= 0)) {
      ySpeed *= -1;
    }
  }


  //Displays trails and styar
  void display() {
    //Loops through the array and draws ellipse based on the previous position
    for (int i = 0; i < previousXPos.length; i++) {
      fill(r, g, b, 20);
      ellipse(previousXPos[i], previousYPos[i], 20, 20);
    }
  }
  
  
}
