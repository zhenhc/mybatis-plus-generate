package com.hong.generate.generatedemo.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author liyh
 * @since 2020-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
@ApiModel(value = "User对象", description = "")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    //主键
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    //昵称
    @ApiModelProperty(value = "昵称")
    @TableField("nickname")
    private String nickname;

    //生日
    @ApiModelProperty(value = "生日")
    @TableField("birthday")
    private Date birthday;

    //用户名
    @ApiModelProperty(value = "用户名")
    @TableField("username")
    private String username;

    //密码
    @ApiModelProperty(value = "密码")
    @TableField("password")
    private String password;

    //状态 
    @ApiModelProperty(value = "状态 ")
    @TableField("status")
    private String status;

    //创建时间
    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    //更新时间
    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private Date updateTime;

    //备注
    @ApiModelProperty(value = "备注")
    @TableField("remarks")
    private String remarks;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
