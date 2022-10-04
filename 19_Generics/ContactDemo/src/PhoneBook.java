public class PhoneBook <K, V>{
    private Contact<K, V>[] contacts;

    public PhoneBook(Contact<K, V>[] contacts) {
        this.contacts = contacts;
    }

    public V findName(K name){
        for(Contact<K, V> contact : contacts){
            if(contact.isKeyEquals(name)){
                return contact.getMobile();
            }
        }
        return null;
    }
}
