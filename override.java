/* @Override annotation */
class A 
{
    void show()
    {
        System.out.println("Super Class");
    }
}
class B extends A
{
    @Override
    void show()
    {
        System.out.println("Sub Class");
    }
    void disp()
    {
        System.out.println("Sub2 Class");
    }
}
class test
{
    public static void main(String[] args) {
        B r=new B();
        r.show(); r.disp();
    }
}
