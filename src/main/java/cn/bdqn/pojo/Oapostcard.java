package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Oapostcard {
    private long id;
    private String username;
    private Time applydate;
    private String applydept;
    private String postion;
    private String mobile;
    private String phone;
    private Long sum;
    private String note;
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
    @Column(name = "APPLYDEPT", nullable = true, length = 50)
    public String getApplydept() {
        return applydept;
    }

    public void setApplydept(String applydept) {
        this.applydept = applydept;
    }

    @Basic
    @Column(name = "POSTION", nullable = true, length = 50)
    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    @Basic
    @Column(name = "MOBILE", nullable = true, length = 11)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "PHONE", nullable = true, length = 20)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "SUM", nullable = true, precision = 0)
    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    @Basic
    @Column(name = "NOTE", nullable = true, length = 50)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
        Oapostcard that = (Oapostcard) o;
        return id == that.id &&
                Objects.equals(username, that.username) &&
                Objects.equals(applydate, that.applydate) &&
                Objects.equals(applydept, that.applydept) &&
                Objects.equals(postion, that.postion) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(sum, that.sum) &&
                Objects.equals(note, that.note) &&
                Objects.equals(checkman, that.checkman);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, applydate, applydept, postion, mobile, phone, sum, note, checkman);
    }
}
