enum Size
{
 small,
 regular,
 large,
}

class Test
{
 Size s;
 Test(Size psize)
 {
  this.s=psize;
 }

 void OrderPizza()
 {
  switch(s)
  {
   case small:System.out.println("I ordered small pizza");
              break;
   case regular:System.out.println("I ordered regular pizza");
                break;
   case large:System.out.println("I ordered large pizza");
              break;
   default:System.out.println("I am broke");
  }
 }
}

class Pizza
{
 public static void main(String args[])
 {
  for(Size s:Size.values())
  {
   Test t=new Test(s);
   T.OrderPizza();
  }
 }
}
