package com.cl.order.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author chenlong
 * @since 2022-06-16 10:48:34
 */
@Data
@TableName("tb_user")
public class User implements Serializable {
    private static final long serialVersionUID = -28775999699675293L;

    @TableId(value = "id")
    private Long id;


    @TableField("username")
    private String username;

    @TableField("address")
    private String address;

}
