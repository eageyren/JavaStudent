package com.qigeng.code;

/**
 * @author eageyren
 * @Description 对数器的使用
 * @date 2026年08月11日下午4:55
 */
public class code05 {

    // 返回一个数组arr，arr长度[0,maxLen-1],arr中的值[0,maxValue-1]
    public static int[] lenRandoomValueRandom(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen);
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = (int) (Math.random() * maxValue);
        }
        return ans;
    }

    // 复制数组
    public static int[] copyArray(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int maxLen = 10;
        int maxValue = 100;
        int testTime = 1000000;
    }

}
