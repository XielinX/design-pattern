# Design-Pattern
大话设计模式
:alarm_clock: 表示不太明白
## 工厂模式
### 定义
+ 使用一个单独的类或方法,来创建实例
### 应用场景

## 策略模式
### 定义 
+ :alarm_clock:
+ 封装算法,提供一个抽象方法
### 应用场景


## 设计模式的五大原则
### 单一职责原则(SRP)
+ 一个类只有一个因其它变化的原因
+ 理解:
  + 分工明确才能做到全局影响最小
### 开放-封闭原则(OCP)
+ 对于软件实体,扩展是开放的,更改是封闭的
+ 理解:
  + 09:00上班,有些人离公司远会迟到,但又不可能修改上班时间,
  + 所以可以弹性调班,迟到多久,下班自愿加班多久
### 里式原则(L)
+ 子类能够出现在父类出现的任何地方,也能代替
+ 理解: 
  + CS游戏,定义了枪,子类有各种枪:手枪,步枪
### 接口隔离原则(I)
+ 专门的接口要比单一的接口好
+ 理解: 
  + 单一接口有工作和吃饭两个方法,对于人来说符合,但是机器人的吃饭却不符合
  + 应该分为吃饭和各种两个接口
### 依赖倒置原则(D)
+ 高层不依赖于低层,都应该依赖于抽象
+ 抽象不依赖于细节,细节依赖于抽象
+ 理解:
  + 传统结构化模式,高层模块高度依赖于低层,订单模块Order,修改订单需要访问数据库
  + 假设当前使用access,如果后期更换为Oracle或者MySQL,需要修改订单类中的数据库访问模块
  + 所以需要将低层数据库访问抽象化为一个数据访问类,不同数据访问细节通过依赖于抽象

### 迪米特法则
+ 也叫最少知识原则
+ 如果两个类不必彼此直接通信,那么这两个类就不应当发生直接的相互作用.
+ 如果其中一个类需要调用另一个类的某一个方法,可以通过第三方转发这个调用
+ 前提:
  + 在类的结构设计上,每一个类应当尽量降低成员的访问权限
  + 就是不需要让别的类知道属性和行为就不公开,也是面向对象的封装
+ 强调类之间的松耦合,(两者没有过多的依赖关系),耦合越弱,一个类修改,也不会对其他类产生影响



## 装饰模式
### 定义
+ :alarm_clock:
+ 理解:
  + 没弄懂
  + 变形金刚组合?层层叠加?
### 应用场景

##代理模式
### 静态代理
#### 定义
+ 为其他对象提供一种代理来控制对这个对象的访问
+ 理解
  + 追求者boy暗恋班花girl,害羞不敢表达(想送花,巧克力),委托同桌小王完成(送花,送巧克力)
  + 追求者boy与代理者小王都有相同的行为,所以可以抽取出来,使用抽象类/接口(推荐)
  + 其实这属于静态代理
    + 代理者只能代理一个人
    + 追求者与代理者都必须实现相同的方法
### 应用场景
+ 远程代理
  + 通过软件,远程控制电脑

### 动态代理
#### 定义
+ 
### 应用场景

## 工厂方法模式
### 定义
+ 定义一个用于创建对象的接口,让子类决定实例化哪一个类
+ 理解:
  + 学习雷锋同志做好事
  + 大学生以雷锋为榜样,到社区热心服务
  + 志愿者以雷锋为榜样,到社区热心服务
 + 要区分**简单工厂**模式
### 应用场景

## 原型模式
### 定义
+ 用原型实例指定创建对象的种类,并且通过拷贝这些原型创建新的对象
+ 理解:
  + 简历有名称name,设置年龄age,性别gender,设置工作经历(这是一个类)
  + 现在需要打印三份不同经历的简历
### 使用了克隆知识
+ 必须实现Cloneable接口
+ 可以重写clone()方法

####浅拷贝
+ 会拷贝基本类型的值,一样
+ 引用类型的引用地址也一样
####深拷贝
+ 会拷贝基本类型的值,一样
+ 引用类型的引用地址不一样

```java
public class Test{
    public static void main(String[] args){
      Resume resume = new Resume();
      Resume clone = resume.clone();
      // 基本类型true
      resume.age == clone.age;
      // 浅克隆引用类型true
      resume.experise == clone.experise;
      
      // 深克隆引用类型false
      resume.experise == clone.experise;
    }
}
```
### 应用场景

## 模板方法模式
### 定义
+ 提取公共行为到抽象类中
+ 理解:
  + 老师在黑板布置了几道题,同学们抄在作业本上做题
  + 题目都是一样的(学生也可能会抄错),只是答案不一样而已
  + 所以会把题目和回答问题的方式抽象化,学生只需要提交答案就行了

## 外观模式
### 定义
+ 为子系统中的一组接口提供一个一致的界面
+ 理解1:
  + 股民炒股,会买不同种类的股票,买进抛出来赚取差价.
  + 但现在有一个基金,股民只需要关注基金涨幅即可,自己不用考虑各种股票行情
  + 然后依靠基金负责各个股票的买入与抛售
  
