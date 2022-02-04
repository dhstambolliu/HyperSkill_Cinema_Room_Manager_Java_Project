import java.util.Arrays;

class ArrayOperations {
    public static int[][][] createCube() {

        final int dim = 3;
        int[][][] cube = new int[dim][dim][dim];

        for (int i = 0; i < dim; i++) {
            int element = 0;
            for (int j = 0; j < dim; j++) {
                for (int k = 0; k < dim; k++) {
                    cube[i][j][k] = element++;
                }
            }
        }

        return cube;
    }
}
