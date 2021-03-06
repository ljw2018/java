package com.upd.business.form;

import com.upd.common.basis.base.QueryForm;

/**
 * Created by ljw on 2017/5/3.
 */
public class VoteForm extends QueryForm {
    private Integer id;//投票ID
    private Integer userId;//用户ID
    private String title;//投票标题
    private String startTime;//开始时间
    private String endTime;//结束时间
    private Integer orgId;//组织ID

    public VoteForm() {
    }

    protected void doParseInternal() {
        ge("DATE_FORMAT(createTime,'%Y-%m-%d')",startTime);
        le("DATE_FORMAT(createTime,'%Y-%m-%d')",endTime);
        like("title",title);
        eq("id",id);
        notIn("id","(SELECT id FROM Vote where FIND_IN_SET("+userId+",voter)>0)");
        eq("orgId",orgId);
        orderBy("createTime desc");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
}
