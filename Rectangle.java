import java.util.Scanner;
class Rectangle {
int height;
int width;
int area;   //data member
void getpara()
{
    height=20;
    width=10;
}  
void findarea() //member's function
{
    area=height*width;
    System.out.println("Area of rectangle is:" + area);
}
public static void main(String[] args)
{
    Rectangle obj=new Rectangle(); //creating instance
    obj.getpara();
    obj.findarea();
}
}