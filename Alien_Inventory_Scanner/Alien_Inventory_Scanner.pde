//So i can use hashmaps
import java.util.HashMap;

//The hashmap to store the key-value pairs
HashMap <String, Integer> alienInventory = new HashMap<>();

//Fonts
PFont a;

//Boolean for key press
boolean keyIsPressed = false;


//Boolean for Zoog key press
boolean zPressed = false;
boolean xPressed = false;
boolean rPressed = false;

//Boolean for bonus point for Zoog
boolean bPressed = false;

//Boolean for Loogs key press
boolean lPressed = false;
boolean kPressed = false;
boolean tPressed = false;

//Boolean for doorgs key press
boolean dPressed = false;
boolean cPressed = false;
boolean yPressed = false;

//increase current number of alien value
int current;

//Total count of alien value
int totalAlienValue;
int zoogCurrent;
int loogCurrent;
int doorgCurrent;

//Bar variables
int barPosX = 25;
int barPosY = 900;

//The bar width
float barWidth = width;


void setup() {
  //The size of the canvas
  size(1000, 1000);

  //Creating the font
  a = createFont("Arial", 16, true);

  //Putting keys-value pairs to the hashmap
  alienInventory.put("Zoog", 4);
  alienInventory.put("Loog", 2);
  alienInventory.put("Doorg", 7);
}


void draw() {

  //Draws background
  background(255);

  //Alien key-value pair text to canvas
  alienNames();

  //Alien value number increase
  increaseValueNumb();

  //Alien value number decrease
  decreaseValueNumb();

  //Alien value rest to original
  resetValueNumb();

  //Counts the total amount of items the aliens have together
  totalCount();

  barWidth = totalAlienValue * 5;

  // Limits the bar
  if (barWidth + barPosX > width) {
    barWidth = width - barPosX;
  }

  // Draws the bar
  stroke(0);
  fill(0, 255, 0);
  rect(barPosX, barPosY, barWidth-20, 50);
}



void keyPressed() {

  //Checks if the z key is pressed
  if (key == 'z') {
    zPressed = true;
  }

  //Checks if the l key is pressed
  else if (key == 'l') {
    lPressed = true;
  }

  //Checks if the d key is pressed
  else if (key == 'd') {
    dPressed = true;
  }

  //Checks if the x key is pressed
  if (key == 'x') {
    xPressed = true;
  }

  //Checks if the k key is pressed
  if (key == 'k') {
    kPressed = true;
  }

  //Checks if the c key is pressed
  if (key == 'c') {
    cPressed = true;
  }

  //Checks if the r key is pressed
  if (key == 'r') {
    rPressed = true;
  }

  //Checks if the t key is pressed
  if (key == 't') {
    tPressed = true;
  }

  //Checks if the y key is pressed
  if (key == 'y') {
    yPressed = true;
  }

  if (key == 'b') {
    bPressed = true;
  }
}



// Method/Function for alien names and value on canvas
void alienNames() {

  //Writes the alien names on the sketch
  fill(0);
  textFont(a, 50);
  text("Zoog" + ": " + alienInventory.get("Zoog"), 100, 100);
  text("Loong" + ": " + alienInventory.get("Loog"), 400, 400);
  text("Doorg" + ": " + alienInventory.get("Doorg"), 100, 800);
  text("Total items: " + totalAlienValue, 500, 800);
}






// Method/Function for alien value to incrase when a button is pressed
void increaseValueNumb() {

  //Increased number of value for Zoog if z pressed
  if (zPressed) {
    current = alienInventory.get("Zoog");
    alienInventory.put("Zoog", current + 1);
    zPressed = false;
  }

  //Increases the value number if l is pressed
  else if (lPressed) {
    current = alienInventory.get("Loog");
    alienInventory.put("Loog", current + 1);
    lPressed = false;
  }

  //Increases the value number if d is pressed
  else if (dPressed) {
    current = alienInventory.get("Doorg");
    alienInventory.put("Doorg", current + 1);
    dPressed = false;
  }

  //Increases Zoogs value number by +2
  if (bPressed) {
    current = alienInventory.get("Zoog");
    alienInventory.put("Zoog", current + 2);
    bPressed = false;
  }
}


void decreaseValueNumb() {
  //Decreases the value number of zoog if x is pressed
  if (xPressed) {
    //Updates current with the latest value
    current = alienInventory.get("Zoog");

    //If statement to make sure not to go under 0 + to decrease the value
    if (current > 0) {
      alienInventory.put("Zoog", current - 1);
      xPressed = false;
    }
    //If Zoogs current value is less than 0 it stops
    else if (current < 0) {
      current = 0;
      println("NO MORE POINTS ON ZOOG");
    }
  }


  //Decreases the value number of Loog if k is pressed
  if (kPressed) {

    //Updates the current value of Loog
    current = alienInventory.get("Loog");

    //Ig statement to make sure loog value does not go under 0, + decreases the value
    if (current > 0) {
      alienInventory.put("Loog", current - 1);
      kPressed = false;
    }

    //If Loogs current value is less than 0, it stops
    else if (current < 0) {
      current = 0;
      println("NO MORE POINTS ON LOOG");
    }
  }

  //Decrease the value of Doorg when c is pressed
  if (cPressed) {

    //Updates the currnet value of Doorg
    current = alienInventory.get("Doorg");

    //Decrease Doorgs value as long as it is over 0
    if (current > 0) {
      alienInventory.put("Doorg", current -1);
      cPressed = false;
    }

    //If Doorgs currnet value is less than 0, it stops
    else if (current < 0) {
      current = 0;
      println("NO MORE POINTS ON Doorg");
    }
  }
}


void resetValueNumb() {

  //Resets Zoogs value number to original value number
  if (rPressed) {

    //Updates the currnet value of Zoog
    current = alienInventory.get("Zoog");

    //If key r is pressed, reset Zoogs value number to original
    if (rPressed == true) {
      alienInventory.put("Zoog", 4);
      rPressed = false;
    }
  }

  //Resets Loogs value number to original value number
  if (tPressed) {

    // Checks/Updates loogs current value number
    current = alienInventory.get("Loog");

    //Resets loogs value number when t button is pressed
    if (tPressed == true) {
      alienInventory.put("Loog", 2);
      tPressed = false;
    }
  }

  //Resets Doorgs value number to original value number
  if (yPressed) {

    // Checks/Updates Doorgs current value number
    current = alienInventory.get("Doorg");

    //Resets Doorgs value number when y button is pressed
    if (yPressed == true) {
      alienInventory.put("Doorg", 7);
      yPressed = false;
    }
  }
}



//A function to calculate the full total of alien items
void totalCount() {

  //Getting the current value item that the aliens have
  zoogCurrent = alienInventory.get("Zoog");
  loogCurrent = alienInventory.get("Loog");
  doorgCurrent = alienInventory.get("Doorg");


  //Adding all of the alien values into one variable
  totalAlienValue =  zoogCurrent + loogCurrent + doorgCurrent;
}
