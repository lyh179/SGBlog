package com.sangeng.constants;

public class SystemConstants
{
    /**
     *  文章是草稿
     */
    public static final int ARTICLE_STATUS_DRAFT = 1;
    /**
     *  文章是正常分布状态
     */
    public static final int ARTICLE_STATUS_NORMAL = 0;

    /**
     * 文章
     */
    public static final String STATUS_NORMAL = "0";

    /**
     * 友联状态为审核通过
     */
    public static final String LINK_STATUS_NORMAL = "0";

    /**
     * 评论是否为根评论
     * 是为-1
     */
    public static final String IS_ROOT_Comment = "-1";

    /**
     * 评论类型为友联
     */
    public static final String LINK_COMMENT = "1";
    /**
     * 评论类型为文章
     */
    public static final String ARTICLE_COMMENT = "0";
    public static final String MENU = "C";
    public static final String BUTTON = "F";

    public static final String REDIS_KEY = "article:viewCount";

    /** 正常状态 */
    public static final String NORMAL = "0";
    public static final String ADMIN = "1";
}