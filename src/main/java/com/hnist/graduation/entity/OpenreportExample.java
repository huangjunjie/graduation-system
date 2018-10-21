package com.hnist.graduation.entity;

import java.util.ArrayList;
import java.util.List;

public class OpenreportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OpenreportExample() {
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

        public Criteria andOridIsNull() {
            addCriterion("ORID is null");
            return (Criteria) this;
        }

        public Criteria andOridIsNotNull() {
            addCriterion("ORID is not null");
            return (Criteria) this;
        }

        public Criteria andOridEqualTo(String value) {
            addCriterion("ORID =", value, "orid");
            return (Criteria) this;
        }

        public Criteria andOridNotEqualTo(String value) {
            addCriterion("ORID <>", value, "orid");
            return (Criteria) this;
        }

        public Criteria andOridGreaterThan(String value) {
            addCriterion("ORID >", value, "orid");
            return (Criteria) this;
        }

        public Criteria andOridGreaterThanOrEqualTo(String value) {
            addCriterion("ORID >=", value, "orid");
            return (Criteria) this;
        }

        public Criteria andOridLessThan(String value) {
            addCriterion("ORID <", value, "orid");
            return (Criteria) this;
        }

        public Criteria andOridLessThanOrEqualTo(String value) {
            addCriterion("ORID <=", value, "orid");
            return (Criteria) this;
        }

        public Criteria andOridLike(String value) {
            addCriterion("ORID like", value, "orid");
            return (Criteria) this;
        }

        public Criteria andOridNotLike(String value) {
            addCriterion("ORID not like", value, "orid");
            return (Criteria) this;
        }

        public Criteria andOridIn(List<String> values) {
            addCriterion("ORID in", values, "orid");
            return (Criteria) this;
        }

        public Criteria andOridNotIn(List<String> values) {
            addCriterion("ORID not in", values, "orid");
            return (Criteria) this;
        }

        public Criteria andOridBetween(String value1, String value2) {
            addCriterion("ORID between", value1, value2, "orid");
            return (Criteria) this;
        }

        public Criteria andOridNotBetween(String value1, String value2) {
            addCriterion("ORID not between", value1, value2, "orid");
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

        public Criteria andContentaIsNull() {
            addCriterion("CONTENTA is null");
            return (Criteria) this;
        }

        public Criteria andContentaIsNotNull() {
            addCriterion("CONTENTA is not null");
            return (Criteria) this;
        }

        public Criteria andContentaEqualTo(String value) {
            addCriterion("CONTENTA =", value, "contenta");
            return (Criteria) this;
        }

        public Criteria andContentaNotEqualTo(String value) {
            addCriterion("CONTENTA <>", value, "contenta");
            return (Criteria) this;
        }

        public Criteria andContentaGreaterThan(String value) {
            addCriterion("CONTENTA >", value, "contenta");
            return (Criteria) this;
        }

        public Criteria andContentaGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTA >=", value, "contenta");
            return (Criteria) this;
        }

        public Criteria andContentaLessThan(String value) {
            addCriterion("CONTENTA <", value, "contenta");
            return (Criteria) this;
        }

        public Criteria andContentaLessThanOrEqualTo(String value) {
            addCriterion("CONTENTA <=", value, "contenta");
            return (Criteria) this;
        }

        public Criteria andContentaLike(String value) {
            addCriterion("CONTENTA like", value, "contenta");
            return (Criteria) this;
        }

        public Criteria andContentaNotLike(String value) {
            addCriterion("CONTENTA not like", value, "contenta");
            return (Criteria) this;
        }

        public Criteria andContentaIn(List<String> values) {
            addCriterion("CONTENTA in", values, "contenta");
            return (Criteria) this;
        }

        public Criteria andContentaNotIn(List<String> values) {
            addCriterion("CONTENTA not in", values, "contenta");
            return (Criteria) this;
        }

        public Criteria andContentaBetween(String value1, String value2) {
            addCriterion("CONTENTA between", value1, value2, "contenta");
            return (Criteria) this;
        }

        public Criteria andContentaNotBetween(String value1, String value2) {
            addCriterion("CONTENTA not between", value1, value2, "contenta");
            return (Criteria) this;
        }

        public Criteria andContentbIsNull() {
            addCriterion("CONTENTB is null");
            return (Criteria) this;
        }

        public Criteria andContentbIsNotNull() {
            addCriterion("CONTENTB is not null");
            return (Criteria) this;
        }

        public Criteria andContentbEqualTo(String value) {
            addCriterion("CONTENTB =", value, "contentb");
            return (Criteria) this;
        }

        public Criteria andContentbNotEqualTo(String value) {
            addCriterion("CONTENTB <>", value, "contentb");
            return (Criteria) this;
        }

        public Criteria andContentbGreaterThan(String value) {
            addCriterion("CONTENTB >", value, "contentb");
            return (Criteria) this;
        }

