package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Oathing {
    private long id;
    private String type;
    private String title;
    private String initiator;
    private Long checkman;
    private String checkstate;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TYPE", nullable = true, length = 50)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "TITLE", nullable = true, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "INITIATOR", nullable = true, length = 50)
    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    @Basic
    @Column(name = "CHECKMAN", nullable = true, precision = 0)
    public Long getCheckman() {
        return checkman;
    }

    public void setCheckman(Long checkman) {
        this.checkman = checkman;
    }

    @Basic
    @Column(name = "CHECKSTATE", nullable = true, length = 50)
    public String getCheckstate() {
        return checkstate;
    }

    public void setCheckstate(String checkstate) {
        this.checkstate = checkstate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oathing oathing = (Oathing) o;
        return id == oathing.id &&
                Objects.equals(type, oathing.type) &&
                Objects.equals(title, oathing.title) &&
                Objects.equals(initiator, oathing.initiator) &&
                Objects.equals(checkman, oathing.checkman) &&
                Objects.equals(checkstate, oathing.checkstate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, title, initiator, checkman, checkstate);
    }
}
