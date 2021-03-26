package com.five.monkey.vi.vhr.dal.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalaryInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryInfoExample() {
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

        public Criteria andBonusIsNull() {
            addCriterion("bonus is null");
            return (Criteria) this;
        }

        public Criteria andBonusIsNotNull() {
            addCriterion("bonus is not null");
            return (Criteria) this;
        }

        public Criteria andBonusEqualTo(BigDecimal value) {
            addCriterion("bonus =", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotEqualTo(BigDecimal value) {
            addCriterion("bonus <>", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThan(BigDecimal value) {
            addCriterion("bonus >", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus >=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThan(BigDecimal value) {
            addCriterion("bonus <", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus <=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusIn(List<BigDecimal> values) {
            addCriterion("bonus in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotIn(List<BigDecimal> values) {
            addCriterion("bonus not in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus not between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andLunchSalaryIsNull() {
            addCriterion("lunch_salary is null");
            return (Criteria) this;
        }

        public Criteria andLunchSalaryIsNotNull() {
            addCriterion("lunch_salary is not null");
            return (Criteria) this;
        }

        public Criteria andLunchSalaryEqualTo(BigDecimal value) {
            addCriterion("lunch_salary =", value, "lunchSalary");
            return (Criteria) this;
        }

        public Criteria andLunchSalaryNotEqualTo(BigDecimal value) {
            addCriterion("lunch_salary <>", value, "lunchSalary");
            return (Criteria) this;
        }

        public Criteria andLunchSalaryGreaterThan(BigDecimal value) {
            addCriterion("lunch_salary >", value, "lunchSalary");
            return (Criteria) this;
        }

        public Criteria andLunchSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lunch_salary >=", value, "lunchSalary");
            return (Criteria) this;
        }

        public Criteria andLunchSalaryLessThan(BigDecimal value) {
            addCriterion("lunch_salary <", value, "lunchSalary");
            return (Criteria) this;
        }

        public Criteria andLunchSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lunch_salary <=", value, "lunchSalary");
            return (Criteria) this;
        }

        public Criteria andLunchSalaryIn(List<BigDecimal> values) {
            addCriterion("lunch_salary in", values, "lunchSalary");
            return (Criteria) this;
        }

        public Criteria andLunchSalaryNotIn(List<BigDecimal> values) {
            addCriterion("lunch_salary not in", values, "lunchSalary");
            return (Criteria) this;
        }

        public Criteria andLunchSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lunch_salary between", value1, value2, "lunchSalary");
            return (Criteria) this;
        }

        public Criteria andLunchSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lunch_salary not between", value1, value2, "lunchSalary");
            return (Criteria) this;
        }

        public Criteria andTrafficSalaryIsNull() {
            addCriterion("traffic_salary is null");
            return (Criteria) this;
        }

        public Criteria andTrafficSalaryIsNotNull() {
            addCriterion("traffic_salary is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficSalaryEqualTo(BigDecimal value) {
            addCriterion("traffic_salary =", value, "trafficSalary");
            return (Criteria) this;
        }

        public Criteria andTrafficSalaryNotEqualTo(BigDecimal value) {
            addCriterion("traffic_salary <>", value, "trafficSalary");
            return (Criteria) this;
        }

        public Criteria andTrafficSalaryGreaterThan(BigDecimal value) {
            addCriterion("traffic_salary >", value, "trafficSalary");
            return (Criteria) this;
        }

        public Criteria andTrafficSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("traffic_salary >=", value, "trafficSalary");
            return (Criteria) this;
        }

        public Criteria andTrafficSalaryLessThan(BigDecimal value) {
            addCriterion("traffic_salary <", value, "trafficSalary");
            return (Criteria) this;
        }

        public Criteria andTrafficSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("traffic_salary <=", value, "trafficSalary");
            return (Criteria) this;
        }

        public Criteria andTrafficSalaryIn(List<BigDecimal> values) {
            addCriterion("traffic_salary in", values, "trafficSalary");
            return (Criteria) this;
        }

        public Criteria andTrafficSalaryNotIn(List<BigDecimal> values) {
            addCriterion("traffic_salary not in", values, "trafficSalary");
            return (Criteria) this;
        }

        public Criteria andTrafficSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("traffic_salary between", value1, value2, "trafficSalary");
            return (Criteria) this;
        }

        public Criteria andTrafficSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("traffic_salary not between", value1, value2, "trafficSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryIsNull() {
            addCriterion("basic_salary is null");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryIsNotNull() {
            addCriterion("basic_salary is not null");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryEqualTo(BigDecimal value) {
            addCriterion("basic_salary =", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryNotEqualTo(BigDecimal value) {
            addCriterion("basic_salary <>", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryGreaterThan(BigDecimal value) {
            addCriterion("basic_salary >", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("basic_salary >=", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryLessThan(BigDecimal value) {
            addCriterion("basic_salary <", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("basic_salary <=", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryIn(List<BigDecimal> values) {
            addCriterion("basic_salary in", values, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryNotIn(List<BigDecimal> values) {
            addCriterion("basic_salary not in", values, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("basic_salary between", value1, value2, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("basic_salary not between", value1, value2, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryIsNull() {
            addCriterion("all_salary is null");
            return (Criteria) this;
        }

        public Criteria andAllSalaryIsNotNull() {
            addCriterion("all_salary is not null");
            return (Criteria) this;
        }

        public Criteria andAllSalaryEqualTo(BigDecimal value) {
            addCriterion("all_salary =", value, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryNotEqualTo(BigDecimal value) {
            addCriterion("all_salary <>", value, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryGreaterThan(BigDecimal value) {
            addCriterion("all_salary >", value, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("all_salary >=", value, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryLessThan(BigDecimal value) {
            addCriterion("all_salary <", value, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("all_salary <=", value, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryIn(List<BigDecimal> values) {
            addCriterion("all_salary in", values, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryNotIn(List<BigDecimal> values) {
            addCriterion("all_salary not in", values, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_salary between", value1, value2, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_salary not between", value1, value2, "allSalary");
            return (Criteria) this;
        }

        public Criteria andDeliverYearIsNull() {
            addCriterion("deliver_year is null");
            return (Criteria) this;
        }

        public Criteria andDeliverYearIsNotNull() {
            addCriterion("deliver_year is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverYearEqualTo(Integer value) {
            addCriterion("deliver_year =", value, "deliverYear");
            return (Criteria) this;
        }

        public Criteria andDeliverYearNotEqualTo(Integer value) {
            addCriterion("deliver_year <>", value, "deliverYear");
            return (Criteria) this;
        }

        public Criteria andDeliverYearGreaterThan(Integer value) {
            addCriterion("deliver_year >", value, "deliverYear");
            return (Criteria) this;
        }

        public Criteria andDeliverYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliver_year >=", value, "deliverYear");
            return (Criteria) this;
        }

        public Criteria andDeliverYearLessThan(Integer value) {
            addCriterion("deliver_year <", value, "deliverYear");
            return (Criteria) this;
        }

        public Criteria andDeliverYearLessThanOrEqualTo(Integer value) {
            addCriterion("deliver_year <=", value, "deliverYear");
            return (Criteria) this;
        }

        public Criteria andDeliverYearIn(List<Integer> values) {
            addCriterion("deliver_year in", values, "deliverYear");
            return (Criteria) this;
        }

        public Criteria andDeliverYearNotIn(List<Integer> values) {
            addCriterion("deliver_year not in", values, "deliverYear");
            return (Criteria) this;
        }

        public Criteria andDeliverYearBetween(Integer value1, Integer value2) {
            addCriterion("deliver_year between", value1, value2, "deliverYear");
            return (Criteria) this;
        }

        public Criteria andDeliverYearNotBetween(Integer value1, Integer value2) {
            addCriterion("deliver_year not between", value1, value2, "deliverYear");
            return (Criteria) this;
        }

        public Criteria andDeliverMonthIsNull() {
            addCriterion("deliver_month is null");
            return (Criteria) this;
        }

        public Criteria andDeliverMonthIsNotNull() {
            addCriterion("deliver_month is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverMonthEqualTo(Integer value) {
            addCriterion("deliver_month =", value, "deliverMonth");
            return (Criteria) this;
        }

        public Criteria andDeliverMonthNotEqualTo(Integer value) {
            addCriterion("deliver_month <>", value, "deliverMonth");
            return (Criteria) this;
        }

        public Criteria andDeliverMonthGreaterThan(Integer value) {
            addCriterion("deliver_month >", value, "deliverMonth");
            return (Criteria) this;
        }

        public Criteria andDeliverMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliver_month >=", value, "deliverMonth");
            return (Criteria) this;
        }

        public Criteria andDeliverMonthLessThan(Integer value) {
            addCriterion("deliver_month <", value, "deliverMonth");
            return (Criteria) this;
        }

        public Criteria andDeliverMonthLessThanOrEqualTo(Integer value) {
            addCriterion("deliver_month <=", value, "deliverMonth");
            return (Criteria) this;
        }

        public Criteria andDeliverMonthIn(List<Integer> values) {
            addCriterion("deliver_month in", values, "deliverMonth");
            return (Criteria) this;
        }

        public Criteria andDeliverMonthNotIn(List<Integer> values) {
            addCriterion("deliver_month not in", values, "deliverMonth");
            return (Criteria) this;
        }

        public Criteria andDeliverMonthBetween(Integer value1, Integer value2) {
            addCriterion("deliver_month between", value1, value2, "deliverMonth");
            return (Criteria) this;
        }

        public Criteria andDeliverMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("deliver_month not between", value1, value2, "deliverMonth");
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