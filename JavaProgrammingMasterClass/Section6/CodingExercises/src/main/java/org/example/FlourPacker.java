package org.example;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean canPack = false;
        int kilosPerBigCount = 5;
        int kilosPerSmallCount = 1;
        if (
                (bigCount < 0) || (smallCount < 0) || (goal < 0) ||
                (bigCount * kilosPerBigCount + smallCount * kilosPerBigCount < goal)
            ) return canPack;

        outer: for (int bigCountSize = bigCount; bigCountSize >= 0; bigCountSize--) {
            int bigCountMass = bigCountSize * kilosPerBigCount;
            for (int smallCountSize = smallCount; smallCountSize >= 0; smallCountSize--) {
                if (bigCountMass > goal) break; // if mass of big > goal we need to reduce big
                int smallCountMass = smallCountSize * kilosPerSmallCount;
                int massCalculation = bigCountMass +  smallCountMass;
                if (massCalculation == goal) {
                    canPack = true;
                    break outer;
                }
            }
        }
        return canPack;
    }
}
/*
    1.  the exit condition is if we can add a bigCount <= initial bigCount and a smallCount <= smallCount
    to equal the goal
    2.  I can try a nested loop, the outer loop for the bigCount and the inner loop for the smallCount.
    3.  I can break out of the loop when bigCount * kilosForBigCount + smallCount = goal
    4.  If the loop ends without the break then the method will return false
*/
