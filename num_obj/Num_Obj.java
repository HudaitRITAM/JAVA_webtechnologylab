
public class Num_Obj
{
    static int count=0;
    Num_Obj()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        Num_Obj obj1 = new Num_Obj();
        Num_Obj obj2 = new Num_Obj();
        Num_Obj obj3 = new Num_Obj();
        Num_Obj obj4 = new Num_Obj();
        System.out.println("Number of objects:"+count);
    }
}