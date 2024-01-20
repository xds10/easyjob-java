package com.easyjob.entity.enums;

public enum VerifyRegexEnum {
    /**
     * 缺省，表示不进行正则校验
     */
    DEFAULT("", "不校验"),

    /**
     * 邮箱正则
     */
    EMAIL_REGEX("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$", "邮箱"),

    /**
     * 手机号正则
     */
    PHONE_NUMBER_REGEX("^((13[0-9])|(14[0|5|6|7|9])|(15[0-3])|(15[5-9])|(16[6|7])|(17[2|3|5|6|7|8])|(18[0-9])|(19[1|8|9]))\\d{8}$",
            "手机号正则"),

    /**
     * 身份证正则
     */
    IDENTITY_CARD_REGEX("(^\\d{18}$)|(^\\d{15}$)", "身份证正则"),

    /**
     * URL正则
     */
    URL_REGEX("http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?", "URL正则"),

    /**
     * IP地址正则
     */
    IP_ADDR_REGEX("(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)", "IP地址正则"),

    /**
     * 用户名正则
     */
    USERNAME_REGEX("^[a-zA-Z]\\w{5,20}$", "用户名正则"),

    /**
     * 密码正则
     */
    PASSWORD_REGEX("^[a-zA-Z0-9]{6,20}$", "密码正则");

    /**
     * 正则
     */
    private String regex;
    private String desc;

    /**
     * 构造方法
     *
     * @param regex
     */
    VerifyRegexEnum(String regex, String desc) {
        this.regex = regex;
        this.desc = desc;
    }


    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
