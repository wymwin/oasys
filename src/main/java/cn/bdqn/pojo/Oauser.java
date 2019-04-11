package cn.bdqn.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "OAUSER")
public class Oauser implements Serializable{
    private Long id;
    private String username;
    private String password;
    private String realname;
    private Long roleid;
    private Long deptno;
    private String position;
    private String state;
    private String pictrue;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
    @Column(name = "PASSWORD", nullable = true, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "REALNAME", nullable = true, length = 50)
    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Basic
    @Column(name = "ROLEID", nullable = true, precision = 0)
    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    @Basic
    @Column(name = "DEPTNO", nullable = true, precision = 0)
    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    @Basic
    @Column(name = "POSITION", nullable = true, length = 50)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
    @Column(name = "PICTRUE", nullable = true, length = 100)
    public String getPictrue() {
        return pictrue;
    }

    public void setPictrue(String pictrue) {
        this.pictrue = pictrue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oauser oauser = (Oauser) o;
        return id == oauser.id &&
                Objects.equals(username, oauser.username) &&
                Objects.equals(password, oauser.password) &&
                Objects.equals(realname, oauser.realname) &&
                Objects.equals(roleid, oauser.roleid) &&
                Objects.equals(deptno, oauser.deptno) &&
                Objects.equals(position, oauser.position) &&
                Objects.equals(state, oauser.state) &&
                Objects.equals(pictrue, oauser.pictrue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, realname, roleid, deptno, position, state, pictrue);
    }
}
