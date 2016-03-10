import java.net.*;
import java.util.*;

/**
 * Created by yukaibo on 2016/3/8.
 */
public class UriDemo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.ecnu.edu.cn");
        Scanner in = new Scanner(url.openStream());
        while (in.hasNextLine()) {
            String str = in.nextLine();
            System.out.println(str);
        }//输出网页内各种元素

        URI uri = new URI("http://blog.csdn.net/xiazdong");
        System.out.println(uri.getScheme()); //http
        System.out.println(uri.getSchemeSpecificPart());// //blog.csdn.net/xiazdong
        System.out.println(uri.getAuthority());//blog.csdn.net
        System.out.println(uri.getUserInfo());//null
        System.out.println(uri.getHost());//blog.csdn.net
        System.out.println(uri.getPort());//-1
        System.out.println(uri.getPath());// /xiazdong
        System.out.println(uri.getQuery());//null
        System.out.println(uri.getFragment());//null

        String str = "/article/details/6705033";
        URI combined = uri.resolve(str);// 根据uri的路径把str变成绝对地址
        System.out.println(combined.getScheme()+ combined.getSchemeSpecificPart());
        // http//blog.csdn.net/article/details/6705033
        URI relative = uri.relativize(new URI(str));
        System.out.println(relative.getSchemeSpecificPart());///article/details/6705033

    }
}
