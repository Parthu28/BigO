import java.util.Arrays;
public class BigO {

public static double[] prefixLinearTime (double[] array1) {     // O(n) time complexity

long startTime = System.nanoTime();

double array[] = new double[array1.length];

double n = 0;

for (int i = 0; i < array1.length; i++) {

n = n + array1[i];

array[i] = n /(i+1);

System.out.println(Arrays.toString(array));

}

long endTime = System.nanoTime();

long timeTaken = endTime - startTime;

System.out.println("Time taken in milliseconds for Linear: " + timeTaken/1000000);

return array;

}

public static double[] prefixQuadraticTime (double[] array1) {   // O(n^2) time complexity

long startTime = System.nanoTime();

double array[] = new double[array1.length];

for (int i = 0; i < array1.length; i++) {

double n = 0;

for (int j = 0; j <= i; j++) {

n = n + array1[j];

}

array[i] = n /(i+1);

System.out.println(Arrays.toString(array));

}

long endTime = System.nanoTime();

long timeTaken = endTime - startTime;

System.out.println("Time taken in milliseconds for Quadratic: " + timeTaken/1000000);

return array;

}

public static void main(String[] args){

double array[] = {1,2,3,4,5,6,7,8};

prefixQuadraticTime(array);

prefixLinearTime(array);

}

}