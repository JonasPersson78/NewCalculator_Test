public class NewCalculator_Test{
  private static NewCalculator calc = new NewCalculator();

  private static boolean test_StartValueOfSecondNumber(){
    double temp = calc.getSecondNumber();
    if(0==temp){
      return true;
    }
    return false;
  }
  public static void main(String[] args){ 
    if(test_StartValueOfSecondNumber()){
      System.out.println("test_StartValueOfSecondNumber: " + "PASSED");
    } else {
      System.out.println("test_StartValueOfSecondNumber: " + "FAILED");
    }
  }
}
