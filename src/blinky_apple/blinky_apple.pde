void setup() {
    size(500, 500);
}
void draw() {
    background(255, 255, 255);
    noStroke();
    fill(255,0,0);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(0,255,31);
    rect(176, 103, 12, 32);
    if(mousePressed){
     int a = (int)random(2);
     println(a);
      fill(255,255,255);
      int size = 4000;
      if (a==0){
        size = 1000;
      
      
      }
     else{
    size = 5;
       
     }
 //35
ellipse(75,200,size,size);
}
}
