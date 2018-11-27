public class NewCalculator_Test{
  private static NewCalculator calc = new NewCalculator();

  private static boolean test_StartValueOfAnswer(){
    double temp = calc.getAnswer();
    if(0==temp){
      return true;
    }
    return false;
  }
  public static void main(String[] args){
    if(test_StartValueOfAnswer()){
      System.out.println("test_StartValueOfAnswer: " + "PASSED");
    } else {
      System.out.println("test_StartValueOfAnswer: " + "FAILED");
    }
  }
}
