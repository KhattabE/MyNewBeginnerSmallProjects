//Star y starting postion
float starPosY = 0;

//Star width and height
float starWidth = 30;
float starHeight = 30;

//Star falling speeed on the y-axes
float starSpeedY = 1;

//RGB Color for the stars
float starColorR = 100;
float starColorG = 170;
float starColorB = 255;

//Boolean to check if the mouse is pressed
boolean mouseIsPressed = false;

//Catcher width and height
float starCatcherWidth = 200;
float starCatcherHeight = 50;
float starCatcherYPosition = 900;

//boolen to check if the player is alive
boolean gameWon = false;

//Checks the player score
int score = 0;

//Checks highScore
int highScore = 0;

//fonts
PFont hs;
PFont w;



void setup(){
  size(1000,1000);
  hs = createFont("Arial", 16, true);
  w = createFont("Arial", 16, true);
}


void draw(){
  
  //Background
  background(255);
               
       //highScore tracker
       textFont(hs, 40);
       fill(0);
       text("High Score: " + score, 700, 100);
       
  
  
  
       //Checks if the score is over 100, if yes you win
       if(score == 100){
       
         //Stops stars from falling
       starPosY = 0;
       
       //Green background for winning
       background(144, 238, 144);
       
       //Winning massage
       textFont(w, 100);
       fill(0);
       text("YOU WIN!", 250, 200);
      } 
      
      //Checks if the score is less than 100
      else if(score < 100){
              
  
  //A for loop to draw a row of stars horizontally across the canvas
    for(float x = 20; x < width ; x += 250){


      //The stars
      stroke(0);
      fill(starColorR, starColorG, starColorB);
      ellipse(x, starPosY, starWidth, starHeight);
 
      
      
      //Gets the stars to move vertically 
       starPosY = starPosY + starSpeedY;
      
    
      //Rest the star y postion when it is greater than the canvas height
      if(starPosY > height){
        starPosY = 0;
        score++;   
      }
    
    
    
     //Restart the stars to top if caught with catcher
     if((starPosY >= 890) && (x >= mouseX - starCatcherWidth/2) && (x <= mouseX + starCatcherWidth/2)){
        
      if(score > highScore){
      highScore = score;
    }
       
       
       starPosY = 0; 
        starColorR = starColorR + random(0, 255);
        starColorR = starColorG + random(0, 255);
        starColorR = starColorB + random(0, 255); 
        score = 0;
  }     
     
}
    
    
    
    
    //If mouse is pressed, speeds it up, else it changes to normal speed
    if(mouseIsPressed == true){
      starSpeedY += 5;
    }else if(mouseIsPressed == false){
      starSpeedY = 1;
    }
      
      //Draws the star catcher
      strokeWeight(2);
      fill(150);
      rectMode(CENTER);
      rect(mouseX, starCatcherYPosition, starCatcherWidth, starCatcherHeight);

          
     //Score counter
     PFont s;
     s = createFont("Arial",16,true);
     textFont(s, 40);
     fill(0);
     text("Score: " + score, 100, 100);
   

       
  
  }   

}






void mousePressed(){
  //Checks if the mouse is pressed
  if(mouseIsPressed == false){
    mouseIsPressed = true;
  } 
  //Checks if the mouse is pressed again
  else if(mouseIsPressed == true)
  mouseIsPressed = false;
}
