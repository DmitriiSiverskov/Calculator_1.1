import org.jetbrains.annotations.NotNull;

import java.text.NumberFormat;
import java.text.ParsePosition;

public class StringCheck {

  static boolean b = true;

    boolean go(@NotNull String[] a) {
        String n1 = a[0] + a[1];

        char[] chars = n1.toCharArray();
        for (char character : chars) {
            if (Character.isDigit(character)) {
                b = true;
            } else {
                b = false;
            }
        }
        return b;
    }
}