package com.yrj.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author YIN
 * date: 2018/12/20 10:20
 * description:
 */
@Data
public class ResultVO<T> {
    @JsonProperty("code")
    private Integer code;
    @JsonProperty("msg")
    private String message;
    @JsonProperty("data")
    private T data;
}
