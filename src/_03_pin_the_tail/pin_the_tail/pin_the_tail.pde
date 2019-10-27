PImage donkey;
PImage donkeytail;
void setup() {
 size(500,500);
  donkey = loadImage("donkey.jpg");
  donkey.resize(500,500);
  donkeytail = loadImage("donkeytail.jpg");
 donkeytail.resize(0,100);
}

void draw() {
  if (dist(0,0,mouseX,mouseY)>30) {
  background(0,0,0);
}
else {
  background(donkey);
}
  
image(donkeytail, mouseX-10, mouseY-20);
rect(0,0,30,30);
rect(440, 140, 50, 50);


}
