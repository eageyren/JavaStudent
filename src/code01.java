/**
 * @author eageyren
 * @Description 位运算
 * @date 2026年08月03日上午9:16
 */
public class code01 {

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        print(a);
        print(b);
        System.out.println("--------------------");
        print(a << 1);//左移
        print(a >> 1);//右移
        System.out.println("--------------------");
        print(a & b);//与
        print(a | b);//或
        print(a ^ b);//异或，不同为1，相同为0
        System.out.println("--------------------");
        int c = Integer.MIN_VALUE;
        print(c);
        print(c >> 1);//有符号右移
        print(c >>> 1);//无符号右移
    }
}


