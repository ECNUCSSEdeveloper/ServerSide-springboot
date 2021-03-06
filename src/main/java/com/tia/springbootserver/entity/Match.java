package com.tia.springbootserver.entity;

import org.springframework.context.annotation.Bean;

import java.util.Date;

public class Match {
    private Integer matchId;

    private String matchName;

    private String matchDescription;

    private String matchRequirements;

    private String time;

    private String place;

    private Date deadline;

    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName == null ? null : matchName.trim();
    }

    public String getMatchDescription() {
        return matchDescription;
    }

    public void setMatchDescription(String matchDescription) {
        this.matchDescription = matchDescription == null ? null : matchDescription.trim();
    }

    public String getMatchRequirements() {
        return matchRequirements;
    }

    public void setMatchRequirements(String matchRequirements) {
        this.matchRequirements = matchRequirements == null ? null : matchRequirements.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", matchId=").append(matchId);
        sb.append(", matchName=").append(matchName);
        sb.append(", matchDescription=").append(matchDescription);
        sb.append(", matchRequirements=").append(matchRequirements);
        sb.append(", time=").append(time);
        sb.append(", place=").append(place);
        sb.append(", deadline=").append(deadline);
        sb.append("]");
        return sb.toString();
    }
}