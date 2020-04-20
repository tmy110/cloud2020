import java.time.ZonedDateTime;


public class T2 {

    public static void main(String[] args) {
        // 默认时区
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);//2020-04-20T22:27:14.748+08:00[Asia/Shanghai]
    }
}
