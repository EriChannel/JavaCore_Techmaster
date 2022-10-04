public class Contact <K, V>{

    private K name;
    private V mobile;

    public Contact(K name, V mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public V getMobile() {
        return mobile;
    }

    public void setMobile(V mobile) {
        this.mobile = mobile;
    }

    public boolean isKeyEquals (K anotherKey){
        return this.name.equals(anotherKey);
    }
}
