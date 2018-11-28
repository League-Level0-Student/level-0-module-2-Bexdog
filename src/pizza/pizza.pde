void setup(){
size(1000,1000);
}
void draw(){
  background(#7CA013);
  int hujgas = 100;
  fill(hujgas);
ellipse(hujgas,hujgas,hujgas,hujgas);
PImage firework = loadImage("firecracker.ppm (1).gif");
if(mousePressed){
image(firework, mouseX, mouseY);

}
PImage finger = loadImage("finger.ppm.gif");
if(mousePressed){
image(finger, mouseX-8, mouseY-8);
}
PImage sink = loadImage("sink.ppm.gif");

image(sink, hujgas, hujgas);

}