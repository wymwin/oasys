package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Oadept {
    private long id;
    private String name;
    private String header;
    private String phone;
    private String mobile;
    private String fax;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "HEADER", nullable = true, length = 50)
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
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
    @Column(name = "MOBILE", nullable = true, length = 11)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "FAX", nullable = true, length = 20)
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oadept oadept = (Oadept) o;
        return id == oadept.id &&
                Objects.equals(name, oadept.name) &&
                Objects.equals(header, oadept.header) &&
                Objects.equals(phone, oadept.phone) &&
                Objects.equals(mobile, oadept.mobile) &&
                Objects.equals(fax, oadept.fax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, header, phone, mobile, fax);
    }
}
