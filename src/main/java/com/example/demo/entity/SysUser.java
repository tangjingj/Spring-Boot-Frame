package com.example.demo.entity;



import lombok.Data;
import java.util.Date;

/**
 * 管理员数据
 */
@Data
public class SysUser {

    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String avatar;
    private Integer loginCount;
    private Date lastLoginAt;
    private Integer isSuper;
    private Integer parentId;
    private Integer agentId;
    private Integer roleId;
    private Date createdAt;
    private Date updatedAt;
    private String agentName;
    private String roleName;






}
