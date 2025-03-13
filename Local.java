//program to demonstatre local vairable
class Local {
    public void add()
    {
        int x,y=10,z=20;  //declaring local variable
        x=y+z;
        System.out.println("Add=" +x);
    }
    public static void main(String[] args)
    {
        Local obj=new Local();
        obj.add();
    }
}