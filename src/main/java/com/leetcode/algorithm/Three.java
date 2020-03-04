package com.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * @author orangeC
 * @description 无重复字符的最长子串
 * @date 2020/2/10 22:32
 */
public class Three {
    public static void main(String[] args) {
        String str = "abcdabcdf";
        getStr(str);
    }

    private static int getStr(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        Set<String> set = new HashSet<>();
        if ("".equals(s)) {
            return 0;
        }
        int resultLen = 1;
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
            set.add(String.valueOf(s.charAt(i)));
            int len = 1;
            for (int j = i+1; j < s.length(); j++) {
                if (!set.add(String.valueOf(s.charAt(j)))){
                    stringBuilder =  new StringBuilder();
                    set.clear();
                    break;
                } else {
                    stringBuilder.append(s.charAt(j));
                }
                len++;
                resultLen = Math.max(len, resultLen);
            }
        }
        return resultLen;
    }
}
