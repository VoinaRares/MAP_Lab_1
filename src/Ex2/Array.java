package Ex2;

import java.util.Arrays;

public class Array {

    private int[] array;
    private int size;

    public Array(int size) {
        this.array = new int[size];
        this.size = size;
    }

    public Array(int[] array) {
        this.array = array;
        this.size = array.length;
    }

    public int[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    public int getMax(){
        int max = 0;
        for(int i = 0; i < size; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public int getMin(){
        int min = array[0];
        for(int i = 0; i < size; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public int maxNSum(int n){
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        int sum = 0;
        for(int i = sortedArray.length - 1; i >= sortedArray.length - n; i--){
            sum += sortedArray[i];
        }

        return sum;
    }
}
