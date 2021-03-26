package com.five.monkey.vi.vhr.dal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RemoveInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RemoveInfoExample() {
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

        public Criteria andPreDepartmentIdIsNull() {
            addCriterion("pre_department_id is null");
            return (Criteria) this;
        }

        public Criteria andPreDepartmentIdIsNotNull() {
            addCriterion("pre_department_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreDepartmentIdEqualTo(Long value) {
            addCriterion("pre_department_id =", value, "preDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPreDepartmentIdNotEqualTo(Long value) {
            addCriterion("pre_department_id <>", value, "preDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPreDepartmentIdGreaterThan(Long value) {
            addCriterion("pre_department_id >", value, "preDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPreDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pre_department_id >=", value, "preDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPreDepartmentIdLessThan(Long value) {
            addCriterion("pre_department_id <", value, "preDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPreDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("pre_department_id <=", value, "preDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPreDepartmentIdIn(List<Long> values) {
            addCriterion("pre_department_id in", values, "preDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPreDepartmentIdNotIn(List<Long> values) {
            addCriterion("pre_department_id not in", values, "preDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPreDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("pre_department_id between", value1, value2, "preDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPreDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("pre_department_id not between", value1, value2, "preDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepartmentIdIsNull() {
            addCriterion("next_department_id is null");
            return (Criteria) this;
        }

        public Criteria andNextDepartmentIdIsNotNull() {
            addCriterion("next_department_id is not null");
            return (Criteria) this;
        }

        public Criteria andNextDepartmentIdEqualTo(Long value) {
            addCriterion("next_department_id =", value, "nextDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepartmentIdNotEqualTo(Long value) {
            addCriterion("next_department_id <>", value, "nextDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepartmentIdGreaterThan(Long value) {
            addCriterion("next_department_id >", value, "nextDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("next_department_id >=", value, "nextDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepartmentIdLessThan(Long value) {
            addCriterion("next_department_id <", value, "nextDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("next_department_id <=", value, "nextDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepartmentIdIn(List<Long> values) {
            addCriterion("next_department_id in", values, "nextDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepartmentIdNotIn(List<Long> values) {
            addCriterion("next_department_id not in", values, "nextDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("next_department_id between", value1, value2, "nextDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("next_department_id not between", value1, value2, "nextDepartmentId");
            return (Criteria) this;
        }

        public Criteria andRemoveDateIsNull() {
            addCriterion("remove_date is null");
            return (Criteria) this;
        }

        public Criteria andRemoveDateIsNotNull() {
            addCriterion("remove_date is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveDateEqualTo(Date value) {
            addCriterionForJDBCDate("remove_date =", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("remove_date <>", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("remove_date >", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("remove_date >=", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateLessThan(Date value) {
            addCriterionForJDBCDate("remove_date <", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("remove_date <=", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateIn(List<Date> values) {
            addCriterionForJDBCDate("remove_date in", values, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("remove_date not in", values, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("remove_date between", value1, value2, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("remove_date not between", value1, value2, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveCauseIsNull() {
            addCriterion("remove_cause is null");
            return (Criteria) this;
        }

        public Criteria andRemoveCauseIsNotNull() {
            addCriterion("remove_cause is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveCauseEqualTo(String value) {
            addCriterion("remove_cause =", value, "removeCause");
            return (Criteria) this;
        }

        public Criteria andRemoveCauseNotEqualTo(String value) {
            addCriterion("remove_cause <>", value, "removeCause");
            return (Criteria) this;
        }

        public Criteria andRemoveCauseGreaterThan(String value) {
            addCriterion("remove_cause >", value, "removeCause");
            return (Criteria) this;
        }

        public Criteria andRemoveCauseGreaterThanOrEqualTo(String value) {
            addCriterion("remove_cause >=", value, "removeCause");
            return (Criteria) this;
        }

        public Criteria andRemoveCauseLessThan(String value) {
            addCriterion("remove_cause <", value, "removeCause");
            return (Criteria) this;
        }

        public Criteria andRemoveCauseLessThanOrEqualTo(String value) {
            addCriterion("remove_cause <=", value, "removeCause");
            return (Criteria) this;
        }

        public Criteria andRemoveCauseLike(String value) {
            addCriterion("remove_cause like", value, "removeCause");
            return (Criteria) this;
        }

        public Criteria andRemoveCauseNotLike(String value) {
            addCriterion("remove_cause not like", value, "removeCause");
            return (Criteria) this;
        }

        public Criteria andRemoveCauseIn(List<String> values) {
            addCriterion("remove_cause in", values, "removeCause");
            return (Criteria) this;
        }

        public Criteria andRemoveCauseNotIn(List<String> values) {
            addCriterion("remove_cause not in", values, "removeCause");
            return (Criteria) this;
        }

        public Criteria andRemoveCauseBetween(String value1, String value2) {
            addCriterion("remove_cause between", value1, value2, "removeCause");
            return (Criteria) this;
        }

        public Criteria andRemoveCauseNotBetween(String value1, String value2) {
            addCriterion("remove_cause not between", value1, value2, "removeCause");
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