package ec.com.sofka.gateway.dto;

import ec.com.sofka.utils.enums.StatusEnum;

import java.math.BigDecimal;

public class TransactionTypeDTO {
    private String id;
    private String type;
    private String description;
    private BigDecimal value;
    private Boolean transactionCost;
    private Boolean discount;
    private StatusEnum status;

    public TransactionTypeDTO() {}

    public TransactionTypeDTO(String id, String type, String description, BigDecimal value, Boolean transactionCost, Boolean discount, StatusEnum status) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.value = value;
        this.transactionCost = transactionCost;
        this.discount = discount;
        this.status = status;
    }

    public TransactionTypeDTO(String type, String description, BigDecimal value, Boolean transactionCost, Boolean discount, StatusEnum status) {
        this.type = type;
        this.description = description;
        this.value = value;
        this.transactionCost = transactionCost;
        this.discount = discount;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Boolean getTransactionCost() {
        return transactionCost;
    }

    public void setTransactionCost(Boolean transactionCost) {
        this.transactionCost = transactionCost;
    }

    public Boolean getDiscount() {
        return discount;
    }

    public void setDiscount(Boolean discount) {
        this.discount = discount;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}