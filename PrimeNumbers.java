//You can display the prime numbers up to the value you specify by changing the value of the num variable.

class Prime {
  public static void main(String[] args) {
    
    int num = 100;
    int i = 1;
    int j = 1;
    int x = 1;
    int y = 1;
    int dividablecount = 0;
    
    
    while(i<=num){
      while(j<=i){
        x = i % j;
        if(x == 0){
          dividablecount++;
        }
        j++;
      }
      j = 1;
      if(dividablecount == 2){
        System.out.print(i+",");
        dividablecount = 0;
      }
      else if(dividablecount != 2){
        dividablecount = 0;
      }
      if(i>2){
      i = i+2;
      }
      else{
        i++;
      }
    }
    
  }
}
