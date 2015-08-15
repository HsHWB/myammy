package com.ommay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ommay.dao.AccountDao;
import com.ommay.entity.Account;
import com.ommay.service.BaseService;
import com.ommay.utils.JsonUtils;

@Controller
@RequestMapping("/accident/data") 
public class AccountController {
	
	@Autowired
	private BaseService accountService;
	/**
	 * 开始页面http://localhost:8080/SpringMVC3/save_action,返回/jsp/accidentInsert.jsp页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/save_action")
	public String saveProduct(Model model){
		model.addAttribute(new Account());
		return "accidentInsert";
	}
	
	/**
	 * 从controller调用service
	 * 
	 */
	
	@RequestMapping(value="/accident_save_service")
	public String useSaveService(Account account) {
		accountService.save(account);
		return "accidentDate";
		
	}
	
	/**
	 * 返回json给前端，用jq接收
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/accident_get_data")
    @ResponseBody
    public JSONObject  useGetData()
    {     
	   List list = accountService.getAll();
	   JSONArray jsonArray = new JSONArray();
	   JSONObject jsonObject = new JSONObject();
	   jsonObject = new JsonUtils().getJsonObject(list);
       return jsonObject;
    }
	
	
	
}
