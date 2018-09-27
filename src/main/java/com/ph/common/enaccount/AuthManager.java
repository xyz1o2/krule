package com.ph.common.enaccount;

import com.ph.common.Product;
import com.ph.entity.urule.UserAuth;
import com.ph.service.domain.urule.UserAuthDomain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Author:   lzy
 * Date:     2018-09-10 15:32
 * Description:  权限管理策略
 **/
@Component
public class AuthManager {

    @Autowired
    UserAuthDomain userAuthDomain;

    private static Logger logger = LoggerFactory.getLogger("LOGIN_INFO");

    /**
     * 验证用户有没有项目权限(任意一个即可)
     * @param username
     * @return
     */
    public boolean vefityUserAnyProject(String username){
        UserAuth userAuth = userAuthDomain.findByUsername(username);
        if(userAuth == null){
            return false;
        }
        String projectNames = userAuth.getProjectName();
        if (StringUtils.isEmpty(projectNames)) {
            return false;
        }
        String[] projects = projectNames.split(",");
        if(projects.length == 0){
            return false;
        }
        return true;
    }


    /**
     * 验证是不是管理员账号
     * 管理员账号拥有一切权限
     * @param username
     * @return
     */
    public boolean vefityAdminUser(String username){
        UserAuth userAuth = userAuthDomain.findByUsername(username);
        if(userAuth == null){
            return false;
        }
        if(userAuth.getIsAdmin() == Product.IS_ADMIN){
            return true;
        }
        return false;
    }


    /**
     * 取出用户被授权的项目
     * @param username
     * @return
     */
    public String getProjectsByUsername(String username){
        UserAuth userAuth = userAuthDomain.findByUsername(username);
        if(userAuth == null){
            return ",";
        }
        return userAuth.getProjectName();
    }


    /**
     * 验证用户有没有该项目权限
     * @param username
     * @param requestURI
     * @param paramStr
     * @return
     */
    public boolean vefityUser(String username,String requestURI,String paramStr){
        return true;
    }

    /**
     * 插入初始化userAuth纪录
     * @param username
     * @return
     */
    public UserAuth insertAuthUser(String username){
        UserAuth userAuth = new UserAuth();
        userAuth.setUsername(username);
        userAuth.setIsAdmin(Product.IS_NOT_ADMIN);
        userAuth.setProjectName(",");
        userAuth.setStatus(0);
        userAuthDomain.insert(userAuth);

        userAuth = userAuthDomain.findByUsername(username);
        return userAuth;

    }

}
