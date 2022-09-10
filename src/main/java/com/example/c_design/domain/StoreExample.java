package com.example.c_design.domain;

import java.util.ArrayList;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSPlaceIsNull() {
            addCriterion("s_place is null");
            return (Criteria) this;
        }

        public Criteria andSPlaceIsNotNull() {
            addCriterion("s_place is not null");
            return (Criteria) this;
        }

        public Criteria andSPlaceEqualTo(String value) {
            addCriterion("s_place =", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceNotEqualTo(String value) {
            addCriterion("s_place <>", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceGreaterThan(String value) {
            addCriterion("s_place >", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("s_place >=", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceLessThan(String value) {
            addCriterion("s_place <", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceLessThanOrEqualTo(String value) {
            addCriterion("s_place <=", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceLike(String value) {
            addCriterion("s_place like", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceNotLike(String value) {
            addCriterion("s_place not like", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceIn(List<String> values) {
            addCriterion("s_place in", values, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceNotIn(List<String> values) {
            addCriterion("s_place not in", values, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceBetween(String value1, String value2) {
            addCriterion("s_place between", value1, value2, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceNotBetween(String value1, String value2) {
            addCriterion("s_place not between", value1, value2, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPictureIsNull() {
            addCriterion("s_picture is null");
            return (Criteria) this;
        }

        public Criteria andSPictureIsNotNull() {
            addCriterion("s_picture is not null");
            return (Criteria) this;
        }

        public Criteria andSPictureEqualTo(String value) {
            addCriterion("s_picture =", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureNotEqualTo(String value) {
            addCriterion("s_picture <>", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureGreaterThan(String value) {
            addCriterion("s_picture >", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureGreaterThanOrEqualTo(String value) {
            addCriterion("s_picture >=", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureLessThan(String value) {
            addCriterion("s_picture <", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureLessThanOrEqualTo(String value) {
            addCriterion("s_picture <=", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureLike(String value) {
            addCriterion("s_picture like", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureNotLike(String value) {
            addCriterion("s_picture not like", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureIn(List<String> values) {
            addCriterion("s_picture in", values, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureNotIn(List<String> values) {
            addCriterion("s_picture not in", values, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureBetween(String value1, String value2) {
            addCriterion("s_picture between", value1, value2, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureNotBetween(String value1, String value2) {
            addCriterion("s_picture not between", value1, value2, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSIntroducetionIsNull() {
            addCriterion("s_introducetion is null");
            return (Criteria) this;
        }

        public Criteria andSIntroducetionIsNotNull() {
            addCriterion("s_introducetion is not null");
            return (Criteria) this;
        }

        public Criteria andSIntroducetionEqualTo(String value) {
            addCriterion("s_introducetion =", value, "sIntroducetion");
            return (Criteria) this;
        }

        public Criteria andSIntroducetionNotEqualTo(String value) {
            addCriterion("s_introducetion <>", value, "sIntroducetion");
            return (Criteria) this;
        }

        public Criteria andSIntroducetionGreaterThan(String value) {
            addCriterion("s_introducetion >", value, "sIntroducetion");
            return (Criteria) this;
        }

        public Criteria andSIntroducetionGreaterThanOrEqualTo(String value) {
            addCriterion("s_introducetion >=", value, "sIntroducetion");
            return (Criteria) this;
        }

        public Criteria andSIntroducetionLessThan(String value) {
            addCriterion("s_introducetion <", value, "sIntroducetion");
            return (Criteria) this;
        }

        public Criteria andSIntroducetionLessThanOrEqualTo(String value) {
            addCriterion("s_introducetion <=", value, "sIntroducetion");
            return (Criteria) this;
        }

        public Criteria andSIntroducetionLike(String value) {
            addCriterion("s_introducetion like", value, "sIntroducetion");
            return (Criteria) this;
        }

        public Criteria andSIntroducetionNotLike(String value) {
            addCriterion("s_introducetion not like", value, "sIntroducetion");
            return (Criteria) this;
        }

        public Criteria andSIntroducetionIn(List<String> values) {
            addCriterion("s_introducetion in", values, "sIntroducetion");
            return (Criteria) this;
        }

        public Criteria andSIntroducetionNotIn(List<String> values) {
            addCriterion("s_introducetion not in", values, "sIntroducetion");
            return (Criteria) this;
        }

        public Criteria andSIntroducetionBetween(String value1, String value2) {
            addCriterion("s_introducetion between", value1, value2, "sIntroducetion");
            return (Criteria) this;
        }

        public Criteria andSIntroducetionNotBetween(String value1, String value2) {
            addCriterion("s_introducetion not between", value1, value2, "sIntroducetion");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSKindIsNull() {
            addCriterion("s_kind is null");
            return (Criteria) this;
        }

        public Criteria andSKindIsNotNull() {
            addCriterion("s_kind is not null");
            return (Criteria) this;
        }

        public Criteria andSKindEqualTo(String value) {
            addCriterion("s_kind =", value, "sKind");
            return (Criteria) this;
        }

        public Criteria andSKindNotEqualTo(String value) {
            addCriterion("s_kind <>", value, "sKind");
            return (Criteria) this;
        }

        public Criteria andSKindGreaterThan(String value) {
            addCriterion("s_kind >", value, "sKind");
            return (Criteria) this;
        }

        public Criteria andSKindGreaterThanOrEqualTo(String value) {
            addCriterion("s_kind >=", value, "sKind");
            return (Criteria) this;
        }

        public Criteria andSKindLessThan(String value) {
            addCriterion("s_kind <", value, "sKind");
            return (Criteria) this;
        }

        public Criteria andSKindLessThanOrEqualTo(String value) {
            addCriterion("s_kind <=", value, "sKind");
            return (Criteria) this;
        }

        public Criteria andSKindLike(String value) {
            addCriterion("s_kind like", value, "sKind");
            return (Criteria) this;
        }

        public Criteria andSKindNotLike(String value) {
            addCriterion("s_kind not like", value, "sKind");
            return (Criteria) this;
        }

        public Criteria andSKindIn(List<String> values) {
            addCriterion("s_kind in", values, "sKind");
            return (Criteria) this;
        }

        public Criteria andSKindNotIn(List<String> values) {
            addCriterion("s_kind not in", values, "sKind");
            return (Criteria) this;
        }

        public Criteria andSKindBetween(String value1, String value2) {
            addCriterion("s_kind between", value1, value2, "sKind");
            return (Criteria) this;
        }

        public Criteria andSKindNotBetween(String value1, String value2) {
            addCriterion("s_kind not between", value1, value2, "sKind");
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