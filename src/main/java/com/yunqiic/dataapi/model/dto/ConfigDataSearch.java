package com.yunqiic.dataapi.model.dto;

public class ConfigDataSearch {
    private Where where;
    private Limit limit;
    private Order order;

    public Limit getLimit() {
        return limit;
    }

    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    public Where getWhere() {
        return where;
    }

    public void setWhere(Where where) {
        this.where = where;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public static class Where {
        private String key;
        private Long startPackageTime;
        private Integer startPackageDate;
        private Integer endPackageDate;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Long getStartPackageTime() {
            return startPackageTime;
        }

        public void setStartPackageTime(Long startPackageTime) {
            this.startPackageTime = startPackageTime;
        }

        public Integer getStartPackageDate() {
            return startPackageDate;
        }

        public void setStartPackageDate(Integer startPackageDate) {
            this.startPackageDate = startPackageDate;
        }

        public Integer getEndPackageDate() {
            return endPackageDate;
        }

        public void setEndPackageDate(Integer endPackageDate) {
            this.endPackageDate = endPackageDate;
        }

        public Where() {

        }
    }

    public static class Limit {
        private String limitStr;

        public String getLimitStr() {
            return limitStr;
        }

        public void setLimitStr(String limitStr) {
            this.limitStr = limitStr;
        }
    }

    public static class Order {
        private String orderStr;

        public String getOrderStr() {
            return orderStr;
        }

        public void setOrderStr(String orderStr) {
            this.orderStr = orderStr;
        }
    }
}
