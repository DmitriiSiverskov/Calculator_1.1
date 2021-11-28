public class Start {

    static FuncEnterDataArr fed = new FuncEnterDataArr();
    static CalculationData cd = new CalculationData();
    static StringCheck sc = new StringCheck();
    static DataCalculator dc = new DataCalculator();

    public static void main(String[] args) {
        try {
            fed.go();
            cd.go(fed.dataCalculator.arrNumberA, fed.dataCalculator.operator);
            if (sc.b) {
                System.out.println(cd.r);
            } else {
                if(cd.r == -1){
                    System.err.println("в римской системе нет отрицательных чисел");

                } else {
                    System.out.println(dc.arrRim[cd.r]);
                }
            }
       }catch (ArrayIndexOutOfBoundsException e){
            System.err.print("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }catch (NullPointerException np){
            System.err.print("строка не является математической операцией");
        }catch (NumberFormatException ne){
            System.err.print("используются одновременно разные системы счисления");
        }
    }
}
