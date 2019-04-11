package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Oarole {
    private long id;
    private String rolename;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ROLENAME", nullable = true, length = 50)
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oarole oarole = (Oarole) o;
        return id == oarole.id &&
                Objects.equals(rolename, oarole.rolename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rolename);
    }
}
