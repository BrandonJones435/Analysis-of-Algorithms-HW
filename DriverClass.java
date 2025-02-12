public class DriverClass {
    // This is a drivers class to help me see what the methods are doing
    private static int[] array = {7,4,9,3,4,5};
    private static int value = 5; 
    private static int number;
    private static int oldValue = 5;
    private static int newValue = 6; 

    public static void main(String[] args) {
        number = MethodsToAnalyze.find(array, value);
        System.out.print(number);
        MethodsToAnalyze.replaceAll(array, oldValue, newValue);
    }
}
