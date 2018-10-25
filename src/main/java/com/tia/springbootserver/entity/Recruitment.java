package com.tia.springbootserver.entity;
public class Recruitment {
    private Integer recruitId;

    private String recruitName;

    private String recruitDescription;

    private String recruitRequirements;

    private Integer registeredNumber;

    private Integer matchId;

    private String studentId;

    public Integer getRecruitId() {
        return recruitId;
    }

    public void setRecruitId(Integer recruitId) {
        this.recruitId = recruitId;
    }

    public String getRecruitName() {
        return recruitName;
    }

    public void setRecruitName(String recruitName) {
        this.recruitName = recruitName == null ? null : recruitName.trim();
    }

    public String getRecruitDescription() {
        return recruitDescription;
    }

    public void setRecruitDescription(String recruitDescription) {
        this.recruitDescription = recruitDescription == null ? null : recruitDescription.trim();
    }

    public String getRecruitRequirements() {
        return recruitRequirements;
    }

    public void setRecruitRequirements(String recruitRequirements) {
        this.recruitRequirements = recruitRequirements == null ? null : recruitRequirements.trim();
    }

    public Integer getRegisteredNumber() {
        return registeredNumber;
    }

    public void setRegisteredNumber(Integer registeredNumber) {
        this.registeredNumber = registeredNumber;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recruitId=").append(recruitId);
        sb.append(", recruitName=").append(recruitName);
        sb.append(", recruitDescription=").append(recruitDescription);
        sb.append(", recruitRequirements=").append(recruitRequirements);
        sb.append(", registeredNumber=").append(registeredNumber);
        sb.append(", matchId=").append(matchId);
        sb.append(", studentId=").append(studentId);
        sb.append("]");
        return sb.toString();
    }
}