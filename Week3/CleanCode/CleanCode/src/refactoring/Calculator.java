package refactoring;

public class Calculator {
        int soDauTien;
    int soThuHai;
    char toanTu;
    public Calculator(){};
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static int calculator(int soDauTien, int soThuHai, char toanTu) {
        switch (toanTu) {
            case ADDITION:
                return soDauTien + soThuHai;
            case SUBTRACTION:
                return soDauTien - soThuHai;
            case MULTIPLICATION:
                return soDauTien * soThuHai;
            case DIVISION:
                if (soThuHai != 0)
                    return soDauTien / soThuHai;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
