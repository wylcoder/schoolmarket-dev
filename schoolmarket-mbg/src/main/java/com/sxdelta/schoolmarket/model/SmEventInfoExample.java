package com.sxdelta.schoolmarket.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmEventInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmEventInfoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNull() {
            addCriterion("event_id is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("event_id is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(String value) {
            addCriterion("event_id =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(String value) {
            addCriterion("event_id <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(String value) {
            addCriterion("event_id >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(String value) {
            addCriterion("event_id >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(String value) {
            addCriterion("event_id <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(String value) {
            addCriterion("event_id <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLike(String value) {
            addCriterion("event_id like", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotLike(String value) {
            addCriterion("event_id not like", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<String> values) {
            addCriterion("event_id in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<String> values) {
            addCriterion("event_id not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(String value1, String value2) {
            addCriterion("event_id between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(String value1, String value2) {
            addCriterion("event_id not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventContentIsNull() {
            addCriterion("event_content is null");
            return (Criteria) this;
        }

        public Criteria andEventContentIsNotNull() {
            addCriterion("event_content is not null");
            return (Criteria) this;
        }

        public Criteria andEventContentEqualTo(String value) {
            addCriterion("event_content =", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentNotEqualTo(String value) {
            addCriterion("event_content <>", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentGreaterThan(String value) {
            addCriterion("event_content >", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentGreaterThanOrEqualTo(String value) {
            addCriterion("event_content >=", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentLessThan(String value) {
            addCriterion("event_content <", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentLessThanOrEqualTo(String value) {
            addCriterion("event_content <=", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentLike(String value) {
            addCriterion("event_content like", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentNotLike(String value) {
            addCriterion("event_content not like", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentIn(List<String> values) {
            addCriterion("event_content in", values, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentNotIn(List<String> values) {
            addCriterion("event_content not in", values, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentBetween(String value1, String value2) {
            addCriterion("event_content between", value1, value2, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentNotBetween(String value1, String value2) {
            addCriterion("event_content not between", value1, value2, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventPictureIsNull() {
            addCriterion("event_picture is null");
            return (Criteria) this;
        }

        public Criteria andEventPictureIsNotNull() {
            addCriterion("event_picture is not null");
            return (Criteria) this;
        }

        public Criteria andEventPictureEqualTo(String value) {
            addCriterion("event_picture =", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureNotEqualTo(String value) {
            addCriterion("event_picture <>", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureGreaterThan(String value) {
            addCriterion("event_picture >", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureGreaterThanOrEqualTo(String value) {
            addCriterion("event_picture >=", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureLessThan(String value) {
            addCriterion("event_picture <", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureLessThanOrEqualTo(String value) {
            addCriterion("event_picture <=", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureLike(String value) {
            addCriterion("event_picture like", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureNotLike(String value) {
            addCriterion("event_picture not like", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureIn(List<String> values) {
            addCriterion("event_picture in", values, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureNotIn(List<String> values) {
            addCriterion("event_picture not in", values, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureBetween(String value1, String value2) {
            addCriterion("event_picture between", value1, value2, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureNotBetween(String value1, String value2) {
            addCriterion("event_picture not between", value1, value2, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventTopicIsNull() {
            addCriterion("event_topic is null");
            return (Criteria) this;
        }

        public Criteria andEventTopicIsNotNull() {
            addCriterion("event_topic is not null");
            return (Criteria) this;
        }

        public Criteria andEventTopicEqualTo(String value) {
            addCriterion("event_topic =", value, "eventTopic");
            return (Criteria) this;
        }

        public Criteria andEventTopicNotEqualTo(String value) {
            addCriterion("event_topic <>", value, "eventTopic");
            return (Criteria) this;
        }

        public Criteria andEventTopicGreaterThan(String value) {
            addCriterion("event_topic >", value, "eventTopic");
            return (Criteria) this;
        }

        public Criteria andEventTopicGreaterThanOrEqualTo(String value) {
            addCriterion("event_topic >=", value, "eventTopic");
            return (Criteria) this;
        }

        public Criteria andEventTopicLessThan(String value) {
            addCriterion("event_topic <", value, "eventTopic");
            return (Criteria) this;
        }

        public Criteria andEventTopicLessThanOrEqualTo(String value) {
            addCriterion("event_topic <=", value, "eventTopic");
            return (Criteria) this;
        }

        public Criteria andEventTopicLike(String value) {
            addCriterion("event_topic like", value, "eventTopic");
            return (Criteria) this;
        }

        public Criteria andEventTopicNotLike(String value) {
            addCriterion("event_topic not like", value, "eventTopic");
            return (Criteria) this;
        }

        public Criteria andEventTopicIn(List<String> values) {
            addCriterion("event_topic in", values, "eventTopic");
            return (Criteria) this;
        }

        public Criteria andEventTopicNotIn(List<String> values) {
            addCriterion("event_topic not in", values, "eventTopic");
            return (Criteria) this;
        }

        public Criteria andEventTopicBetween(String value1, String value2) {
            addCriterion("event_topic between", value1, value2, "eventTopic");
            return (Criteria) this;
        }

        public Criteria andEventTopicNotBetween(String value1, String value2) {
            addCriterion("event_topic not between", value1, value2, "eventTopic");
            return (Criteria) this;
        }

        public Criteria andEventSchoolIsNull() {
            addCriterion("event_school is null");
            return (Criteria) this;
        }

        public Criteria andEventSchoolIsNotNull() {
            addCriterion("event_school is not null");
            return (Criteria) this;
        }

        public Criteria andEventSchoolEqualTo(String value) {
            addCriterion("event_school =", value, "eventSchool");
            return (Criteria) this;
        }

        public Criteria andEventSchoolNotEqualTo(String value) {
            addCriterion("event_school <>", value, "eventSchool");
            return (Criteria) this;
        }

        public Criteria andEventSchoolGreaterThan(String value) {
            addCriterion("event_school >", value, "eventSchool");
            return (Criteria) this;
        }

        public Criteria andEventSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("event_school >=", value, "eventSchool");
            return (Criteria) this;
        }

        public Criteria andEventSchoolLessThan(String value) {
            addCriterion("event_school <", value, "eventSchool");
            return (Criteria) this;
        }

        public Criteria andEventSchoolLessThanOrEqualTo(String value) {
            addCriterion("event_school <=", value, "eventSchool");
            return (Criteria) this;
        }

        public Criteria andEventSchoolLike(String value) {
            addCriterion("event_school like", value, "eventSchool");
            return (Criteria) this;
        }

        public Criteria andEventSchoolNotLike(String value) {
            addCriterion("event_school not like", value, "eventSchool");
            return (Criteria) this;
        }

        public Criteria andEventSchoolIn(List<String> values) {
            addCriterion("event_school in", values, "eventSchool");
            return (Criteria) this;
        }

        public Criteria andEventSchoolNotIn(List<String> values) {
            addCriterion("event_school not in", values, "eventSchool");
            return (Criteria) this;
        }

        public Criteria andEventSchoolBetween(String value1, String value2) {
            addCriterion("event_school between", value1, value2, "eventSchool");
            return (Criteria) this;
        }

        public Criteria andEventSchoolNotBetween(String value1, String value2) {
            addCriterion("event_school not between", value1, value2, "eventSchool");
            return (Criteria) this;
        }

        public Criteria andEventViewpermissionIsNull() {
            addCriterion("event_viewpermission is null");
            return (Criteria) this;
        }

        public Criteria andEventViewpermissionIsNotNull() {
            addCriterion("event_viewpermission is not null");
            return (Criteria) this;
        }

        public Criteria andEventViewpermissionEqualTo(Integer value) {
            addCriterion("event_viewpermission =", value, "eventViewpermission");
            return (Criteria) this;
        }

        public Criteria andEventViewpermissionNotEqualTo(Integer value) {
            addCriterion("event_viewpermission <>", value, "eventViewpermission");
            return (Criteria) this;
        }

        public Criteria andEventViewpermissionGreaterThan(Integer value) {
            addCriterion("event_viewpermission >", value, "eventViewpermission");
            return (Criteria) this;
        }

        public Criteria andEventViewpermissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_viewpermission >=", value, "eventViewpermission");
            return (Criteria) this;
        }

        public Criteria andEventViewpermissionLessThan(Integer value) {
            addCriterion("event_viewpermission <", value, "eventViewpermission");
            return (Criteria) this;
        }

        public Criteria andEventViewpermissionLessThanOrEqualTo(Integer value) {
            addCriterion("event_viewpermission <=", value, "eventViewpermission");
            return (Criteria) this;
        }

        public Criteria andEventViewpermissionIn(List<Integer> values) {
            addCriterion("event_viewpermission in", values, "eventViewpermission");
            return (Criteria) this;
        }

        public Criteria andEventViewpermissionNotIn(List<Integer> values) {
            addCriterion("event_viewpermission not in", values, "eventViewpermission");
            return (Criteria) this;
        }

        public Criteria andEventViewpermissionBetween(Integer value1, Integer value2) {
            addCriterion("event_viewpermission between", value1, value2, "eventViewpermission");
            return (Criteria) this;
        }

        public Criteria andEventViewpermissionNotBetween(Integer value1, Integer value2) {
            addCriterion("event_viewpermission not between", value1, value2, "eventViewpermission");
            return (Criteria) this;
        }

        public Criteria andEventCommentspermissionIsNull() {
            addCriterion("event_commentspermission is null");
            return (Criteria) this;
        }

        public Criteria andEventCommentspermissionIsNotNull() {
            addCriterion("event_commentspermission is not null");
            return (Criteria) this;
        }

        public Criteria andEventCommentspermissionEqualTo(Integer value) {
            addCriterion("event_commentspermission =", value, "eventCommentspermission");
            return (Criteria) this;
        }

        public Criteria andEventCommentspermissionNotEqualTo(Integer value) {
            addCriterion("event_commentspermission <>", value, "eventCommentspermission");
            return (Criteria) this;
        }

        public Criteria andEventCommentspermissionGreaterThan(Integer value) {
            addCriterion("event_commentspermission >", value, "eventCommentspermission");
            return (Criteria) this;
        }

        public Criteria andEventCommentspermissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_commentspermission >=", value, "eventCommentspermission");
            return (Criteria) this;
        }

        public Criteria andEventCommentspermissionLessThan(Integer value) {
            addCriterion("event_commentspermission <", value, "eventCommentspermission");
            return (Criteria) this;
        }

        public Criteria andEventCommentspermissionLessThanOrEqualTo(Integer value) {
            addCriterion("event_commentspermission <=", value, "eventCommentspermission");
            return (Criteria) this;
        }

        public Criteria andEventCommentspermissionIn(List<Integer> values) {
            addCriterion("event_commentspermission in", values, "eventCommentspermission");
            return (Criteria) this;
        }

        public Criteria andEventCommentspermissionNotIn(List<Integer> values) {
            addCriterion("event_commentspermission not in", values, "eventCommentspermission");
            return (Criteria) this;
        }

        public Criteria andEventCommentspermissionBetween(Integer value1, Integer value2) {
            addCriterion("event_commentspermission between", value1, value2, "eventCommentspermission");
            return (Criteria) this;
        }

        public Criteria andEventCommentspermissionNotBetween(Integer value1, Integer value2) {
            addCriterion("event_commentspermission not between", value1, value2, "eventCommentspermission");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStartNumIsNull() {
            addCriterion("start_num is null");
            return (Criteria) this;
        }

        public Criteria andStartNumIsNotNull() {
            addCriterion("start_num is not null");
            return (Criteria) this;
        }

        public Criteria andStartNumEqualTo(Integer value) {
            addCriterion("start_num =", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumNotEqualTo(Integer value) {
            addCriterion("start_num <>", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumGreaterThan(Integer value) {
            addCriterion("start_num >", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_num >=", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumLessThan(Integer value) {
            addCriterion("start_num <", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumLessThanOrEqualTo(Integer value) {
            addCriterion("start_num <=", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumIn(List<Integer> values) {
            addCriterion("start_num in", values, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumNotIn(List<Integer> values) {
            addCriterion("start_num not in", values, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumBetween(Integer value1, Integer value2) {
            addCriterion("start_num between", value1, value2, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumNotBetween(Integer value1, Integer value2) {
            addCriterion("start_num not between", value1, value2, "startNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumIsNull() {
            addCriterion("collect_num is null");
            return (Criteria) this;
        }

        public Criteria andCollectNumIsNotNull() {
            addCriterion("collect_num is not null");
            return (Criteria) this;
        }

        public Criteria andCollectNumEqualTo(Integer value) {
            addCriterion("collect_num =", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumNotEqualTo(Integer value) {
            addCriterion("collect_num <>", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumGreaterThan(Integer value) {
            addCriterion("collect_num >", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_num >=", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumLessThan(Integer value) {
            addCriterion("collect_num <", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumLessThanOrEqualTo(Integer value) {
            addCriterion("collect_num <=", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumIn(List<Integer> values) {
            addCriterion("collect_num in", values, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumNotIn(List<Integer> values) {
            addCriterion("collect_num not in", values, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumBetween(Integer value1, Integer value2) {
            addCriterion("collect_num between", value1, value2, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_num not between", value1, value2, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNull() {
            addCriterion("comment_num is null");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNotNull() {
            addCriterion("comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNumEqualTo(Integer value) {
            addCriterion("comment_num =", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotEqualTo(Integer value) {
            addCriterion("comment_num <>", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThan(Integer value) {
            addCriterion("comment_num >", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_num >=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThan(Integer value) {
            addCriterion("comment_num <", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThanOrEqualTo(Integer value) {
            addCriterion("comment_num <=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIn(List<Integer> values) {
            addCriterion("comment_num in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotIn(List<Integer> values) {
            addCriterion("comment_num not in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumBetween(Integer value1, Integer value2) {
            addCriterion("comment_num between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_num not between", value1, value2, "commentNum");
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