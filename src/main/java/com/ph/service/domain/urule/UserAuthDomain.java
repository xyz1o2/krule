package com.ph.service.domain.urule;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.urule.UserAuth;
import com.ph.mapper.urule.UserAuthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;

@Repository
public class UserAuthDomain {

    @Autowired
    private UserAuthMapper userAuthMapper;

    @DataSourceRouter(type = DataSourceType.URULE)
    public List<Map<String,Object>> findAllUserAuth() {
        List<Map<String,Object>> result = new ArrayList<>();
        List<UserAuth> userAuthList = userAuthMapper.findAllUserAuth();
        if(CollectionUtils.isEmpty(userAuthList))
            return null;
        for(UserAuth userAuth : userAuthList){
            Map<String,Object> uaMap = new HashMap<>();
            uaMap.put("id",userAuth.getId());
            uaMap.put("user",userAuth.getUsername());
            uaMap.put("qx",userAuth.getProjectName());
            result.add(uaMap);
        }
        return result;
    }

    @DataSourceRouter(type = DataSourceType.URULE)
    public UserAuth findByUsername(String username) {
        return userAuthMapper.findByUsername(username);
    }

    @DataSourceRouter(type = DataSourceType.URULE)
    public List<String> findAuthProjectList(String username) {
        List<String> projectList = new ArrayList<>();
        UserAuth userAuth = userAuthMapper.findByUsername(username);
        String projectNames = userAuth.getProjectName();
        if(StringUtils.isEmpty(projectList)){
            return projectList;
        }
        projectList = Arrays.asList(projectNames.split(","));
        return projectList;
    }

    @DataSourceRouter(type = DataSourceType.URULE)
    public void update(UserAuth userAuth) {
        userAuthMapper.update(userAuth);
    }

    @DataSourceRouter(type = DataSourceType.URULE)
    public void insert(UserAuth userAuth) {
        userAuthMapper.insert(userAuth);
    }

}
