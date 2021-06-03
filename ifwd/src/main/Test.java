import java.security.Timestamp;

//package 
//import java.sql.Timestamp;
//import java.sql.Date;

public class Test {
    public static void main(String[] args){
        java.util.Date date = new java.util.Date();
        System.out.println(date);
        //Timestamp receiveTime = new Timestamp(date.getTime());
        // Timestamp receiveTime = new Timestamp(System.currentTimeMillis());
        // getTime方法可返回距 1970 年 1 月 1 日之间的毫秒数。 
        System.out.println(date.getTime()/1000);
        java.sql.Timestamp ts = new java.sql.Timestamp(date.getTime());
        System.out.println(ts);
        System.out.println("Hello test");
    }
}
