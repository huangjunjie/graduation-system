package com.hnist.graduation.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("MID is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("MID is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("MID =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("MID <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("MID >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MID >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("MID <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("MID <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("MID in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("MID not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("MID between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("MID not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andFromIsNull() {
            addCriterion("FROM is null");
            return (Criteria) this;
        }

        public Criteria andFromIsNotNull() {
            addCriterion("FROM is not null");
            return (Criteria) this;
        }

        public Criteria andFromEqualTo(String value) {
            addCriterion("FROM =", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotEqualTo(String value) {
            addCriterion("FROM <>", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThan(String value) {
            addCriterion("FROM >", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThanOrEqualTo(String value) {
            addCriterion("FROM >=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThan(String value) {
            addCriterion("FROM <", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThanOrEqualTo(String value) {
            addCriterion("FROM <=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLike(String value) {
            addCriterion("FROM like", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotLike(String value) {
            addCriterion("FROM not like", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromIn(List<String> values) {
            addCriterion("FROM in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotIn(List<String> values) {
            addCriterion("FROM not in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromBetween(String value1, String value2) {
            addCriterion("FROM between", value1, value2, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotBetween(String value1, String value2) {
            addCriterion("FROM not between", value1, value2, "from");
            return (Criteria) this;
        }

        public Criteria andToIsNull() {
            addCriterion("TO is null");
            return (Criteria) this;
        }

        public Criteria andToIsNotNull() {
            addCriterion("TO is not null");
            return (Criteria) this;
        }

        public Criteria andToEqualTo(String value) {
            addCriterion("TO =", value, "to");
            return (Criteria) this;
        }

        public Criteria andToNotEqualTo(String value) {
            addCriterion("TO <>", value, "to");
            return (Criteria) this;
        }

        public Criteria andToGreaterThan(String value) {
            addCriterion("TO >", value, "to");
            return (Criteria) this;
        }

        public Criteria andToGreaterThanOrEqualTo(String value) {
            addCriterion("TO >=", value, "to");
            return (Criteria) this;
        }

        public Criteria andToLessThan(String value) {
            addCriterion("TO <", value, "to");
            return (Criteria) this;
        }

        public Criteria andToLessThanOrEqualTo(String value) {
            addCriterion("TO <=", value, "to");
            return (Criteria) this;
        }

        public Criteria andToLike(String value) {
            addCriterion("TO like", value, "to");
            return (Criteria) this;
        }

        public Criteria andToNotLike(String value) {
            addCriterion("TO not like", value, "to");
            return (Criteria) this;
        }

        public Criteria andToIn(List<String> values) {
            addCriterion("TO in", values, "to");
            return (Criteria) this;
        }

        public Criteria andToNotIn(List<String> values) {
            addCriterion("TO not in", values, "to");
            return (Criteria) this;
        }

        public Criteria andToBetween(String value1, String value2) {
            addCriterion("TO between", value1, value2, "to");
            return (Criteria) this;
        }

        public Criteria andToNotBetween(String value1, String value2) {
            addCriterion("TO not between", value1, value2, "to");
            return (Criteria) this;
        }

        public Criteria andMtitleIsNull() {
            addCriterion("MTITLE is null");
            return (Criteria) this;
        }

        public Criteria andMtitleIsNotNull() {
            addCriterion("MTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andMtitleEqualTo(String value) {
            addCriterion("MTITLE =", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotEqualTo(String value) {
            addCriterion("MTITLE <>", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleGreaterThan(String value) {
            addCriterion("MTITLE >", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleGreaterThanOrEqualTo(String value) {
            addCriterion("MTITLE >=", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleLessThan(String value) {
            addCriterion("MTITLE <", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleLessThanOrEqualTo(String value) {
            addCriterion("MTITLE <=", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleLike(String value) {
            addCriterion("MTITLE like", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotLike(String value) {
            addCriterion("MTITLE not like", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleIn(List<String> values) {
            addCriterion("MTITLE in", values, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotIn(List<String> values) {
            addCriterion("MTITLE not in", values, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleBetween(String value1, String value2) {
            addCriterion("MTITLE between", value1, value2, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotBetween(String value1, String value2) {
            addCriterion("MTITLE not between", value1, value2, "mtitle");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("STARTTIME =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("STARTTIME <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("STARTTIME >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("STARTTIME >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("STARTTIME <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("STARTTIME <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("STARTTIME in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("STARTTIME not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("STARTTIME between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("STARTTIME not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andQuoteidIsNull() {
            addCriterion("QUOTEID is null");
            return (Criteria) this;
        }

        public Criteria andQuoteidIsNotNull() {
            addCriterion("QUOTEID is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteidEqualTo(String value) {
            addCriterion("QUOTEID =", value, "quoteid");
            return (Criteria) this;
        }

        public Criteria andQuoteidNotEqualTo(String value) {
            addCriterion("QUOTEID <>", value, "quoteid");
            return (Criteria) this;
        }

        public Criteria andQuoteidGreaterThan(String value) {
            addCriterion("QUOTEID >", value, "quoteid");
            return (Criteria) this;
        }

        public Criteria andQuoteidGreaterThanOrEqualTo(String value) {
            addCriterion("QUOTEID >=", value, "quoteid");
            return (Criteria) this;
        }

        public Criteria andQuoteidLessThan(String value) {
            addCriterion("QUOTEID <", value, "quoteid");
            return (Criteria) this;
        }

        public Criteria andQuoteidLessThanOrEqualTo(String value) {
            addCriterion("QUOTEID <=", value, "quoteid");
            return (Criteria) this;
        }

        public Criteria andQuoteidLike(String value) {
            addCriterion("QUOTEID like", value, "quoteid");
            return (Criteria) this;
        }

        public Criteria andQuoteidNotLike(String value) {
            addCriterion("QUOTEID not like", value, "quoteid");
            return (Criteria) this;
        }

        public Criteria andQuoteidIn(List<String> values) {
            addCriterion("QUOTEID in", values, "quoteid");
            return (Criteria) this;
        }

        public Criteria andQuoteidNotIn(List<String> values) {
            addCriterion("QUOTEID not in", values, "quoteid");
            return (Criteria) this;
        }

        public Criteria andQuoteidBetween(String value1, String value2) {
            addCriterion("QUOTEID between", value1, value2, "quoteid");
            return (Criteria) this;
        }

        public Criteria andQuoteidNotBetween(String value1, String value2) {
            addCriterion("QUOTEID not between", value1, value2, "quoteid");
            return (Criteria) this;
        }

        public Criteria andQuoteclassIsNull() {
            addCriterion("QUOTECLASS is null");
            return (Criteria) this;
        }

        public Criteria andQuoteclassIsNotNull() {
            addCriterion("QUOTECLASS is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteclassEqualTo(Integer value) {
            addCriterion("QUOTECLASS =", value, "quoteclass");
            return (Criteria) this;
        }

        public Criteria andQuoteclassNotEqualTo(Integer value) {
            addCriterion("QUOTECLASS <>", value, "quoteclass");
            return (Criteria) this;
        }

        public Criteria andQuoteclassGreaterThan(Integer value) {
            addCriterion("QUOTECLASS >", value, "quoteclass");
            return (Criteria) this;
        }

        public Criteria andQuoteclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUOTECLASS >=", value, "quoteclass");
            return (Criteria) this;
        }

        public Criteria andQuoteclassLessThan(Integer value) {
            addCriterion("QUOTECLASS <", value, "quoteclass");
            return (Criteria) this;
        }

        public Criteria andQuoteclassLessThanOrEqualTo(Integer value) {
            addCriterion("QUOTECLASS <=", value, "quoteclass");
            return (Criteria) this;
        }

        public Criteria andQuoteclassIn(List<Integer> values) {
            addCriterion("QUOTECLASS in", values, "quoteclass");
            return (Criteria) this;
        }

        public Criteria andQuoteclassNotIn(List<Integer> values) {
            addCriterion("QUOTECLASS not in", values, "quoteclass");
            return (Criteria) this;
        }

        public Criteria andQuoteclassBetween(Integer value1, Integer value2) {
            addCriterion("QUOTECLASS between", value1, value2, "quoteclass");
            return (Criteria) this;
        }

        public Criteria andQuoteclassNotBetween(Integer value1, Integer value2) {
            addCriterion("QUOTECLASS not between", value1, value2, "quoteclass");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andMstatusIsNull() {
            addCriterion("MSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andMstatusIsNotNull() {
            addCriterion("MSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMstatusEqualTo(Integer value) {
            addCriterion("MSTATUS =", value, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusNotEqualTo(Integer value) {
            addCriterion("MSTATUS <>", value, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusGreaterThan(Integer value) {
            addCriterion("MSTATUS >", value, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("MSTATUS >=", value, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusLessThan(Integer value) {
            addCriterion("MSTATUS <", value, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusLessThanOrEqualTo(Integer value) {
            addCriterion("MSTATUS <=", value, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusIn(List<Integer> values) {
            addCriterion("MSTATUS in", values, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusNotIn(List<Integer> values) {
            addCriterion("MSTATUS not in", values, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusBetween(Integer value1, Integer value2) {
            addCriterion("MSTATUS between", value1, value2, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("MSTATUS not between", value1, value2, "mstatus");
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