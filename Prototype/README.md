# 原型模式
##### 使用 Object#clone()
这是一个让我有点不知所措的设计模式，感觉就像时在介绍 Object#clone() 方法和 Cloneable 接口的使用.

在 Java 中,虽然对象皆继承自 Object,但是 Object#clone() 方法是 protected 的，
如果你希望你的对象可以被正常使用 Object#clone() 方法进行克隆时，

- 重写 Object#clone() 方法， 只需要返回 super.clone() 即可，
然后将 访问权限设置为 public。
- 将你的对象实现 Cloneable 接口

Object#clone() 方法是一个 native 方法，利用它来生成一个新的对象比 new 关键字要有效率得多。

##### 浅复制
需要注意的是，java 中的 Object#clone() 这个方法默认是一种“浅复制”，就是说，
使用 Object#clone() 复制一个新对象的时侯，关于这个新对象中的成员变量，如果是基本数据类型和一些
不变的对象（如 String），则会从原本对象中复制一份新的过来，而如果是普通的 Object 类型的成员变量，
则只是从从原本对象中复制一个引用过来。

##### 深复制
很多情况下，浅复制并不能满足我们的要求，那么如何进行深度复制呢？
很简单，在重写 Object#clone() 时，将原本对象的 Object 类型的成员变量们，也逐个调用一次 Object#clone() 方法，
并赋值给生成的对象中的该成员变量，像下面：
```
public class Prototype implements Cloneable {
    private ArrayList list = new ArrayList();
    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
            prototype.list = (ArrayList) this.list.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    return prototype;
    }
}
```

##### 多层深度复制
又有这么一种情况，我们要克隆的对象，它有一个成员变量需要克隆，而成员变量中，又有一个成员变量需要克隆。。。
这样一来，我们要利用上面的方法进行深度克隆就会显得特别麻烦。
在这种情况下，我们可以利用 DataInputStream 和 DataOutputStream 方法，将待克隆的对象（当然需要实现 Serializable)
先反序列话然后再读出来，一次性产生了一个从里到外新的对象。