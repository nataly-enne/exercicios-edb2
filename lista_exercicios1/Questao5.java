public class Questao5{
  
  public static int multiplicacao(int a, int b) {
    if(a == 0 || b == 0) return 0;
    if(b == 1) return a;
    return a + multiplicacao(a, b - 1);
  }
}