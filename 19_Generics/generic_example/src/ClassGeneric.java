public class ClassGeneric <T>{

    private T obj;

    public ClassGeneric() {
    }

    public ClassGeneric(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
