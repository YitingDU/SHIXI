package com.yiting.shixi1.exception;

//为什么要编写CommonException异常类?
//在项目开发过程中,我们经常需要抛出一些业务异常,比如"用户名已存在"、"余额不足"等。如果每次都自己定义一个新的异常类,
//代码会变得冗余且难以维护。因此,我们可以编写一个通用的CommonException异常类,在抛出异常时动态设置状态码和异常信息,
//这样代码更加简洁、可复用性更高。
//CommonException异常类需要继承Exception
//Exception是所有异常类的父类,继承自Exception的类也是一种异常类型。SpringBoot在处理异常时,
//会根据抛出的异常类型进行匹配,找到对应的异常处理方法。因此CommonException需要继承Exception,以便SpringBoot能够正确识别和处理该异常。
public class CommonException extends Exception{
    private Integer code;

    private String msg;

    public CommonException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

//    在CommonException类中定义两个属性:状态码code和异常信息message。
//    状态码用于标识异常类型,异常信息用于描述异常详情。
    public Integer getCode() {
        return code;
    }

    public String getMsg(){
        return msg;
    }
}
