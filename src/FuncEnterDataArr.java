import java.util.Scanner;

public class FuncEnterDataArr {

    DataCalculator dataCalculator = new DataCalculator();

    public void go() {
        System.out.println("Введите данные : ");
        Scanner reader = new Scanner(System.in);
        String st = reader.nextLine();
        for (int i = 0, j = 0; i < st.length(); i++) {
            if (st.charAt(i) != ' ' && st.charAt(i) != '-' && st.charAt(i) != '+' &&
                    st.charAt(i) != '*' && st.charAt(i) != '/') {

                if(dataCalculator.arrNumberA[j] == null) {
                    dataCalculator.arrNumberA[j] = String.valueOf(st.charAt(i));

                } else if (st.charAt(i) != ' ' | st.charAt(i) != '-' | st.charAt(i) != '+' |
                        st.charAt(i) != '*' | st.charAt(i) != '/') {
                    dataCalculator.arrNumberA[j] += String.valueOf(st.charAt(i));
                }

            } if (st.charAt(i) == '+' | st.charAt(i) == '-' | st.charAt(i) == '*' | st.charAt(i) == '/'){
                j++;
                dataCalculator.operator = String.valueOf(st.charAt(i));
            }
        }

    }

}
