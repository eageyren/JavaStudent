package com.qigeng.code;

/**
 * @author eageyren
 * @Description 随机函数
 * @date 2026年08月05日下午7:13
 */
public class code04 {

    public static void main(String[] args) {

        // Math.random() 生成一个[0,1)之间的随机数 double类型
        int testTimes = 1000000;
        int count = 0;
        for (int i = 0; i < testTimes; i++) {
            if (Math.random() < 0.5) {
                count++;
            }
        }
        System.out.println((double) count / (double) testTimes);

        System.out.println("--------------------");

        // Math变形，范围变为[0,K)之间的随机数
        int K = 9;

        int[] counts = new int[9];
        for (int i = 0; i < testTimes; i++) {
            int ans = (int) (Math.random() * K);
            counts[ans]++;
        }
        for (int i = 0; i < K; i++) {
            System.out.println(i + "出现的次数" + counts[i]);
        }

        System.out.println("--------------------");

        // 验证g函数的等概率性
        counts = new int[8];
        for (int i = 0; i < testTimes; i++) {
            int num = g();
            counts[num]++;
        }
        for (int i = 1; i < 8; i++) {
            System.out.println(i + "出现的次数" + counts[i]);
        }
    }

    // 任意的x，x属于[0,1），[0,x)范围上的数出现的概率由原来的x调整为x的平方
    public static double xToXPower2() {
        return Math.max(Math.random(), Math.random());
        // 三次方，return Math.max(Math.random(), Math.max(Math.random(), Math.random()));
        // 1 - ( 1 - x ) * 2 , Math.max(Math.random(), Math.random());
    }

    // 等概率返回1~5之间的数，不能改动f1
    public static int f1() {
        return (int) (Math.random() * 5) + 1;
    }

    // 等概率返回0和1
    public static int f2() {
        int ans = 0;
        do {
            ans = f1();
        } while (ans == 3);
        return ans < 3 ? 0 : 1;
    }

    // 等概率返回0~7之间的数
    public static int f3() {
        return (f2() << 2) + (f2() << 1) + f2();
    }

    // 等概率返回0~6之间的数
    public static int f4() {
        int ans = 0;
        do {
            ans = f3();
        } while (ans == 7);
        return ans;
    }

    // 等概率返回1~7之间的数
    public static int g() {
        return f4() + 1;
    }

    // 已知，x会以固定概率返回0和1，但是x的内容不知道
    public static int x() {
        return Math.random() < 0.84 ? 0 : 1;
    }

    // 等概率返回0和1
    public static int y() {
        int ans = 0;
        do {
            ans = x();
        } while (ans == x());
        return ans;
    }
}
