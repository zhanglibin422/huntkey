package com.huntkey.rx.sceo.formula.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author chenfei on 2017/5/15.
 */
public class TfdFormulaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TfdFormulaExample() {
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

        public Criteria andFrmuIdIsNull() {
            addCriterion("frmu_id is null");
            return (Criteria) this;
        }

        public Criteria andFrmuIdIsNotNull() {
            addCriterion("frmu_id is not null");
            return (Criteria) this;
        }

        public Criteria andFrmuIdEqualTo(String value) {
            addCriterion("frmu_id =", value, "frmuId");
            return (Criteria) this;
        }

        public Criteria andFrmuIdNotEqualTo(String value) {
            addCriterion("frmu_id <>", value, "frmuId");
            return (Criteria) this;
        }

        public Criteria andFrmuIdGreaterThan(String value) {
            addCriterion("frmu_id >", value, "frmuId");
            return (Criteria) this;
        }

        public Criteria andFrmuIdGreaterThanOrEqualTo(String value) {
            addCriterion("frmu_id >=", value, "frmuId");
            return (Criteria) this;
        }

        public Criteria andFrmuIdLessThan(String value) {
            addCriterion("frmu_id <", value, "frmuId");
            return (Criteria) this;
        }

        public Criteria andFrmuIdLessThanOrEqualTo(String value) {
            addCriterion("frmu_id <=", value, "frmuId");
            return (Criteria) this;
        }

        public Criteria andFrmuIdLike(String value) {
            addCriterion("frmu_id like", value, "frmuId");
            return (Criteria) this;
        }

        public Criteria andFrmuIdNotLike(String value) {
            addCriterion("frmu_id not like", value, "frmuId");
            return (Criteria) this;
        }

        public Criteria andFrmuIdIn(List<String> values) {
            addCriterion("frmu_id in", values, "frmuId");
            return (Criteria) this;
        }

        public Criteria andFrmuIdNotIn(List<String> values) {
            addCriterion("frmu_id not in", values, "frmuId");
            return (Criteria) this;
        }

        public Criteria andFrmuIdBetween(String value1, String value2) {
            addCriterion("frmu_id between", value1, value2, "frmuId");
            return (Criteria) this;
        }

