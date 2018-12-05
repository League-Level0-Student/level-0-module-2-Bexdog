void setup(){
size(1000, 1000);
}
void draw(){
  PImage face = loadImage("maxresdefault.jpg");
image(face, 0, 0);
face.resize(200, 200);
fill(255, 0, 0);
ellipse(440, 360, 20, 20);
ellipse(585, 335, 20, 20);
fill(0,0,0);
ellipse(440, 360, 10, 10);
ellipse(585, 335, 10, 10);
fill(255,0,0);

}
