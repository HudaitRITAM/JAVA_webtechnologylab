class Shape {
int length;
int width;
int height;
int thick;
Shape() {
length = 0;
width = 0;
height = 0;
thick = 0;
}
}
class Plate extends Shape {
Plate() {
length = 10;
width = 5;
}
void displayPlate() {
System.out.println("Plate is "+length+ ", "+width);
}
}
class Box extends Plate {
Box() {
height = 20;
}
void displayBox() {
System.out.println("Box is "+length+ ", "+width+ ", "+height);
}
}
class WoodBox extends Box {
WoodBox() {
thick = 25;
}
void displayWoodBox() {
System.out.println("Wood Box is "+length+ ", "+width+ ", "+height+", "+thick);
}
}
public class Geometry {
public static void main(String[] args) {
WoodBox obj = new WoodBox();
obj.displayPlate();
obj.displayBox();
obj.displayWoodBox();
}
}