package com.zj.onlinetest.enums;

/**
 * @Auther: zj
 * @Date: 2019/4/17 14:29
 * @Description: 常用枚举类
 */
public enum  CommonEnum {



    HTTPUSRL(0001,"http://localhost:8080/goingWrittenTest"),

    FALSE(-1,"false"),
    USERNAMEORPASSWORD_ERROR(-2,"用户名或密码错误"),
    PERRMISSIONERROR(-3,"权限不足"),
    PARAMERSERROR(-4,"参数校验不通过"),
    USERHASWDTAKEEDTEST(-5,"您已经参加过笔试，不能再次参加"),
    USERHASTAKEDTEST(-6,"用户已发表笔试，没有权限删除"),
    THISQUESTIONHASPUBLISHED(-7,"该笔试题已被发布，没有权限删除"),


    SUCCESS(1,"true"),
    LOGINSUCCEES(2,"管理员登录成功"),
    ADDQUESTIONSUCCESS(3,"增加题库成功"),
    ADDNEWUSERSUCCESS(4,"新增笔试者成功"),
    PUBLISHWRITTENTESTSUCCESS(5,"发布笔试成功"),
    GETUSEALLSUCCESS(6,"获取用户列表成功"),
    GETUSEALLTOTALSUCCESS(7,"获取所有用户数量成功"),
    GETSELFQUESTIONSSUCCESS(8,"获取当前笔试者笔试题成功"),
    GETALLQUESTIONSUCCESS(9,"获取所有笔试题成功"),
    PLAYBACKTESTSUCCESS(10,"开始回放"),
    GETTESTUSERSELFINFOSUCCESS(11,"获取用户信息成功"),
    GETALLUSERLISTAFTERPUBLISHEDTESTSUCCESS(12,"获取发布笔试后的笔试者列表成功"),
    STARTTESTSUCCESS(13,"开始答题"),
    ENDTESTSUCCESS(14,"结束答题"),
    DELETEUSERSUCCESS(15,"删除用户成功"),
    CHANGEQUESTIONSUCCESS(16,"编辑问题完成"),
    DELETEQUESTIONSUCCESS(17,"删除问题成功"),
    GETTHELASTONEABOUTRESULTSUCCESS(18,"获取最终结果成功"),
    ;


    private Integer code;
    private String message;

    CommonEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
