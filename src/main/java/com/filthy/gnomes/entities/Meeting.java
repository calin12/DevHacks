package com.filthy.gnomes.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "MEETING")
public class Meeting {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEETING_SEQ_GEN")
    @SequenceGenerator(name = "MEETING_SEQ_GEN", sequenceName = "MEETING_ID_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "EMPLOYEE")
    private String employee;

    @Column(name = "CODE")
    private String code;

    @ManyToOne
    @JoinColumn(name = "ROOM_ID")
    private Room room;

    @Column(name = "TIME_END")
    private LocalDateTime timeEnd;

    @Column(name = "TIME_BEGIN")
    private LocalDateTime timeBegin;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID")
    private Company company;

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDateTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalDateTime timeEnd) {
        this.timeEnd = timeEnd;
    }

    public LocalDateTime getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(LocalDateTime timeBegin) {
        this.timeBegin = timeBegin;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Meeting(String employee, String code, Room location, LocalDateTime timeEnd, LocalDateTime timeBegin, Company company) {
        this.employee = employee;
        this.code = code;
        this.room = location;
        this.timeEnd = timeEnd;
        this.timeBegin = timeBegin;
        this.company = company;
    }

    public Meeting() {
    }
}
