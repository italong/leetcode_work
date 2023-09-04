package top.italong.leetcode.day01;

/**
 * Create by Idea
 *
 * @Author along
 * @create 2023/9/4 19:10
 */
public class Test1 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void start(){
                dianping();
            }

        };
        thread.start();
        System.out.println("dazhong");
    }

    private static void dianping() {
        System.out.println("dianping");
    }
}
