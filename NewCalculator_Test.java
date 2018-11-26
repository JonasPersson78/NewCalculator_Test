public class NewCalculator_Test{
  private static NewCalculator calc = new NewCalculator();

  private static boolean test_StartValueOfFirstNumber(){
    double temp = calc.getFirstNumber();
    if(2==temp){
      return true;
    }
    return false;
  }
  public static void main(String[] args){
    if(test_StartValueOfFirstNumber()){
      System.out.println("test_StartValueOfFirstNumber: " + "PASSED");
    } else {
      System.out.println("test_StartValueOfFirstNumber: " + "FAILED");
    }
  }
}
