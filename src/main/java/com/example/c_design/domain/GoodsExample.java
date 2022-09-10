package com.example.c_design.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGIdIsNull() {
            addCriterion("g_id is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("g_id is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(Long value) {
            addCriterion("g_id =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(Long value) {
            addCriterion("g_id <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(Long value) {
            addCriterion("g_id >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(Long value) {
            addCriterion("g_id >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(Long value) {
            addCriterion("g_id <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(Long value) {
            addCriterion("g_id <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<Long> values) {
            addCriterion("g_id in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<Long> values) {
            addCriterion("g_id not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(Long value1, Long value2) {
            addCriterion("g_id between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(Long value1, Long value2) {
            addCriterion("g_id not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGNameIsNull() {
            addCriterion("g_name is null");
            return (Criteria) this;
        }

        public Criteria andGNameIsNotNull() {
            addCriterion("g_name is not null");
            return (Criteria) this;
        }

        public Criteria andGNameEqualTo(String value) {
            addCriterion("g_name =", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotEqualTo(String value) {
            addCriterion("g_name <>", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThan(String value) {
            addCriterion("g_name >", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThanOrEqualTo(String value) {
            addCriterion("g_name >=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThan(String value) {
            addCriterion("g_name <", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThanOrEqualTo(String value) {
            addCriterion("g_name <=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLike(String value) {
            addCriterion("g_name like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotLike(String value) {
            addCriterion("g_name not like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameIn(List<String> values) {
            addCriterion("g_name in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotIn(List<String> values) {
            addCriterion("g_name not in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameBetween(String value1, String value2) {
            addCriterion("g_name between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotBetween(String value1, String value2) {
            addCriterion("g_name not between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGPriceIsNull() {
            addCriterion("g_price is null");
            return (Criteria) this;
        }

        public Criteria andGPriceIsNotNull() {
            addCriterion("g_price is not null");
            return (Criteria) this;
        }

        public Criteria andGPriceEqualTo(Integer value) {
            addCriterion("g_price =", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceNotEqualTo(Integer value) {
            addCriterion("g_price <>", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceGreaterThan(Integer value) {
            addCriterion("g_price >", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_price >=", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceLessThan(Integer value) {
            addCriterion("g_price <", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceLessThanOrEqualTo(Integer value) {
            addCriterion("g_price <=", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceIn(List<Integer> values) {
            addCriterion("g_price in", values, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceNotIn(List<Integer> values) {
            addCriterion("g_price not in", values, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceBetween(Integer value1, Integer value2) {
            addCriterion("g_price between", value1, value2, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("g_price not between", value1, value2, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPictureIsNull() {
            addCriterion("g_picture is null");
            return (Criteria) this;
        }

        public Criteria andGPictureIsNotNull() {
            addCriterion("g_picture is not null");
            return (Criteria) this;
        }

        public Criteria andGPictureEqualTo(String value) {
            addCriterion("g_picture =", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureNotEqualTo(String value) {
            addCriterion("g_picture <>", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureGreaterThan(String value) {
            addCriterion("g_picture >", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureGreaterThanOrEqualTo(String value) {
            addCriterion("g_picture >=", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureLessThan(String value) {
            addCriterion("g_picture <", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureLessThanOrEqualTo(String value) {
            addCriterion("g_picture <=", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureLike(String value) {
            addCriterion("g_picture like", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureNotLike(String value) {
            addCriterion("g_picture not like", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureIn(List<String> values) {
            addCriterion("g_picture in", values, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureNotIn(List<String> values) {
            addCriterion("g_picture not in", values, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureBetween(String value1, String value2) {
            addCriterion("g_picture between", value1, value2, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureNotBetween(String value1, String value2) {
            addCriterion("g_picture not between", value1, value2, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGNumberIsNull() {
            addCriterion("g_number is null");
            return (Criteria) this;
        }

        public Criteria andGNumberIsNotNull() {
            addCriterion("g_number is not null");
            return (Criteria) this;
        }

        public Criteria andGNumberEqualTo(Integer value) {
            addCriterion("g_number =", value, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberNotEqualTo(Integer value) {
            addCriterion("g_number <>", value, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberGreaterThan(Integer value) {
            addCriterion("g_number >", value, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_number >=", value, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberLessThan(Integer value) {
            addCriterion("g_number <", value, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberLessThanOrEqualTo(Integer value) {
            addCriterion("g_number <=", value, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberIn(List<Integer> values) {
            addCriterion("g_number in", values, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberNotIn(List<Integer> values) {
            addCriterion("g_number not in", values, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberBetween(Integer value1, Integer value2) {
            addCriterion("g_number between", value1, value2, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("g_number not between", value1, value2, "gNumber");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}