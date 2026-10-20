# Scanner 与 switch

> 日期：2026-10-20 ｜ 标签：#基础语法 #输入输出 #分支
> 对应代码：`src/main/java/study/basics/SwitchDemo.java`

## 一句话结论

`Scanner` 负责从标准输入读数据，`switch` 负责按值分支；命中固定值集合时用 switch，比一长串 `if-else` 清晰。

## 核心概念

- `Scanner(InputStream)`：`next()` 读一个以空白分隔的字符串，`nextInt()` 读整数，`nextLine()` 读一整行。
- `switch` 支持 `byte / short / char / int`、对应包装类、`String`、`enum`。
- 箭头形式 `case X -> ...`（Java 14+）不会贯穿，不需要 `break`；分支要多条语句时用 `{ }` 包起来。
- `default` 处理所有没匹配上的值，建议永远保留。
- 对 `null` 做 switch 会抛 `NullPointerException`。

## 代码示例

见 `src/main/java/study/basics/SwitchDemo.java`：

```java
switch (noodles) {
    case "火鸡面"     -> System.out.println("吃火鸡面");
    case "武汉热干面" -> System.out.println("吃武汉热干面");
    default          -> System.out.println("吃方便面");
}
```

## 运行结果

```
输入：火鸡面
输出：吃火鸡面
```

## 踩坑与疑问

- `next()` 之后再调 `nextLine()` 会读到空串：`next()` 把换行留在了缓冲区。
- 输入中文在 Windows 自带 cmd 里乱码，需 `chcp 65001`；IDEA 控制台默认 UTF-8，不会乱码。

## 小结 / 待复习

- [x] 箭头 switch 与穿透 switch 的区别
- [ ] `switch` 表达式（`yield`）的用法，写到后面补