+ 理解2:
  + dao层进行数据库访问后,会有结果返回(受影响行数或结果集)
  + 有一个统一结果返回规范Result类,用户执行某个操作,不需要知道执行数据库的操作结果,
  + 用户通过这个统一结果返回规范知道操作的成功与否
  
  
## 建造者模式
### 定义
+ 将一个复杂对象的构建与它的表示分离,使得同样的构建过程可以创建不同的表示
+ 理解:
  + 玩具生产,它由不同零件组装成
  + 先定义一个玩具类型 class Product
    + 零件属性 
    + 添加零件方法 addPart()
    + 玩具展示方法 show()
  + 抽象生产方式(提取共同生产方式) abstract class Builder
    + 各个零件组装方法 abstract buildPartA()
    + 成品组装方法 abstract createProd()
  + 具体某种玩具的生产(抽象生产方式的实现) class DuckBuilder
    + 生产小黄鸭玩具 yellowDuck
    + 生产惨叫鸡玩具 scrimChicken 
  + 统一指导建造过程(用户不用知道如何建造,只需与建造者沟通即可) class Director
    + 产品全部组装方法 construct(Builder builder)
    
  + 客户只需要调用构建者


## 观察者模式
+ 也叫发布-订阅模式
### 定义
+ 定义了一种一对多的依赖关系,让多个观察者对象同时监听某一个主题对象,
+ 这个主题对象在状态发生变化时,会通知所有观察者对象,使他们能够自动更新自己

+ 理解:
  + 摸鱼的一天,员工想摸鱼,想要前台的小姐姐帮忙望风,老板来了知会一声
  + 望风的人
    + 有多少人要告知
    + 如何告知
    + 上面的行为可以抽象为接口
  + 想摸鱼的人
    + 都具有希望被通知
    + 可以抽象为一个抽象类
     
### 运用场景
+ 当一个对象的改变需要同时改变其他对象时
+ 这其实就是解耦,使双方都依赖于抽象,而不是具体

## 抽象工厂模式
### 定义
+ **提供一个创建一系列相关或相互依赖的的对象的接口(创建对象的接口)**
+ 理解:
  + 1实体类User,数据库操作类AccessUser(insert(User u);delete user(id);方法)
  + 简单应用场景:实例化db操作类对象,然后调用相应方法
  + 2假如更换数据库为SQLServer,需要增加数据库操作类SQLServerUser(同样的方法)
  + 3发现db操作类方法类似,可以抽象出来做接口,IUser(insert();delete();)
  + 4这样就必须要创建对应的接口实现类,AccessUserImpl类,SQLServerUserImpl类,应用场景依然实例化它们调用方法
  + 5IUser的实现类都要先实例化,又抽象出来一个实例化操作的接口IFactory( IUser createUser();) `抽象工厂模式`
  + 实现场景只需实例化对应创建的具体工厂实例,AccessFactory类/SQLServerFactory类
  + 优化:
    + 也是需要new xxxFactory();可以使用简单工厂模式实例类对象
    + DataAccess类
    + 进一步优化,使用反射取代`switch`
```java
public class DataAccess{
    
    private static final String DB = "SQLServer";
    public static IUser createUser(){
        IUser user = null;
        switch (DB){
            case "SQLServer":
                user = new SQLServerUser();
                break;
            case "Access":
                user = new AccessUser();
                break;
            default:
                user = null;    
        }
        return user;
    }
    
    // 新增部门Department
    public static IDepartment createDepartment(){
            IDepartment department = null;
            switch (db){
                case "SQLServer":
                    department = new SQLServerDepartment();
                    break;
                case "Access":
                    department = new AccessDepartment();
                    break;
                default:
                    department = null;    
            }
            return department;
        }
}
```    
### 运用场景


## 状态模式
### 定义    
+ 当一个类对象状态改变时会影响其行为,看作是类对象改变其类
+ 理解:
  + QQ的状态,
    + 上线
    + 下线
    + 隐身
    + 注销
```java
public class State{
    
    private String status;
    public static void main(String[] args){
        // Long Method长方法(重构)
        if(Objects.equals("online",status)){
          // todo
        }else if(Objects.equals("offline",status)){
            // todo
        }else if(Objects.equals("hidden",status)){
            // todo
        }else if(Objects.equals("logout",status)){
            // todo
        }else{ 
            // todo 
        }
  }
}
```
### 应用场景
+ 当控制对象状态转变条件过于复杂时,把状态的判断逻辑转移到不同状态的类里面,以便将复杂的逻辑简化
+ 一般会使用枚举类型存储不同类型

## 适配器模式
### 定义
+ 将接口转换成另一种接口,从而使原本由于接口不兼容而不能工作的类一起工作
+ 理解:
  + 球队踢球,有前锋,中锋,后锋的球员.
  + 现在球队新加入一个外籍球员,但是不会说英语
  + 你不可能要求大家来学一门语言吧
  + 所以需要适配,请一名翻译人员来翻译给他
