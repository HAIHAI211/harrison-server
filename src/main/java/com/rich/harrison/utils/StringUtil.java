package com.rich.harrison.utils;

import java.util.UUID;

public class StringUtil {
    /**
     * 生成token
     * @return
     */
    public static String GetGUID()
    {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
