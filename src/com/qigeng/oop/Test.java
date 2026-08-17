package com.qigeng.oop;

/**
 * @author eageyren
 * @Description
 * @date 2026年08月17日下午3:53
 */
public class Test {
    public static void main(String[] args) {
        // 目标：完成面向对象的综合小案例。
        // 1、设计电影类Movie，以便创建电影对象，封装电影数据。over
        // 2、封装系统中的全部电影数据。（自己造一些数据）
        Movie[] movies = new Movie[5];
        movies[0] = new Movie(1, "肖申克的救赎", 9.9, "蒂姆·罗宾斯");
        movies[1] = new Movie(2, "霸王别姬", 8.9, "张国荣");
        movies[2] = new Movie(3, "阿甘正传", 7.9, "汤姆·汉克斯");
        movies[3] = new Movie(4, "泰坦尼克号", 6.9, "莱昂纳多·迪卡普里奥");
        movies[4] = new Movie(5, "盗梦空间", 5.9, "莱昂纳多·迪卡普里奥");
        // 3、创建电影操作对象出来，专门负责电影数据的业务操作。
        MovieOperator mo = new MovieOperator();
        mo.show(movies);
        mo.search(movies);
    }
}
