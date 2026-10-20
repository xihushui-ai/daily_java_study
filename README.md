# daily_java_study

每天一点 Java。笔记 + 可运行的代码，按主题组织的长期知识库。

## 目录导航

| 主题 | 笔记 | 代码 |
| --- | --- | --- |
| 01 基础语法 | [docs/01-基础语法](docs/01-基础语法) | [study/basics](src/main/java/study/basics) |
| 02 面向对象 | [docs/02-面向对象](docs/02-面向对象) | [study/oop](src/main/java/study/oop) |
| 03 集合框架 | [docs/03-集合框架](docs/03-集合框架) | [study/collection](src/main/java/study/collection) |
| 04 异常与IO | [docs/04-异常与IO](docs/04-异常与IO) | [study/exception](src/main/java/study/exception) |
| 05 并发编程 | [docs/05-并发编程](docs/05-并发编程) | [study/concurrent](src/main/java/study/concurrent) |
| 06 JVM | [docs/06-JVM](docs/06-JVM) | [study/jvm](src/main/java/study/jvm) |
| 07 算法与数据结构 | [docs/07-算法与数据结构](docs/07-算法与数据结构) | [study/algo](src/main/java/study/algo) |

学习进度见 [docs/00-学习路线与进度.md](docs/00-学习路线与进度.md)。

## 目录约定

- `docs/` 只放 Markdown 笔记，一个主题一个文件，**文件名不写日期**
- `src/main/java/study/<主题>/` 放可运行的示例代码，包名与 `docs/` 编号一一对应
- `src/test/java/study/` 放 JUnit 5 测试
- 笔记里的图片放在该章节目录的 `images/` 下，用**相对路径**引用

## 环境

| 工具 | 版本 |
| --- | --- |
| JDK | 25+（本地 27） |
| IntelliJ IDEA | 2025.x |
| Maven | 3.9+（用 IDEA 自带的即可） |

## 常用命令

```bash
mvn compile   # 编译
mvn test      # 跑测试
```

## 提交规范

`类型(范围): 说明`，类型取 `docs` / `feat` / `fix` / `refactor` / `chore`。