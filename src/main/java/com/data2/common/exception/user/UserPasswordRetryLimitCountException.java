package com.data2.common.exception.user;

/**
 * 用户错误计数异常类
 */
public class UserPasswordRetryLimitCountException extends UserException{
    private static final long serialVersionUID = 1L;
    public UserPasswordRetryLimitCountException(int retryLimitConut,String password){
        super("user.password.retry.limit.count",new Object[]{retryLimitConut,password});
    }
}
