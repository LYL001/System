package entity;

import java.util.ArrayList;
import java.util.List;

public class AcceptMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcceptMessageExample() {
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

        public Criteria andAcceptmIdIsNull() {
            addCriterion("AcceptM_Id is null");
            return (Criteria) this;
        }

        public Criteria andAcceptmIdIsNotNull() {
            addCriterion("AcceptM_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptmIdEqualTo(Integer value) {
            addCriterion("AcceptM_Id =", value, "acceptmId");
            return (Criteria) this;
        }

        public Criteria andAcceptmIdNotEqualTo(Integer value) {
            addCriterion("AcceptM_Id <>", value, "acceptmId");
            return (Criteria) this;
        }

        public Criteria andAcceptmIdGreaterThan(Integer value) {
            addCriterion("AcceptM_Id >", value, "acceptmId");
            return (Criteria) this;
        }

        public Criteria andAcceptmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AcceptM_Id >=", value, "acceptmId");
            return (Criteria) this;
        }

        public Criteria andAcceptmIdLessThan(Integer value) {
            addCriterion("AcceptM_Id <", value, "acceptmId");
            return (Criteria) this;
        }

        public Criteria andAcceptmIdLessThanOrEqualTo(Integer value) {
            addCriterion("AcceptM_Id <=", value, "acceptmId");
            return (Criteria) this;
        }

        public Criteria andAcceptmIdIn(List<Integer> values) {
            addCriterion("AcceptM_Id in", values, "acceptmId");
            return (Criteria) this;
        }

        public Criteria andAcceptmIdNotIn(List<Integer> values) {
            addCriterion("AcceptM_Id not in", values, "acceptmId");
            return (Criteria) this;
        }

        public Criteria andAcceptmIdBetween(Integer value1, Integer value2) {
            addCriterion("AcceptM_Id between", value1, value2, "acceptmId");
            return (Criteria) this;
        }

        public Criteria andAcceptmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AcceptM_Id not between", value1, value2, "acceptmId");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("Send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("Send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(String value) {
            addCriterion("Send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(String value) {
            addCriterion("Send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(String value) {
            addCriterion("Send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(String value) {
            addCriterion("Send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(String value) {
            addCriterion("Send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLike(String value) {
            addCriterion("Send_time like", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotLike(String value) {
            addCriterion("Send_time not like", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<String> values) {
            addCriterion("Send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<String> values) {
            addCriterion("Send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(String value1, String value2) {
            addCriterion("Send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(String value1, String value2) {
            addCriterion("Send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("User_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("User_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("User_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("User_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("User_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("User_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("User_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("User_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("User_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSenduIdIsNull() {
            addCriterion("SendU_id is null");
            return (Criteria) this;
        }

        public Criteria andSenduIdIsNotNull() {
            addCriterion("SendU_id is not null");
            return (Criteria) this;
        }

        public Criteria andSenduIdEqualTo(Integer value) {
            addCriterion("SendU_id =", value, "senduId");
            return (Criteria) this;
        }

        public Criteria andSenduIdNotEqualTo(Integer value) {
            addCriterion("SendU_id <>", value, "senduId");
            return (Criteria) this;
        }

        public Criteria andSenduIdGreaterThan(Integer value) {
            addCriterion("SendU_id >", value, "senduId");
            return (Criteria) this;
        }

        public Criteria andSenduIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SendU_id >=", value, "senduId");
            return (Criteria) this;
        }

        public Criteria andSenduIdLessThan(Integer value) {
            addCriterion("SendU_id <", value, "senduId");
            return (Criteria) this;
        }

        public Criteria andSenduIdLessThanOrEqualTo(Integer value) {
            addCriterion("SendU_id <=", value, "senduId");
            return (Criteria) this;
        }

        public Criteria andSenduIdIn(List<Integer> values) {
            addCriterion("SendU_id in", values, "senduId");
            return (Criteria) this;
        }

        public Criteria andSenduIdNotIn(List<Integer> values) {
            addCriterion("SendU_id not in", values, "senduId");
            return (Criteria) this;
        }

        public Criteria andSenduIdBetween(Integer value1, Integer value2) {
            addCriterion("SendU_id between", value1, value2, "senduId");
            return (Criteria) this;
        }

        public Criteria andSenduIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SendU_id not between", value1, value2, "senduId");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("Mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("Mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(Integer value) {
            addCriterion("Mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(Integer value) {
            addCriterion("Mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(Integer value) {
            addCriterion("Mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("Mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(Integer value) {
            addCriterion("Mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(Integer value) {
            addCriterion("Mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<Integer> values) {
            addCriterion("Mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<Integer> values) {
            addCriterion("Mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(Integer value1, Integer value2) {
            addCriterion("Mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("Mark not between", value1, value2, "mark");
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