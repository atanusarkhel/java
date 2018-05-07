interface Student
{
  public static void print()
  {
    System.out.println("Interface print method");
  }
  public default write()
  {
    System.out.println("Interface print method");
  }
  public abstract void show();
}

class InterfaceAnonymousDemo
{
  public static void main(String Args[])
  {
    Student st=new student(){public void show(){System.out.println("main class show method");}};
  }
}
