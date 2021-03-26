package com.five.monkey.vi.vhr.dal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainInfoExample() {
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

        public Criteria andTrainDateIsNull() {
            addCriterion("train_date is null");
            return (Criteria) this;
        }

        public Criteria andTrainDateIsNotNull() {
            addCriterion("train_date is not null");
            return (Criteria) this;
        }

        public Criteria andTrainDateEqualTo(Date value) {
            addCriterion("train_date =", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateNotEqualTo(Date value) {
            addCriterion("train_date <>", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateGreaterThan(Date value) {
            addCriterion("train_date >", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateGreaterThanOrEqualTo(Date value) {
            addCriterion("train_date >=", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateLessThan(Date value) {
            addCriterion("train_date <", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateLessThanOrEqualTo(Date value) {
            addCriterion("train_date <=", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateIn(List<Date> values) {
            addCriterion("train_date in", values, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateNotIn(List<Date> values) {
            addCriterion("train_date not in", values, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateBetween(Date value1, Date value2) {
            addCriterion("train_date between", value1, value2, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateNotBetween(Date value1, Date value2) {
            addCriterion("train_date not between", value1, value2, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainContentIsNull() {
            addCriterion("train_content is null");
            return (Criteria) this;
        }

        public Criteria andTrainContentIsNotNull() {
            addCriterion("train_content is not null");
            return (Criteria) this;
        }

        public Criteria andTrainContentEqualTo(String value) {
            addCriterion("train_content =", value, "trainContent");
            return (Criteria) this;
        }

        public Criteria andTrainContentNotEqualTo(String value) {
            addCriterion("train_content <>", value, "trainContent");
            return (Criteria) this;
        }

        public Criteria andTrainContentGreaterThan(String value) {
            addCriterion("train_content >", value, "trainContent");
            return (Criteria) this;
        }

        public Criteria andTrainContentGreaterThanOrEqualTo(String value) {
            addCriterion("train_content >=", value, "trainContent");
            return (Criteria) this;
        }

        public Criteria andTrainContentLessThan(String value) {
            addCriterion("train_content <", value, "trainContent");
            return (Criteria) this;
        }

        public Criteria andTrainContentLessThanOrEqualTo(String value) {
            addCriterion("train_content <=", value, "trainContent");
            return (Criteria) this;
        }

        public Criteria andTrainContentLike(String value) {
            addCriterion("train_content like", value, "trainContent");
            return (Criteria) this;
        }

        public Criteria andTrainContentNotLike(String value) {
            addCriterion("train_content not like", value, "trainContent");
            return (Criteria) this;
        }

        public Criteria andTrainContentIn(List<String> values) {
            addCriterion("train_content in", values, "trainContent");
            return (Criteria) this;
        }

        public Criteria andTrainContentNotIn(List<String> values) {
            addCriterion("train_content not in", values, "trainContent");
            return (Criteria) this;
        }

        public Criteria andTrainContentBetween(String value1, String value2) {
            addCriterion("train_content between", value1, value2, "trainContent");
            return (Criteria) this;
        }

        public Criteria andTrainContentNotBetween(String value1, String value2) {
            addCriterion("train_content not between", value1, value2, "trainContent");
            return (Criteria) this;
        }

        public Criteria andTrainAddressIsNull() {
            addCriterion("train_address is null");
            return (Criteria) this;
        }

        public Criteria andTrainAddressIsNotNull() {
            addCriterion("train_address is not null");
            return (Criteria) this;
        }

        public Criteria andTrainAddressEqualTo(String value) {
            addCriterion("train_address =", value, "trainAddress");
            return (Criteria) this;
        }

        public Criteria andTrainAddressNotEqualTo(String value) {
            addCriterion("train_address <>", value, "trainAddress");
            return (Criteria) this;
        }

        public Criteria andTrainAddressGreaterThan(String value) {
            addCriterion("train_address >", value, "trainAddress");
            return (Criteria) this;
        }

        public Criteria andTrainAddressGreaterThanOrEqualTo(String value) {
            addCriterion("train_address >=", value, "trainAddress");
            return (Criteria) this;
        }

        public Criteria andTrainAddressLessThan(String value) {
            addCriterion("train_address <", value, "trainAddress");
            return (Criteria) this;
        }

        public Criteria andTrainAddressLessThanOrEqualTo(String value) {
            addCriterion("train_address <=", value, "trainAddress");
            return (Criteria) this;
        }

        public Criteria andTrainAddressLike(String value) {
            addCriterion("train_address like", value, "trainAddress");
            return (Criteria) this;
        }

        public Criteria andTrainAddressNotLike(String value) {
            addCriterion("train_address not like", value, "trainAddress");
            return (Criteria) this;
        }

        public Criteria andTrainAddressIn(List<String> values) {
            addCriterion("train_address in", values, "trainAddress");
            return (Criteria) this;
        }

        public Criteria andTrainAddressNotIn(List<String> values) {
            addCriterion("train_address not in", values, "trainAddress");
            return (Criteria) this;
        }

        public Criteria andTrainAddressBetween(String value1, String value2) {
            addCriterion("train_address between", value1, value2, "trainAddress");
            return (Criteria) this;
        }

        public Criteria andTrainAddressNotBetween(String value1, String value2) {
            addCriterion("train_address not between", value1, value2, "trainAddress");
            return (Criteria) this;
        }

        public Criteria andTrainStateIsNull() {
            addCriterion("train_state is null");
            return (Criteria) this;
        }

        public Criteria andTrainStateIsNotNull() {
            addCriterion("train_state is not null");
            return (Criteria) this;
        }

        public Criteria andTrainStateEqualTo(Byte value) {
            addCriterion("train_state =", value, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateNotEqualTo(Byte value) {
            addCriterion("train_state <>", value, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateGreaterThan(Byte value) {
            addCriterion("train_state >", value, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("train_state >=", value, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateLessThan(Byte value) {
            addCriterion("train_state <", value, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateLessThanOrEqualTo(Byte value) {
            addCriterion("train_state <=", value, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateIn(List<Byte> values) {
            addCriterion("train_state in", values, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateNotIn(List<Byte> values) {
            addCriterion("train_state not in", values, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateBetween(Byte value1, Byte value2) {
            addCriterion("train_state between", value1, value2, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateNotBetween(Byte value1, Byte value2) {
            addCriterion("train_state not between", value1, value2, "trainState");
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