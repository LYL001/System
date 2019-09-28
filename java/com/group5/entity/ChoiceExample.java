package com.group5.entity;

import java.util.ArrayList;
import java.util.List;

public class ChoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChoiceExample() {
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

        public Criteria andAgeMaxIsNull() {
            addCriterion("age_max is null");
            return (Criteria) this;
        }

        public Criteria andAgeMaxIsNotNull() {
            addCriterion("age_max is not null");
            return (Criteria) this;
        }

        public Criteria andAgeMaxEqualTo(Integer value) {
            addCriterion("age_max =", value, "ageMax");
            return (Criteria) this;
        }

        public Criteria andAgeMaxNotEqualTo(Integer value) {
            addCriterion("age_max <>", value, "ageMax");
            return (Criteria) this;
        }

        public Criteria andAgeMaxGreaterThan(Integer value) {
            addCriterion("age_max >", value, "ageMax");
            return (Criteria) this;
        }

        public Criteria andAgeMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("age_max >=", value, "ageMax");
            return (Criteria) this;
        }

        public Criteria andAgeMaxLessThan(Integer value) {
            addCriterion("age_max <", value, "ageMax");
            return (Criteria) this;
        }

        public Criteria andAgeMaxLessThanOrEqualTo(Integer value) {
            addCriterion("age_max <=", value, "ageMax");
            return (Criteria) this;
        }

        public Criteria andAgeMaxIn(List<Integer> values) {
            addCriterion("age_max in", values, "ageMax");
            return (Criteria) this;
        }

        public Criteria andAgeMaxNotIn(List<Integer> values) {
            addCriterion("age_max not in", values, "ageMax");
            return (Criteria) this;
        }

        public Criteria andAgeMaxBetween(Integer value1, Integer value2) {
            addCriterion("age_max between", value1, value2, "ageMax");
            return (Criteria) this;
        }

        public Criteria andAgeMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("age_max not between", value1, value2, "ageMax");
            return (Criteria) this;
        }

        public Criteria andAgeMinIsNull() {
            addCriterion("age_min is null");
            return (Criteria) this;
        }

        public Criteria andAgeMinIsNotNull() {
            addCriterion("age_min is not null");
            return (Criteria) this;
        }

        public Criteria andAgeMinEqualTo(Integer value) {
            addCriterion("age_min =", value, "ageMin");
            return (Criteria) this;
        }

        public Criteria andAgeMinNotEqualTo(Integer value) {
            addCriterion("age_min <>", value, "ageMin");
            return (Criteria) this;
        }

        public Criteria andAgeMinGreaterThan(Integer value) {
            addCriterion("age_min >", value, "ageMin");
            return (Criteria) this;
        }

        public Criteria andAgeMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("age_min >=", value, "ageMin");
            return (Criteria) this;
        }

        public Criteria andAgeMinLessThan(Integer value) {
            addCriterion("age_min <", value, "ageMin");
            return (Criteria) this;
        }

        public Criteria andAgeMinLessThanOrEqualTo(Integer value) {
            addCriterion("age_min <=", value, "ageMin");
            return (Criteria) this;
        }

        public Criteria andAgeMinIn(List<Integer> values) {
            addCriterion("age_min in", values, "ageMin");
            return (Criteria) this;
        }

        public Criteria andAgeMinNotIn(List<Integer> values) {
            addCriterion("age_min not in", values, "ageMin");
            return (Criteria) this;
        }

        public Criteria andAgeMinBetween(Integer value1, Integer value2) {
            addCriterion("age_min between", value1, value2, "ageMin");
            return (Criteria) this;
        }

        public Criteria andAgeMinNotBetween(Integer value1, Integer value2) {
            addCriterion("age_min not between", value1, value2, "ageMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxIsNull() {
            addCriterion("salary_max is null");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxIsNotNull() {
            addCriterion("salary_max is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxEqualTo(Float value) {
            addCriterion("salary_max =", value, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxNotEqualTo(Float value) {
            addCriterion("salary_max <>", value, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxGreaterThan(Float value) {
            addCriterion("salary_max >", value, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxGreaterThanOrEqualTo(Float value) {
            addCriterion("salary_max >=", value, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxLessThan(Float value) {
            addCriterion("salary_max <", value, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxLessThanOrEqualTo(Float value) {
            addCriterion("salary_max <=", value, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxIn(List<Float> values) {
            addCriterion("salary_max in", values, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxNotIn(List<Float> values) {
            addCriterion("salary_max not in", values, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxBetween(Float value1, Float value2) {
            addCriterion("salary_max between", value1, value2, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxNotBetween(Float value1, Float value2) {
            addCriterion("salary_max not between", value1, value2, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMinIsNull() {
            addCriterion("salary_min is null");
            return (Criteria) this;
        }

        public Criteria andSalaryMinIsNotNull() {
            addCriterion("salary_min is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryMinEqualTo(Float value) {
            addCriterion("salary_min =", value, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinNotEqualTo(Float value) {
            addCriterion("salary_min <>", value, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinGreaterThan(Float value) {
            addCriterion("salary_min >", value, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinGreaterThanOrEqualTo(Float value) {
            addCriterion("salary_min >=", value, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinLessThan(Float value) {
            addCriterion("salary_min <", value, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinLessThanOrEqualTo(Float value) {
            addCriterion("salary_min <=", value, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinIn(List<Float> values) {
            addCriterion("salary_min in", values, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinNotIn(List<Float> values) {
            addCriterion("salary_min not in", values, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinBetween(Float value1, Float value2) {
            addCriterion("salary_min between", value1, value2, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinNotBetween(Float value1, Float value2) {
            addCriterion("salary_min not between", value1, value2, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andHeightMaxIsNull() {
            addCriterion("height_max is null");
            return (Criteria) this;
        }

        public Criteria andHeightMaxIsNotNull() {
            addCriterion("height_max is not null");
            return (Criteria) this;
        }

        public Criteria andHeightMaxEqualTo(Float value) {
            addCriterion("height_max =", value, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxNotEqualTo(Float value) {
            addCriterion("height_max <>", value, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxGreaterThan(Float value) {
            addCriterion("height_max >", value, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxGreaterThanOrEqualTo(Float value) {
            addCriterion("height_max >=", value, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxLessThan(Float value) {
            addCriterion("height_max <", value, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxLessThanOrEqualTo(Float value) {
            addCriterion("height_max <=", value, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxIn(List<Float> values) {
            addCriterion("height_max in", values, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxNotIn(List<Float> values) {
            addCriterion("height_max not in", values, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxBetween(Float value1, Float value2) {
            addCriterion("height_max between", value1, value2, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxNotBetween(Float value1, Float value2) {
            addCriterion("height_max not between", value1, value2, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMinIsNull() {
            addCriterion("height_min is null");
            return (Criteria) this;
        }

        public Criteria andHeightMinIsNotNull() {
            addCriterion("height_min is not null");
            return (Criteria) this;
        }

        public Criteria andHeightMinEqualTo(Float value) {
            addCriterion("height_min =", value, "heightMin");
            return (Criteria) this;
        }

        public Criteria andHeightMinNotEqualTo(Float value) {
            addCriterion("height_min <>", value, "heightMin");
            return (Criteria) this;
        }

        public Criteria andHeightMinGreaterThan(Float value) {
            addCriterion("height_min >", value, "heightMin");
            return (Criteria) this;
        }

        public Criteria andHeightMinGreaterThanOrEqualTo(Float value) {
            addCriterion("height_min >=", value, "heightMin");
            return (Criteria) this;
        }

        public Criteria andHeightMinLessThan(Float value) {
            addCriterion("height_min <", value, "heightMin");
            return (Criteria) this;
        }

        public Criteria andHeightMinLessThanOrEqualTo(Float value) {
            addCriterion("height_min <=", value, "heightMin");
            return (Criteria) this;
        }

        public Criteria andHeightMinIn(List<Float> values) {
            addCriterion("height_min in", values, "heightMin");
            return (Criteria) this;
        }

        public Criteria andHeightMinNotIn(List<Float> values) {
            addCriterion("height_min not in", values, "heightMin");
            return (Criteria) this;
        }

        public Criteria andHeightMinBetween(Float value1, Float value2) {
            addCriterion("height_min between", value1, value2, "heightMin");
            return (Criteria) this;
        }

        public Criteria andHeightMinNotBetween(Float value1, Float value2) {
            addCriterion("height_min not between", value1, value2, "heightMin");
            return (Criteria) this;
        }

        public Criteria andEduIdIsNull() {
            addCriterion("EDU_id is null");
            return (Criteria) this;
        }

        public Criteria andEduIdIsNotNull() {
            addCriterion("EDU_id is not null");
            return (Criteria) this;
        }

        public Criteria andEduIdEqualTo(Integer value) {
            addCriterion("EDU_id =", value, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdNotEqualTo(Integer value) {
            addCriterion("EDU_id <>", value, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdGreaterThan(Integer value) {
            addCriterion("EDU_id >", value, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EDU_id >=", value, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdLessThan(Integer value) {
            addCriterion("EDU_id <", value, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdLessThanOrEqualTo(Integer value) {
            addCriterion("EDU_id <=", value, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdIn(List<Integer> values) {
            addCriterion("EDU_id in", values, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdNotIn(List<Integer> values) {
            addCriterion("EDU_id not in", values, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdBetween(Integer value1, Integer value2) {
            addCriterion("EDU_id between", value1, value2, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EDU_id not between", value1, value2, "eduId");
            return (Criteria) this;
        }

        public Criteria andSituationIsNull() {
            addCriterion("Situation is null");
            return (Criteria) this;
        }

        public Criteria andSituationIsNotNull() {
            addCriterion("Situation is not null");
            return (Criteria) this;
        }

        public Criteria andSituationEqualTo(String value) {
            addCriterion("Situation =", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotEqualTo(String value) {
            addCriterion("Situation <>", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationGreaterThan(String value) {
            addCriterion("Situation >", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationGreaterThanOrEqualTo(String value) {
            addCriterion("Situation >=", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationLessThan(String value) {
            addCriterion("Situation <", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationLessThanOrEqualTo(String value) {
            addCriterion("Situation <=", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationLike(String value) {
            addCriterion("Situation like", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotLike(String value) {
            addCriterion("Situation not like", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationIn(List<String> values) {
            addCriterion("Situation in", values, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotIn(List<String> values) {
            addCriterion("Situation not in", values, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationBetween(String value1, String value2) {
            addCriterion("Situation between", value1, value2, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotBetween(String value1, String value2) {
            addCriterion("Situation not between", value1, value2, "situation");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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