package com.hnist.graduation.entity;

import java.util.ArrayList;
import java.util.List;

public class ThesisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThesisExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andThidIsNull() {
            addCriterion("THID is null");
            return (Criteria) this;
        }

        public Criteria andThidIsNotNull() {
            addCriterion("THID is not null");
            return (Criteria) this;
        }

        public Criteria andThidEqualTo(String value) {
            addCriterion("THID =", value, "thid");
            return (Criteria) this;
        }

        public Criteria andThidNotEqualTo(String value) {
            addCriterion("THID <>", value, "thid");
            return (Criteria) this;
        }

        public Criteria andThidGreaterThan(String value) {
            addCriterion("THID >", value, "thid");
            return (Criteria) this;
        }

        public Criteria andThidGreaterThanOrEqualTo(String value) {
            addCriterion("THID >=", value, "thid");
            return (Criteria) this;
        }

        public Criteria andThidLessThan(String value) {
            addCriterion("THID <", value, "thid");
            return (Criteria) this;
        }

        public Criteria andThidLessThanOrEqualTo(String value) {
            addCriterion("THID <=", value, "thid");
            return (Criteria) this;
        }

        public Criteria andThidLike(String value) {
            addCriterion("THID like", value, "thid");
            return (Criteria) this;
        }

        public Criteria andThidNotLike(String value) {
            addCriterion("THID not like", value, "thid");
            return (Criteria) this;
        }

        public Criteria andThidIn(List<String> values) {
            addCriterion("THID in", values, "thid");
            return (Criteria) this;
        }

        public Criteria andThidNotIn(List<String> values) {
            addCriterion("THID not in", values, "thid");
            return (Criteria) this;
        }

        public Criteria andThidBetween(String value1, String value2) {
            addCriterion("THID between", value1, value2, "thid");
            return (Criteria) this;
        }

        public Criteria andThidNotBetween(String value1, String value2) {
            addCriterion("THID not between", value1, value2, "thid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("TID is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("TID is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("TID =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("TID <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("TID >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("TID >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("TID <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("TID <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("TID like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("TID not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("TID in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("TID not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("TID between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("TID not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andThnameIsNull() {
            addCriterion("THNAME is null");
            return (Criteria) this;
        }

        public Criteria andThnameIsNotNull() {
            addCriterion("THNAME is not null");
            return (Criteria) this;
        }

        public Criteria andThnameEqualTo(String value) {
            addCriterion("THNAME =", value, "thname");
            return (Criteria) this;
        }

        public Criteria andThnameNotEqualTo(String value) {
            addCriterion("THNAME <>", value, "thname");
            return (Criteria) this;
        }

        public Criteria andThnameGreaterThan(String value) {
            addCriterion("THNAME >", value, "thname");
            return (Criteria) this;
        }

        public Criteria andThnameGreaterThanOrEqualTo(String value) {
            addCriterion("THNAME >=", value, "thname");
            return (Criteria) this;
        }

        public Criteria andThnameLessThan(String value) {
            addCriterion("THNAME <", value, "thname");
            return (Criteria) this;
        }

        public Criteria andThnameLessThanOrEqualTo(String value) {
            addCriterion("THNAME <=", value, "thname");
            return (Criteria) this;
        }

        public Criteria andThnameLike(String value) {
            addCriterion("THNAME like", value, "thname");
            return (Criteria) this;
        }

        public Criteria andThnameNotLike(String value) {
            addCriterion("THNAME not like", value, "thname");
            return (Criteria) this;
        }

        public Criteria andThnameIn(List<String> values) {
            addCriterion("THNAME in", values, "thname");
            return (Criteria) this;
        }

        public Criteria andThnameNotIn(List<String> values) {
            addCriterion("THNAME not in", values, "thname");
            return (Criteria) this;
        }

        public Criteria andThnameBetween(String value1, String value2) {
            addCriterion("THNAME between", value1, value2, "thname");
            return (Criteria) this;
        }

        public Criteria andThnameNotBetween(String value1, String value2) {
            addCriterion("THNAME not between", value1, value2, "thname");
            return (Criteria) this;
        }

        public Criteria andThtitleIsNull() {
            addCriterion("THTITLE is null");
            return (Criteria) this;
        }

        public Criteria andThtitleIsNotNull() {
            addCriterion("THTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andThtitleEqualTo(String value) {
            addCriterion("THTITLE =", value, "thtitle");
            return (Criteria) this;
        }

        public Criteria andThtitleNotEqualTo(String value) {
            addCriterion("THTITLE <>", value, "thtitle");
            return (Criteria) this;
        }

        public Criteria andThtitleGreaterThan(String value) {
            addCriterion("THTITLE >", value, "thtitle");
            return (Criteria) this;
        }

        public Criteria andThtitleGreaterThanOrEqualTo(String value) {
            addCriterion("THTITLE >=", value, "thtitle");
            return (Criteria) this;
        }

        public Criteria andThtitleLessThan(String value) {
            addCriterion("THTITLE <", value, "thtitle");
            return (Criteria) this;
        }

        public Criteria andThtitleLessThanOrEqualTo(String value) {
            addCriterion("THTITLE <=", value, "thtitle");
            return (Criteria) this;
        }

        public Criteria andThtitleLike(String value) {
            addCriterion("THTITLE like", value, "thtitle");
            return (Criteria) this;
        }

        public Criteria andThtitleNotLike(String value) {
            addCriterion("THTITLE not like", value, "thtitle");
            return (Criteria) this;
        }

        public Criteria andThtitleIn(List<String> values) {
            addCriterion("THTITLE in", values, "thtitle");
            return (Criteria) this;
        }

        public Criteria andThtitleNotIn(List<String> values) {
            addCriterion("THTITLE not in", values, "thtitle");
            return (Criteria) this;
        }

        public Criteria andThtitleBetween(String value1, String value2) {
            addCriterion("THTITLE between", value1, value2, "thtitle");
            return (Criteria) this;
        }

        public Criteria andThtitleNotBetween(String value1, String value2) {
            addCriterion("THTITLE not between", value1, value2, "thtitle");
            return (Criteria) this;
        }

        public Criteria andThesiscardIsNull() {
            addCriterion("THESISCARD is null");
            return (Criteria) this;
        }

        public Criteria andThesiscardIsNotNull() {
            addCriterion("THESISCARD is not null");
            return (Criteria) this;
        }

        public Criteria andThesiscardEqualTo(String value) {
            addCriterion("THESISCARD =", value, "thesiscard");
            return (Criteria) this;
        }

        public Criteria andThesiscardNotEqualTo(String value) {
            addCriterion("THESISCARD <>", value, "thesiscard");
            return (Criteria) this;
        }

        public Criteria andThesiscardGreaterThan(String value) {
            addCriterion("THESISCARD >", value, "thesiscard");
            return (Criteria) this;
        }

        public Criteria andThesiscardGreaterThanOrEqualTo(String value) {
            addCriterion("THESISCARD >=", value, "thesiscard");
            return (Criteria) this;
        }

        public Criteria andThesiscardLessThan(String value) {
            addCriterion("THESISCARD <", value, "thesiscard");
            return (Criteria) this;
        }

        public Criteria andThesiscardLessThanOrEqualTo(String value) {
            addCriterion("THESISCARD <=", value, "thesiscard");
            return (Criteria) this;
        }

        public Criteria andThesiscardLike(String value) {
            addCriterion("THESISCARD like", value, "thesiscard");
            return (Criteria) this;
        }

        public Criteria andThesiscardNotLike(String value) {
            addCriterion("THESISCARD not like", value, "thesiscard");
            return (Criteria) this;
        }

        public Criteria andThesiscardIn(List<String> values) {
            addCriterion("THESISCARD in", values, "thesiscard");
            return (Criteria) this;
        }

        public Criteria andThesiscardNotIn(List<String> values) {
            addCriterion("THESISCARD not in", values, "thesiscard");
            return (Criteria) this;
        }

        public Criteria andThesiscardBetween(String value1, String value2) {
            addCriterion("THESISCARD between", value1, value2, "thesiscard");
            return (Criteria) this;
        }

        public Criteria andThesiscardNotBetween(String value1, String value2) {
            addCriterion("THESISCARD not between", value1, value2, "thesiscard");
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