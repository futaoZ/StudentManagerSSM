package com.ford.util;

/**
 * @ClassName: DateUtil
 * @Description: TODO
 * @author: Ford.Zhang
 * @version: 1.0
 * 2019/8/30 下午 2:43
 **/
public class DateUtil {
    public static java.sql.Timestamp d2t(java.util.Date d) {
        if (null == d) {
            return null;
        }
        return new java.sql.Timestamp(d.getTime());
    }

    public static java.util.Date t2d(java.sql.Timestamp t) {
        if (null == t) {
            return null;
        }
        return new java.util.Date(t.getTime());
    }
}
