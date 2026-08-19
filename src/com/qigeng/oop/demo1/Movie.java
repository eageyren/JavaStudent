package com.qigeng.oop.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author eageyren
 * @Description
 * @date 2026年08月17日下午3:53
 */
// lombok技术可以实现为类自动添加getter setter方法、toString方法、无参构造器等
@Data // @Data注解可以为类自动生成getter setter方法、无参构造器、toString方法等
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private int id;
    private String name;
    private double price;
    private String actor;

}
