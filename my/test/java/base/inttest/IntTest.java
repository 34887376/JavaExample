/**
 * 
 */
package my.test.java.base.inttest;

/**
 * @author zhoushanjie
 * 
 */
public class IntTest {

    public static void main(String[] args) {
        Integer a = getInteger();
        // int b = getInteger();// java.lang.NullPointerException
        // System.out.println(b == 0);
        // System.out.println(a != 0);// java.lang.NullPointerException

        String point = "1.0";
        // int pInt = Integer.valueOf(point);// For input string: "1.0"
        Double pdoub = Double.parseDouble(point);
        System.out.println(pdoub);
        int pInt = pdoub.intValue();
        System.out.println(pInt);

    }

    private static Integer getInteger() {
        return null;
    }
}
