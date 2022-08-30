public class Main {
    public static void main(String[] args) {

        int row = 3;
        int col = 4;
        int[][] intArray = new int[row][col];

        intArray[0][0] = 4;
        intArray[0][1] = 9;
        intArray[0][2] = 2;
        intArray[0][3] = 37;

        intArray[1][0] = 6;
        intArray[1][1] = 4;
        intArray[1][2] = -6;
        intArray[1][3] = 57;

        intArray[2][0] = 8;
        intArray[2][1] = 7;
        intArray[2][2] = 14;
        intArray[2][3] = 5;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(intArray[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println(intArray[2][3]);
    }
}