import java.util.*;

enum Move
{
  rock,
  paper,
  scissor
}

class Game
{
  Move m,c;
  Game(Move m)
  {
    this.m=m;
  }

  void RandomMove() 
  {
    int pick = new Random().nextInt(move.values().length);
    c=move.values()[pick];
  }

  void Display()
  { 
    RandomMove();
    if(m==Move.rock)
    {
      if(c==Move.scissor)
      {
        System.out.println("You Win");
        System.out.println("Your move:"+m+" computer move:"+c);
      }
      else
      {
        System.out.println("You Lose");
        System.out.println("Your move:"+m+" Computer move:"+c);
      }
    }

    else if(m==Move.paper)
    {
      if(c==Move.rock)
      {
        System.out.println("You Win");
        System.out.println("Your move:"+m+" Computer move:"+c);
      }
     else
     {
       System.out.println("You lose");
       System.out.println("Your move:"+m+" computer move:"+c);
     }
   }

   else
   {
     if(c==Move.paper)
     {
       System.out.println("You Win");
       System.out.println("Your move:"+m+" Computer move:"+c);
     }
     else
     {
       System.out.println("You lose");
       System.out.println("Your move:"+m+" computer move:"+c);
     }
    }
  }
}

class Play
{
  public static void main(String args[])
  {
    Game g=new Game(Move.paper);
    g.Display();
  }
}
