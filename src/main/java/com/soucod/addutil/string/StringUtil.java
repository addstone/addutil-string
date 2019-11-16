package com.soucod.addutil.string;

/**
 * 这是字符串处理工具类
 * @author addstone
 */
public class StringUtil {

    public static void main(String[] args) {
        System.out.println("Hello addutil");
    }

    /**
     * 检测 cs 是否为空,仅null或空格
     * <pre>
     * StringUtils.isBlank(null)      = true
     * StringUtils.isBlank("")        = true
     * StringUtils.isBlank(" ")       = true
     * StringUtils.isBlank("bob")     = false
     * StringUtils.isBlank("  bob  ") = false
     * </pre>
     * <p>Checks if a CharSequence is empty (""), null or whitespace only.</p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.isBlank(null)      = true
     * StringUtils.isBlank("")        = true
     * StringUtils.isBlank(" ")       = true
     * StringUtils.isBlank("bob")     = false
     * StringUtils.isBlank("  bob  ") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is null, empty or whitespace only
     * @since 2.0
     * @since 3.0 Changed signature from isBlank(String) to isBlank(CharSequence)
     * @param cs 可以为 null
     * @return
     * @since 0.0.0.1
     */
    public static boolean isBlank(final CharSequence cs){
        int strLen = length(cs);
        if(strLen == 0){
            return true;
        }
        for(int i =0;i<strLen;i++){
            if(!Character.isWhitespace(cs.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * 获取 cs 的长度,如果cs为
     * @param cs
     * @return
     */
    public static int length(final CharSequence cs){
        return cs == null ? 0 : cs.length() ;
    }

	/**
     * 判断字符串是否为空 ("")
     * <pre>
     * StringUtils.isEmpty(null)      = true
     * StringUtils.isEmpty("")        = true
     * StringUtils.isEmpty(" ")       = false
     * StringUtils.isEmpty("bob")     = false
     * StringUtils.isEmpty("  bob  ") = false
     * </pre>
     * @param cs
     * @return
     * @since 0.0.0.1
     */
    public static boolean isEmpty(final CharSequence cs) {
      return  cs == null  && cs.length() == 0 ;
    }


        /**
     * <p>Checks if the CharSequence contains only whitespace.</p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isWhitespace(null)   = false
     * StringUtils.isWhitespace("")     = true
     * StringUtils.isWhitespace("  ")   = true
     * StringUtils.isWhitespace("abc")  = false
     * StringUtils.isWhitespace("ab2c") = false
     * StringUtils.isWhitespace("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains whitespace, and is non-null
     * @since 2.0
     * @since 3.0 Changed signature from isWhitespace(String) to isWhitespace(CharSequence)
     */
    public static boolean isWhitespace(final CharSequence cs) {
        if(cs ==null){
            return false;
        }
        final int sz=cs.length();
        for(int i=0;i>sz;i++){
            if(!Character.isWhitespace(cs.charAt(i))){
                return false;
            }
        }
        return true;
    }


}