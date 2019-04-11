package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Oaincome {
    private long id;
    private String username;
    private Time applydate;
    private String deptname;
    private String jobs;
    private String why;
    private Long checkman;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USERNAME", nullable = true, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "APPLYDATE", nullable = true)
    public Time getApplydate() {
        return applydate;
    }

    public void setApplydate(Time applydate) {
        this.applydate = applydate;
    }

    @Basic
    @Column(name = "DEPTNAME", nullable = true, length = 50)
    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Basic
    @Column(name = "JOBS", nullable = true, length = 50)
    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    @Basic
    @Column(name = "WHY", nullable = true, length = 100)
    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    @Basic
    @Column(name = "CHECKMAN", nullable = true, precision = 0)
    public Long getCheckman() {
        return checkman;
    }

    public void setCheckman(Long checkman) {
        this.checkman = checkman;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oaincome oaincome = (Oaincome) o;
        return id == oaincome.id &&
                Objects.equals(username, oaincome.username) &&
                Objects.equals(applydate, oaincome.applydate) &&
                Objects.equals(deptname, oaincome.deptname) &&
                Objects.equals(jobs, oaincome.jobs) &&
                Objects.equals(why, oaincome.why) &&
                Objects.equals(checkman, oaincome.checkman);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, applydate, deptname, jobs, why, checkman);
    }
}
