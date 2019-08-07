package com.uestc.fff.hotel.domain;

public class SearchSession {
    private int pagePointer;
    private FullSearResult resultList;

    public int getPagePointer() {
        return pagePointer;
    }

    public void setPagePointer(int pagePointer) {
        this.pagePointer = pagePointer;
    }

    public FullSearResult getResultList() {
        return resultList;
    }

    public void setResultList(FullSearResult resultList) {
        this.resultList = resultList;
    }
}
