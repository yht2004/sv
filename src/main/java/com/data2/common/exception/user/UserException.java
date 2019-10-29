package com.data2.common.exception.user;

import com.data2.common.exception.base.BaseException;

/**
 * 用户基础异常类
 */
public class UserException extends BaseException {
    private static final Long serialVersionUID = 1L;
    public UserException(String code,Object[] args){
        super("user",code,args,null);
    }

}
