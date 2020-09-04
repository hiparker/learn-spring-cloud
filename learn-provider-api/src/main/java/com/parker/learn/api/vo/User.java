package com.parker.learn.api.vo;

import java.util.Random;

/**
 * @BelongsProject: learn-provider-api
 * @BelongsPackage: com.parker.learn.api.vo
 * @Author: Parker
 * @CreateTime: 2020-09-05 01:13
 * @Description: TODO
 */
public class User {

    private static final Random RANDOM = new Random();

    private Integer id;

    private String name;

    public User() {
    }

    public User(String name) {
        this.id = RANDOM.nextInt();
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
