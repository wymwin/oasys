package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Oacalendar {
    private long id;
    private String theme;
    private Time startdate;
    private Time enddate;
    private Long type;
    private String loc;
    private Long ispublic;
    private Long isdepartmentdates;
    private Long userid;
    private String datescontent;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "THEME", nullable = true, length = 50)
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
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
    @Column(name = "TYPE", nullable = true, precision = 0)
    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    @Basic
    @Column(name = "LOC", nullable = true, length = 50)
    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Basic
    @Column(name = "ISPUBLIC", nullable = true, precision = 0)
    public Long getIspublic() {
        return ispublic;
    }

    public void setIspublic(Long ispublic) {
        this.ispublic = ispublic;
    }

    @Basic
    @Column(name = "ISDEPARTMENTDATES", nullable = true, precision = 0)
    public Long getIsdepartmentdates() {
        return isdepartmentdates;
    }

    public void setIsdepartmentdates(Long isdepartmentdates) {
        this.isdepartmentdates = isdepartmentdates;
    }

    @Basic
    @Column(name = "USERID", nullable = true, precision = 0)
    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "DATESCONTENT", nullable = true, length = 50)
    public String getDatescontent() {
        return datescontent;
    }

    public void setDatescontent(String datescontent) {
        this.datescontent = datescontent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oacalendar that = (Oacalendar) o;
        return id == that.id &&
                Objects.equals(theme, that.theme) &&
                Objects.equals(startdate, that.startdate) &&
                Objects.equals(enddate, that.enddate) &&
                Objects.equals(type, that.type) &&
                Objects.equals(loc, that.loc) &&
                Objects.equals(ispublic, that.ispublic) &&
                Objects.equals(isdepartmentdates, that.isdepartmentdates) &&
                Objects.equals(userid, that.userid) &&
                Objects.equals(datescontent, that.datescontent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, theme, startdate, enddate, type, loc, ispublic, isdepartmentdates, userid, datescontent);
    }
}
