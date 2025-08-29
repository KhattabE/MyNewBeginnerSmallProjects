//Object variables
Orin orin;
Sirius sirius;
Stella stella;

//Fonts
PFont n;

//
String topMood;
float topSnackCount;

void setup(){
  //Size of canvas
  size(1000,1000);
  
  //Alien Orin object + assign values
  orin = new Orin("Orin", "Happy", 5);

  //Alien Sirius object + assign values
  sirius = new Sirius("Sirius", "Sad", 10);

  
  //Alien Stella object + assign value;
  stella = new Stella("Stella","Angry", 2);

  //Creates a font
  n = createFont("Arial", 16, true);
}


void draw(){

  //background
  background(255);
  
  //Calls on the alienText method/function
  alienText();
  
  //Calls on the moodDisplayTopEater method/Function
  moodDisplayTopEater();
  
  
  
  


}


// Function/method for alien info text display
void alienText(){

  //Alien display name + mood + snackcount
  fill(0);
  //The size of the text
  textSize(30);
  //Orin display
  text("Alien name: " + orin.alienName + 
     "\nAlien mood: " + orin.alienMood + 
     "\nSnack count: " + orin.snackCount, 
     500, 100);
  
  //Sirius display
   text("Alien name: " + sirius.alienName + 
   "\nAlien mood: " + sirius.alienMood + 
   "\nSnack count: " + sirius.snackCount, 
   500, 300);
   
   //Stella display
   text("Alien name: " + stella.alienName + 
   "\nAlien mood: " + stella.alienMood + 
   "\nSnack count: " + stella.snackCount, 
   500, 500
   );

  //Top Mood display
   text("Top Eater Mood: " + topMood + "\n top Snacks amount: " + topSnackCount, 100, 100);
   

}


//Function/Method for display top eater mood + count
void moodDisplayTopEater(){

    if((this.orin.snackCount > this.sirius.snackCount) && (this.orin.snackCount > this.stella.snackCount)){
    topSnackCount = orin.snackCount;
    topMood = this.orin.alienMood;  
}
  else if((this.sirius.snackCount > this.orin.snackCount) && (this.sirius.snackCount > this.stella.snackCount)){
    topSnackCount = this.sirius.snackCount;
    topMood = this.sirius.alienMood;
  } else if((this.stella.snackCount > this.orin.snackCount) && (this.stella.snackCount > this.sirius.snackCount)){
    topSnackCount = this.stella.snackCount;
    topMood = this.stella.alienMood;
  }
  
}
