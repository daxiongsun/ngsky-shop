package com.ngsky.common.pojo;

import java.io.Serializable;

/**
 * @Description tree structure
 * @Author daxiong
 * @Date 8/9/2018 12:07 AM
 **/
public class TreeNode implements Serializable {

    private Long id;
    private String state;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
