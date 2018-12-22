package com.yrj.exception;

import com.yrj.enums.ResultEnum;

/**
 * @author YIN
 * date: 2018/12/21 14:49
 * description:
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String msg){
        super(msg);
        this.code = code;
    }
}
