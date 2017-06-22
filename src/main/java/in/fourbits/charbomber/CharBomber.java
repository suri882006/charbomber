package in.fourbits.charbomber;

/**
 * Solution to blast the 2 or more same characters which are in a sequence.
 * 
 * For example Consider input String - "aabcccdee" O/P - bd
 *
 * @author Suraj Acharya
 */
 
public class CharBomber {

    /**
     * 
     * @param inputArray
     * @return 
     */
    public String BomberAlgo(char[] inputArray) {
        int currentPosition = 0;
        char recentMatchChar = '\0';
        int recentMatchPos = 0;
        int inputArrayLength = inputArray.length;
        boolean exists = false;
        while (currentPosition < inputArrayLength - 1) {
            if (inputArray[currentPosition] == '\0') {
            } else {
                if (inputArray[currentPosition] != inputArray[currentPosition + 1]) {
                    if (recentMatchChar == inputArray[currentPosition]) {
                        inputArray[currentPosition] = '\0';
                        inputArray[recentMatchPos] = '\0';
                        exists = true;
                    }
                    recentMatchChar = inputArray[currentPosition];
                    recentMatchPos = currentPosition;
                } else {
                    exists = true;
                    recentMatchChar = inputArray[currentPosition];
                    recentMatchPos = currentPosition;
                    inputArray[currentPosition] = '\0';
                    inputArray[currentPosition + 1] = '\0';
                }
            }
            currentPosition ++;
        }
        if (exists) {
            BomberAlgo(inputArray);
        }
        return new String(inputArray).trim().replaceAll("\0", "");
    }
}