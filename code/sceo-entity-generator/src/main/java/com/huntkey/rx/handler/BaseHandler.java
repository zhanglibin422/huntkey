package com.huntkey.rx.handler;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.huntkey.rx.framework.context.ApplicationContext;
import com.huntkey.rx.util.DateUtil;
import com.huntkey.rx.util.FileHelper;
import com.huntkey.rx.util.FreeMarkerUtil;

public abstract class BaseHandler<T> {

    protected ApplicationContext  context;
    protected String              ftlName;
    protected String              savePath;
    protected Map<String, String> param = new HashMap<String, String>();
    protected T                   info;

    public String generateFinalStr() {
        String temp = FileHelper.readFileToString(this.getClass().getClassLoader().getResource("").getPath() + ftlName);
        String modelStr = FreeMarkerUtil.getProcessValue(param, temp);
        return modelStr;
    }

    /**
     * 保存到文件
     * 
     * @param str
     */
    public void saveToFile(String str) {
        FileHelper.writeToFile(savePath, str);
    }

    /**
     * 组装参数
     * 
     * @param param
     */
    public abstract void combileParams(T info);

    /**
     * 设置一些公共的参数.
     */
    public void beforeGenerate() {
        String time = DateUtil.formatDataToStr(new Date(), "yyyy年MM月dd日");
        param.put("author", System.getProperty("user.name"));
        param.put("time", time);
    }

    /**
     * 生成文件
     */
    public void execute(ApplicationContext context) {
        this.context = context;
        String str = null;
        combileParams(info);
        beforeGenerate();
        str = generateFinalStr();
        saveToFile(str);
    }

}
