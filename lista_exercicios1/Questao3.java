public class Questao3{
  
  public static int sumArray(int vector[], int size){
    if (size == 1) return vector[0];
    return vector[size - 1] + sumArray(vector, size - 1);
  } 
}