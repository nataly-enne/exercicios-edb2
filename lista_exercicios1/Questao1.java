public class Questao1{
  
  public static int fatorial(int number){
    if(number <= 1)return 1;
    return number * fatorial(number-1);
  }
}
