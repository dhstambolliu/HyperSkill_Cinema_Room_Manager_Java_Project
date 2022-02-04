class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {

        int[][] newArray = new int[twoDimArray.length][twoDimArray[0].length];

        for (int a = 0; a <= newArray.length - 1; a++) {
            for (int b = 0; b <= newArray[a].length - 1; b++) {
                newArray[a][newArray[a].length - 1 - b] = twoDimArray[a][b];
            }
        }

        for (int c = 0; c <= newArray.length - 1; c++) {
            for (int d = 0; d <= newArray[c].length - 1; d++) {
                twoDimArray[c][d] = newArray[c][d];
            }
        }
    }
}