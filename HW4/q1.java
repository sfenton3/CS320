public class q1{
  public static void main(String[] args){
    
    int arr[] = {-1,0,0,0,0,0,0};
    int x = 0;
    for(int i=1;i<7;i++){
      for(int j=1;j<7;j++){
        if(i > j || i == j)
          x = i;
        else
          x = j;
        arr[x]++;
      }
    }
    
    for(int i=1;i<arr.length;i++)
      System.out.println(arr[i]);
        
    
    
  }
}
  