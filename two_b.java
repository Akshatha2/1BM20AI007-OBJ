abstract class shape
{
  double a;
  abstract void display();
}

class triangle extends shape
{
  int b,h;
  
  triangle(int x,int y)
  {
    b=x;
    h=y;
  }
  
  void area1()
  {
    a=0.5*b*h;
  }
  
  void display()
  {
    System.out.println("Area of Triangle="+a);
  }
}

class circle extends shape
{
  protected int r;
  
  circle(int n)
  {
    r=n;
  }
  
  void area2()
  {
    a=3.14*r*r;
  }
  
  void display()
  {
    System.out.println("Area of Circle="+a);
  }
}

class hexagon extends shape
{
  int s;
  hexagon(int m)
  {
    s=m;
  }
  
  void area3()
  {
    a=2.6*s*s;
  }
  
  void display()
  {
    System.out.println("Area of Hexagon="+a);
  }
}

class threeDcircle extends circle
{ 
  threeDcircle(int o)
  {
    super(o);
  }
    
  void area4()
  {
    a=4*3.14*r*r;
  }
  
  void display()
  {
    System.out.println("Volume of sphere="+a);
  }
}

class two_b
{
  public static void main(String args[])
  {
    triangle t=new triangle(5,10);
    circle c=new circle(5);
    hexagon h=new hexagon(10);
    threeDcircle tc=new threeDcircle(15);
    t.area1();
    t.display();
    c.area2();
    c.display();
    h.area3();
    h.display();
    tc.area4();
    tc.display();
  }
}
 
