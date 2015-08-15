package com.ommay.utils;

import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonUtils {
	/**
	 * CODE_1:连接正常
	 * CODE_2:连接失败
	 * CODE_3:参数出错
	 * CODE_4:
	 * CODE_5:服务器故障
	 */
	private static final String CODE_1 = "1";
	private static final String CODE_2 = "2";
	private static final String CODE_3 = "3";
	private static final String CODE_4 = "4";
	private static final String CODE_5 = "5";
	
	public JSONObject getJsonObject(List list){
		 JSONArray jsonArray = null;
		 JSONObject jsonObject = null;
		 jsonArray  = new JSONArray(list);
		 jsonObject = new JSONObject();
		 if (true) {
			 jsonObject.put("code", CODE_1);
		}
		 jsonObject.put("msg", "no message");
		 jsonObject.put("array", jsonArray);
		 return jsonObject;
	}
	
}
