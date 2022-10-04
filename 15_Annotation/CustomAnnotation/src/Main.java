import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User(1, "ngoc_eri", "ngoc@gmail.com",
                "12345", LocalDate.now());

        Field[] fields = user.getClass().getDeclaredFields();
        for (Field field : fields){
            field.setAccessible(true);
            JsonElement jsonElement = field.getAnnotation(JsonElement.class);
            String fieldname = jsonElement.name();
            Object fieldValue = field.get(user);
            Type fieldType = jsonElement.type();
            boolean isPrimaryKey = jsonElement.isPrimaryKey();

            System.out.println("Field Name : " + fieldname);
            System.out.println("Field Value: " + fieldValue);
            System.out.println("Field Type: " + fieldType);
            System.out.println("Primary Key: " +isPrimaryKey);

            System.out.println();

        }
    }
}