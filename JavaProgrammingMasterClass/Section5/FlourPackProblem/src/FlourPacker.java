public class FlourPacker {
    final public static int bigBagWeight = 5;
    final public static int smallBagWeight = 1;

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean foundBagCombinations = false;
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        int totalWeight = bigCount * bigBagWeight + smallCount * smallBagWeight;

        if (totalWeight < goal) {
            return false;
        } else if (totalWeight == goal ){
            return true;
        } else {
            int newBigCount = bigCount;
            for (int count = newBigCount; count >= 0; count -= 1 ) {
                if (count * bigBagWeight <= goal) {
                    newBigCount = count;
                    break;
                }
            }
            for (int count = 0; count <= smallCount; count += 1) {
                totalWeight = newBigCount * bigBagWeight + count * smallBagWeight;
                if (totalWeight == goal) {
                    foundBagCombinations = true;
                    break;
                }
            }
        }
        return foundBagCombinations;
    }
}

/*
    The goal is to see if we can reach the goal with all bags given or if we can reach the goal with a subset for
    each category of bags given.

    1.  if total weight < goal return false
    2.  if total weight == goal return true;
    3.  else try to find bag combinations that work
        first find the largest number of bigCount bags that will go into goal
        if bigCount Weight > goal subtract 1 from big count until it is less than goal, this is the new number of
        bigCount bags.

        once the new number of bigCount is reached then we start at 1 for the small count bags
        if bigCount*bigBagWeight + smallCount*smallCountWeight = goal
        break out of loop
*/
