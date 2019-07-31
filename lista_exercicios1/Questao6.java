public class Questao6{

  public static int sequencia(int number){
    if (number == 0) return number;
    if (number == 1) return number;
    if (number == 2) return number;
    return (3 * (sequencia(number - 1))) + (4 * (sequencia(number - 2)));

  }
}