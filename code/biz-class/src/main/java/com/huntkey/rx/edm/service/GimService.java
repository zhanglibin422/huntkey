package com.huntkey.rx.edm.service;
import java.io.Serializable;
import java.util.*;
import com.huntkey.rx.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.Date;
import com.huntkey.rx.commons.utils.rest.Result;
import com.huntkey.rx.sceo.method.register.plugin.entity.ParamsVo;
import com.huntkey.rx.sceo.method.register.plugin.util.ExecUtil;


/**
 *
 * 全球物流索引类实体
 *
 */
@Service
public class GimService {


    public Result wangyuqni1(ParamsVo params) {
        params.setClassName("Gim");
        params.setMethodName("wangyuqni1");
        return ExecUtil.exec(params);
    }



}