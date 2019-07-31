public class Questao2{
  
  public static int fibonacci(int number){
    if(number < 2) return number;
    return fibonacci(number - 1) + fibonacci(number - 2);
  }
}