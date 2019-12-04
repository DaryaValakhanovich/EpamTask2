public class Task {
    public static void main(String[] args) {
        double[] array = new double[] {-4, -13.4, -2.5, 3.7, -9.2, 35.8};
        if(areSameValues(array)){ System.out.println("No max element");
        } else {
            System.out.println("Max element: " + findMax(array));
        } int positive = findLastPositive(array);
        if(positive==-1){
            System.out.println("No positive elements");
        } else {
            System.out.println("Sum of all elements before last positive element: " + findSumBeforeLastPositive(array, positive));
        }
    }

    private static double findMax(double[] array){
        double max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] >max){ max = array[i];
            }
        }
        return max;
    }

    private static double findSumBeforeLastPositive(double[] array, int positive){
        double sum = 0;
        for(int i = 0; i < positive; i++){
            sum+=array[i];
        }
        return sum;
    }

    private static int findLastPositive(double[] array){
        int positive = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){ positive = i;
            }
        }
        return positive;
    }

    private static boolean areSameValues(double[] array){
        double element = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] != element){
                return false;
            }
        }
        return true;
    }
}