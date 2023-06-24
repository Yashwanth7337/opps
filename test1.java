class A
{
int a;
int b;
public int add(int a,int b)
{
    return a+b;

}
}
class B extends A
{
    public int sub(int a,int b)
    {
return a-b;

    }
}
class C extends B
{
public int mul(int a,int b)
{
    return a*b;
    
}
}
class D extends C{
    public int div(int a,int b)
    {
        return a/b;
    }
}
class test
{
    public static void main(String args[])
    {
        D d=new D();
      
         System.out.println (d.add(10,5));
          System.out.println (d.sub(10,5));
           System.out.println (d.mul(10,5));
            System.out.println (d.div(10,5));
    


    }
}