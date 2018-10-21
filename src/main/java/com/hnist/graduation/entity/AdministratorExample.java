package com.hnist.graduation.entity;

import java.util.ArrayList;
import java.util.List;

public class AdministratorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdministratorExample() {
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

        public Criteria andAdminidIsNull() {
            addCriterion("ADMINID is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("ADMINID is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(String value) {
            addCriterion("ADMINID =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(String value) {
            addCriterion("ADMINID <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(String value) {
            addCriterion("ADMINID >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINID >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(String value) {
            addCriterion("ADMINID <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(String value) {
            addCriterion("ADMINID <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLike(String value) {
            addCriterion("ADMINID like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotLike(String value) {
            addCriterion("ADMINID not like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<String> values) {
            addCriterion("ADMINID in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<String> values) {
            addCriterion("ADMINID not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(String value1, String value2) {
            addCriterion("ADMINID between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(String value1, String value2) {
            addCriterion("ADMINID not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminuseridIsNull() {
            addCriterion("ADMINUSERID is null");
            return (Criteria) this;
        }

        public Criteria andAdminuseridIsNotNull() {
            addCriterion("ADMINUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andAdminuseridEqualTo(String value) {
            addCriterion("ADMINUSERID =", value, "adminuserid");
            return (Criteria) this;
        }

        public Criteria andAdminuseridNotEqualTo(String value) {
            addCriterion("ADMINUSERID <>", value, "adminuserid");
            return (Criteria) this;
        }

        public Criteria andAdminuseridGreaterThan(String value) {
            addCriterion("ADMINUSERID >", value, "adminuserid");
            return (Criteria) this;
        }

        public Criteria andAdminuseridGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINUSERID >=", value, "adminuserid");
            return (Criteria) this;
        }

        public Criteria andAdminuseridLessThan(String value) {
            addCriterion("ADMINUSERID <", value, "adminuserid");
            return (Criteria) this;
        }

        public Criteria andAdminuseridLessThanOrEqualTo(String value) {
            addCriterion("ADMINUSERID <=", value, "adminuserid");
            return (Criteria) this;
        }

        public Criteria andAdminuseridLike(String value) {
            addCriterion("ADMINUSERID like", value, "adminuserid");
            return (Criteria) this;
        }

        public Criteria andAdminuseridNotLike(String value) {
            addCriterion("ADMINUSERID not like", value, "adminuserid");
            return (Criteria) this;
        }

        public Criteria andAdminuseridIn(List<String> values) {
            addCriterion("ADMINUSERID in", values, "adminuserid");
            return (Criteria) this;
        }

        public Criteria andAdminuseridNotIn(List<String> values) {
            addCriterion("ADMINUSERID not in", values, "adminuserid");
            return (Criteria) this;
        }

        public Criteria andAdminuseridBetween(String value1, String value2) {
            addCriterion("ADMINUSERID between", value1, value2, "adminuserid");
            return (Criteria) this;
        }

        public Criteria andAdminuseridNotBetween(String value1, String value2) {
            addCriterion("ADMINUSERID not between", value1, value2, "adminuserid");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNull() {
            addCriterion("ADMINPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNotNull() {
            addCriterion("ADMINPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordEqualTo(String value) {
            addCriterion("ADMINPASSWORD =", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotEqualTo(String value) {
            addCriterion("ADMINPASSWORD <>", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThan(String value) {
            addCriterion("ADMINPASSWORD >", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINPASSWORD >=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThan(String value) {
            addCriterion("ADMINPASSWORD <", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThanOrEqualTo(String value) {
            addCriterion("ADMINPASSWORD <=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLike(String value) {
            addCriterion("ADMINPASSWORD like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotLike(String value) {
            addCriterion("ADMINPASSWORD not like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIn(List<String> values) {
            addCriterion("ADMINPASSWORD in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotIn(List<String> values) {
            addCriterion("ADMINPASSWORD not in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordBetween(String value1, String value2) {
            addCriterion("ADMINPASSWORD between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotBetween(String value1, String value2) {
            addCriterion("ADMINPASSWORD not between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminrealnameIsNull() {
            addCriterion("ADMINREALNAME is null");
            return (Criteria) this;
        }

        public Criteria andAdminrealnameIsNotNull() {
            addCriterion("ADMINREALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAdminrealnameEqualTo(String value) {
            addCriterion("ADMINREALNAME =", value, "adminrealname");
            return (Criteria) this;
        }

        public Criteria andAdminrealnameNotEqualTo(String value) {
            addCriterion("ADMINREALNAME <>", value, "adminrealname");
            return (Criteria) this;
        }

        public Criteria andAdminrealnameGreaterThan(String value) {
            addCriterion("ADMINREALNAME >", value, "adminrealname");
            return (Criteria) this;
        }

        public Criteria andAdminrealnameGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINREALNAME >=", value, "adminrealname");
            return (Criteria) this;
        }

        public Criteria andAdminrealnameLessThan(String value) {
            addCriterion("ADMINREALNAME <", value, "adminrealname");
            return (Criteria) this;
        }

        public Criteria andAdminrealnameLessThanOrEqualTo(String value) {
            addCriterion("ADMINREALNAME <=", value, "adminrealname");
            return (Criteria) this;
        }

        public Criteria andAdminrealnameLike(String value) {
            addCriterion("ADMINREALNAME like", value, "adminrealname");
            return (Criteria) this;
        }

        public Criteria andAdminrealnameNotLike(String value) {
            addCriterion("ADMINREALNAME not like", value, "adminrealname");
            return (Criteria) this;
        }

        public Criteria andAdminrealnameIn(List<String> values) {
            addCriterion("ADMINREALNAME in", values, "adminrealname");
            return (Criteria) this;
        }

        public Criteria andAdminrealnameNotIn(List<String> values) {
            addCriterion("ADMINREALNAME not in", values, "adminrealname");
            return (Criteria) this;
        }

        public Criteria andAdminrealnameBetween(String value1, String value2) {
            addCriterion("ADMINREALNAME between", value1, value2, "adminrealname");
            return (Criteria) this;
        }

        public Criteria andAdminrealnameNotBetween(String value1, String value2) {
            addCriterion("ADMINREALNAME not between", value1, value2, "adminrealname");
            return (Criteria) this;
        }

        public Criteria andAdminemailIsNull() {
            addCriterion("ADMINEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andAdminemailIsNotNull() {
            addCriterion("ADMINEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andAdminemailEqualTo(String value) {
            addCriterion("ADMINEMAIL =", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotEqualTo(String value) {
            addCriterion("ADMINEMAIL <>", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailGreaterThan(String value) {
            addCriterion("ADMINEMAIL >", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINEMAIL >=", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLessThan(String value) {
            addCriterion("ADMINEMAIL <", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLessThanOrEqualTo(String value) {
            addCriterion("ADMINEMAIL <=", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLike(String value) {
            addCriterion("ADMINEMAIL like", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotLike(String value) {
            addCriterion("ADMINEMAIL not like", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailIn(List<String> values) {
            addCriterion("ADMINEMAIL in", values, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotIn(List<String> values) {
            addCriterion("ADMINEMAIL not in", values, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailBetween(String value1, String value2) {
            addCriterion("ADMINEMAIL between", value1, value2, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotBetween(String value1, String value2) {
            addCriterion("ADMINEMAIL not between", value1, value2, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdmintelIsNull() {
            addCriterion("ADMINTEL is null");
            return (Criteria) this;
        }

        public Criteria andAdmintelIsNotNull() {
            addCriterion("ADMINTEL is not null");
            return (Criteria) this;
        }

        public Criteria andAdmintelEqualTo(String value) {
            addCriterion("ADMINTEL =", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelNotEqualTo(String value) {
            addCriterion("ADMINTEL <>", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelGreaterThan(String value) {
            addCriterion("ADMINTEL >", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINTEL >=", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelLessThan(String value) {
            addCriterion("ADMINTEL <", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelLessThanOrEqualTo(String value) {
            addCriterion("ADMINTEL <=", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelLike(String value) {
            addCriterion("ADMINTEL like", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelNotLike(String value) {
            addCriterion("ADMINTEL not like", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelIn(List<String> values) {
            addCriterion("ADMINTEL in", values, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelNotIn(List<String> values) {
            addCriterion("ADMINTEL not in", values, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelBetween(String value1, String value2) {
            addCriterion("ADMINTEL between", value1, value2, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelNotBetween(String value1, String value2) {
            addCriterion("ADMINTEL not between", value1, value2, "admintel");
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