        public Criteria andFrmuIdNotBetween(String value1, String value2) {
            addCriterion("frmu_id not between", value1, value2, "frmuId");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaContentIsNull() {
            addCriterion("frmu_formula_content is null");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaContentIsNotNull() {
            addCriterion("frmu_formula_content is not null");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaContentEqualTo(String value) {
            addCriterion("frmu_formula_content =", value, "frmuFormulaContent");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaContentNotEqualTo(String value) {
            addCriterion("frmu_formula_content <>", value, "frmuFormulaContent");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaContentGreaterThan(String value) {
            addCriterion("frmu_formula_content >", value, "frmuFormulaContent");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaContentGreaterThanOrEqualTo(String value) {
            addCriterion("frmu_formula_content >=", value, "frmuFormulaContent");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaContentLessThan(String value) {
            addCriterion("frmu_formula_content <", value, "frmuFormulaContent");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaContentLessThanOrEqualTo(String value) {
            addCriterion("frmu_formula_content <=", value, "frmuFormulaContent");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaContentLike(String value) {
            addCriterion("frmu_formula_content like", value, "frmuFormulaContent");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaContentNotLike(String value) {
            addCriterion("frmu_formula_content not like", value, "frmuFormulaContent");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaContentIn(List<String> values) {
            addCriterion("frmu_formula_content in", values, "frmuFormulaContent");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaContentNotIn(List<String> values) {
            addCriterion("frmu_formula_content not in", values, "frmuFormulaContent");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaContentBetween(String value1, String value2) {
            addCriterion("frmu_formula_content between", value1, value2, "frmuFormulaContent");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaContentNotBetween(String value1, String value2) {
            addCriterion("frmu_formula_content not between", value1, value2, "frmuFormulaContent");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaStyleIsNull() {
            addCriterion("frmu_formula_style is null");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaStyleIsNotNull() {
            addCriterion("frmu_formula_style is not null");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaStyleEqualTo(String value) {
            addCriterion("frmu_formula_style =", value, "frmuFormulaStyle");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaStyleNotEqualTo(String value) {
            addCriterion("frmu_formula_style <>", value, "frmuFormulaStyle");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaStyleGreaterThan(String value) {
            addCriterion("frmu_formula_style >", value, "frmuFormulaStyle");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaStyleGreaterThanOrEqualTo(String value) {
            addCriterion("frmu_formula_style >=", value, "frmuFormulaStyle");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaStyleLessThan(String value) {
            addCriterion("frmu_formula_style <", value, "frmuFormulaStyle");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaStyleLessThanOrEqualTo(String value) {
            addCriterion("frmu_formula_style <=", value, "frmuFormulaStyle");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaStyleLike(String value) {
            addCriterion("frmu_formula_style like", value, "frmuFormulaStyle");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaStyleNotLike(String value) {
            addCriterion("frmu_formula_style not like", value, "frmuFormulaStyle");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaStyleIn(List<String> values) {
            addCriterion("frmu_formula_style in", values, "frmuFormulaStyle");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaStyleNotIn(List<String> values) {
            addCriterion("frmu_formula_style not in", values, "frmuFormulaStyle");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaStyleBetween(String value1, String value2) {
            addCriterion("frmu_formula_style between", value1, value2, "frmuFormulaStyle");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaStyleNotBetween(String value1, String value2) {
            addCriterion("frmu_formula_style not between", value1, value2, "frmuFormulaStyle");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNull() {
            addCriterion("isenable is null");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNotNull() {
            addCriterion("isenable is not null");
            return (Criteria) this;
        }

        public Criteria andIsenableEqualTo(Byte value) {
            addCriterion("isenable =", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotEqualTo(Byte value) {
            addCriterion("isenable <>", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThan(Byte value) {
            addCriterion("isenable >", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThanOrEqualTo(Byte value) {
            addCriterion("isenable >=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThan(Byte value) {
            addCriterion("isenable <", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThanOrEqualTo(Byte value) {
            addCriterion("isenable <=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableIn(List<Byte> values) {
            addCriterion("isenable in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotIn(List<Byte> values) {
            addCriterion("isenable not in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableBetween(Byte value1, Byte value2) {
            addCriterion("isenable between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotBetween(Byte value1, Byte value2) {
            addCriterion("isenable not between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAdduserIsNull() {
            addCriterion("adduser is null");
            return (Criteria) this;
        }

        public Criteria andAdduserIsNotNull() {
            addCriterion("adduser is not null");
            return (Criteria) this;
        }

        public Criteria andAdduserEqualTo(String value) {
            addCriterion("adduser =", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotEqualTo(String value) {
            addCriterion("adduser <>", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserGreaterThan(String value) {
            addCriterion("adduser >", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserGreaterThanOrEqualTo(String value) {
            addCriterion("adduser >=", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserLessThan(String value) {
            addCriterion("adduser <", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserLessThanOrEqualTo(String value) {
            addCriterion("adduser <=", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserLike(String value) {
            addCriterion("adduser like", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotLike(String value) {
            addCriterion("adduser not like", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserIn(List<String> values) {
            addCriterion("adduser in", values, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotIn(List<String> values) {
            addCriterion("adduser not in", values, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserBetween(String value1, String value2) {
            addCriterion("adduser between", value1, value2, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotBetween(String value1, String value2) {
            addCriterion("adduser not between", value1, value2, "adduser");
            return (Criteria) this;
        }

        public Criteria andModtimeIsNull() {
            addCriterion("modtime is null");
            return (Criteria) this;
        }

        public Criteria andModtimeIsNotNull() {
            addCriterion("modtime is not null");
            return (Criteria) this;
        }

        public Criteria andModtimeEqualTo(Date value) {
            addCriterion("modtime =", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotEqualTo(Date value) {
            addCriterion("modtime <>", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeGreaterThan(Date value) {
            addCriterion("modtime >", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modtime >=", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeLessThan(Date value) {
            addCriterion("modtime <", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeLessThanOrEqualTo(Date value) {
            addCriterion("modtime <=", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeIn(List<Date> values) {
            addCriterion("modtime in", values, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotIn(List<Date> values) {
            addCriterion("modtime not in", values, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeBetween(Date value1, Date value2) {
            addCriterion("modtime between", value1, value2, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotBetween(Date value1, Date value2) {
            addCriterion("modtime not between", value1, value2, "modtime");
            return (Criteria) this;
        }

        public Criteria andModuserIsNull() {
            addCriterion("moduser is null");
            return (Criteria) this;
        }

        public Criteria andModuserIsNotNull() {
            addCriterion("moduser is not null");
            return (Criteria) this;
        }

        public Criteria andModuserEqualTo(String value) {
            addCriterion("moduser =", value, "moduser");
            return (Criteria) this;
        }

        public Criteria andModuserNotEqualTo(String value) {
            addCriterion("moduser <>", value, "moduser");
            return (Criteria) this;
        }

        public Criteria andModuserGreaterThan(String value) {
            addCriterion("moduser >", value, "moduser");
            return (Criteria) this;
        }

        public Criteria andModuserGreaterThanOrEqualTo(String value) {
            addCriterion("moduser >=", value, "moduser");
            return (Criteria) this;
        }

        public Criteria andModuserLessThan(String value) {
            addCriterion("moduser <", value, "moduser");
            return (Criteria) this;
        }

        public Criteria andModuserLessThanOrEqualTo(String value) {
            addCriterion("moduser <=", value, "moduser");
            return (Criteria) this;
        }

        public Criteria andModuserLike(String value) {
            addCriterion("moduser like", value, "moduser");
            return (Criteria) this;
        }

        public Criteria andModuserNotLike(String value) {
            addCriterion("moduser not like", value, "moduser");
            return (Criteria) this;
        }

        public Criteria andModuserIn(List<String> values) {
            addCriterion("moduser in", values, "moduser");
            return (Criteria) this;
        }

        public Criteria andModuserNotIn(List<String> values) {
            addCriterion("moduser not in", values, "moduser");
            return (Criteria) this;
        }

        public Criteria andModuserBetween(String value1, String value2) {
            addCriterion("moduser between", value1, value2, "moduser");
            return (Criteria) this;
        }

        public Criteria andModuserNotBetween(String value1, String value2) {
            addCriterion("moduser not between", value1, value2, "moduser");
            return (Criteria) this;
        }

        public Criteria andAcctidIsNull() {
            addCriterion("acctid is null");
            return (Criteria) this;
        }

        public Criteria andAcctidIsNotNull() {
            addCriterion("acctid is not null");
            return (Criteria) this;
        }

        public Criteria andAcctidEqualTo(Integer value) {
            addCriterion("acctid =", value, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidNotEqualTo(Integer value) {
            addCriterion("acctid <>", value, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidGreaterThan(Integer value) {
            addCriterion("acctid >", value, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidGreaterThanOrEqualTo(Integer value) {
            addCriterion("acctid >=", value, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidLessThan(Integer value) {
            addCriterion("acctid <", value, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidLessThanOrEqualTo(Integer value) {
            addCriterion("acctid <=", value, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidIn(List<Integer> values) {
            addCriterion("acctid in", values, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidNotIn(List<Integer> values) {
            addCriterion("acctid not in", values, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidBetween(Integer value1, Integer value2) {
            addCriterion("acctid between", value1, value2, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidNotBetween(Integer value1, Integer value2) {
            addCriterion("acctid not between", value1, value2, "acctid");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaTextIsNull() {
            addCriterion("frmu_formula_text is null");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaTextIsNotNull() {
            addCriterion("frmu_formula_text is not null");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaTextEqualTo(String value) {
            addCriterion("frmu_formula_text =", value, "frmuFormulaText");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaTextNotEqualTo(String value) {
            addCriterion("frmu_formula_text <>", value, "frmuFormulaText");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaTextGreaterThan(String value) {
            addCriterion("frmu_formula_text >", value, "frmuFormulaText");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaTextGreaterThanOrEqualTo(String value) {
            addCriterion("frmu_formula_text >=", value, "frmuFormulaText");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaTextLessThan(String value) {
            addCriterion("frmu_formula_text <", value, "frmuFormulaText");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaTextLessThanOrEqualTo(String value) {
            addCriterion("frmu_formula_text <=", value, "frmuFormulaText");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaTextLike(String value) {
            addCriterion("frmu_formula_text like", value, "frmuFormulaText");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaTextNotLike(String value) {
            addCriterion("frmu_formula_text not like", value, "frmuFormulaText");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaTextIn(List<String> values) {
            addCriterion("frmu_formula_text in", values, "frmuFormulaText");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaTextNotIn(List<String> values) {
            addCriterion("frmu_formula_text not in", values, "frmuFormulaText");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaTextBetween(String value1, String value2) {
            addCriterion("frmu_formula_text between", value1, value2, "frmuFormulaText");
            return (Criteria) this;
        }

        public Criteria andFrmuFormulaTextNotBetween(String value1, String value2) {
            addCriterion("frmu_formula_text not between", value1, value2, "frmuFormulaText");
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