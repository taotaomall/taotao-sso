package com.taotao.sso.service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 18:35 2018/2/26
 */
public interface UserService {

        TaotaoResult checkData(String content, Integer type);
        TaotaoResult createUser(TbUser user);
        TaotaoResult userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response);
        TaotaoResult getUserByToken(String token);
}
