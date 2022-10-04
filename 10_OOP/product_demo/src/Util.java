import java.text.DecimalFormat;

public class Util {
    public static String printCategory(Category[] categories){
        StringBuilder result = new StringBuilder(new String());
        for(Category category : categories){
            result.append(category.value);
            result.append(", ");
        }

        return result.toString();
    }

    public static String formatPrice(long price){
        DecimalFormat myFormat = new DecimalFormat("#,###,###,##0");
        String result = myFormat.format(price);
        return result;
    }
}