### 应用场景
+ 一般应用于类或接口不太容易更改的前提下,提出一个兼容的办法来解决


## 备忘录模式
### 定义
+ 在不破坏封装性的前提下,捕获一个对象的内部状态,并在对象之外保存这个状态,以后就可以将该对象恢复到原此保存的状态
+ 理解: 
  + 以前的单机游戏
  + 玩到那个部分,可以存档
  + 退出后,不用重新玩过

### 应用场景
+ 适用于功能比较复杂,但需要记录或维护属性历史的类


## 组合模式
### 定义
+ 将对象组合成树形结构,来表示部分与整体的层次结构
+ 理解:
  + 公司与分公司
  + 北京总部
    + 人事部
    + 维修部
    + 研发部
    + 上海分公司
      + 人事部门
      + 研发部门
### 应用场景
+ 部分与整体的组合 


## 迭代器模式
### 定义
+ 提供一种方法顺序访问一个聚合对象中各个元素,而不是暴露该对象的内部表示
+ 理解:
  + 集合的迭代方法 Iterate
### 应用场景
+ 集合迭代遍历



## 单例模式
### 定义
+ 保证一个类仅有一个实例,并提供一个访问他的全局访问点
### 应用场景



## 桥接模式
### 定义
+ 将抽象部分与他的实现部分分离,使他们都可以独立的变化
+ 理解:
  + 手机品牌和要安装的手机软件
  + 手机品牌
    + M型
    + A型
  + 安装的手机软件
    + 游戏
    + 通讯录
### 应用场景
+ 组合方式(has)


## 命令模式
### 定义
+ 将一个请求封装成一个对象,从而可以使用不同的请求对客户经行参数化
+ 理解:
  + 撸串
  + 客人
    + 订单:2瓶啤酒,3只猪脚,4串羊肉
  + 服务员
    + 把菜单送给厨师制作
  + 厨师收到服务员的菜单,开始烤肉  
### 应用场景
+ 容易设计成命令队列
+ 写入日志
+ 撤销和恢复



## 职责链模式
### 定义
+ 使多个对象都有机会处理请求,从而避免发送者和接收者之间的耦合关系,将这个对象连成一条链,并沿着这条链传递该请求,直到请求完成为止
+ 理解:
  + 想要加薪,跟经理说,经理向总监说,总监向总经理说,总经理批准
  + 抽象的管理者
    + 经理
    + 总监
    + 总经理
  + 申请/请求   
### 应用场景
+ 权限处理情景,需要更高的职位处理


## 中介者模式
### 定义
+ 用一个中介对象来封装一系列的对象交互,中介者使各对象不需要显示地相互引用,从而使其相互耦合松散
+ 理解:
  + 国家与国家之间的冲突,联合国来当中介调节国家之间的纷争
  + 
### 应用场景
+ 对象定义良好但是复杂的通信场景 


## 享元模式
### 定义
+ 利用共享技术,有效的支持大细粒度的对象
+ 内部状态:
  + 在享元对象内部并且不会随环境变化而变化的共享部分
+ 外部状态:
  + 在大量的细粒度化的类实例里,可能这些实例除了几个参数外基本都是相同的,
  + 可以把参数移到类实例外,在方法调用时传递进来,就可以减少类实例的开销
+ 理解:
  + 1.设计了一个网站,客户A想要,客户B也想要一个类似网站,可以共享出相同的代码,来减少开销
  + 2.围棋游戏
    + 黑白棋子的颜色,就是它的内部状态,不管如何变化颜色都是黑/白
    + 下棋的位置,就是外部状态,
    + 围棋有361个空间位置,常规面向对象编程可能会实例出几百个棋子对象,效率低
    + 使用享元模式,就只有2个黑/白颜色对象,处理下棋时不同的位置就行
### 应用场景
+ 一个应用程序使用了大量的对象,大量对象会造成内存开销
+ 使用了大量的外部状态,如果减少外部状态,使用少量共享对象代替


## 解释器模式
### 定义
+ 给定一个语言,定义他的文法的一种表示,并定义一个解释器,解释器用来解释语言中表示的句子
+ 理解:
  + 战争时传输情报的密码本
  + 发送密文
  + 根据密码本解密密文
  + 获得明文情报
### 应用场景
+ 浏览器的搜索栏,使用正则表达式去匹配
+ 智能机器人
+ 语言翻译,英文翻译中文


## 访问者模式
### 定义
+ 作用于某对象结构中各元素中的操作
+ 理解案例:
  + 根据不同人的状态处理案例
  + 抽象的人Person
    + accept(State state)方法
  + 具体实现类
    + 男人类:重写父类方法,调用state来获取人状态时的样子
    + 女人类:
  + 抽象的状态类State
    + 男人的状态方法,getManState(Person p);
    + 女人的状态方法  
  + 具体实现类
    + 成功Success,重写父类方法
    + 失败Fail  
  
  + 提供调用状态,来改变人  
### 应用场景







