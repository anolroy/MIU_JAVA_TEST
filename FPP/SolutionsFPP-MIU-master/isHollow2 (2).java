private static int isHollow(int[] array) {
    int length = array.length;
    int startCount = 0;
    int endCount = 0;
    int zeroCount = 0;
    int nonZeroCount = 0;

    if (array[0] == 0 || array[length - 1] == 0) return 0;

    for (int i = 0; i < length; i++) {
        if (array[i] != 0) {
            startCount++;
        } else {
            break;
        }
    }
    for (int i = 0; i < length; i++) {
        if (array[i] == 0) {
            zeroCount++;
        } else {
            nonZeroCount++;
        }
    }

    for (int i = length - 1; i >= 0; i--) {
        if (array[i] != 0) {
            endCount++;
        } else {
            break;
        }
    }

    if (startCount == endCount && (startCount + endCount) == nonZeroCount && zeroCount >= 3) {
        return 1;
    }
    return 0;
}