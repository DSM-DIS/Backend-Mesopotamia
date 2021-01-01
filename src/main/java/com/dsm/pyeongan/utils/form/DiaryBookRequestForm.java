package com.dsm.pyeongan.utils.form;

public class DiaryBookRequestForm {
    private String userId;
    private String code;

    public DiaryBookRequestForm() {}
    public DiaryBookRequestForm(String userId, String code) {
        this.userId = userId;
        this.code = code;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
