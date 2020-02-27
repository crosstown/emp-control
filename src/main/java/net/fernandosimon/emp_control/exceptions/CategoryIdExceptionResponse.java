package net.fernandosimon.emp_control.exceptions;

/**
 * @author developer
 * @date 2020-01-12
 * @time 16:15
 */
public class CategoryIdExceptionResponse {
    private String categoryId;

    public CategoryIdExceptionResponse(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
