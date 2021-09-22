package cn.o0k.common.constant;

/**
 * @author 张澎_9970
 * @date 2021.7.14 下午 2:48 星期三
 * @desc:
 */
public class Constants {
    /**
     * 斜杠
     */
    public static final String SLASH = "/";
    /**
     * 反斜杠
     */
    public static final String BACKSLASH = "\\";
    /**
     * 病人类型
     */
    public static final String PT = "PT";

    /**
     * 前端浏览器自动刷新
     */
    public static final int AUTO_RELOAD_EXPIRE_TIME = 30;
    /**
     * UTF-8 字符集
     */
    public static final String UTF8 = "UTF-8";

    /**
     * GBK 字符集
     */
    public static final String GBK = "GBK";

    /**
     * http请求
     */
    public static final String HTTP = "http://";

    /**
     * https请求
     */
    public static final String HTTPS = "https://";

    /**
     * 通用成功标识
     */
    public static final String SUCCESS = "0";

    /**
     * 通用失败标识
     */
    public static final String FAIL = "1";

    /**
     * 登录成功
     */
    public static final String LOGIN_SUCCESS = "Success";

    /**
     * 注销
     */
    public static final String LOGOUT = "Logout";

    /**
     * 登录失败
     */
    public static final String LOGIN_FAIL = "Error";

    /**
     * 验证码 redis key
     */
    public static final String CAPTCHA_CODE_KEY = "captcha_codes:";

    /**
     * 登录用户 redis key
     */
    public static final String LOGIN_TOKEN_KEY = "login_tokens:";

    public static final String LOGIN_TOKEN_NEW_KEY = "login_new_tokens:";

    /**
     * 验证码有效期（分钟）
     */
    public static final Integer CAPTCHA_EXPIRATION = 2;

    /**
     * 令牌
     */
    public static final String TOKEN = "token";

    /**
     * 令牌前缀
     */
    public static final String TOKEN_PREFIX = "Bearer ";

    /**
     * 令牌前缀
     */
    public static final String LOGIN_USER_KEY = "login_user_key";

    /**
     * 用户ID
     */
    public static final String JWT_USERID = "userid";

    /**
     * 用户名称
     */
    // public static final String JWT_USERNAME = Claims.SUBJECT;

    /**
     * 用户头像
     */
    public static final String JWT_AVATAR = "avatar";

    /**
     * 创建时间
     */
    public static final String JWT_CREATED = "created";

    /**
     * 用户权限
     */
    public static final String JWT_AUTHORITIES = "authorities";

    /**
     * 参数管理 cache key
     */
    public static final String SYS_CONFIG_KEY = "sys_config:";

    /**
     * 字典管理 cache key
     */
    public static final String SYS_DICT_KEY = "sys_dict:";

    /**
     * 资源映射路径 前缀
     */
    public static final String RESOURCE_PREFIX = "/profile";

    /**
     * service操作 新增
     */
    public static final String INSERT = "insert";
    /**
     * service操作 删除
     */
    public static final String DELETE = "delete";
    /**
     * service操作 更新
     */
    public static final String UPDATE = "update";

    /**
     * 是否标志 -- 0：否，1：是
     */
    public static final String FLAG_NO = "0";

    /**
     * 是否标志 -- 0：否，1：是
     */
    public static final String FLAG_YES = "1";

    public static final String DEFAULT_LOGIN_USER = "system";

    public static final String LOGKIND = ".DICT.";

    public static final String LOGKIND_QC = ".DICT.QC";

    public static final String LOGKIND_BAC = ".DICT.BAC";

    //程序代号 体征项目字典
    public static final String NBS1A4 = "nbs1a4";

    //程序代号 微生物耐药机制
    public static final String LIS945 = "lis945";

    //程序代号 体征项目字典
    public static final String NBS115 = "nbs115";

    //程序代号 血库安全字典
    public static final String BLD122 = "bld122";

    //程序代号 交叉验血
    public static final String BLD420 = "bld420";

    //程序代号 报告通用
    public static final String LIS310 = "lis310";

    //程序代号 质控规则（仪器）
    public static final String LIS520 = "lis520";

    //程序代号 微生物-鉴定试验
    public static final String LIS930 = "lis930";

    //QCRULE_LIST (质控规则代码类别)
    public static final String QCRULE_LIST = "QCRULE_LIST";

    public static final String RABBITMQ_LOG_SESSION_INFO = "RABBITMQ_LOG_SESSION_INFO";

    public static final String RABBITMQ_SYSTEM_LOG = "RABBITMQ_SYSTEM_LOG.";

    public static final String QUEUE_NAME = "LIS_SYSTEM_LOG_QUEUE";
    public static final String EXCHANGE_NAME = "LIS_SYSTEM_LOG_EXCHANGE";

    //报告操作类型
    public static final String Log_INSERT = "01";//录入

    public static final String Log_UPDATE = "02";//修改

    public static final String Log_FEFRESH = "021";//刷新参考值

    public static final String Log_PRINT = "03";//打印

    public static final String Log_EXAMINE = "04";//审核

    public static final String Log_REMOVE_EXAMINE = "05";//解除审核

    public static final String Log_SECOND_EXAMINE = "06";// "二审"

    public static final String Log_RELEASE = "07";//发布

    public static final String Log_DELETE = "08";//删除

    public static final String Log_VALUATION = "09";//计价

    public static final String Log_REVIEW = "11";//复查

    public static final String Log_REMOVE_REVIEW = "12";//删除复查

    public static final String Log_QUALITY_CONTROL = "21";//指定到质控

    public static final String Log_NO_CRITICAL = "31";//不上报危急值

    public static final String Log_SELF_PRINT = "83";//恢复自助打印

    public static final String Log_ALONE_IMPORT = "91";//单机版导入

    public static final String Log_REVIEW_INTERCEPT = "022";//血型复核拦截

    public static final String Log_NO_APLID = "99";//血型复核拦截
}
