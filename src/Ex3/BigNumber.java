package Ex3;

public class BigNumber {
    int[] number;

    public BigNumber(int[] number) {
        this.number = number;
    }

    public int[] getNumber() {
        return number;
    }

    public void setNumber(int[] number) {
        this.number = number;
    }

    public int[] getSum(BigNumber addingNumber) {
        int[] result = new int[this.number.length + 1];
        for(int i = this.number.length - 1; i >= 0; i--) {
            result[i + 1] = addingNumber.getNumber()[i] + this.number[i] + result[i + 1];
            if(result[i + 1] >= 10) {
                result[i] = result[i + 1]/10;
                result[i + 1] = result[i + 1]%10;

            }
        }

        return result;
    }

    public int[] getDifference(BigNumber subtractingNumber) {
        int[] result = new int[this.number.length + 1];
        for(int i = this.number.length - 1; i >= 0; i--) {
            result[i + 1] = this.number[i] - subtractingNumber.getNumber()[i] + result[i + 1];
            if(result[i + 1] < 0) {
                result[i] = -1;
                result[i + 1] = result[i + 1] + 10;
            }
        }

        return result;
    }
}