        public Criteria andContentbGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTB >=", value, "contentb");
            return (Criteria) this;
        }

        public Criteria andContentbLessThan(String value) {
            addCriterion("CONTENTB <", value, "contentb");
            return (Criteria) this;
        }

        public Criteria andContentbLessThanOrEqualTo(String value) {
            addCriterion("CONTENTB <=", value, "contentb");
            return (Criteria) this;
        }

        public Criteria andContentbLike(String value) {
            addCriterion("CONTENTB like", value, "contentb");
            return (Criteria) this;
        }

        public Criteria andContentbNotLike(String value) {
            addCriterion("CONTENTB not like", value, "contentb");
            return (Criteria) this;
        }

        public Criteria andContentbIn(List<String> values) {
            addCriterion("CONTENTB in", values, "contentb");
            return (Criteria) this;
        }

        public Criteria andContentbNotIn(List<String> values) {
            addCriterion("CONTENTB not in", values, "contentb");
            return (Criteria) this;
        }

        public Criteria andContentbBetween(String value1, String value2) {
            addCriterion("CONTENTB between", value1, value2, "contentb");
            return (Criteria) this;
        }

        public Criteria andContentbNotBetween(String value1, String value2) {
            addCriterion("CONTENTB not between", value1, value2, "contentb");
            return (Criteria) this;
        }

        public Criteria andContentcIsNull() {
            addCriterion("CONTENTC is null");
            return (Criteria) this;
        }

        public Criteria andContentcIsNotNull() {
            addCriterion("CONTENTC is not null");
            return (Criteria) this;
        }

        public Criteria andContentcEqualTo(String value) {
            addCriterion("CONTENTC =", value, "contentc");
            return (Criteria) this;
        }

        public Criteria andContentcNotEqualTo(String value) {
            addCriterion("CONTENTC <>", value, "contentc");
            return (Criteria) this;
        }

        public Criteria andContentcGreaterThan(String value) {
            addCriterion("CONTENTC >", value, "contentc");
            return (Criteria) this;
        }

        public Criteria andContentcGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTC >=", value, "contentc");
            return (Criteria) this;
        }

        public Criteria andContentcLessThan(String value) {
            addCriterion("CONTENTC <", value, "contentc");
            return (Criteria) this;
        }

        public Criteria andContentcLessThanOrEqualTo(String value) {
            addCriterion("CONTENTC <=", value, "contentc");
            return (Criteria) this;
        }

        public Criteria andContentcLike(String value) {
            addCriterion("CONTENTC like", value, "contentc");
            return (Criteria) this;
        }

        public Criteria andContentcNotLike(String value) {
            addCriterion("CONTENTC not like", value, "contentc");
            return (Criteria) this;
        }

        public Criteria andContentcIn(List<String> values) {
            addCriterion("CONTENTC in", values, "contentc");
            return (Criteria) this;
        }

        public Criteria andContentcNotIn(List<String> values) {
            addCriterion("CONTENTC not in", values, "contentc");
            return (Criteria) this;
        }

        public Criteria andContentcBetween(String value1, String value2) {
            addCriterion("CONTENTC between", value1, value2, "contentc");
            return (Criteria) this;
        }

        public Criteria andContentcNotBetween(String value1, String value2) {
            addCriterion("CONTENTC not between", value1, value2, "contentc");
            return (Criteria) this;
        }

        public Criteria andContentdIsNull() {
            addCriterion("CONTENTD is null");
            return (Criteria) this;
        }

        public Criteria andContentdIsNotNull() {
            addCriterion("CONTENTD is not null");
            return (Criteria) this;
        }

        public Criteria andContentdEqualTo(String value) {
            addCriterion("CONTENTD =", value, "contentd");
            return (Criteria) this;
        }

        public Criteria andContentdNotEqualTo(String value) {
            addCriterion("CONTENTD <>", value, "contentd");
            return (Criteria) this;
        }

        public Criteria andContentdGreaterThan(String value) {
            addCriterion("CONTENTD >", value, "contentd");
            return (Criteria) this;
        }

        public Criteria andContentdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTD >=", value, "contentd");
            return (Criteria) this;
        }

        public Criteria andContentdLessThan(String value) {
            addCriterion("CONTENTD <", value, "contentd");
            return (Criteria) this;
        }

        public Criteria andContentdLessThanOrEqualTo(String value) {
            addCriterion("CONTENTD <=", value, "contentd");
            return (Criteria) this;
        }

        public Criteria andContentdLike(String value) {
            addCriterion("CONTENTD like", value, "contentd");
            return (Criteria) this;
        }

        public Criteria andContentdNotLike(String value) {
            addCriterion("CONTENTD not like", value, "contentd");
            return (Criteria) this;
        }

        public Criteria andContentdIn(List<String> values) {
            addCriterion("CONTENTD in", values, "contentd");
            return (Criteria) this;
        }

        public Criteria andContentdNotIn(List<String> values) {
            addCriterion("CONTENTD not in", values, "contentd");
            return (Criteria) this;
        }

        public Criteria andContentdBetween(String value1, String value2) {
            addCriterion("CONTENTD between", value1, value2, "contentd");
            return (Criteria) this;
        }

        public Criteria andContentdNotBetween(String value1, String value2) {
            addCriterion("CONTENTD not between", value1, value2, "contentd");
            return (Criteria) this;
        }

        public Criteria andContenteIsNull() {
            addCriterion("CONTENTE is null");
            return (Criteria) this;
        }

        public Criteria andContenteIsNotNull() {
            addCriterion("CONTENTE is not null");
            return (Criteria) this;
        }

        public Criteria andContenteEqualTo(String value) {
            addCriterion("CONTENTE =", value, "contente");
            return (Criteria) this;
        }

        public Criteria andContenteNotEqualTo(String value) {
            addCriterion("CONTENTE <>", value, "contente");
            return (Criteria) this;
        }

        public Criteria andContenteGreaterThan(String value) {
            addCriterion("CONTENTE >", value, "contente");
            return (Criteria) this;
        }

        public Criteria andContenteGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTE >=", value, "contente");
            return (Criteria) this;
        }

        public Criteria andContenteLessThan(String value) {
            addCriterion("CONTENTE <", value, "contente");
            return (Criteria) this;
        }

        public Criteria andContenteLessThanOrEqualTo(String value) {
            addCriterion("CONTENTE <=", value, "contente");
            return (Criteria) this;
        }

        public Criteria andContenteLike(String value) {
            addCriterion("CONTENTE like", value, "contente");
            return (Criteria) this;
        }

        public Criteria andContenteNotLike(String value) {
            addCriterion("CONTENTE not like", value, "contente");
            return (Criteria) this;
        }

        public Criteria andContenteIn(List<String> values) {
            addCriterion("CONTENTE in", values, "contente");
            return (Criteria) this;
        }

        public Criteria andContenteNotIn(List<String> values) {
            addCriterion("CONTENTE not in", values, "contente");
            return (Criteria) this;
        }

        public Criteria andContenteBetween(String value1, String value2) {
            addCriterion("CONTENTE between", value1, value2, "contente");
            return (Criteria) this;
        }

        public Criteria andContenteNotBetween(String value1, String value2) {
            addCriterion("CONTENTE not between", value1, value2, "contente");
            return (Criteria) this;
        }

        public Criteria andContentfIsNull() {
            addCriterion("CONTENTF is null");
            return (Criteria) this;
        }

        public Criteria andContentfIsNotNull() {
            addCriterion("CONTENTF is not null");
            return (Criteria) this;
        }

        public Criteria andContentfEqualTo(String value) {
            addCriterion("CONTENTF =", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfNotEqualTo(String value) {
            addCriterion("CONTENTF <>", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfGreaterThan(String value) {
            addCriterion("CONTENTF >", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTF >=", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfLessThan(String value) {
            addCriterion("CONTENTF <", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfLessThanOrEqualTo(String value) {
            addCriterion("CONTENTF <=", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfLike(String value) {
            addCriterion("CONTENTF like", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfNotLike(String value) {
            addCriterion("CONTENTF not like", value, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfIn(List<String> values) {
            addCriterion("CONTENTF in", values, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfNotIn(List<String> values) {
            addCriterion("CONTENTF not in", values, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfBetween(String value1, String value2) {
            addCriterion("CONTENTF between", value1, value2, "contentf");
            return (Criteria) this;
        }

        public Criteria andContentfNotBetween(String value1, String value2) {
            addCriterion("CONTENTF not between", value1, value2, "contentf");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNull() {
            addCriterion("LASTTIME is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNotNull() {
            addCriterion("LASTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeEqualTo(String value) {
            addCriterion("LASTTIME =", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotEqualTo(String value) {
            addCriterion("LASTTIME <>", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThan(String value) {
            addCriterion("LASTTIME >", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThanOrEqualTo(String value) {
            addCriterion("LASTTIME >=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThan(String value) {
            addCriterion("LASTTIME <", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThanOrEqualTo(String value) {
            addCriterion("LASTTIME <=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLike(String value) {
            addCriterion("LASTTIME like", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotLike(String value) {
            addCriterion("LASTTIME not like", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIn(List<String> values) {
            addCriterion("LASTTIME in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotIn(List<String> values) {
            addCriterion("LASTTIME not in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeBetween(String value1, String value2) {
            addCriterion("LASTTIME between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotBetween(String value1, String value2) {
            addCriterion("LASTTIME not between", value1, value2, "lasttime");
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