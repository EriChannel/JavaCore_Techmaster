public class ArrayDemo<T> {
    T[] array;

    public boolean add(int index, T element){
        if(index < 0 || index >= array.length){
            return false;
        }else {
            array[index] = element;
            return true;
        }
    }

    public void print(){
        for(T t: array){
            System.out.print(t + "\t");
        }
        System.out.println();
    }

    public T get(int index){
        if(index < 0 || index >= array.length){
            return null;
        }else {
            return array[index];
        }
    }
}
