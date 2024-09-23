public class Main 
{
    public static void main(String[] args) 
    {
      Feeder f = new Feeder(0);
      System.out.println(f);
      Feeder g = new Feeder(500);
      System.out.println(Math.random());
      //System.out.println(f.currentFood);
      System.out.println(f.getCurrentFood());
      System.out.println(g.getCurrentFood());
      double random = Math.random()* 10;
      System.out.println(random);
      int random = (int) Math.random()* 10;
      System,out.println(random)
    }
}
