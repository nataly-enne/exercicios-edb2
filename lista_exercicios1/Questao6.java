public class Questao6{

  public static int sequencia(int number){
    if (number == 0) return 0;
    if (number == 1) return 1;
    if (number == 2) return 2;
    return (3 * (sequencia(number - 1))) + (4 * (sequencia(number - 2)));

  }
}
