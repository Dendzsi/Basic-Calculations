// This algorithm recursively counts the integer's number of digits.

class Digitcounter {
  public static void main(String[] args) {
    double myNumber = counter(131512573, 0);
    System.out.println(myNumber);
  }
    public static double counter(double k, double j){
      if(k > 1){
        j++;
        return counter(k/10, j);
      }
      else {
      return j;
    }
    }
}    
