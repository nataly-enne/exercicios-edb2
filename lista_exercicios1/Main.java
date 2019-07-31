import java.util.*;

public class Main {
  public static void main(String[] args){
    
    int value;

    Scanner scanner = new Scanner(System.in);
    value = scanner.nextInt();
    
    // // Questão 1 - Fatorial.
    // System.out.println("Fatorial: " + Questao1.fatorial(value));
    
    // // Questão 2 - Fibonacci.
    // System.out.println(value + "º termo de Fibonacci: " + Questao2.fibonacci(value));
    
    // // Questão 3 - Soma do vetor.
    // System.out.println("Insira os valores do array: ");
    // int vector[] = new int[value];
    // int numbers;
    // for (int i = 0; i < value; i++){
    //   numbers = scanner.nextInt();
    //   vector[i] = numbers;
    // }
    // System.out.println("Soma do array: " + Questao3.sumArray(vector, value));

    // // Questão 4 - Soma de 1 a N.
    // System.out.println("Soma de 1 a "+ value + ": " + Questao4.sum(value));

    // // Questão 5 - Multiplicação recursiva.
    // System.out.println("Digite mais um valor.");
    // int valueB;
    // valueB = scanner.nextInt();
    // System.out.print("Multiplicação entre "+ value + " e " + valueB + ": " + Questao5.multiplicacao(value, valueB));

    // Questão 6 - Sequência.
    for(int i = 3; i < value; i++){
      System.out.println(Questao6.sequencia(i));
    }
  }  
}