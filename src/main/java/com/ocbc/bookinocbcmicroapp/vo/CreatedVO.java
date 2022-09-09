package com.ocbc.bookinocbcmicroapp.vo;

import com.ocbc.bookinocbcmicroapp.constant.Code;
import com.ocbc.bookinocbcmicroapp.util.ResponseUtil;
import org.springframework.http.HttpStatus;

public class CreatedVO<T> extends UnifyResponseVO {

    public CreatedVO() {
        super(Code.CREATED.getCode());
        ResponseUtil.setCurrentResponseHttpStatus(HttpStatus.CREATED.value());
    }

    public CreatedVO(int code) {
        super(code);
        ResponseUtil.setCurrentResponseHttpStatus(HttpStatus.CREATED.value());
    }

    public CreatedVO(T message) {
        super(message);
        ResponseUtil.setCurrentResponseHttpStatus(HttpStatus.CREATED.value());
    }

    public CreatedVO(int code, T message) {
        super(code, message);
        ResponseUtil.setCurrentResponseHttpStatus(HttpStatus.CREATED.value());
    }

}
