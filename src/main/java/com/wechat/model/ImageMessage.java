package com.wechat.model;

/**
 * Created by 墨殇 on 2017/3/24.
 * 图片消息
 *
 */
public class ImageMessage extends BaseMessage {
    // 图片链接
    private String PicUrl;

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }
}