package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Oabook {
    private long id;
    private String bookname;
    private String state;
    private String borrower;
    private String borrowdapt;
    private Time borrowdate;
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
    @Column(name = "BOOKNAME", nullable = true, length = 50)
    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
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
    @Column(name = "BORROWER", nullable = true, length = 50)
    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    @Basic
    @Column(name = "BORROWDAPT", nullable = true, length = 50)
    public String getBorrowdapt() {
        return borrowdapt;
    }

    public void setBorrowdapt(String borrowdapt) {
        this.borrowdapt = borrowdapt;
    }

    @Basic
    @Column(name = "BORROWDATE", nullable = true)
    public Time getBorrowdate() {
        return borrowdate;
    }

    public void setBorrowdate(Time borrowdate) {
        this.borrowdate = borrowdate;
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
        Oabook oabook = (Oabook) o;
        return id == oabook.id &&
                Objects.equals(bookname, oabook.bookname) &&
                Objects.equals(state, oabook.state) &&
                Objects.equals(borrower, oabook.borrower) &&
                Objects.equals(borrowdapt, oabook.borrowdapt) &&
                Objects.equals(borrowdate, oabook.borrowdate) &&
                Objects.equals(checkman, oabook.checkman);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookname, state, borrower, borrowdapt, borrowdate, checkman);
    }
}
