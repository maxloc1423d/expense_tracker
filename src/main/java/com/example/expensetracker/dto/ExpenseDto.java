package com.example.expensetracker.dto;


public class ExpenseDto {
    private Long id;
    private String category;
    private Double amount;
    private String comments;

    public ExpenseDto() {}

    public ExpenseDto(Long id, String category, Double amount, String comments) {
        this.id = id;
        this.category = category;
        this.amount = amount;
        this.comments = comments;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
