package com.five.monkey.vi.vhr.dal.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OccurDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OccurDetailExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Long value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Long value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Long value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Long value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Long value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Long> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Long> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Long value1, Long value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Long value1, Long value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andOccurDateIsNull() {
            addCriterion("occur_date is null");
            return (Criteria) this;
        }

        public Criteria andOccurDateIsNotNull() {
            addCriterion("occur_date is not null");
            return (Criteria) this;
        }

        public Criteria andOccurDateEqualTo(Date value) {
            addCriterionForJDBCDate("occur_date =", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("occur_date <>", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateGreaterThan(Date value) {
            addCriterionForJDBCDate("occur_date >", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("occur_date >=", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateLessThan(Date value) {
            addCriterionForJDBCDate("occur_date <", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("occur_date <=", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateIn(List<Date> values) {
            addCriterionForJDBCDate("occur_date in", values, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("occur_date not in", values, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("occur_date between", value1, value2, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("occur_date not between", value1, value2, "occurDate");
            return (Criteria) this;
        }

        public Criteria andCauseIsNull() {
            addCriterion("cause is null");
            return (Criteria) this;
        }

        public Criteria andCauseIsNotNull() {
            addCriterion("cause is not null");
            return (Criteria) this;
        }

        public Criteria andCauseEqualTo(String value) {
            addCriterion("cause =", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotEqualTo(String value) {
            addCriterion("cause <>", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThan(String value) {
            addCriterion("cause >", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThanOrEqualTo(String value) {
            addCriterion("cause >=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThan(String value) {
            addCriterion("cause <", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThanOrEqualTo(String value) {
            addCriterion("cause <=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLike(String value) {
            addCriterion("cause like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotLike(String value) {
            addCriterion("cause not like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseIn(List<String> values) {
            addCriterion("cause in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotIn(List<String> values) {
            addCriterion("cause not in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseBetween(String value1, String value2) {
            addCriterion("cause between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotBetween(String value1, String value2) {
            addCriterion("cause not between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andOccurQuotaIsNull() {
            addCriterion("occur_quota is null");
            return (Criteria) this;
        }

        public Criteria andOccurQuotaIsNotNull() {
            addCriterion("occur_quota is not null");
            return (Criteria) this;
        }

        public Criteria andOccurQuotaEqualTo(BigDecimal value) {
            addCriterion("occur_quota =", value, "occurQuota");
            return (Criteria) this;
        }

        public Criteria andOccurQuotaNotEqualTo(BigDecimal value) {
            addCriterion("occur_quota <>", value, "occurQuota");
            return (Criteria) this;
        }

        public Criteria andOccurQuotaGreaterThan(BigDecimal value) {
            addCriterion("occur_quota >", value, "occurQuota");
            return (Criteria) this;
        }

        public Criteria andOccurQuotaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("occur_quota >=", value, "occurQuota");
            return (Criteria) this;
        }

        public Criteria andOccurQuotaLessThan(BigDecimal value) {
            addCriterion("occur_quota <", value, "occurQuota");
            return (Criteria) this;
        }

        public Criteria andOccurQuotaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("occur_quota <=", value, "occurQuota");
            return (Criteria) this;
        }

        public Criteria andOccurQuotaIn(List<BigDecimal> values) {
            addCriterion("occur_quota in", values, "occurQuota");
            return (Criteria) this;
        }

        public Criteria andOccurQuotaNotIn(List<BigDecimal> values) {
            addCriterion("occur_quota not in", values, "occurQuota");
            return (Criteria) this;
        }

        public Criteria andOccurQuotaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("occur_quota between", value1, value2, "occurQuota");
            return (Criteria) this;
        }

        public Criteria andOccurQuotaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("occur_quota not between", value1, value2, "occurQuota");
            return (Criteria) this;
        }

        public Criteria andOccurTypeIsNull() {
            addCriterion("occur_type is null");
            return (Criteria) this;
        }

        public Criteria andOccurTypeIsNotNull() {
            addCriterion("occur_type is not null");
            return (Criteria) this;
        }

        public Criteria andOccurTypeEqualTo(Byte value) {
            addCriterion("occur_type =", value, "occurType");
            return (Criteria) this;
        }

        public Criteria andOccurTypeNotEqualTo(Byte value) {
            addCriterion("occur_type <>", value, "occurType");
            return (Criteria) this;
        }

        public Criteria andOccurTypeGreaterThan(Byte value) {
            addCriterion("occur_type >", value, "occurType");
            return (Criteria) this;
        }

        public Criteria andOccurTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("occur_type >=", value, "occurType");
            return (Criteria) this;
        }

        public Criteria andOccurTypeLessThan(Byte value) {
            addCriterion("occur_type <", value, "occurType");
            return (Criteria) this;
        }

        public Criteria andOccurTypeLessThanOrEqualTo(Byte value) {
            addCriterion("occur_type <=", value, "occurType");
            return (Criteria) this;
        }

        public Criteria andOccurTypeIn(List<Byte> values) {
            addCriterion("occur_type in", values, "occurType");
            return (Criteria) this;
        }

        public Criteria andOccurTypeNotIn(List<Byte> values) {
            addCriterion("occur_type not in", values, "occurType");
            return (Criteria) this;
        }

        public Criteria andOccurTypeBetween(Byte value1, Byte value2) {
            addCriterion("occur_type between", value1, value2, "occurType");
            return (Criteria) this;
        }

        public Criteria andOccurTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("occur_type not between", value1, value2, "occurType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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