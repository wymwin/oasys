package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Oacar {
    private long id;
    private String username;
    private String driver;
    private String entourage;
    private String usedept;
    private Time startdate;
    private Time enddate;
    private String destination;
    private Long mileage;
    private String why;
    private String state;
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
    @Column(name = "DRIVER", nullable = true, length = 50)
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Basic
    @Column(name = "ENTOURAGE", nullable = true, length = 50)
    public String getEntourage() {
        return entourage;
    }

    public void setEntourage(String entourage) {
        this.entourage = entourage;
    }

    @Basic
    @Column(name = "USEDEPT", nullable = true, length = 50)
    public String getUsedept() {
        return usedept;
    }

    public void setUsedept(String usedept) {
        this.usedept = usedept;
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
    @Column(name = "DESTINATION", nullable = true, length = 50)
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Basic
    @Column(name = "MILEAGE", nullable = true, precision = 2)
    public Long getMileage() {
        return mileage;
    }

    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    @Basic
    @Column(name = "WHY", nullable = true, length = 50)
    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    @Basic
    @Column(name = "STATE", nullable = true, length = 50)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
        Oacar oacar = (Oacar) o;
        return id == oacar.id &&
                Objects.equals(username, oacar.username) &&
                Objects.equals(driver, oacar.driver) &&
                Objects.equals(entourage, oacar.entourage) &&
                Objects.equals(usedept, oacar.usedept) &&
                Objects.equals(startdate, oacar.startdate) &&
                Objects.equals(enddate, oacar.enddate) &&
                Objects.equals(destination, oacar.destination) &&
                Objects.equals(mileage, oacar.mileage) &&
                Objects.equals(why, oacar.why) &&
                Objects.equals(state, oacar.state) &&
                Objects.equals(checkman, oacar.checkman);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, driver, entourage, usedept, startdate, enddate, destination, mileage, why, state, checkman);
    }
}
