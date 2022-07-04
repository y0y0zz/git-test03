package git;

import java.util.ArrayList;

/**
 * @author yoyo
 * @create 2022-07-04 21:32
 */
public class GitTest02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("添加暂存区");
        list.add("提交本体库");
        System.out.println(list.size());

        for (String value : list){
            System.out.println("list中的value = " + value);
        }
    }
}
