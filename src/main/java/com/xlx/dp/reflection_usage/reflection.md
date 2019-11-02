# Reflection Usages

## 反射API
### Field类
+ 提供有关类的**属性**信息,以及对它的动态访问权,他是一个封装**反射类的属性**的类
### Constructor类
+ 提供有关类的**构造方法**的信息,以及对它的动态访问权,他是一个封装**反射类构造方法**的类
### Method类
+ 提供有关类的**方法**的信息,包括抽象方法,他是一个封装**反射类方法**的类
### Class类
+ 表示正在运行的Java应用程序中的类实例
### Object类
+ Object是所有Java类的父类,所有对象都默认实现了Object类的方法

## 获取Class类对象的三种方式
+ 下面三种方法获取到的Class对象是同一个,即Java运行时,每一个类只会产生一个Class对象
### Class类的静态方法,forName(String class);
+ 参数需指定类的全路径名称
> Class<?> stuClass = Class.forName("com.xlx.dp.reflection_usage.Student");

### 使用类名.class()方法
+ 需要导包
> Class<Student> stuClass2 = Student.class;

### 使用Object方法
+ 已经产生对象,不需要反射
> Student student = new Student();
> Class<? extends Student> stuClass3 = student.getClass();
