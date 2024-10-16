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

    private int[] removeExtraZeros(int[] number) {
        int index = 0;
        int extraZeroes = 0;
        while(number[index] == 0) {
            extraZeroes++;
            index++;
        }
        int[] result = new int[number.length - extraZeroes];
        for(int i = extraZeroes; i < number.length; i++) {
            result[i - extraZeroes] = number[i];
        }

        return result;
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

        return removeExtraZeros(result);
    }

    private boolean isBigger(BigNumber comparingNumber) {
        for(int i = 0; i < this.number.length; i++) {
            if(comparingNumber.getNumber()[i] > this.number[i]) {
                return false;
            }
        }
        return true;
    }

    public int[] getDifference(BigNumber subtractingNumber) {
        int[] result = new int[this.number.length + 1];
        BigNumber b1 = new BigNumber(this.number);
        BigNumber b2 = new BigNumber(subtractingNumber.getNumber());
        if(this.isBigger(subtractingNumber)) {
            b1.setNumber(subtractingNumber.getNumber());
            b2.setNumber(this.getNumber());
        }
        for(int i = b1.number.length - 1; i >= 0; i--) {
            result[i + 1] = b1.number[i] - b2.getNumber()[i] + result[i + 1];
            if(result[i + 1] < 0) {
                result[i] = -1;
                result[i + 1] = result[i + 1] + 10;
            }
        }

        return removeExtraZeros(result);
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

        return removeExtraZeros(result);
    }

    public int[] getDivision(int divisor) {
        int[] result = new int[this.number.length];
        int remainingFromDivision = 0;
        for(int i = 0; i < this.number.length; i++) {
            result[i] = (this.number[i] + remainingFromDivision * 10)/ divisor;
            remainingFromDivision = this.number[i] % divisor;
        }

        return removeExtraZeros(result);
    }
}
