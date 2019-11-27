import com.soucod.addutil.string.StringUtil;

/**
 * String 测试类
 */
public class StringUtilTest {

    public static void main(String[] args) {
        System.out.println("Hello addutil");
    }

    @Test
    public void testIsBlank() {
        assertTrue(StringUtil.isBlank(null));
        assertTrue(StringUtil.isBlank(""));
        assertTrue(StringUtil.isBlank(StringUtilsTest.WHITESPACE));
        assertFalse(StringUtil.isBlank("foo"));
        assertFalse(StringUtil.isBlank("  foo  "));
    }



}