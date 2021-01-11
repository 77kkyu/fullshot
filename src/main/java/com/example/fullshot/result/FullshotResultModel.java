package com.example.fullshot.result;

import java.util.List;

public class FullshotResultModel {

    public Integer code, size = 0, totalCount;
    public String message, accessToken;
    public Object obj;

    public FullshotResultModel(ResultCodeSet resultCodeSet) {
        init(resultCodeSet.code, resultCodeSet.message, resultCodeSet.message);
    }

    public FullshotResultModel(ResultCodeSet resultCodeSet, Object obj) {
        init(resultCodeSet.code, resultCodeSet.message, obj);
    }

    public FullshotResultModel(ResultCodeSet resultCodeSet, Object obj, String accessToken, int totalCount) {
        init3(resultCodeSet.code, resultCodeSet.message, obj, accessToken, totalCount);
    }

    public FullshotResultModel(ResultCodeSet resultCodeSet, int size, Object obj, int totalCount) {
        init2(resultCodeSet.code, resultCodeSet.message, size, obj, totalCount);
    }

    public FullshotResultModel(Integer code, String message, Object obj) {
        init(code, message, obj);
    }

    private void init(Integer code, String message, Object obj){
        this.code = code;
        this.message = message;
        this.obj = obj;

        if(obj == null)
            return;

        if(obj instanceof List){
            this.size = ((List) obj).size();
        }else{
            this.size = 1;
        }
    }

    private void init2(Integer code, String message, int size, Object obj, int totalCount){
        this.code = code;
        this.message = message;
        this.obj = obj;
        this.totalCount = totalCount;

        if(obj == null)
            return;

        this.size = size;
    }

    private void init3(Integer code, String message, Object obj, String accessToken, int totalCount){
        this.code = code;
        this.message = message;
        this.accessToken = accessToken;
        this.obj = obj;
        this.totalCount = totalCount;

        if(obj == null)
            return;

        if(obj instanceof List){
            this.size = ((List) obj).size();
        }else{
            this.size = 1;
        }
    }
}
