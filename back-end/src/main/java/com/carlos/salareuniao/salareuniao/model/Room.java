package com.carlos.salareuniao.salareuniao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name="meetingroom")
@Data
@NoArgsConstructor
public class Room {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private  String date;

    @Column(name = "startHour", nullable = false)
    private  String startHour;

    @Column(name = "endHour", nullable = false)
    private  String endHour;

    public  Room(long id, String name, String date, String startHour, String endHour){
        this.id = id;
        this.name = name;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
    }
}
