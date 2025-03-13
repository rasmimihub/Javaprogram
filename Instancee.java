class Instancee{
    //these instance variable can be used inside all the function of this instancee class
    int x,y=30,z=40;
    public void add() {
        x=y+z;  //accessing instance variable
        System.out.println("Add=" +x);
    }
    public void sub()
    {
        x=y-z; //accessing instance variable
        System.out.println("Sub=" +x);
    }
    public static void main(String args[])
    {
        Instancee obj=new Instancee();   //creating instance object 
        obj.add();
        obj.sub();
    }
}