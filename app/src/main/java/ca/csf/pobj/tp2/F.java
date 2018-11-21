package ca.csf.pobj.tp2;

public final class F {

    private F() {
        // private so it is a static class
    }

    public static int getNumberAtPower(int originalNumber, int power) {
        return originalNumber % (int)Math.pow(10, power) / (int)Math.pow(10, power-1);
    }

    public static int[] getArrayOfPower(int originalNumber, int powerUpTo) {
        int[] powerArray = new int[powerUpTo];

        for (int i = 3; i >= 0; i--) {
            powerArray[i] = getNumberAtPower(originalNumber, powerUpTo-i);
        }

        return powerArray;
    }
}
