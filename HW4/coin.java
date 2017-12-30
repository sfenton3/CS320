import java.util.Random;

public class coin{
  public static void main(String[] args){
    long  n = 2000000000;
    int[] toss = new int[2];
    toss = flip(n);
    System.out.println("Heads: " + toss[0] + " Tails: " + toss[1]);
    System.out.println("Heads: " + toss[0]/(n*1.0) + " Tails: " + toss[1]/(n*1.0));
    
    
    
  }
  
  public static int[] flip(long flips){
    int[] toss = new int[2];
    Random rand = new Random();
    
    for(int i=0;i<flips;i++){
      int n = rand.nextInt(2);
      if(n == 0)
        toss[0]++;
      else
        toss[1]++;
    }

    return toss;
    
    
    
  }
  
}