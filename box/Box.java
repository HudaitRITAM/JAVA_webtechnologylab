import java.util.*;
class Box 
{
    protected double length, width, height;
    Box(double length, double width, double height) 
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void volume() 
    {
        System.out.println("Volume is "+ length * width * height);
    }
}

class Demo 
{ 
    public static void main(String args[]) 
    {
        double l, b, h;
        l = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        h = Double.parseDouble(args[2]);
        Box b1 = new Box(l, b, h);
        b1.volume();
    }
}