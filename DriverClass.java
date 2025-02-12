public class DriverClass {
    // This is a drivers class to help me see what the methods are doing
    private static int[] array = {0,1,2,3,4,5};
    private static int value = 5; 
    private static int number;
    public static void main(String[] args) {
        number = MethodsToAnalyze.find(array, value);
        System.out.print(number);
    }
}
