package com.example.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceExample() {
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

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Integer value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Integer value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Integer value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Integer value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Integer> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Integer> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andStandIdIsNull() {
            addCriterion("stand_id is null");
            return (Criteria) this;
        }

        public Criteria andStandIdIsNotNull() {
            addCriterion("stand_id is not null");
            return (Criteria) this;
        }

        public Criteria andStandIdEqualTo(Integer value) {
            addCriterion("stand_id =", value, "standId");
            return (Criteria) this;
        }

        public Criteria andStandIdNotEqualTo(Integer value) {
            addCriterion("stand_id <>", value, "standId");
            return (Criteria) this;
        }

        public Criteria andStandIdGreaterThan(Integer value) {
            addCriterion("stand_id >", value, "standId");
            return (Criteria) this;
        }

        public Criteria andStandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stand_id >=", value, "standId");
            return (Criteria) this;
        }

        public Criteria andStandIdLessThan(Integer value) {
            addCriterion("stand_id <", value, "standId");
            return (Criteria) this;
        }

        public Criteria andStandIdLessThanOrEqualTo(Integer value) {
            addCriterion("stand_id <=", value, "standId");
            return (Criteria) this;
        }

        public Criteria andStandIdIn(List<Integer> values) {
            addCriterion("stand_id in", values, "standId");
            return (Criteria) this;
        }

        public Criteria andStandIdNotIn(List<Integer> values) {
            addCriterion("stand_id not in", values, "standId");
            return (Criteria) this;
        }

        public Criteria andStandIdBetween(Integer value1, Integer value2) {
            addCriterion("stand_id between", value1, value2, "standId");
            return (Criteria) this;
        }

        public Criteria andStandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stand_id not between", value1, value2, "standId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andAliDeviceIdIsNull() {
            addCriterion("ali_device_id is null");
            return (Criteria) this;
        }

        public Criteria andAliDeviceIdIsNotNull() {
            addCriterion("ali_device_id is not null");
            return (Criteria) this;
        }

        public Criteria andAliDeviceIdEqualTo(String value) {
            addCriterion("ali_device_id =", value, "aliDeviceId");
            return (Criteria) this;
        }

        public Criteria andAliDeviceIdNotEqualTo(String value) {
            addCriterion("ali_device_id <>", value, "aliDeviceId");
            return (Criteria) this;
        }

        public Criteria andAliDeviceIdGreaterThan(String value) {
            addCriterion("ali_device_id >", value, "aliDeviceId");
            return (Criteria) this;
        }

        public Criteria andAliDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("ali_device_id >=", value, "aliDeviceId");
            return (Criteria) this;
        }

        public Criteria andAliDeviceIdLessThan(String value) {
            addCriterion("ali_device_id <", value, "aliDeviceId");
            return (Criteria) this;
        }

        public Criteria andAliDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("ali_device_id <=", value, "aliDeviceId");
            return (Criteria) this;
        }

        public Criteria andAliDeviceIdLike(String value) {
            addCriterion("ali_device_id like", value, "aliDeviceId");
            return (Criteria) this;
        }

        public Criteria andAliDeviceIdNotLike(String value) {
            addCriterion("ali_device_id not like", value, "aliDeviceId");
            return (Criteria) this;
        }

        public Criteria andAliDeviceIdIn(List<String> values) {
            addCriterion("ali_device_id in", values, "aliDeviceId");
            return (Criteria) this;
        }

        public Criteria andAliDeviceIdNotIn(List<String> values) {
            addCriterion("ali_device_id not in", values, "aliDeviceId");
            return (Criteria) this;
        }

        public Criteria andAliDeviceIdBetween(String value1, String value2) {
            addCriterion("ali_device_id between", value1, value2, "aliDeviceId");
            return (Criteria) this;
        }

        public Criteria andAliDeviceIdNotBetween(String value1, String value2) {
            addCriterion("ali_device_id not between", value1, value2, "aliDeviceId");
            return (Criteria) this;
        }

        public Criteria andAliDeviceSecretIsNull() {
            addCriterion("ali_device_secret is null");
            return (Criteria) this;
        }

        public Criteria andAliDeviceSecretIsNotNull() {
            addCriterion("ali_device_secret is not null");
            return (Criteria) this;
        }

        public Criteria andAliDeviceSecretEqualTo(String value) {
            addCriterion("ali_device_secret =", value, "aliDeviceSecret");
            return (Criteria) this;
        }

        public Criteria andAliDeviceSecretNotEqualTo(String value) {
            addCriterion("ali_device_secret <>", value, "aliDeviceSecret");
            return (Criteria) this;
        }

        public Criteria andAliDeviceSecretGreaterThan(String value) {
            addCriterion("ali_device_secret >", value, "aliDeviceSecret");
            return (Criteria) this;
        }

        public Criteria andAliDeviceSecretGreaterThanOrEqualTo(String value) {
            addCriterion("ali_device_secret >=", value, "aliDeviceSecret");
            return (Criteria) this;
        }

        public Criteria andAliDeviceSecretLessThan(String value) {
            addCriterion("ali_device_secret <", value, "aliDeviceSecret");
            return (Criteria) this;
        }

        public Criteria andAliDeviceSecretLessThanOrEqualTo(String value) {
            addCriterion("ali_device_secret <=", value, "aliDeviceSecret");
            return (Criteria) this;
        }

        public Criteria andAliDeviceSecretLike(String value) {
            addCriterion("ali_device_secret like", value, "aliDeviceSecret");
            return (Criteria) this;
        }

        public Criteria andAliDeviceSecretNotLike(String value) {
            addCriterion("ali_device_secret not like", value, "aliDeviceSecret");
            return (Criteria) this;
        }

        public Criteria andAliDeviceSecretIn(List<String> values) {
            addCriterion("ali_device_secret in", values, "aliDeviceSecret");
            return (Criteria) this;
        }

        public Criteria andAliDeviceSecretNotIn(List<String> values) {
            addCriterion("ali_device_secret not in", values, "aliDeviceSecret");
            return (Criteria) this;
        }

        public Criteria andAliDeviceSecretBetween(String value1, String value2) {
            addCriterion("ali_device_secret between", value1, value2, "aliDeviceSecret");
            return (Criteria) this;
        }

        public Criteria andAliDeviceSecretNotBetween(String value1, String value2) {
            addCriterion("ali_device_secret not between", value1, value2, "aliDeviceSecret");
            return (Criteria) this;
        }

        public Criteria andDeviceQrCodeIsNull() {
            addCriterion("device_qr_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceQrCodeIsNotNull() {
            addCriterion("device_qr_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceQrCodeEqualTo(String value) {
            addCriterion("device_qr_code =", value, "deviceQrCode");
            return (Criteria) this;
        }

        public Criteria andDeviceQrCodeNotEqualTo(String value) {
            addCriterion("device_qr_code <>", value, "deviceQrCode");
            return (Criteria) this;
        }

        public Criteria andDeviceQrCodeGreaterThan(String value) {
            addCriterion("device_qr_code >", value, "deviceQrCode");
            return (Criteria) this;
        }

        public Criteria andDeviceQrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("device_qr_code >=", value, "deviceQrCode");
            return (Criteria) this;
        }

        public Criteria andDeviceQrCodeLessThan(String value) {
            addCriterion("device_qr_code <", value, "deviceQrCode");
            return (Criteria) this;
        }

        public Criteria andDeviceQrCodeLessThanOrEqualTo(String value) {
            addCriterion("device_qr_code <=", value, "deviceQrCode");
            return (Criteria) this;
        }

        public Criteria andDeviceQrCodeLike(String value) {
            addCriterion("device_qr_code like", value, "deviceQrCode");
            return (Criteria) this;
        }

        public Criteria andDeviceQrCodeNotLike(String value) {
            addCriterion("device_qr_code not like", value, "deviceQrCode");
            return (Criteria) this;
        }

        public Criteria andDeviceQrCodeIn(List<String> values) {
            addCriterion("device_qr_code in", values, "deviceQrCode");
            return (Criteria) this;
        }

        public Criteria andDeviceQrCodeNotIn(List<String> values) {
            addCriterion("device_qr_code not in", values, "deviceQrCode");
            return (Criteria) this;
        }

        public Criteria andDeviceQrCodeBetween(String value1, String value2) {
            addCriterion("device_qr_code between", value1, value2, "deviceQrCode");
            return (Criteria) this;
        }

        public Criteria andDeviceQrCodeNotBetween(String value1, String value2) {
            addCriterion("device_qr_code not between", value1, value2, "deviceQrCode");
            return (Criteria) this;
        }

        public Criteria andDeviceQrImgIsNull() {
            addCriterion("device_qr_img is null");
            return (Criteria) this;
        }

        public Criteria andDeviceQrImgIsNotNull() {
            addCriterion("device_qr_img is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceQrImgEqualTo(String value) {
            addCriterion("device_qr_img =", value, "deviceQrImg");
            return (Criteria) this;
        }

        public Criteria andDeviceQrImgNotEqualTo(String value) {
            addCriterion("device_qr_img <>", value, "deviceQrImg");
            return (Criteria) this;
        }

        public Criteria andDeviceQrImgGreaterThan(String value) {
            addCriterion("device_qr_img >", value, "deviceQrImg");
            return (Criteria) this;
        }

        public Criteria andDeviceQrImgGreaterThanOrEqualTo(String value) {
            addCriterion("device_qr_img >=", value, "deviceQrImg");
            return (Criteria) this;
        }

        public Criteria andDeviceQrImgLessThan(String value) {
            addCriterion("device_qr_img <", value, "deviceQrImg");
            return (Criteria) this;
        }

        public Criteria andDeviceQrImgLessThanOrEqualTo(String value) {
            addCriterion("device_qr_img <=", value, "deviceQrImg");
            return (Criteria) this;
        }

        public Criteria andDeviceQrImgLike(String value) {
            addCriterion("device_qr_img like", value, "deviceQrImg");
            return (Criteria) this;
        }

        public Criteria andDeviceQrImgNotLike(String value) {
            addCriterion("device_qr_img not like", value, "deviceQrImg");
            return (Criteria) this;
        }

        public Criteria andDeviceQrImgIn(List<String> values) {
            addCriterion("device_qr_img in", values, "deviceQrImg");
            return (Criteria) this;
        }

        public Criteria andDeviceQrImgNotIn(List<String> values) {
            addCriterion("device_qr_img not in", values, "deviceQrImg");
            return (Criteria) this;
        }

        public Criteria andDeviceQrImgBetween(String value1, String value2) {
            addCriterion("device_qr_img between", value1, value2, "deviceQrImg");
            return (Criteria) this;
        }

        public Criteria andDeviceQrImgNotBetween(String value1, String value2) {
            addCriterion("device_qr_img not between", value1, value2, "deviceQrImg");
            return (Criteria) this;
        }

        public Criteria andOperatorStatusIsNull() {
            addCriterion("operator_status is null");
            return (Criteria) this;
        }

        public Criteria andOperatorStatusIsNotNull() {
            addCriterion("operator_status is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorStatusEqualTo(Boolean value) {
            addCriterion("operator_status =", value, "operatorStatus");
            return (Criteria) this;
        }

        public Criteria andOperatorStatusNotEqualTo(Boolean value) {
            addCriterion("operator_status <>", value, "operatorStatus");
            return (Criteria) this;
        }

        public Criteria andOperatorStatusGreaterThan(Boolean value) {
            addCriterion("operator_status >", value, "operatorStatus");
            return (Criteria) this;
        }

        public Criteria andOperatorStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("operator_status >=", value, "operatorStatus");
            return (Criteria) this;
        }

        public Criteria andOperatorStatusLessThan(Boolean value) {
            addCriterion("operator_status <", value, "operatorStatus");
            return (Criteria) this;
        }

        public Criteria andOperatorStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("operator_status <=", value, "operatorStatus");
            return (Criteria) this;
        }

        public Criteria andOperatorStatusIn(List<Boolean> values) {
            addCriterion("operator_status in", values, "operatorStatus");
            return (Criteria) this;
        }

        public Criteria andOperatorStatusNotIn(List<Boolean> values) {
            addCriterion("operator_status not in", values, "operatorStatus");
            return (Criteria) this;
        }

        public Criteria andOperatorStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("operator_status between", value1, value2, "operatorStatus");
            return (Criteria) this;
        }

        public Criteria andOperatorStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("operator_status not between", value1, value2, "operatorStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIsNull() {
            addCriterion("device_status is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIsNotNull() {
            addCriterion("device_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusEqualTo(Boolean value) {
            addCriterion("device_status =", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotEqualTo(Boolean value) {
            addCriterion("device_status <>", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusGreaterThan(Boolean value) {
            addCriterion("device_status >", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("device_status >=", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusLessThan(Boolean value) {
            addCriterion("device_status <", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("device_status <=", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIn(List<Boolean> values) {
            addCriterion("device_status in", values, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotIn(List<Boolean> values) {
            addCriterion("device_status not in", values, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("device_status between", value1, value2, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("device_status not between", value1, value2, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIsNull() {
            addCriterion("online_status is null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIsNotNull() {
            addCriterion("online_status is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusEqualTo(Boolean value) {
            addCriterion("online_status =", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotEqualTo(Boolean value) {
            addCriterion("online_status <>", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusGreaterThan(Boolean value) {
            addCriterion("online_status >", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("online_status >=", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLessThan(Boolean value) {
            addCriterion("online_status <", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("online_status <=", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIn(List<Boolean> values) {
            addCriterion("online_status in", values, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotIn(List<Boolean> values) {
            addCriterion("online_status not in", values, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("online_status between", value1, value2, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("online_status not between", value1, value2, "onlineStatus");
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

        public Criteria andCurrentUserIsNull() {
            addCriterion("current_user is null");
            return (Criteria) this;
        }

        public Criteria andCurrentUserIsNotNull() {
            addCriterion("current_user is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentUserEqualTo(Integer value) {
            addCriterion("current_user =", value, "currentUser");
            return (Criteria) this;
        }

        public Criteria andCurrentUserNotEqualTo(Integer value) {
            addCriterion("current_user <>", value, "currentUser");
            return (Criteria) this;
        }

        public Criteria andCurrentUserGreaterThan(Integer value) {
            addCriterion("current_user >", value, "currentUser");
            return (Criteria) this;
        }

        public Criteria andCurrentUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_user >=", value, "currentUser");
            return (Criteria) this;
        }

        public Criteria andCurrentUserLessThan(Integer value) {
            addCriterion("current_user <", value, "currentUser");
            return (Criteria) this;
        }

        public Criteria andCurrentUserLessThanOrEqualTo(Integer value) {
            addCriterion("current_user <=", value, "currentUser");
            return (Criteria) this;
        }

        public Criteria andCurrentUserIn(List<Integer> values) {
            addCriterion("current_user in", values, "currentUser");
            return (Criteria) this;
        }

        public Criteria andCurrentUserNotIn(List<Integer> values) {
            addCriterion("current_user not in", values, "currentUser");
            return (Criteria) this;
        }

        public Criteria andCurrentUserBetween(Integer value1, Integer value2) {
            addCriterion("current_user between", value1, value2, "currentUser");
            return (Criteria) this;
        }

        public Criteria andCurrentUserNotBetween(Integer value1, Integer value2) {
            addCriterion("current_user not between", value1, value2, "currentUser");
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

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(BigDecimal value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(BigDecimal value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(BigDecimal value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(BigDecimal value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<BigDecimal> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<BigDecimal> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(BigDecimal value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(BigDecimal value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(BigDecimal value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(BigDecimal value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<BigDecimal> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<BigDecimal> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat not between", value1, value2, "lat");
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

        public Criteria andServiceCountIsNull() {
            addCriterion("service_count is null");
            return (Criteria) this;
        }

        public Criteria andServiceCountIsNotNull() {
            addCriterion("service_count is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCountEqualTo(Integer value) {
            addCriterion("service_count =", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountNotEqualTo(Integer value) {
            addCriterion("service_count <>", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountGreaterThan(Integer value) {
            addCriterion("service_count >", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_count >=", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountLessThan(Integer value) {
            addCriterion("service_count <", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountLessThanOrEqualTo(Integer value) {
            addCriterion("service_count <=", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountIn(List<Integer> values) {
            addCriterion("service_count in", values, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountNotIn(List<Integer> values) {
            addCriterion("service_count not in", values, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountBetween(Integer value1, Integer value2) {
            addCriterion("service_count between", value1, value2, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountNotBetween(Integer value1, Integer value2) {
            addCriterion("service_count not between", value1, value2, "serviceCount");
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

        public Criteria andIsDelEqualTo(Boolean value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Boolean> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Boolean> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
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

        public Criteria andStatustimeIsNull() {
            addCriterion("statustime is null");
            return (Criteria) this;
        }

        public Criteria andStatustimeIsNotNull() {
            addCriterion("statustime is not null");
            return (Criteria) this;
        }

        public Criteria andStatustimeEqualTo(Date value) {
            addCriterion("statustime =", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeNotEqualTo(Date value) {
            addCriterion("statustime <>", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeGreaterThan(Date value) {
            addCriterion("statustime >", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeGreaterThanOrEqualTo(Date value) {
            addCriterion("statustime >=", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeLessThan(Date value) {
            addCriterion("statustime <", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeLessThanOrEqualTo(Date value) {
            addCriterion("statustime <=", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeIn(List<Date> values) {
            addCriterion("statustime in", values, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeNotIn(List<Date> values) {
            addCriterion("statustime not in", values, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeBetween(Date value1, Date value2) {
            addCriterion("statustime between", value1, value2, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeNotBetween(Date value1, Date value2) {
            addCriterion("statustime not between", value1, value2, "statustime");
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