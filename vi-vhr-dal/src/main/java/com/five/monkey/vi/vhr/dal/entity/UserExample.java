package com.five.monkey.vi.vhr.dal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.five.monkey.vi.vhr.dal.entity.base.BaseExample;

public class UserExample extends BaseExample {
	protected String			orderByClause;

	protected boolean			distinct;

	protected List<Criteria>	oredCriteria;

	public UserExample() {
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

		public Criteria andIdentifyIdIsNull() {
			addCriterion("identify_id is null");
			return (Criteria) this;
		}

		public Criteria andIdentifyIdIsNotNull() {
			addCriterion("identify_id is not null");
			return (Criteria) this;
		}

		public Criteria andIdentifyIdEqualTo(String value) {
			addCriterion("identify_id =", value, "identifyId");
			return (Criteria) this;
		}

		public Criteria andIdentifyIdNotEqualTo(String value) {
			addCriterion("identify_id <>", value, "identifyId");
			return (Criteria) this;
		}

		public Criteria andIdentifyIdGreaterThan(String value) {
			addCriterion("identify_id >", value, "identifyId");
			return (Criteria) this;
		}

		public Criteria andIdentifyIdGreaterThanOrEqualTo(String value) {
			addCriterion("identify_id >=", value, "identifyId");
			return (Criteria) this;
		}

		public Criteria andIdentifyIdLessThan(String value) {
			addCriterion("identify_id <", value, "identifyId");
			return (Criteria) this;
		}

		public Criteria andIdentifyIdLessThanOrEqualTo(String value) {
			addCriterion("identify_id <=", value, "identifyId");
			return (Criteria) this;
		}

		public Criteria andIdentifyIdLike(String value) {
			addCriterion("identify_id like", value, "identifyId");
			return (Criteria) this;
		}

		public Criteria andIdentifyIdNotLike(String value) {
			addCriterion("identify_id not like", value, "identifyId");
			return (Criteria) this;
		}

		public Criteria andIdentifyIdIn(List<String> values) {
			addCriterion("identify_id in", values, "identifyId");
			return (Criteria) this;
		}

		public Criteria andIdentifyIdNotIn(List<String> values) {
			addCriterion("identify_id not in", values, "identifyId");
			return (Criteria) this;
		}

		public Criteria andIdentifyIdBetween(String value1, String value2) {
			addCriterion("identify_id between", value1, value2, "identifyId");
			return (Criteria) this;
		}

		public Criteria andIdentifyIdNotBetween(String value1, String value2) {
			addCriterion("identify_id not between", value1, value2, "identifyId");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("`name` is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("`name` is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("`name` =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("`name` <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("`name` >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("`name` >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("`name` <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("`name` <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("`name` like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("`name` not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("`name` in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("`name` not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("`name` between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("`name` not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(String value) {
			addCriterion("phone <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(String value) {
			addCriterion("phone >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("phone >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(String value) {
			addCriterion("phone <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(String value) {
			addCriterion("phone <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLike(String value) {
			addCriterion("phone like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotLike(String value) {
			addCriterion("phone not like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<String> values) {
			addCriterion("phone in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<String> values) {
			addCriterion("phone not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(String value1, String value2) {
			addCriterion("phone between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(String value1, String value2) {
			addCriterion("phone not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andEMailIsNull() {
			addCriterion("e_mail is null");
			return (Criteria) this;
		}

		public Criteria andEMailIsNotNull() {
			addCriterion("e_mail is not null");
			return (Criteria) this;
		}

		public Criteria andEMailEqualTo(String value) {
			addCriterion("e_mail =", value, "eMail");
			return (Criteria) this;
		}

		public Criteria andEMailNotEqualTo(String value) {
			addCriterion("e_mail <>", value, "eMail");
			return (Criteria) this;
		}

		public Criteria andEMailGreaterThan(String value) {
			addCriterion("e_mail >", value, "eMail");
			return (Criteria) this;
		}

		public Criteria andEMailGreaterThanOrEqualTo(String value) {
			addCriterion("e_mail >=", value, "eMail");
			return (Criteria) this;
		}

		public Criteria andEMailLessThan(String value) {
			addCriterion("e_mail <", value, "eMail");
			return (Criteria) this;
		}

		public Criteria andEMailLessThanOrEqualTo(String value) {
			addCriterion("e_mail <=", value, "eMail");
			return (Criteria) this;
		}

		public Criteria andEMailLike(String value) {
			addCriterion("e_mail like", value, "eMail");
			return (Criteria) this;
		}

		public Criteria andEMailNotLike(String value) {
			addCriterion("e_mail not like", value, "eMail");
			return (Criteria) this;
		}

		public Criteria andEMailIn(List<String> values) {
			addCriterion("e_mail in", values, "eMail");
			return (Criteria) this;
		}

		public Criteria andEMailNotIn(List<String> values) {
			addCriterion("e_mail not in", values, "eMail");
			return (Criteria) this;
		}

		public Criteria andEMailBetween(String value1, String value2) {
			addCriterion("e_mail between", value1, value2, "eMail");
			return (Criteria) this;
		}

		public Criteria andEMailNotBetween(String value1, String value2) {
			addCriterion("e_mail not between", value1, value2, "eMail");
			return (Criteria) this;
		}

		public Criteria andAddressIsNull() {
			addCriterion("address is null");
			return (Criteria) this;
		}

		public Criteria andAddressIsNotNull() {
			addCriterion("address is not null");
			return (Criteria) this;
		}

		public Criteria andAddressEqualTo(String value) {
			addCriterion("address =", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotEqualTo(String value) {
			addCriterion("address <>", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThan(String value) {
			addCriterion("address >", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThanOrEqualTo(String value) {
			addCriterion("address >=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThan(String value) {
			addCriterion("address <", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThanOrEqualTo(String value) {
			addCriterion("address <=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLike(String value) {
			addCriterion("address like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotLike(String value) {
			addCriterion("address not like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressIn(List<String> values) {
			addCriterion("address in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotIn(List<String> values) {
			addCriterion("address not in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressBetween(String value1, String value2) {
			addCriterion("address between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotBetween(String value1, String value2) {
			addCriterion("address not between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andSexIsNull() {
			addCriterion("sex is null");
			return (Criteria) this;
		}

		public Criteria andSexIsNotNull() {
			addCriterion("sex is not null");
			return (Criteria) this;
		}

		public Criteria andSexEqualTo(Byte value) {
			addCriterion("sex =", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotEqualTo(Byte value) {
			addCriterion("sex <>", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThan(Byte value) {
			addCriterion("sex >", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThanOrEqualTo(Byte value) {
			addCriterion("sex >=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThan(Byte value) {
			addCriterion("sex <", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThanOrEqualTo(Byte value) {
			addCriterion("sex <=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexIn(List<Byte> values) {
			addCriterion("sex in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotIn(List<Byte> values) {
			addCriterion("sex not in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexBetween(Byte value1, Byte value2) {
			addCriterion("sex between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotBetween(Byte value1, Byte value2) {
			addCriterion("sex not between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andBirthdayIsNull() {
			addCriterion("birthday is null");
			return (Criteria) this;
		}

		public Criteria andBirthdayIsNotNull() {
			addCriterion("birthday is not null");
			return (Criteria) this;
		}

		public Criteria andBirthdayEqualTo(Date value) {
			addCriterionForJDBCDate("birthday =", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotEqualTo(Date value) {
			addCriterionForJDBCDate("birthday <>", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayGreaterThan(Date value) {
			addCriterionForJDBCDate("birthday >", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("birthday >=", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayLessThan(Date value) {
			addCriterionForJDBCDate("birthday <", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("birthday <=", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayIn(List<Date> values) {
			addCriterionForJDBCDate("birthday in", values, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotIn(List<Date> values) {
			addCriterionForJDBCDate("birthday not in", values, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
			return (Criteria) this;
		}

		public Criteria andWedLockIsNull() {
			addCriterion("wed_lock is null");
			return (Criteria) this;
		}

		public Criteria andWedLockIsNotNull() {
			addCriterion("wed_lock is not null");
			return (Criteria) this;
		}

		public Criteria andWedLockEqualTo(Byte value) {
			addCriterion("wed_lock =", value, "wedLock");
			return (Criteria) this;
		}

		public Criteria andWedLockNotEqualTo(Byte value) {
			addCriterion("wed_lock <>", value, "wedLock");
			return (Criteria) this;
		}

		public Criteria andWedLockGreaterThan(Byte value) {
			addCriterion("wed_lock >", value, "wedLock");
			return (Criteria) this;
		}

		public Criteria andWedLockGreaterThanOrEqualTo(Byte value) {
			addCriterion("wed_lock >=", value, "wedLock");
			return (Criteria) this;
		}

		public Criteria andWedLockLessThan(Byte value) {
			addCriterion("wed_lock <", value, "wedLock");
			return (Criteria) this;
		}

		public Criteria andWedLockLessThanOrEqualTo(Byte value) {
			addCriterion("wed_lock <=", value, "wedLock");
			return (Criteria) this;
		}

		public Criteria andWedLockIn(List<Byte> values) {
			addCriterion("wed_lock in", values, "wedLock");
			return (Criteria) this;
		}

		public Criteria andWedLockNotIn(List<Byte> values) {
			addCriterion("wed_lock not in", values, "wedLock");
			return (Criteria) this;
		}

		public Criteria andWedLockBetween(Byte value1, Byte value2) {
			addCriterion("wed_lock between", value1, value2, "wedLock");
			return (Criteria) this;
		}

		public Criteria andWedLockNotBetween(Byte value1, Byte value2) {
			addCriterion("wed_lock not between", value1, value2, "wedLock");
			return (Criteria) this;
		}

		public Criteria andRaceIsNull() {
			addCriterion("race is null");
			return (Criteria) this;
		}

		public Criteria andRaceIsNotNull() {
			addCriterion("race is not null");
			return (Criteria) this;
		}

		public Criteria andRaceEqualTo(String value) {
			addCriterion("race =", value, "race");
			return (Criteria) this;
		}

		public Criteria andRaceNotEqualTo(String value) {
			addCriterion("race <>", value, "race");
			return (Criteria) this;
		}

		public Criteria andRaceGreaterThan(String value) {
			addCriterion("race >", value, "race");
			return (Criteria) this;
		}

		public Criteria andRaceGreaterThanOrEqualTo(String value) {
			addCriterion("race >=", value, "race");
			return (Criteria) this;
		}

		public Criteria andRaceLessThan(String value) {
			addCriterion("race <", value, "race");
			return (Criteria) this;
		}

		public Criteria andRaceLessThanOrEqualTo(String value) {
			addCriterion("race <=", value, "race");
			return (Criteria) this;
		}

		public Criteria andRaceLike(String value) {
			addCriterion("race like", value, "race");
			return (Criteria) this;
		}

		public Criteria andRaceNotLike(String value) {
			addCriterion("race not like", value, "race");
			return (Criteria) this;
		}

		public Criteria andRaceIn(List<String> values) {
			addCriterion("race in", values, "race");
			return (Criteria) this;
		}

		public Criteria andRaceNotIn(List<String> values) {
			addCriterion("race not in", values, "race");
			return (Criteria) this;
		}

		public Criteria andRaceBetween(String value1, String value2) {
			addCriterion("race between", value1, value2, "race");
			return (Criteria) this;
		}

		public Criteria andRaceNotBetween(String value1, String value2) {
			addCriterion("race not between", value1, value2, "race");
			return (Criteria) this;
		}

		public Criteria andPlaceIsNull() {
			addCriterion("place is null");
			return (Criteria) this;
		}

		public Criteria andPlaceIsNotNull() {
			addCriterion("place is not null");
			return (Criteria) this;
		}

		public Criteria andPlaceEqualTo(String value) {
			addCriterion("place =", value, "place");
			return (Criteria) this;
		}

		public Criteria andPlaceNotEqualTo(String value) {
			addCriterion("place <>", value, "place");
			return (Criteria) this;
		}

		public Criteria andPlaceGreaterThan(String value) {
			addCriterion("place >", value, "place");
			return (Criteria) this;
		}

		public Criteria andPlaceGreaterThanOrEqualTo(String value) {
			addCriterion("place >=", value, "place");
			return (Criteria) this;
		}

		public Criteria andPlaceLessThan(String value) {
			addCriterion("place <", value, "place");
			return (Criteria) this;
		}

		public Criteria andPlaceLessThanOrEqualTo(String value) {
			addCriterion("place <=", value, "place");
			return (Criteria) this;
		}

		public Criteria andPlaceLike(String value) {
			addCriterion("place like", value, "place");
			return (Criteria) this;
		}

		public Criteria andPlaceNotLike(String value) {
			addCriterion("place not like", value, "place");
			return (Criteria) this;
		}

		public Criteria andPlaceIn(List<String> values) {
			addCriterion("place in", values, "place");
			return (Criteria) this;
		}

		public Criteria andPlaceNotIn(List<String> values) {
			addCriterion("place not in", values, "place");
			return (Criteria) this;
		}

		public Criteria andPlaceBetween(String value1, String value2) {
			addCriterion("place between", value1, value2, "place");
			return (Criteria) this;
		}

		public Criteria andPlaceNotBetween(String value1, String value2) {
			addCriterion("place not between", value1, value2, "place");
			return (Criteria) this;
		}

		public Criteria andPoliticIsNull() {
			addCriterion("politic is null");
			return (Criteria) this;
		}

		public Criteria andPoliticIsNotNull() {
			addCriterion("politic is not null");
			return (Criteria) this;
		}

		public Criteria andPoliticEqualTo(String value) {
			addCriterion("politic =", value, "politic");
			return (Criteria) this;
		}

		public Criteria andPoliticNotEqualTo(String value) {
			addCriterion("politic <>", value, "politic");
			return (Criteria) this;
		}

		public Criteria andPoliticGreaterThan(String value) {
			addCriterion("politic >", value, "politic");
			return (Criteria) this;
		}

		public Criteria andPoliticGreaterThanOrEqualTo(String value) {
			addCriterion("politic >=", value, "politic");
			return (Criteria) this;
		}

		public Criteria andPoliticLessThan(String value) {
			addCriterion("politic <", value, "politic");
			return (Criteria) this;
		}

		public Criteria andPoliticLessThanOrEqualTo(String value) {
			addCriterion("politic <=", value, "politic");
			return (Criteria) this;
		}

		public Criteria andPoliticLike(String value) {
			addCriterion("politic like", value, "politic");
			return (Criteria) this;
		}

		public Criteria andPoliticNotLike(String value) {
			addCriterion("politic not like", value, "politic");
			return (Criteria) this;
		}

		public Criteria andPoliticIn(List<String> values) {
			addCriterion("politic in", values, "politic");
			return (Criteria) this;
		}

		public Criteria andPoliticNotIn(List<String> values) {
			addCriterion("politic not in", values, "politic");
			return (Criteria) this;
		}

		public Criteria andPoliticBetween(String value1, String value2) {
			addCriterion("politic between", value1, value2, "politic");
			return (Criteria) this;
		}

		public Criteria andPoliticNotBetween(String value1, String value2) {
			addCriterion("politic not between", value1, value2, "politic");
			return (Criteria) this;
		}

		public Criteria andSchoolIsNull() {
			addCriterion("school is null");
			return (Criteria) this;
		}

		public Criteria andSchoolIsNotNull() {
			addCriterion("school is not null");
			return (Criteria) this;
		}

		public Criteria andSchoolEqualTo(String value) {
			addCriterion("school =", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotEqualTo(String value) {
			addCriterion("school <>", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolGreaterThan(String value) {
			addCriterion("school >", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolGreaterThanOrEqualTo(String value) {
			addCriterion("school >=", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolLessThan(String value) {
			addCriterion("school <", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolLessThanOrEqualTo(String value) {
			addCriterion("school <=", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolLike(String value) {
			addCriterion("school like", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotLike(String value) {
			addCriterion("school not like", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolIn(List<String> values) {
			addCriterion("school in", values, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotIn(List<String> values) {
			addCriterion("school not in", values, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolBetween(String value1, String value2) {
			addCriterion("school between", value1, value2, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotBetween(String value1, String value2) {
			addCriterion("school not between", value1, value2, "school");
			return (Criteria) this;
		}

		public Criteria andSpecialtyIsNull() {
			addCriterion("specialty is null");
			return (Criteria) this;
		}

		public Criteria andSpecialtyIsNotNull() {
			addCriterion("specialty is not null");
			return (Criteria) this;
		}

		public Criteria andSpecialtyEqualTo(String value) {
			addCriterion("specialty =", value, "specialty");
			return (Criteria) this;
		}

		public Criteria andSpecialtyNotEqualTo(String value) {
			addCriterion("specialty <>", value, "specialty");
			return (Criteria) this;
		}

		public Criteria andSpecialtyGreaterThan(String value) {
			addCriterion("specialty >", value, "specialty");
			return (Criteria) this;
		}

		public Criteria andSpecialtyGreaterThanOrEqualTo(String value) {
			addCriterion("specialty >=", value, "specialty");
			return (Criteria) this;
		}

		public Criteria andSpecialtyLessThan(String value) {
			addCriterion("specialty <", value, "specialty");
			return (Criteria) this;
		}

		public Criteria andSpecialtyLessThanOrEqualTo(String value) {
			addCriterion("specialty <=", value, "specialty");
			return (Criteria) this;
		}

		public Criteria andSpecialtyLike(String value) {
			addCriterion("specialty like", value, "specialty");
			return (Criteria) this;
		}

		public Criteria andSpecialtyNotLike(String value) {
			addCriterion("specialty not like", value, "specialty");
			return (Criteria) this;
		}

		public Criteria andSpecialtyIn(List<String> values) {
			addCriterion("specialty in", values, "specialty");
			return (Criteria) this;
		}

		public Criteria andSpecialtyNotIn(List<String> values) {
			addCriterion("specialty not in", values, "specialty");
			return (Criteria) this;
		}

		public Criteria andSpecialtyBetween(String value1, String value2) {
			addCriterion("specialty between", value1, value2, "specialty");
			return (Criteria) this;
		}

		public Criteria andSpecialtyNotBetween(String value1, String value2) {
			addCriterion("specialty not between", value1, value2, "specialty");
			return (Criteria) this;
		}

		public Criteria andTopDegreeIsNull() {
			addCriterion("top_degree is null");
			return (Criteria) this;
		}

		public Criteria andTopDegreeIsNotNull() {
			addCriterion("top_degree is not null");
			return (Criteria) this;
		}

		public Criteria andTopDegreeEqualTo(Byte value) {
			addCriterion("top_degree =", value, "topDegree");
			return (Criteria) this;
		}

		public Criteria andTopDegreeNotEqualTo(Byte value) {
			addCriterion("top_degree <>", value, "topDegree");
			return (Criteria) this;
		}

		public Criteria andTopDegreeGreaterThan(Byte value) {
			addCriterion("top_degree >", value, "topDegree");
			return (Criteria) this;
		}

		public Criteria andTopDegreeGreaterThanOrEqualTo(Byte value) {
			addCriterion("top_degree >=", value, "topDegree");
			return (Criteria) this;
		}

		public Criteria andTopDegreeLessThan(Byte value) {
			addCriterion("top_degree <", value, "topDegree");
			return (Criteria) this;
		}

		public Criteria andTopDegreeLessThanOrEqualTo(Byte value) {
			addCriterion("top_degree <=", value, "topDegree");
			return (Criteria) this;
		}

		public Criteria andTopDegreeIn(List<Byte> values) {
			addCriterion("top_degree in", values, "topDegree");
			return (Criteria) this;
		}

		public Criteria andTopDegreeNotIn(List<Byte> values) {
			addCriterion("top_degree not in", values, "topDegree");
			return (Criteria) this;
		}

		public Criteria andTopDegreeBetween(Byte value1, Byte value2) {
			addCriterion("top_degree between", value1, value2, "topDegree");
			return (Criteria) this;
		}

		public Criteria andTopDegreeNotBetween(Byte value1, Byte value2) {
			addCriterion("top_degree not between", value1, value2, "topDegree");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String	condition;

		private Object	value;

		private Object	secondValue;

		private boolean	noValue;

		private boolean	singleValue;

		private boolean	betweenValue;

		private boolean	listValue;

		private String	typeHandler;

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