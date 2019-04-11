package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Oaseal {
    private long id;
    private String username;
    private String borrowdate;
    private String borrowerdept;
    private String borrowertype;
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
    @Column(name = "BORROWDATE", nullable = true, length = 50)
    public String getBorrowdate() {
        return borrowdate;
    }

    public void setBorrowdate(String borrowdate) {
        this.borrowdate = borrowdate;
    }

    @Basic
    @Column(name = "BORROWERDEPT", nullable = true, length = 50)
    public String getBorrowerdept() {
        return borrowerdept;
    }

    public void setBorrowerdept(String borrowerdept) {
        this.borrowerdept = borrowerdept;
    }

    @Basic
    @Column(name = "BORROWERTYPE", nullable = true, length = 50)
    public String getBorrowertype() {
        return borrowertype;
    }

    public void setBorrowertype(String borrowertype) {
        this.borrowertype = borrowertype;
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
        Oaseal oaseal = (Oaseal) o;
        return id == oaseal.id &&
                Objects.equals(username, oaseal.username) &&
                Objects.equals(borrowdate, oaseal.borrowdate) &&
                Objects.equals(borrowerdept, oaseal.borrowerdept) &&
                Objects.equals(borrowertype, oaseal.borrowertype) &&
                Objects.equals(why, oaseal.why) &&
                Objects.equals(checkman, oaseal.checkman);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, borrowdate, borrowerdept, borrowertype, why, checkman);
    }
}
