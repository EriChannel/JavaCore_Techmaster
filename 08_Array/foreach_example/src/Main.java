public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};

        for(int i : array){
            System.out.print(i + "\t");
        }
        System.out.println();

        for(int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        int max = array[0];
        for(int i : array){
            if(max < i){
                max = i;
            }
        }

        System.out.println("Phần tử lớn nhất: " + max);

        for(int i : array){
            if(i == 4){
                i = 40;
            }
        }

        for(int i : array){
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}