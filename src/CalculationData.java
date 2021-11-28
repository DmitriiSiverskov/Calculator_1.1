import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;

public class CalculationData {
    int n1 = 0;
    int n2 = 0;
    int r = 0;
    int i = 0;
    boolean rim = false;
    StringCheck s = new StringCheck();
    StringCheck stringCheck = new StringCheck();


    int go(String[]a, String b) {

        if (stringCheck.go(a)){
            n1 = Integer.parseInt(a[0]);
            n2 = Integer.parseInt(a[1]);
        }
        else {
            rim = true;
        }
        if(rim){
            while (i != 2){
                switch (a[i]){
                    case "0": r += 0;
                    break;
                    case "I": r += 1;
                    break;
                    case "II": r = 2;
                    break;
                    case "III": r = 3;
                    break;
                    case "iV": r = 4;
                    break;
                    case "V": r = 5;
                    break;
                    case "VI": r = 6;
                    break;
                    case "VII": r = 7;
                    break;
                    case "VIII": r = 8;
                    break;
                    case "IX": r = 9;
                    break;
                    case "X": r = 10;
                }
                if(i == 0){
                    n1 = r;
                } else {
                    n2 = r;
                }
                i++;
            }
        }
        switch (b){
            case "-": r = n1 - n2;
                break;
            case "+": r = n1 + n2;
                break;
            case "*": r = n1 * n2;
                break;
            case "/": r = n1 / n2;
        }
        return r;
    }


}
