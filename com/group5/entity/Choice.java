package entity;

public class Choice {
    private Integer id;

    private Integer ageMax;

    private Integer ageMin;

    private Float salaryMax;

    private Float salaryMin;

    private Float heightMax;

    private Float heightMin;

    private Integer eduId;

    private String situation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(Integer ageMax) {
        this.ageMax = ageMax;
    }

    public Integer getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(Integer ageMin) {
        this.ageMin = ageMin;
    }

    public Float getSalaryMax() {
        return salaryMax;
    }

    public void setSalaryMax(Float salaryMax) {
        this.salaryMax = salaryMax;
    }

    public Float getSalaryMin() {
        return salaryMin;
    }

    public void setSalaryMin(Float salaryMin) {
        this.salaryMin = salaryMin;
    }

    public Float getHeightMax() {
        return heightMax;
    }

    public void setHeightMax(Float heightMax) {
        this.heightMax = heightMax;
    }

    public Float getHeightMin() {
        return heightMin;
    }

    public void setHeightMin(Float heightMin) {
        this.heightMin = heightMin;
    }

    public Integer getEduId() {
        return eduId;
    }

    public void setEduId(Integer eduId) {
        this.eduId = eduId;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation == null ? null : situation.trim();
    }
}