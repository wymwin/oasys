package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Oanotice {
    private long id;
    private String title;
    private String content;
    private String author;
    private Time releasedate;
    private String state;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "CONTENT", nullable = true, length = 500)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "AUTHOR", nullable = true, length = 50)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "RELEASEDATE", nullable = true)
    public Time getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Time releasedate) {
        this.releasedate = releasedate;
    }

    @Basic
    @Column(name = "STATE", nullable = true, length = 50)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oanotice oanotice = (Oanotice) o;
        return id == oanotice.id &&
                Objects.equals(title, oanotice.title) &&
                Objects.equals(content, oanotice.content) &&
                Objects.equals(author, oanotice.author) &&
                Objects.equals(releasedate, oanotice.releasedate) &&
                Objects.equals(state, oanotice.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, author, releasedate, state);
    }
}
