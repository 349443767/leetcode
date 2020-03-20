import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hongwei
 * @Title:
 * @Package
 * @Description: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * @date 2020/3/19 上午10:27
 */
public class ReverseSolution {

    public int reverse(int x) {
        try {
            if (x < 0) {
                String str = x * -1 + "";
                return Integer.parseInt(reverse(str)) * -1;
            } else {
                String str = x + "";
                return Integer.parseInt(reverse(str));
            }
        } catch (Exception e) {
            return 0;
        }

    }

    public String reverse(String str) {
        List<String> list = new LinkedList();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.substring(i, i + 1));
        }
        Collections.reverse(list);

        StringBuffer sb = new StringBuffer();
        for (String reverseStr : list) {
            sb.append(reverseStr);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int num1 = 123;
        int num2 = -123;
        int num3 = 120;
        int num4 = 1534236469;
        new ReverseSolution().reverse(num1);
        new ReverseSolution().reverse(num2);
        new ReverseSolution().reverse(num3);
        new ReverseSolution().reverse(num4);
    }

}
