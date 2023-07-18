//This algorithm prints the number we specify backwards.

class ReverseNumber {
  public static void main(String[] args) {
    int ReversedNum = Reverse(123456789, 0);
    System.out.println(ReversedNum);
    
  }
    
    public static int Reverse(int k,int y){
      if(k > 0){
      int z = k % 10;
      y = y * 10 + z;
      return Reverse(k/10, y);
      }
      else{
        return y;
      }
    } 
  }
