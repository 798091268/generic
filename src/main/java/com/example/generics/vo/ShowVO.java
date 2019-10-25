package com.example.generics.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ShowVO {

    private String branchNo;

    private String shelfNo;

    public String getBranchNo() {
        return branchNo;
    }

    public String getShelfNo() {
        return shelfNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    public void setShelfNo(String shelfNo) {
        this.shelfNo = shelfNo;
    }
}
