import java.util.Random;
import java.util.Scanner;
public class game
 {
     int num,user_num,num_of_guesses;
     public  int getNum_of_Guesses()
     {
         return num_of_guesses;
     }
     public void setNum_of_guesses(int num_of_guesses)
     {
      this.num_of_guesses=num_of_guesses;
     }
     public game()
     {
         Random random=new Random();
         num= random.nextInt(25);
     }
public int getUser_num()
{
    Scanner scan =new Scanner(System.in);
    user_num =scan.nextInt();
    return user_num;
}
public int Num_of_guesses()
{
  if (num_of_guesses == user_num)
  {
      System.out.println("no is corr you win");
  }
  else
  {
      System.out.println("no is in-corr you loose");
  }
    System.out.println();
    System.out.println(num);
    return num;
}
    public static void main(String[] args)

    {
        game g;
        g = new game();
        g.getUser_num();
        g.Num_of_guesses();




        //     System.out.println("Hello world!");
    }

}