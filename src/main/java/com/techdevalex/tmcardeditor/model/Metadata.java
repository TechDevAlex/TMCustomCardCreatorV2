package com.techdevalex.tmcardeditor.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Metadata {
    @Column
    private String description;

    @Column
    private String cardNumber;

    @Column
    private int victoryPoints;

    @Embedded
    private RenderData renderData;

    // Getters and setters...
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(int victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    public RenderData getRenderData() {
        return renderData;
    }

    public void setRenderData(RenderData renderData) {
        this.renderData = renderData;
    }

    @Embeddable
    public static class RenderData {
        @Embedded
        private List<Row> rows;

        // Getters and setters...
        public List<Row> getRows() {
            return rows;
        }

        public void setRows(List<Row> rows) {
            this.rows = rows;
        }

        @Embeddable
        public static class Row {
            @Embedded
            private List<Item> rows;

            // Getters and setters...
            public List<Item> getRows() {
                return rows;
            }

            public void setRows(List<Item> rows) {
                this.rows = rows;
            }

            @Embeddable
            public static class Item {
                // changing to name to ensure it isn't mapped to card-type from card class
                @Column (name = "itemType")
                private String type;

                @Column
                private int amount;

                @Column
                private boolean isItem;

                @Column
                private String text;

                @Column
                private boolean isPlate;

                @Column
                private boolean isBold;

                @Column
                private String size;

                @Column
                private boolean isIcon;

                @Column
                private boolean isSuperscript;

                // Getters and setters...
                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getAmount() {
                    return amount;
                }

                public void setAmount(int amount) {
                    this.amount = amount;
                }

                public boolean isItem() {
                    return isItem;
                }

                public void setItem(boolean isItem) {
                    this.isItem = isItem;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public boolean isPlate() {
                    return isPlate;
                }

                public void setPlate(boolean isPlate) {
                    this.isPlate = isPlate;
                }

                public boolean isBold() {
                    return isBold;
                }

                public void setBold(boolean isBold) {
                    this.isBold = isBold;
                }

                public String getSize() {
                    return size;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public boolean isIcon() {
                    return isIcon;
                }

                public void setIcon(boolean isIcon) {
                    this.isIcon = isIcon;
                }

                public boolean isSuperscript() {
                    return isSuperscript;
                }

                public void setSuperscript(boolean isSuperscript) {
                    this.isSuperscript = isSuperscript;
                }
            }
        }
    }
}