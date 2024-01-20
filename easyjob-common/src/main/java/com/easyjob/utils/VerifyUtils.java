package com.easyjob.utils;

import com.easyjob.entity.constants.Constants;
import com.easyjob.entity.enums.VerifyRegexEnum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyUtils {
    // regex为指定的匹配规则，value为传入的待匹配校验的值
    public static boolean verify(String regex, String value) {
        if (StringTools.isEmpty(value)) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        //指示整个value字符串是否与regex模式匹配。
        return matcher.matches();
    }

    public static boolean verify(VerifyRegexEnum regex, String value) {
        return verify(regex.getRegex(), value);
    }

    public static boolean checkAccount(String account) {
        if (StringTools.isEmpty(account) || account.length() < Constants.LENGTH_8 || account.length() > Constants.LENGTH_20) {
            return false;
        }
        return verify(VerifyRegexEnum.USERNAME_REGEX, account);
    }

    public static boolean checkPassWord(String password) {
        return verify(VerifyRegexEnum.PASSWORD_REGEX, password);
    }

}
