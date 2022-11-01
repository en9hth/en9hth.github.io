package smallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class small {
    public static void main(String[] args) {
        String key = "";
        boolean loop = true;
        String details = "-----------零钱通明细-----------";
        Date date = new Date();//接收用户输入的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化
        double money = 0;//接收每一次的入账
        String remark = "";
        double balance = 0;//余额

        do{
            System.out.println("----------零钱通明细------------");
            System.out.println("\t\t"+"1.零钱通明细");
            System.out.println("\t\t"+"2.收益入账");
            System.out.println("\t\t"+"3.消费");
            System.out.println("\t\t"+"4.退      出");
            System.out.println("请输入1-4");
            Scanner scanner = new Scanner(System.in);
            key = scanner.next();
            switch(key){
                case "1":
                    System.out.println("1.零钱通明细");
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("2.收益入账");
                    System.out.println("这次收益入账金额 ：");
                    money = scanner.nextDouble();
                    if(money > 0){//金额大于0，则进入
                        balance += money;
                        System.out.println("备注：");
                        remark = scanner.next();
                        date =  new Date();//获取当前的时间

                        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t余额" + balance +
                                "\n备注\t" + remark;

                        break;
                    }
                    else {
                        System.out.println("你输入的金额有误，请输入一个大于0的数");
                        break;
                    }


                case "3":
                    System.out.println("3.消费");
                    System.out.println("请输入消费金额(大于0)");
                    money = scanner.nextDouble();
                    if(money > 0 || money >= balance){
                        balance -= money;
                        System.out.println("备注");
                        remark = scanner.next();//接收消费的原因
                        date = new Date();//获取当前时间
                        details += "\n消费支出\t" + money + "\t" + sdf.format(date) + "\t余额" + balance +
                                "\n备注\t" + remark;
                        break;
                    }
                    else{
                        System.out.println("你输入的金额有误，请输入一个大于0的数。或者你输入的金额大于了余额");
                        break;
                    }

                case "4":
                    System.out.println("确认退出？，输入y退出，输入n不退出");
                    char c = scanner.next().charAt(0);//接收用户输入的字符
                    switch(c){
                        case 'y' :
                            System.out.println("已退出");
                            loop = false;//退出循环
                        case 'n' :
                            System.out.println("回到零钱通");
                            loop = true;//继续循环
                    }
                    break;
                default:
                    System.out.println("你输入的数字有误，请输入1-4");
            }
        }
        while(loop);
        System.out.println("零钱通退出");

    }
}
