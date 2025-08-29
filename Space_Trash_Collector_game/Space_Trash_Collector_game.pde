//Trash x and y-axes positions
float trashPosY = 0;

//Trash width and height
float trashWidth = 50;
float trashHeight = 30;

//Trash falling speed (Y-axes)
float trashFallSpeed = 1;

//trashCan height and width
float trashCanHeight = 170;
float trashCanWidth = 100;

//Trash can y position
float trashCanPosY = 800;

//Score trash
int score = 0;

//Missed trash
int missedScore = 0;

//Boolean to check game over condition
boolean gameOver = false;

//Trash top postion
float trashCanY = 790;

//Text fonts
PFont s;
PFont ms;
PFont g;

void setup(){
  //Sizse of the canvas
  size(1000,1000);
  
  //Font for score
  s = createFont("Arial", 16, true);
  ms = createFont("Arial", 16, true);
  g = createFont("Arial", 16, true);
}

void draw(){

  //Background
  background(255);
  
  
  if (gameOver == false){
  
  //Score display
  textFont(s, 50);
  fill(0);
  text("Score: " + score, 50, 100);
  
  //Missed trash Score display
  textFont(s, 50);
  fill(0);
  text("Missed Score: " + missedScore, 625, 100);
  
  //For loop to make a row of trash on x-axes
  for(float trashPosX = 40; trashPosX < width; trashPosX += 200){
    
    //Draws trash
    strokeWeight(2);
    fill(0, 255, 0);
    ellipse(trashPosX, trashPosY, 50, 30);
    
    //Trash fall animation (Verticaly)
    trashPosY = trashPosY + trashFallSpeed;
    
    

    //Trash y postion > height, rest to the top
    if(trashPosY > height){
      trashPosX = random(0,1000);
      trashPosY = 0;
      missedScore--;
    }

    //Checks if the trash touces the corners or top
    if((trashPosY >= trashCanY - trashCanHeight/2) && (trashPosX > mouseX - trashCanWidth /2) && (trashPosX < mouseX + trashCanWidth /2)){
      trashPosY = 0;
      score++;
      
  }
  
  //Checks if the player missed than 10 trash
  if(missedScore <=  -10){
    gameOver = true;
  }
  
   //Draw trash can
   strokeWeight(2);
   fill(175);
   rectMode(CENTER);
   rect(mouseX, trashCanPosY, trashCanWidth, trashCanHeight);

  
  
 }
  
}

    if(gameOver == true){
    background(255, 0 , 0);
    trashFallSpeed = 0;
    //Game Over display
    textFont(s, 100);
    fill(0);
    text("GAME OVER ", 300, 400);
    
  }
  

  















}
