package com.qigeng.oop.demo1;

import java.util.Scanner;

/**
 * @author eageyren
 * @Description 电影操作类
 * @date 2026年08月17日下午3:53
 */
public class MovieOperator {

    public void show(Movie[] movies) {
        // 打印所有id、name、price、actor
        System.out.println("============电影表单================");
        for (Movie movie : movies) {
            System.out.println(movie.getId() + "\t" + movie.getName() + "\t" + movie.getPrice() + "\t" + movie.getActor());
        }

    }

    public void search(Movie[] movies) {
        // 获取用户输入的id，根据用户输入的id查询
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的电影id：");
        int id = sc.nextInt();
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                System.out.println(movie.getId() + "\t" + movie.getName() + "\t" + movie.getPrice() + "\t" + movie.getActor());
                return;
            }
        }
        System.out.println("没有找到该电影！");
    }
}