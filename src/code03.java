/**
 * @author eageyren
 * @Description 数据结构 = 连续 + 跳转
 * 数组：便于寻址，不便于增删改查
 * 链表：便于增删改查，不便于寻址
 * @date 2026年08月04日上午11:11
 */
public class code03 {

    // 一维数组快速求某区间的累加和
    // 第一种方法：二维表，空间换时间
    // 第二种方法：一维数组，时间换空间，eg:0~7 - 0~3 = 4~7
    public static class RangeSum {

        private int[] preSum;

        public RangeSum(int[] array) {
            int N = array.length;
            preSum = new int[N];
            preSum[0] = array[0];
            for (int i = 1; i < N; i++) {
                preSum[i] = preSum[i - 1] + array[i];
            }
        }

        public int rangeSum(int L, int R) {
            return L == 0 ? preSum[R] : preSum[R] - preSum[L - 1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        RangeSum rangeSum = new RangeSum(arr);
        System.out.println(rangeSum.rangeSum(0, 7));
        System.out.println(rangeSum.rangeSum(0, 3));
        System.out.println(rangeSum.rangeSum(4, 7));
    }

}
