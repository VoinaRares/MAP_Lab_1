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

    //assumes that this.number is bigger than subtracting number
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

    public int[] getMultiplication(int multiplier) {
        int[] result = new int[this.number.length + 1];
        for(int i = this.number.length - 1; i >= 0; i--) {
            result[i + 1] = this.number[i] * multiplier + result[i + 1];
            if(result[i + 1] > 10) {
                result[i] = result[i + 1]/10;
                result[i + 1] = result[i + 1]%10;
            }
        }

        return result;
    }

    public int[] getDivision(int divisor) {
        int[] result = new int[this.number.length];
        int remainingFromDivision = 0;
        for(int i = 0; i < this.number.length; i++) {
            result[i] = (this.number[i] + remainingFromDivision * 10)/ divisor;
            remainingFromDivision = this.number[i] % divisor;
        }

        return result;
    }
}
