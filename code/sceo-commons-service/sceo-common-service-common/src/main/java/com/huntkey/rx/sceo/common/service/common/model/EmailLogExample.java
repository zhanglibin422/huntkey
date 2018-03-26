package com.huntkey.rx.sceo.common.service.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmailLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
    public EmailLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
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

        public Criteria andMailidIsNull() {
            addCriterion("mailId is null");
            return (Criteria) this;
        }

        public Criteria andMailidIsNotNull() {
            addCriterion("mailId is not null");
            return (Criteria) this;
        }

        public Criteria andMailidEqualTo(String value) {
            addCriterion("mailId =", value, "mailid");
            return (Criteria) this;
        }

        public Criteria andMailidNotEqualTo(String value) {
            addCriterion("mailId <>", value, "mailid");
            return (Criteria) this;
        }

        public Criteria andMailidGreaterThan(String value) {
            addCriterion("mailId >", value, "mailid");
            return (Criteria) this;
        }

        public Criteria andMailidGreaterThanOrEqualTo(String value) {
            addCriterion("mailId >=", value, "mailid");
            return (Criteria) this;
        }

        public Criteria andMailidLessThan(String value) {
            addCriterion("mailId <", value, "mailid");
            return (Criteria) this;
        }

        public Criteria andMailidLessThanOrEqualTo(String value) {
            addCriterion("mailId <=", value, "mailid");
            return (Criteria) this;
        }

        public Criteria andMailidLike(String value) {
            addCriterion("mailId like", value, "mailid");
            return (Criteria) this;
        }

        public Criteria andMailidNotLike(String value) {
            addCriterion("mailId not like", value, "mailid");
            return (Criteria) this;
        }

        public Criteria andMailidIn(List<String> values) {
            addCriterion("mailId in", values, "mailid");
            return (Criteria) this;
        }

        public Criteria andMailidNotIn(List<String> values) {
            addCriterion("mailId not in", values, "mailid");
            return (Criteria) this;
        }

        public Criteria andMailidBetween(String value1, String value2) {
            addCriterion("mailId between", value1, value2, "mailid");
            return (Criteria) this;
        }

        public Criteria andMailidNotBetween(String value1, String value2) {
            addCriterion("mailId not between", value1, value2, "mailid");
            return (Criteria) this;
        }

        public Criteria andMailmodulecodeIsNull() {
            addCriterion("mailModuleCode is null");
            return (Criteria) this;
        }

        public Criteria andMailmodulecodeIsNotNull() {
            addCriterion("mailModuleCode is not null");
            return (Criteria) this;
        }

        public Criteria andMailmodulecodeEqualTo(String value) {
            addCriterion("mailModuleCode =", value, "mailmodulecode");
            return (Criteria) this;
        }

        public Criteria andMailmodulecodeNotEqualTo(String value) {
            addCriterion("mailModuleCode <>", value, "mailmodulecode");
            return (Criteria) this;
        }

        public Criteria andMailmodulecodeGreaterThan(String value) {
            addCriterion("mailModuleCode >", value, "mailmodulecode");
            return (Criteria) this;
        }

        public Criteria andMailmodulecodeGreaterThanOrEqualTo(String value) {
            addCriterion("mailModuleCode >=", value, "mailmodulecode");
            return (Criteria) this;
        }

        public Criteria andMailmodulecodeLessThan(String value) {
            addCriterion("mailModuleCode <", value, "mailmodulecode");
            return (Criteria) this;
        }

        public Criteria andMailmodulecodeLessThanOrEqualTo(String value) {
            addCriterion("mailModuleCode <=", value, "mailmodulecode");
            return (Criteria) this;
        }

        public Criteria andMailmodulecodeLike(String value) {
            addCriterion("mailModuleCode like", value, "mailmodulecode");
            return (Criteria) this;
        }

        public Criteria andMailmodulecodeNotLike(String value) {
            addCriterion("mailModuleCode not like", value, "mailmodulecode");
            return (Criteria) this;
        }

        public Criteria andMailmodulecodeIn(List<String> values) {
            addCriterion("mailModuleCode in", values, "mailmodulecode");
            return (Criteria) this;
        }

        public Criteria andMailmodulecodeNotIn(List<String> values) {
            addCriterion("mailModuleCode not in", values, "mailmodulecode");
            return (Criteria) this;
        }

        public Criteria andMailmodulecodeBetween(String value1, String value2) {
            addCriterion("mailModuleCode between", value1, value2, "mailmodulecode");
            return (Criteria) this;
        }

        public Criteria andMailmodulecodeNotBetween(String value1, String value2) {
            addCriterion("mailModuleCode not between", value1, value2, "mailmodulecode");
            return (Criteria) this;
        }

        public Criteria andMailsubjectIsNull() {
            addCriterion("mailSubject is null");
            return (Criteria) this;
        }

        public Criteria andMailsubjectIsNotNull() {
            addCriterion("mailSubject is not null");
            return (Criteria) this;
        }

        public Criteria andMailsubjectEqualTo(String value) {
            addCriterion("mailSubject =", value, "mailsubject");
            return (Criteria) this;
        }

        public Criteria andMailsubjectNotEqualTo(String value) {
            addCriterion("mailSubject <>", value, "mailsubject");
            return (Criteria) this;
        }

        public Criteria andMailsubjectGreaterThan(String value) {
            addCriterion("mailSubject >", value, "mailsubject");
            return (Criteria) this;
        }

        public Criteria andMailsubjectGreaterThanOrEqualTo(String value) {
            addCriterion("mailSubject >=", value, "mailsubject");
            return (Criteria) this;
        }

        public Criteria andMailsubjectLessThan(String value) {
            addCriterion("mailSubject <", value, "mailsubject");
            return (Criteria) this;
        }

        public Criteria andMailsubjectLessThanOrEqualTo(String value) {
            addCriterion("mailSubject <=", value, "mailsubject");
            return (Criteria) this;
        }

        public Criteria andMailsubjectLike(String value) {
            addCriterion("mailSubject like", value, "mailsubject");
            return (Criteria) this;
        }

        public Criteria andMailsubjectNotLike(String value) {
            addCriterion("mailSubject not like", value, "mailsubject");
            return (Criteria) this;
        }

        public Criteria andMailsubjectIn(List<String> values) {
            addCriterion("mailSubject in", values, "mailsubject");
            return (Criteria) this;
        }

        public Criteria andMailsubjectNotIn(List<String> values) {
            addCriterion("mailSubject not in", values, "mailsubject");
            return (Criteria) this;
        }

        public Criteria andMailsubjectBetween(String value1, String value2) {
            addCriterion("mailSubject between", value1, value2, "mailsubject");
            return (Criteria) this;
        }

        public Criteria andMailsubjectNotBetween(String value1, String value2) {
            addCriterion("mailSubject not between", value1, value2, "mailsubject");
            return (Criteria) this;
        }

        public Criteria andMailsendtimeIsNull() {
            addCriterion("mailSendTime is null");
            return (Criteria) this;
        }

        public Criteria andMailsendtimeIsNotNull() {
            addCriterion("mailSendTime is not null");
            return (Criteria) this;
        }

        public Criteria andMailsendtimeEqualTo(Date value) {
            addCriterion("mailSendTime =", value, "mailsendtime");
            return (Criteria) this;
        }

        public Criteria andMailsendtimeNotEqualTo(Date value) {
            addCriterion("mailSendTime <>", value, "mailsendtime");
            return (Criteria) this;
        }

        public Criteria andMailsendtimeGreaterThan(Date value) {
            addCriterion("mailSendTime >", value, "mailsendtime");
            return (Criteria) this;
        }

        public Criteria andMailsendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mailSendTime >=", value, "mailsendtime");
            return (Criteria) this;
        }

        public Criteria andMailsendtimeLessThan(Date value) {
            addCriterion("mailSendTime <", value, "mailsendtime");
            return (Criteria) this;
        }

        public Criteria andMailsendtimeLessThanOrEqualTo(Date value) {
            addCriterion("mailSendTime <=", value, "mailsendtime");
            return (Criteria) this;
        }

        public Criteria andMailsendtimeIn(List<Date> values) {
            addCriterion("mailSendTime in", values, "mailsendtime");
            return (Criteria) this;
        }

        public Criteria andMailsendtimeNotIn(List<Date> values) {
            addCriterion("mailSendTime not in", values, "mailsendtime");
            return (Criteria) this;
        }

        public Criteria andMailsendtimeBetween(Date value1, Date value2) {
            addCriterion("mailSendTime between", value1, value2, "mailsendtime");
            return (Criteria) this;
        }

        public Criteria andMailsendtimeNotBetween(Date value1, Date value2) {
            addCriterion("mailSendTime not between", value1, value2, "mailsendtime");
            return (Criteria) this;
        }

        public Criteria andMailsendstautsIsNull() {
            addCriterion("mailSendStauts is null");
            return (Criteria) this;
        }

        public Criteria andMailsendstautsIsNotNull() {
            addCriterion("mailSendStauts is not null");
            return (Criteria) this;
        }

        public Criteria andMailsendstautsEqualTo(String value) {
            addCriterion("mailSendStauts =", value, "mailsendstauts");
            return (Criteria) this;
        }

        public Criteria andMailsendstautsNotEqualTo(String value) {
            addCriterion("mailSendStauts <>", value, "mailsendstauts");
            return (Criteria) this;
        }

        public Criteria andMailsendstautsGreaterThan(String value) {
            addCriterion("mailSendStauts >", value, "mailsendstauts");
            return (Criteria) this;
        }

        public Criteria andMailsendstautsGreaterThanOrEqualTo(String value) {
            addCriterion("mailSendStauts >=", value, "mailsendstauts");
            return (Criteria) this;
        }

        public Criteria andMailsendstautsLessThan(String value) {
            addCriterion("mailSendStauts <", value, "mailsendstauts");
            return (Criteria) this;
        }

        public Criteria andMailsendstautsLessThanOrEqualTo(String value) {
            addCriterion("mailSendStauts <=", value, "mailsendstauts");
            return (Criteria) this;
        }

        public Criteria andMailsendstautsLike(String value) {
            addCriterion("mailSendStauts like", value, "mailsendstauts");
            return (Criteria) this;
        }

        public Criteria andMailsendstautsNotLike(String value) {
            addCriterion("mailSendStauts not like", value, "mailsendstauts");
            return (Criteria) this;
        }

        public Criteria andMailsendstautsIn(List<String> values) {
            addCriterion("mailSendStauts in", values, "mailsendstauts");
            return (Criteria) this;
        }

        public Criteria andMailsendstautsNotIn(List<String> values) {
            addCriterion("mailSendStauts not in", values, "mailsendstauts");
            return (Criteria) this;
        }

        public Criteria andMailsendstautsBetween(String value1, String value2) {
            addCriterion("mailSendStauts between", value1, value2, "mailsendstauts");
            return (Criteria) this;
        }

        public Criteria andMailsendstautsNotBetween(String value1, String value2) {
            addCriterion("mailSendStauts not between", value1, value2, "mailsendstauts");
            return (Criteria) this;
        }

        public Criteria andMailerrorresponseIsNull() {
            addCriterion("mailErrorResponse is null");
            return (Criteria) this;
        }

        public Criteria andMailerrorresponseIsNotNull() {
            addCriterion("mailErrorResponse is not null");
            return (Criteria) this;
        }

        public Criteria andMailerrorresponseEqualTo(String value) {
            addCriterion("mailErrorResponse =", value, "mailerrorresponse");
            return (Criteria) this;
        }

        public Criteria andMailerrorresponseNotEqualTo(String value) {
            addCriterion("mailErrorResponse <>", value, "mailerrorresponse");
            return (Criteria) this;
        }

        public Criteria andMailerrorresponseGreaterThan(String value) {
            addCriterion("mailErrorResponse >", value, "mailerrorresponse");
            return (Criteria) this;
        }

        public Criteria andMailerrorresponseGreaterThanOrEqualTo(String value) {
            addCriterion("mailErrorResponse >=", value, "mailerrorresponse");
            return (Criteria) this;
        }

        public Criteria andMailerrorresponseLessThan(String value) {
            addCriterion("mailErrorResponse <", value, "mailerrorresponse");
            return (Criteria) this;
        }

        public Criteria andMailerrorresponseLessThanOrEqualTo(String value) {
            addCriterion("mailErrorResponse <=", value, "mailerrorresponse");
            return (Criteria) this;
        }

        public Criteria andMailerrorresponseLike(String value) {
            addCriterion("mailErrorResponse like", value, "mailerrorresponse");
            return (Criteria) this;
        }

        public Criteria andMailerrorresponseNotLike(String value) {
            addCriterion("mailErrorResponse not like", value, "mailerrorresponse");
            return (Criteria) this;
        }

        public Criteria andMailerrorresponseIn(List<String> values) {
            addCriterion("mailErrorResponse in", values, "mailerrorresponse");
            return (Criteria) this;
        }

        public Criteria andMailerrorresponseNotIn(List<String> values) {
            addCriterion("mailErrorResponse not in", values, "mailerrorresponse");
            return (Criteria) this;
        }

        public Criteria andMailerrorresponseBetween(String value1, String value2) {
            addCriterion("mailErrorResponse between", value1, value2, "mailerrorresponse");
            return (Criteria) this;
        }

        public Criteria andMailerrorresponseNotBetween(String value1, String value2) {
            addCriterion("mailErrorResponse not between", value1, value2, "mailerrorresponse");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated do_not_delete_during_merge Mon Jun 26 13:53:36 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table LOG_SEND_EMAIL
     *
     * @mbg.generated Mon Jun 26 13:53:36 CST 2017
     */
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