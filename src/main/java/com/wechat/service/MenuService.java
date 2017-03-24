package com.wechat.service;

import net.sf.json.JSONObject;

import java.util.Map;

/**
 * Created by 墨殇 on 2017/3/24.
 */
public interface MenuService {
    public JSONObject getMenu(String accessToken);
    public int createMenu(Map<String, Object> menu, String accessToken);
    public int deleteMenu(String accessToken);
}
