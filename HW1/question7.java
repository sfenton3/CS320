public class question7{
  
  public static void main(String[] args){
    int[] seq = {33,5,6,8,12,3,66, 2, 17};
    System.out.println(xtoy(seq));
  }
  
  
  //find an x such that another term equals x^2
  public static String xtoy(int[] seq){
    String result = "No Match :(";
    int count = 0;
    for(int i=0;i < seq.length;i++){
      for(int j=0;j < seq.length;j++){
        count++;
        if(seq[i] == (seq[j] * seq[j]) && seq[i] != seq[j]){
          return result = "Count: " + count + "\n" + seq[i] + "=" + seq[j] + "^2";
        }    
      }
    }
    System.out.println(count);
    return result;
  }
}
    