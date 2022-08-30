public class Main {
    public static void main(String[] args) {
        int[] intArray;
        intArray = new int[5];
        intArray[0] = 9;
        intArray[1] = 23;
        intArray[2] = 8;
        intArray[3] = -12;
        intArray[4] = 7;
        //intArray[5] = 3;

        System.out.println("Sử dụng for loop: ");
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + "\t");
        }
        System.out.println();

        System.out.println("Sử dụng while loop: ");
        int j = 0;
        while (j < intArray.length){
            System.out.print(intArray[j] + "\t");
            j++;
        }
        System.out.println();

        System.out.println("Phần tử là số chẵn: ");
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] % 2 == 0){
                System.out.print(intArray[i] + "\t");
            }
        }
        System.out.println();

        int max = intArray[0];
        for(int i = 1; i < intArray.length; i++){
            if(max < intArray[i]){
                max = intArray[i];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);

        System.out.println(intArray[2]);

        float[] floatArray = new float[3];
        System.out.println(floatArray[0]);

        String[] strArray = {"Java", "JS", "PHP", "C/C++"};
        System.out.println("Kích thước mảng: " + strArray.length);
        System.out.println("Phần tử cuối cùng: " +strArray[strArray.length - 1]);
    }
}