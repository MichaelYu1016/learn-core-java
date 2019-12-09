/**
 * 构建字符串StringBuilder类
 * @author Yu Nongxin
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("I ");
        builder.append("am ");
        builder.append("Ironman");
        System.out.println(builder.toString());
    }
}