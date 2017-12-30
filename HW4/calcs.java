import java.lang.System.*;
import java.util.Random;


public class calcs{
  public static void main(String[] args){
    double start = System.currentTimeMillis();
    Random rand = new Random();
    long n = rand.nextInt(2000) + 1500;
    long q;
    for(int i=0;i<1500000;i++){
      q = n * n;
      q = 0;}
    
    
    
    
    
    double end = System.currentTimeMillis();
    System.out.println(end - start);
    
    
    
  }
}
  