package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Oacuweb {
    private long id;
    private String webname;
    private String webloc;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "WEBNAME", nullable = true, length = 50)
    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname;
    }

    @Basic
    @Column(name = "WEBLOC", nullable = true, length = 100)
    public String getWebloc() {
        return webloc;
    }

    public void setWebloc(String webloc) {
        this.webloc = webloc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oacuweb oacuweb = (Oacuweb) o;
        return id == oacuweb.id &&
                Objects.equals(webname, oacuweb.webname) &&
                Objects.equals(webloc, oacuweb.webloc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, webname, webloc);
    }
}
