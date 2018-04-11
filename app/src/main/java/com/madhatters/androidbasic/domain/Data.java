package com.madhatters.androidbasic.domain;

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable {
    private List<ActualCity> content;
    private int totalPages;
    private int totalElements;

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public List<ActualCity> getContent() {
        return content;
    }

    public void setContent(List<ActualCity> content) {
        this.content = content;
    }
}
