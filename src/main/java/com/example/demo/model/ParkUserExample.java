package com.example.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParkUserExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andFromTypeIsNull() {
            addCriterion("from_type is null");
            return (Criteria) this;
        }

        public Criteria andFromTypeIsNotNull() {
            addCriterion("from_type is not null");
            return (Criteria) this;
        }

        public Criteria andFromTypeEqualTo(Integer value) {
            addCriterion("from_type =", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotEqualTo(Integer value) {
            addCriterion("from_type <>", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeGreaterThan(Integer value) {
            addCriterion("from_type >", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_type >=", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeLessThan(Integer value) {
            addCriterion("from_type <", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeLessThanOrEqualTo(Integer value) {
            addCriterion("from_type <=", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeIn(List<Integer> values) {
            addCriterion("from_type in", values, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotIn(List<Integer> values) {
            addCriterion("from_type not in", values, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeBetween(Integer value1, Integer value2) {
            addCriterion("from_type between", value1, value2, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("from_type not between", value1, value2, "fromType");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNull() {
            addCriterion("order_count is null");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNotNull() {
            addCriterion("order_count is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCountEqualTo(Integer value) {
            addCriterion("order_count =", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotEqualTo(Integer value) {
            addCriterion("order_count <>", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThan(Integer value) {
            addCriterion("order_count >", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_count >=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThan(Integer value) {
            addCriterion("order_count <", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("order_count <=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountIn(List<Integer> values) {
            addCriterion("order_count in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotIn(List<Integer> values) {
            addCriterion("order_count not in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("order_count between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_count not between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNull() {
            addCriterion("expense is null");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNotNull() {
            addCriterion("expense is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseEqualTo(BigDecimal value) {
            addCriterion("expense =", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotEqualTo(BigDecimal value) {
            addCriterion("expense <>", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThan(BigDecimal value) {
            addCriterion("expense >", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expense >=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThan(BigDecimal value) {
            addCriterion("expense <", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expense <=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseIn(List<BigDecimal> values) {
            addCriterion("expense in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotIn(List<BigDecimal> values) {
            addCriterion("expense not in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expense between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expense not between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andMarginIsNull() {
            addCriterion("margin is null");
            return (Criteria) this;
        }

        public Criteria andMarginIsNotNull() {
            addCriterion("margin is not null");
            return (Criteria) this;
        }

        public Criteria andMarginEqualTo(BigDecimal value) {
            addCriterion("margin =", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginNotEqualTo(BigDecimal value) {
            addCriterion("margin <>", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginGreaterThan(BigDecimal value) {
            addCriterion("margin >", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("margin >=", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginLessThan(BigDecimal value) {
            addCriterion("margin <", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginLessThanOrEqualTo(BigDecimal value) {
            addCriterion("margin <=", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginIn(List<BigDecimal> values) {
            addCriterion("margin in", values, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginNotIn(List<BigDecimal> values) {
            addCriterion("margin not in", values, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("margin between", value1, value2, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("margin not between", value1, value2, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginIdIsNull() {
            addCriterion("margin_id is null");
            return (Criteria) this;
        }

        public Criteria andMarginIdIsNotNull() {
            addCriterion("margin_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarginIdEqualTo(Integer value) {
            addCriterion("margin_id =", value, "marginId");
            return (Criteria) this;
        }

        public Criteria andMarginIdNotEqualTo(Integer value) {
            addCriterion("margin_id <>", value, "marginId");
            return (Criteria) this;
        }

        public Criteria andMarginIdGreaterThan(Integer value) {
            addCriterion("margin_id >", value, "marginId");
            return (Criteria) this;
        }

        public Criteria andMarginIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("margin_id >=", value, "marginId");
            return (Criteria) this;
        }

        public Criteria andMarginIdLessThan(Integer value) {
            addCriterion("margin_id <", value, "marginId");
            return (Criteria) this;
        }

        public Criteria andMarginIdLessThanOrEqualTo(Integer value) {
            addCriterion("margin_id <=", value, "marginId");
            return (Criteria) this;
        }

        public Criteria andMarginIdIn(List<Integer> values) {
            addCriterion("margin_id in", values, "marginId");
            return (Criteria) this;
        }

        public Criteria andMarginIdNotIn(List<Integer> values) {
            addCriterion("margin_id not in", values, "marginId");
            return (Criteria) this;
        }

        public Criteria andMarginIdBetween(Integer value1, Integer value2) {
            addCriterion("margin_id between", value1, value2, "marginId");
            return (Criteria) this;
        }

        public Criteria andMarginIdNotBetween(Integer value1, Integer value2) {
            addCriterion("margin_id not between", value1, value2, "marginId");
            return (Criteria) this;
        }

        public Criteria andAutoOpenIsNull() {
            addCriterion("auto_open is null");
            return (Criteria) this;
        }

        public Criteria andAutoOpenIsNotNull() {
            addCriterion("auto_open is not null");
            return (Criteria) this;
        }

        public Criteria andAutoOpenEqualTo(Integer value) {
            addCriterion("auto_open =", value, "autoOpen");
            return (Criteria) this;
        }

        public Criteria andAutoOpenNotEqualTo(Integer value) {
            addCriterion("auto_open <>", value, "autoOpen");
            return (Criteria) this;
        }

        public Criteria andAutoOpenGreaterThan(Integer value) {
            addCriterion("auto_open >", value, "autoOpen");
            return (Criteria) this;
        }

        public Criteria andAutoOpenGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_open >=", value, "autoOpen");
            return (Criteria) this;
        }

        public Criteria andAutoOpenLessThan(Integer value) {
            addCriterion("auto_open <", value, "autoOpen");
            return (Criteria) this;
        }

        public Criteria andAutoOpenLessThanOrEqualTo(Integer value) {
            addCriterion("auto_open <=", value, "autoOpen");
            return (Criteria) this;
        }

        public Criteria andAutoOpenIn(List<Integer> values) {
            addCriterion("auto_open in", values, "autoOpen");
            return (Criteria) this;
        }

        public Criteria andAutoOpenNotIn(List<Integer> values) {
            addCriterion("auto_open not in", values, "autoOpen");
            return (Criteria) this;
        }

        public Criteria andAutoOpenBetween(Integer value1, Integer value2) {
            addCriterion("auto_open between", value1, value2, "autoOpen");
            return (Criteria) this;
        }

        public Criteria andAutoOpenNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_open not between", value1, value2, "autoOpen");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("contract_id like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("contract_id not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andAgreementNoIsNull() {
            addCriterion("agreement_no is null");
            return (Criteria) this;
        }

        public Criteria andAgreementNoIsNotNull() {
            addCriterion("agreement_no is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementNoEqualTo(String value) {
            addCriterion("agreement_no =", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoNotEqualTo(String value) {
            addCriterion("agreement_no <>", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoGreaterThan(String value) {
            addCriterion("agreement_no >", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_no >=", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoLessThan(String value) {
            addCriterion("agreement_no <", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoLessThanOrEqualTo(String value) {
            addCriterion("agreement_no <=", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoLike(String value) {
            addCriterion("agreement_no like", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoNotLike(String value) {
            addCriterion("agreement_no not like", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoIn(List<String> values) {
            addCriterion("agreement_no in", values, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoNotIn(List<String> values) {
            addCriterion("agreement_no not in", values, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoBetween(String value1, String value2) {
            addCriterion("agreement_no between", value1, value2, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoNotBetween(String value1, String value2) {
            addCriterion("agreement_no not between", value1, value2, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNull() {
            addCriterion("login_count is null");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNotNull() {
            addCriterion("login_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCountEqualTo(Integer value) {
            addCriterion("login_count =", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotEqualTo(Integer value) {
            addCriterion("login_count <>", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThan(Integer value) {
            addCriterion("login_count >", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_count >=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThan(Integer value) {
            addCriterion("login_count <", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThanOrEqualTo(Integer value) {
            addCriterion("login_count <=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountIn(List<Integer> values) {
            addCriterion("login_count in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotIn(List<Integer> values) {
            addCriterion("login_count not in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountBetween(Integer value1, Integer value2) {
            addCriterion("login_count between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotBetween(Integer value1, Integer value2) {
            addCriterion("login_count not between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLastLoginFromIsNull() {
            addCriterion("last_login_from is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginFromIsNotNull() {
            addCriterion("last_login_from is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginFromEqualTo(Integer value) {
            addCriterion("last_login_from =", value, "lastLoginFrom");
            return (Criteria) this;
        }

        public Criteria andLastLoginFromNotEqualTo(Integer value) {
            addCriterion("last_login_from <>", value, "lastLoginFrom");
            return (Criteria) this;
        }

        public Criteria andLastLoginFromGreaterThan(Integer value) {
            addCriterion("last_login_from >", value, "lastLoginFrom");
            return (Criteria) this;
        }

        public Criteria andLastLoginFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_login_from >=", value, "lastLoginFrom");
            return (Criteria) this;
        }

        public Criteria andLastLoginFromLessThan(Integer value) {
            addCriterion("last_login_from <", value, "lastLoginFrom");
            return (Criteria) this;
        }

        public Criteria andLastLoginFromLessThanOrEqualTo(Integer value) {
            addCriterion("last_login_from <=", value, "lastLoginFrom");
            return (Criteria) this;
        }

        public Criteria andLastLoginFromIn(List<Integer> values) {
            addCriterion("last_login_from in", values, "lastLoginFrom");
            return (Criteria) this;
        }

        public Criteria andLastLoginFromNotIn(List<Integer> values) {
            addCriterion("last_login_from not in", values, "lastLoginFrom");
            return (Criteria) this;
        }

        public Criteria andLastLoginFromBetween(Integer value1, Integer value2) {
            addCriterion("last_login_from between", value1, value2, "lastLoginFrom");
            return (Criteria) this;
        }

        public Criteria andLastLoginFromNotBetween(Integer value1, Integer value2) {
            addCriterion("last_login_from not between", value1, value2, "lastLoginFrom");
            return (Criteria) this;
        }

        public Criteria andLastLoginAtIsNull() {
            addCriterion("last_login_at is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginAtIsNotNull() {
            addCriterion("last_login_at is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginAtEqualTo(Date value) {
            addCriterion("last_login_at =", value, "lastLoginAt");
            return (Criteria) this;
        }

        public Criteria andLastLoginAtNotEqualTo(Date value) {
            addCriterion("last_login_at <>", value, "lastLoginAt");
            return (Criteria) this;
        }

        public Criteria andLastLoginAtGreaterThan(Date value) {
            addCriterion("last_login_at >", value, "lastLoginAt");
            return (Criteria) this;
        }

        public Criteria andLastLoginAtGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_at >=", value, "lastLoginAt");
            return (Criteria) this;
        }

        public Criteria andLastLoginAtLessThan(Date value) {
            addCriterion("last_login_at <", value, "lastLoginAt");
            return (Criteria) this;
        }

        public Criteria andLastLoginAtLessThanOrEqualTo(Date value) {
            addCriterion("last_login_at <=", value, "lastLoginAt");
            return (Criteria) this;
        }

        public Criteria andLastLoginAtIn(List<Date> values) {
            addCriterion("last_login_at in", values, "lastLoginAt");
            return (Criteria) this;
        }

        public Criteria andLastLoginAtNotIn(List<Date> values) {
            addCriterion("last_login_at not in", values, "lastLoginAt");
            return (Criteria) this;
        }

        public Criteria andLastLoginAtBetween(Date value1, Date value2) {
            addCriterion("last_login_at between", value1, value2, "lastLoginAt");
            return (Criteria) this;
        }

        public Criteria andLastLoginAtNotBetween(Date value1, Date value2) {
            addCriterion("last_login_at not between", value1, value2, "lastLoginAt");
            return (Criteria) this;
        }

        public Criteria andCurrentOrderIsNull() {
            addCriterion("current_order is null");
            return (Criteria) this;
        }

        public Criteria andCurrentOrderIsNotNull() {
            addCriterion("current_order is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentOrderEqualTo(Integer value) {
            addCriterion("current_order =", value, "currentOrder");
            return (Criteria) this;
        }

        public Criteria andCurrentOrderNotEqualTo(Integer value) {
            addCriterion("current_order <>", value, "currentOrder");
            return (Criteria) this;
        }

        public Criteria andCurrentOrderGreaterThan(Integer value) {
            addCriterion("current_order >", value, "currentOrder");
            return (Criteria) this;
        }

        public Criteria andCurrentOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_order >=", value, "currentOrder");
            return (Criteria) this;
        }

        public Criteria andCurrentOrderLessThan(Integer value) {
            addCriterion("current_order <", value, "currentOrder");
            return (Criteria) this;
        }

        public Criteria andCurrentOrderLessThanOrEqualTo(Integer value) {
            addCriterion("current_order <=", value, "currentOrder");
            return (Criteria) this;
        }

        public Criteria andCurrentOrderIn(List<Integer> values) {
            addCriterion("current_order in", values, "currentOrder");
            return (Criteria) this;
        }

        public Criteria andCurrentOrderNotIn(List<Integer> values) {
            addCriterion("current_order not in", values, "currentOrder");
            return (Criteria) this;
        }

        public Criteria andCurrentOrderBetween(Integer value1, Integer value2) {
            addCriterion("current_order between", value1, value2, "currentOrder");
            return (Criteria) this;
        }

        public Criteria andCurrentOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("current_order not between", value1, value2, "currentOrder");
            return (Criteria) this;
        }

        public Criteria andLastOrderIsNull() {
            addCriterion("last_order is null");
            return (Criteria) this;
        }

        public Criteria andLastOrderIsNotNull() {
            addCriterion("last_order is not null");
            return (Criteria) this;
        }

        public Criteria andLastOrderEqualTo(Integer value) {
            addCriterion("last_order =", value, "lastOrder");
            return (Criteria) this;
        }

        public Criteria andLastOrderNotEqualTo(Integer value) {
            addCriterion("last_order <>", value, "lastOrder");
            return (Criteria) this;
        }

        public Criteria andLastOrderGreaterThan(Integer value) {
            addCriterion("last_order >", value, "lastOrder");
            return (Criteria) this;
        }

        public Criteria andLastOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_order >=", value, "lastOrder");
            return (Criteria) this;
        }

        public Criteria andLastOrderLessThan(Integer value) {
            addCriterion("last_order <", value, "lastOrder");
            return (Criteria) this;
        }

        public Criteria andLastOrderLessThanOrEqualTo(Integer value) {
            addCriterion("last_order <=", value, "lastOrder");
            return (Criteria) this;
        }

        public Criteria andLastOrderIn(List<Integer> values) {
            addCriterion("last_order in", values, "lastOrder");
            return (Criteria) this;
        }

        public Criteria andLastOrderNotIn(List<Integer> values) {
            addCriterion("last_order not in", values, "lastOrder");
            return (Criteria) this;
        }

        public Criteria andLastOrderBetween(Integer value1, Integer value2) {
            addCriterion("last_order between", value1, value2, "lastOrder");
            return (Criteria) this;
        }

        public Criteria andLastOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("last_order not between", value1, value2, "lastOrder");
            return (Criteria) this;
        }

        public Criteria andFromAgentIdIsNull() {
            addCriterion("from_agent_id is null");
            return (Criteria) this;
        }

        public Criteria andFromAgentIdIsNotNull() {
            addCriterion("from_agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromAgentIdEqualTo(Integer value) {
            addCriterion("from_agent_id =", value, "fromAgentId");
            return (Criteria) this;
        }

        public Criteria andFromAgentIdNotEqualTo(Integer value) {
            addCriterion("from_agent_id <>", value, "fromAgentId");
            return (Criteria) this;
        }

        public Criteria andFromAgentIdGreaterThan(Integer value) {
            addCriterion("from_agent_id >", value, "fromAgentId");
            return (Criteria) this;
        }

        public Criteria andFromAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_agent_id >=", value, "fromAgentId");
            return (Criteria) this;
        }

        public Criteria andFromAgentIdLessThan(Integer value) {
            addCriterion("from_agent_id <", value, "fromAgentId");
            return (Criteria) this;
        }

        public Criteria andFromAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_agent_id <=", value, "fromAgentId");
            return (Criteria) this;
        }

        public Criteria andFromAgentIdIn(List<Integer> values) {
            addCriterion("from_agent_id in", values, "fromAgentId");
            return (Criteria) this;
        }

        public Criteria andFromAgentIdNotIn(List<Integer> values) {
            addCriterion("from_agent_id not in", values, "fromAgentId");
            return (Criteria) this;
        }

        public Criteria andFromAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("from_agent_id between", value1, value2, "fromAgentId");
            return (Criteria) this;
        }

        public Criteria andFromAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_agent_id not between", value1, value2, "fromAgentId");
            return (Criteria) this;
        }

        public Criteria andFromStandIdIsNull() {
            addCriterion("from_stand_id is null");
            return (Criteria) this;
        }

        public Criteria andFromStandIdIsNotNull() {
            addCriterion("from_stand_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromStandIdEqualTo(Integer value) {
            addCriterion("from_stand_id =", value, "fromStandId");
            return (Criteria) this;
        }

        public Criteria andFromStandIdNotEqualTo(Integer value) {
            addCriterion("from_stand_id <>", value, "fromStandId");
            return (Criteria) this;
        }

        public Criteria andFromStandIdGreaterThan(Integer value) {
            addCriterion("from_stand_id >", value, "fromStandId");
            return (Criteria) this;
        }

        public Criteria andFromStandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_stand_id >=", value, "fromStandId");
            return (Criteria) this;
        }

        public Criteria andFromStandIdLessThan(Integer value) {
            addCriterion("from_stand_id <", value, "fromStandId");
            return (Criteria) this;
        }

        public Criteria andFromStandIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_stand_id <=", value, "fromStandId");
            return (Criteria) this;
        }

        public Criteria andFromStandIdIn(List<Integer> values) {
            addCriterion("from_stand_id in", values, "fromStandId");
            return (Criteria) this;
        }

        public Criteria andFromStandIdNotIn(List<Integer> values) {
            addCriterion("from_stand_id not in", values, "fromStandId");
            return (Criteria) this;
        }

        public Criteria andFromStandIdBetween(Integer value1, Integer value2) {
            addCriterion("from_stand_id between", value1, value2, "fromStandId");
            return (Criteria) this;
        }

        public Criteria andFromStandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_stand_id not between", value1, value2, "fromStandId");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Integer value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Integer value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Integer value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Integer value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Integer value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Integer> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Integer> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Integer value1, Integer value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andWalletIsNull() {
            addCriterion("wallet is null");
            return (Criteria) this;
        }

        public Criteria andWalletIsNotNull() {
            addCriterion("wallet is not null");
            return (Criteria) this;
        }

        public Criteria andWalletEqualTo(BigDecimal value) {
            addCriterion("wallet =", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletNotEqualTo(BigDecimal value) {
            addCriterion("wallet <>", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletGreaterThan(BigDecimal value) {
            addCriterion("wallet >", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wallet >=", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletLessThan(BigDecimal value) {
            addCriterion("wallet <", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wallet <=", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletIn(List<BigDecimal> values) {
            addCriterion("wallet in", values, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletNotIn(List<BigDecimal> values) {
            addCriterion("wallet not in", values, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wallet between", value1, value2, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wallet not between", value1, value2, "wallet");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
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