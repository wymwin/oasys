package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Oameeting {
    private long id;
    private String roomname;
    private String roomstate;
    private Time startdate;
    private Time enddate;
    private String roomuse;
    private String recorder;
    private String reservationman;
    private Time reservationdate;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ROOMNAME", nullable = true, length = 50)
    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    @Basic
    @Column(name = "ROOMSTATE", nullable = true, length = 50)
    public String getRoomstate() {
        return roomstate;
    }

    public void setRoomstate(String roomstate) {
        this.roomstate = roomstate;
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
    @Column(name = "ROOMUSE", nullable = true, length = 50)
    public String getRoomuse() {
        return roomuse;
    }

    public void setRoomuse(String roomuse) {
        this.roomuse = roomuse;
    }

    @Basic
    @Column(name = "RECORDER", nullable = true, length = 50)
    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    @Basic
    @Column(name = "RESERVATIONMAN", nullable = true, length = 50)
    public String getReservationman() {
        return reservationman;
    }

    public void setReservationman(String reservationman) {
        this.reservationman = reservationman;
    }

    @Basic
    @Column(name = "RESERVATIONDATE", nullable = true)
    public Time getReservationdate() {
        return reservationdate;
    }

    public void setReservationdate(Time reservationdate) {
        this.reservationdate = reservationdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oameeting oameeting = (Oameeting) o;
        return id == oameeting.id &&
                Objects.equals(roomname, oameeting.roomname) &&
                Objects.equals(roomstate, oameeting.roomstate) &&
                Objects.equals(startdate, oameeting.startdate) &&
                Objects.equals(enddate, oameeting.enddate) &&
                Objects.equals(roomuse, oameeting.roomuse) &&
                Objects.equals(recorder, oameeting.recorder) &&
                Objects.equals(reservationman, oameeting.reservationman) &&
                Objects.equals(reservationdate, oameeting.reservationdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roomname, roomstate, startdate, enddate, roomuse, recorder, reservationman, reservationdate);
    }
}
