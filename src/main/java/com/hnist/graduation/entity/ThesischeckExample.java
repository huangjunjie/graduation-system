package com.hnist.graduation.entity;

import java.util.ArrayList;
import java.util.List;

public class ThesischeckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThesischeckExample() {
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

        public Criteria andThclassIsNull() {
            addCriterion("THCLASS is null");
            return (Criteria) this;
        }

        public Criteria andThclassIsNotNull() {
            addCriterion("THCLASS is not null");
            return (Criteria) this;
        }

        public Criteria andThclassEqualTo(String value) {
            addCriterion("THCLASS =", value, "thclass");
            return (Criteria) this;
        }

        public Criteria andThclassNotEqualTo(String value) {
            addCriterion("THCLASS <>", value, "thclass");
            return (Criteria) this;
        }

        public Criteria andThclassGreaterThan(String value) {
            addCriterion("THCLASS >", value, "thclass");
            return (Criteria) this;
        }

        public Criteria andThclassGreaterThanOrEqualTo(String value) {
            addCriterion("THCLASS >=", value, "thclass");
            return (Criteria) this;
        }

        public Criteria andThclassLessThan(String value) {
            addCriterion("THCLASS <", value, "thclass");
            return (Criteria) this;
        }

        public Criteria andThclassLessThanOrEqualTo(String value) {
            addCriterion("THCLASS <=", value, "thclass");
            return (Criteria) this;
        }

        public Criteria andThclassLike(String value) {
            addCriterion("THCLASS like", value, "thclass");
            return (Criteria) this;
        }

        public Criteria andThclassNotLike(String value) {
            addCriterion("THCLASS not like", value, "thclass");
            return (Criteria) this;
        }

        public Criteria andThclassIn(List<String> values) {
            addCriterion("THCLASS in", values, "thclass");
            return (Criteria) this;
        }

        public Criteria andThclassNotIn(List<String> values) {
            addCriterion("THCLASS not in", values, "thclass");
            return (Criteria) this;
        }

        public Criteria andThclassBetween(String value1, String value2) {
            addCriterion("THCLASS between", value1, value2, "thclass");
            return (Criteria) this;
        }

        public Criteria andThclassNotBetween(String value1, String value2) {
            addCriterion("THCLASS not between", value1, value2, "thclass");
            return (Criteria) this;
        }

        public Criteria andThfromIsNull() {
            addCriterion("THFROM is null");
            return (Criteria) this;
        }

        public Criteria andThfromIsNotNull() {
            addCriterion("THFROM is not null");
            return (Criteria) this;
        }

        public Criteria andThfromEqualTo(String value) {
            addCriterion("THFROM =", value, "thfrom");
            return (Criteria) this;
        }

        public Criteria andThfromNotEqualTo(String value) {
            addCriterion("THFROM <>", value, "thfrom");
            return (Criteria) this;
        }

        public Criteria andThfromGreaterThan(String value) {
            addCriterion("THFROM >", value, "thfrom");
            return (Criteria) this;
        }

        public Criteria andThfromGreaterThanOrEqualTo(String value) {
            addCriterion("THFROM >=", value, "thfrom");
            return (Criteria) this;
        }

        public Criteria andThfromLessThan(String value) {
            addCriterion("THFROM <", value, "thfrom");
            return (Criteria) this;
        }

        public Criteria andThfromLessThanOrEqualTo(String value) {
            addCriterion("THFROM <=", value, "thfrom");
            return (Criteria) this;
        }

        public Criteria andThfromLike(String value) {
            addCriterion("THFROM like", value, "thfrom");
            return (Criteria) this;
        }

        public Criteria andThfromNotLike(String value) {
            addCriterion("THFROM not like", value, "thfrom");
            return (Criteria) this;
        }

        public Criteria andThfromIn(List<String> values) {
            addCriterion("THFROM in", values, "thfrom");
            return (Criteria) this;
        }

        public Criteria andThfromNotIn(List<String> values) {
            addCriterion("THFROM not in", values, "thfrom");
            return (Criteria) this;
        }

        public Criteria andThfromBetween(String value1, String value2) {
            addCriterion("THFROM between", value1, value2, "thfrom");
            return (Criteria) this;
        }

        public Criteria andThfromNotBetween(String value1, String value2) {
            addCriterion("THFROM not between", value1, value2, "thfrom");
            return (Criteria) this;
        }

        public Criteria andCheckdIsNull() {
            addCriterion("CHECKD is null");
            return (Criteria) this;
        }

        public Criteria andCheckdIsNotNull() {
            addCriterion("CHECKD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdEqualTo(Integer value) {
            addCriterion("CHECKD =", value, "checkd");
            return (Criteria) this;
        }

        public Criteria andCheckdNotEqualTo(Integer value) {
            addCriterion("CHECKD <>", value, "checkd");
            return (Criteria) this;
        }

        public Criteria andCheckdGreaterThan(Integer value) {
            addCriterion("CHECKD >", value, "checkd");
            return (Criteria) this;
        }

        public Criteria andCheckdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECKD >=", value, "checkd");
            return (Criteria) this;
        }

        public Criteria andCheckdLessThan(Integer value) {
            addCriterion("CHECKD <", value, "checkd");
            return (Criteria) this;
        }

        public Criteria andCheckdLessThanOrEqualTo(Integer value) {
            addCriterion("CHECKD <=", value, "checkd");
            return (Criteria) this;
        }

        public Criteria andCheckdIn(List<Integer> values) {
            addCriterion("CHECKD in", values, "checkd");
            return (Criteria) this;
        }

        public Criteria andCheckdNotIn(List<Integer> values) {
            addCriterion("CHECKD not in", values, "checkd");
            return (Criteria) this;
        }

        public Criteria andCheckdBetween(Integer value1, Integer value2) {
            addCriterion("CHECKD between", value1, value2, "checkd");
            return (Criteria) this;
        }

        public Criteria andCheckdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECKD not between", value1, value2, "checkd");
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