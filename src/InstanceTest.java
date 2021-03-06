/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-26 15:48
 */
/**
 * 一、理解“万事万物皆对象”
 * 1.在Java语言范畴中，我们都将功能。结构等封装到类中，通过类的实例化。来调节具体的功能结构
 *      >Scanner ,String等
 *      >文件：File
 *      >网络资源：URL
 * 2.涉及到Java语言与前端Html、后端数据库交互时，前后端的结构在Java层面交互时，都体现为类、对象
 * 二、内存解析的shuoming
 *  1.引用类型的变量，只可能存储两类值：null 或地址值（含变量的类型）
 *
 *  三、匿名对象的使用
 *      1.理解：我们创建的对象，没有现实的赋给一个变量名。即为匿名对象
 *      2.特征：匿名对象只能调用一次
 *      3.使用：如下
 *
 *
 * */

public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
//        System.out.println(p);
//
//
//        p.sendEmail();
//        p.playGame();


        // 匿名
//        new Phone().sendEmail();
//        new Phone().playGame();
//        new Phone().proces = 1999;
//        new Phone().showPrivce(); // 0.0
        // 匿名对象的使用
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone());
    }


}

 class PhoneMall{
    public void show(Phone Phone){
        Phone.sendEmail();
        Phone.playGame();
    }

 }

class Phone{
    double proces;

    public void sendEmail(){
        System.out.println("发送邮件");
    }
    public  void playGame(){
        System.out.println("玩游戏");
    }
    public void showPrivce(){
        System.out.println("手机的价格为"+proces);
    }


}
