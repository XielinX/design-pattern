package com.xlx.dp.reflection_usage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取Class对象实例方法
 *
 * @author xielx at 2019/11/2 16:09
 */
public class ClassInstance {
    
    /**
     * 获取Class对象的三种方式
     */
    public static void getClassInstance() throws ClassNotFoundException {
        // 1.使用Class类的静态方法forName(String class);
        Class<?> stuClass = Class.forName("com.xlx.dp.reflection_usage.Student");
        
        // 2.使用类名.class()方法
        Class<Student> stuClass2 = Student.class;
        
        // 3.使用Object方法,
        Student student = new Student();
        Class<? extends Student> stuClass3 = student.getClass();
    
        System.out.println("Class对象============");
        System.out.println(stuClass);
        System.out.println(stuClass2);
        System.out.println(stuClass3);
        System.out.println("stuClass == stuClass2 ? " + (stuClass == stuClass2));
        System.out.println("stuClass2 == stuClass3 ? " + (stuClass2 == stuClass3));
    }
    
    /**
     * 获取成员变量
     * getDeclaredFields():获取所有声明的字段,包括公有和私有字段
     * getFields():获取所有公有的字段
     */
    public static void getFieldValue() throws ClassNotFoundException {
        Class<?> stuClass = Class.forName("com.xlx.dp.reflection_usage.Student");
        // 获取所有声明的字段,包括公有和私有字段
        Field[] declaredFields = stuClass.getDeclaredFields();
        System.out.println("************所有字段************");
        for (Field field : declaredFields) {
            System.out.println(field);
        }
    
        // 获取所有公有的字段
        Field[] fields = stuClass.getFields();
        System.out.println("************公有字段************");
        for (Field field : fields) {
            System.out.println(field);
        }
    }
    
    /**
     * 获取构造方法
     * getDeclaredConstructors(): 所有构造方法
     * getConstructors():公有构造方法
     */
    public static void getConstructor() throws ClassNotFoundException {
        Class<?> stuClass = Class.forName("com.xlx.dp.reflection_usage.Student");
        Constructor<?>[] declaredConstructors = stuClass.getDeclaredConstructors();
        System.out.println("******所有构造方法:");
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        
        System.out.println("******公有构造方法:");
        Constructor<?>[] constructors = stuClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
    
    /**
     * 获取非构造方法
     * getDeclaredMethods():无法获取父类方法
     */
    public static void getUnConstructorMethod() throws ClassNotFoundException {
        Class<?> stuClass = Class.forName("com.xlx.dp.reflection_usage.Student");
        // 获取所有非构造函数
        Method[] declaredMethods = stuClass.getDeclaredMethods();
        System.out.println("*******所有非构造方法");
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
        
        // 获取公共的非构造函数,包括父类
        System.out.println("*******公共方法");
        Method[] methods = stuClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    
    }
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        // 1.获取Class对象
        Class<?> stuClass = Class.forName("com.xlx.dp.reflection_usage.Student");
       
        // 2.获取有参构造
        Constructor<?> constructor = stuClass.getDeclaredConstructor(String.class);
        // 私有构造,需要设置访问权限
        constructor.setAccessible(true);
       
        // 3.使用构造实例化Student对象(传参数)
        Object student = constructor.newInstance("zhang");
        
        // 4.属性
        Field age = stuClass.getDeclaredField("age");
        // 私有字段设置
        //age.setAccessible(true);
        
        // 5.赋值
        age.set(student,10);
        
        // 6.获取函数(方法名,方法参数)
        Method showMethod = stuClass.getDeclaredMethod("show", String.class);
        showMethod.setAccessible(true);
    
        // 7.调用实例方法
        Object returnValue = showMethod.invoke(student, "message");
        System.out.println("show方法的返回值:" + returnValue);
    }
}
