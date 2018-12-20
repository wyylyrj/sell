package com.yrj.util;

import com.yrj.VO.ResultVO;

/**
 * @author YIN
 * date: 2018/12/20 13:37
 * description:
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO result = new ResultVO();
        result.setCode(0);
        result.setMessage("成功");
        result.setData(object);

        return result;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO result = new ResultVO();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }
}
