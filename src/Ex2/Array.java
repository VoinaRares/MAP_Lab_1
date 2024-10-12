package Ex2;

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
}
