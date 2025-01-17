public class Type_casting {
  public static void main(String[] args) {
    // Implicit casting (widening) 
    int intValue = 10; 
    double doubleValue = intValue;

    System.out.println("Double Value: " + doubleValue);

    // Explicit casting (narrowing)
    double doubleVal = 20.5;
    int intVal = (int) doubleVal;

    System.out.println("Int Value: " + intVal);
  }
}
