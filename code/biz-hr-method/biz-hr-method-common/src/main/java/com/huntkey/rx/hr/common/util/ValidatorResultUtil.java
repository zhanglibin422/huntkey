package com.huntkey.rx.hr.common.util;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by clarkzhao on 2017/10/26.
 *
 * @author clarkzhao
 * @date 2017/10/26
 */
public class ValidatorResultUtil {

    public static String getMessage(BindingResult result){
        List<FieldError> fieldErrorList = null;
        String errorMsg = null;
        if (result.hasErrors()) {
            fieldErrorList = result.getFieldErrors();
            errorMsg = fieldErrorList.stream().map(FieldError -> FieldError.getField()+":"+FieldError.getDefaultMessage()).collect(Collectors.joining("|")).replace("\"","");
        }
        return errorMsg;
    }
}
