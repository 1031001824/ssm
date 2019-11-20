package com.zhg.javakc.modules.test.entity;

import com.zhg.javakc.base.entity.BaseEntity;

import java.util.Date;

public class testentity extends BaseEntity<testentity> {
    private String testid;
    private String testname;
    private String testsex;
    private Date testdate;

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname;
    }

    public String getTestsex() {
        return testsex;
    }

    public void setTestsex(String testsex) {
        this.testsex = testsex;
    }

    public Date getTestdate() {
        return testdate;
    }

    public void setTestdate(Date testdate) {
        this.testdate = testdate;
    }

    public String getTestid() {
        return testid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }
}
