package com.upd.business.form;

import com.upd.common.basis.base.QueryForm;

/**
 * Created by ljw on 2017/5/3.
 */
public class CalendarForm extends QueryForm {
    private Integer userId;//用户ID
    private String subject;//主题
    private String startTime;//开始时间
    private String endTime;//结束时间
    private Integer orgId;//组织ID

    protected void doParseInternal() {
        ge("DATE_FORMAT(createTime,'%Y-%m-%d')",startTime);
        le("DATE_FORMAT(createTime,'%Y-%m-%d')",endTime);
        like("subject",subject);
        eq("user.id",userId);
        eq("orgId",orgId);
        notEq("orgId",0);
        orderBy("createTime desc");
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
}
