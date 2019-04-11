package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Oaevection {
    private long id;
    private String username;
    private String deptname;
    private Time startdate;
    private Time enddate;
    private String holidaytype;
    private String holidayreason;
    private String checkstate;
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
    @Column(name = "DEPTNAME", nullable = true, length = 50)
    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Basic
    @Column(name = "STARTDATE", nullable = true)
    public Time getStartdate() {
        return startdate;
    }

    public void setStartdate(Time startdate) {
        this.startdate = startdate;
    }

    @Basic
    @Column(name = "ENDDATE", nullable = true)
    public Time getEnddate() {
        return enddate;
    }

    public void setEnddate(Time enddate) {
        this.enddate = enddate;
    }

    @Basic
    @Column(name = "HOLIDAYTYPE", nullable = true, length = 50)
    public String getHolidaytype() {
        return holidaytype;
    }

    public void setHolidaytype(String holidaytype) {
        this.holidaytype = holidaytype;
    }

    @Basic
    @Column(name = "HOLIDAYREASON", nullable = true, length = 50)
    public String getHolidayreason() {
        return holidayreason;
    }

    public void setHolidayreason(String holidayreason) {
        this.holidayreason = holidayreason;
    }

    @Basic
    @Column(name = "CHECKSTATE", nullable = true, length = 50)
    public String getCheckstate() {
        return checkstate;
    }

    public void setCheckstate(String checkstate) {
        this.checkstate = checkstate;
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
        Oaevection that = (Oaevection) o;
        return id == that.id &&
                Objects.equals(username, that.username) &&
                Objects.equals(deptname, that.deptname) &&
                Objects.equals(startdate, that.startdate) &&
                Objects.equals(enddate, that.enddate) &&
                Objects.equals(holidaytype, that.holidaytype) &&
                Objects.equals(holidayreason, that.holidayreason) &&
                Objects.equals(checkstate, that.checkstate) &&
                Objects.equals(checkman, that.checkman);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, deptname, startdate, enddate, holidaytype, holidayreason, checkstate, checkman);
    }
}
