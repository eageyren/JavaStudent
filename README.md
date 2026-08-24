# JavaStudent

Java 基础与面向对象练习项目，记录 Java 学习过程中的算法、随机数以及 OOP 综合案例。项目使用 IntelliJ IDEA 管理，源码位于 `src` 目录。

## 学习内容

### 基础与算法练习

| 文件 | 内容 |
| --- | --- |
| `code01.java` | 位运算、移位运算、位逻辑运算，以及整数的 32 位二进制表示 |
| `code02.java` | 选择排序、冒泡排序、插入排序和数组操作工具 |
| `code03.java` | 一维数组前缀和、区间求和，以及数组/链表数据结构练习 |
| `code04.java` | `Math.random()`、概率、区间映射和等概率随机函数构造 |
| `code05.java` | 对数器基础，包括随机数组生成和数组复制 |

`code05.java` 目前主要用于准备对数器所需的工具方法，示例入口中尚未完成完整的算法对比流程。

### 面向对象综合案例

#### 电影信息查询：`oop/demo1`

通过 `Movie` 封装电影编号、名称、评分和主演等信息，使用 `MovieOperator` 完成电影列表展示和按编号查询。

入口类：`com.qigeng.oop.demo1.Test`

运行后会先显示预置的 5 部电影，再根据输入的电影编号查询电影详情。

#### 加油站支付：`oop/demo2`

模拟加油站刷卡支付，演示继承、封装、多态和方法重写：

- `Card`：金卡和银卡的父类，封装卡号、用户名、手机号和余额等信息。
- `GoldCard`：消费享受 8 折优惠，消费满 200 元时打印洗车票。
- `SilverCard`：消费享受 9 折优惠。
- `Test`：创建金卡和银卡，并通过统一的 `pay(Card)` 方法完成支付。

入口类：`com.qigeng.oop.demo2.Test`

运行后根据提示输入当前消费金额即可体验两种卡片的支付逻辑。

## 项目结构

```text
Studentcode/
├── README.md
└── src/
    └── com/qigeng/
        ├── code/
        │   ├── code01.java
        │   ├── code02.java
        │   ├── code03.java
        │   ├── code04.java
        │   └── code05.java
        └── oop/
            ├── demo1/
            │   ├── Movie.java
            │   ├── MovieOperator.java
            │   └── Test.java
            └── demo2/
                ├── Card.java
                ├── GoldCard.java
                ├── SilverCard.java
                └── Test.java
```

## 运行环境

- JDK 17
- IntelliJ IDEA
- Lombok 1.18.30

## 在 IntelliJ IDEA 中运行

1. 使用 IntelliJ IDEA 打开项目目录。
2. 将项目 SDK 设置为 JDK 17。
3. 确保 IntelliJ IDEA 已安装并启用 Lombok 插件，并配置 Lombok 1.18.30 依赖。
4. 在项目视图中打开任意入口类的 `main` 方法并运行：
   - `com.qigeng.code.code01` 至 `com.qigeng.code.code05`
   - `com.qigeng.oop.demo1.Test`
   - `com.qigeng.oop.demo2.Test`

运行 `demo1` 和 `demo2` 时，需要在控制台按程序提示输入电影编号或消费金额。

## 使用 JDK 命令行运行基础练习

`code` 目录下的基础练习不依赖 Lombok，可以直接使用 JDK 17 编译运行：

```bash
# 在项目根目录执行
javac -encoding UTF-8 -d out src/com/qigeng/code/*.java
java -cp out com.qigeng.code.code01
```

将最后一行中的类名替换为 `code02`、`code03`、`code04` 或 `code05`，即可运行对应示例。面向对象案例使用了 Lombok，建议优先在 IntelliJ IDEA 中运行。

## 说明

这是一个用于学习和练习的示例项目，代码会随着学习进度持续补充和完善。
