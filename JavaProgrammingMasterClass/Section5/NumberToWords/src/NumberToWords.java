public class NumberToWords {
    final static int base = 10;

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        int reversedNumber = reverse(number), numberDigitCount = getDigitCount(number);
        int reversedNumberDigitCount = getDigitCount(reversedNumber);
        int numberOfZeroes, digitCount;
        if (numberDigitCount > reversedNumber) {
            numberOfZeroes = numberDigitCount - reversedNumberDigitCount;
            digitCount = reversedNumberDigitCount;
        } else {
            numberOfZeroes = 0;
            digitCount = numberDigitCount;
        }
        while (digitCount > 0) {
            digitCount -= 1;
            int digit = reversedNumber % base;
            reversedNumber /= base;
            switch (digit) {
                case 0: {
                    System.out.println("Zero");
                    break;
                }
                case 1: {
                    System.out.println("One");
                    break;
                }
                case 2: {
                    System.out.println("Two");
                    break;
                }
                case 3: {
                    System.out.println("Three");
                    break;
                }
                case 4: {
                    System.out.println("Four");
                    break;
                }
                case 5: {
                    System.out.println("Five");
                    break;
                }
                case 6: {
                    System.out.println("Six");
                    break;
                }
                case 7: {
                    System.out.println("Seven");
                    break;
                }
                case 8: {
                    System.out.println("Eight");
                    break;
                }
                default: {
                    System.out.println("Nine");
                    break;
                }
            }
        }
        while (numberOfZeroes > 0) {
            System.out.println("Zero");
            numberOfZeroes -= 1;
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int digitCount = 0, remainingNumber = number;
        boolean atFirstDigit = false;

        while (!atFirstDigit) {
            digitCount += 1;
            remainingNumber /= base;
            if (remainingNumber == 0) atFirstDigit = true;
        }
        return digitCount;
    }

    public static int reverse(int number) {
        int absoluteValueOfNumber = Math.abs(number);
        int remainingNumber = absoluteValueOfNumber, reversedNumber = 0,
                powerOfTenExponent = getDigitCount(absoluteValueOfNumber) - 1;

        while (powerOfTenExponent >= 0) {
            int powerOfTen = (int)Math.pow(base, powerOfTenExponent);
            reversedNumber += (remainingNumber % base) * powerOfTen;
            remainingNumber /= base;
            powerOfTenExponent -= 1;
        }
        return reversedNumber = (number < 0) ? -1 * reversedNumber : reversedNumber;
    }
}
