package homework;
/*
1.定义一个Person类，{name,age,job}，初始化Person对象数组，有三个Person对象，并按age从大到小进行排序。使用冒泡排序
 */
/*
public class hw {
    public static void main(String[] args) {
        Person[] p = new Person[3];//定义一个Person的数组，里边有三个对象
        p[0] = new Person("jack",70,"打野狗");//创建p对象
        p[1] = new Person("dack",50,"打黑狗");
        p[2] = new Person("cack",60,"打黄狗");

        for (int o = 0; o < p.length - 1; o++) {


        for (int q = 0; q < p.length - 1 - o; q++) {
            if (p[q].age > p[q + 1].age) {//如果前一个数大于后一个数，就交换两个数的位置
                int temp;
                temp = p[q + 1].age;
                p[q + 1].age = p[q].age;
                p[q].age = temp;
            }
        }
        }
        for (int w = 0; w < p.length; w++) {
            System.out.println(p[w].age);
        }
        for (int u = 0; u < p.length; u++) {
            System.out.println(p[u].toString());
        }

    }
}
*/
/*
2.
写出四种访问访问修饰符的访问权限
 */
/*
public 本类 本包 子类，其他类
protected 本类 本包 子类
默认    本类 本包
private 本类
 */
/*
3.
编写老师类
1.要求有属性 name ,age,post,salary
2.编写业务方法，introduce(),实现输出一个教师的信息
3.编写教师类的三个子类，教授类，副教授类，讲师类，工资级别分别为：教授为1.3，副教授为1.2，讲师1.1.
在三个子类里面重写父类的introduce()方法
4.定义并初始化一个对象，调用业务方法，实现对象基本信息的后台打印。
 */
//public class hw{
//    public static void main(String[] args) {
//        Professor professor = new Professor("老王", 40, "教授", 13000);
//        AsProfessor asProfessor = new AsProfessor("老张", 20, "副教授", 12000);
//        lecturer lecturer = new lecturer("老刘", 10, "讲师", 11000);
//        professor.introduce();
//        asProfessor.introduce();
//        lecturer.introduce();
//
//    }
//
//        }
public class hw {

}
