package com.supinfo.suprails.entity;

import javax.persistence.*;

/**
 * Created by Alexandre NGUYEN on 13/10/2014.
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "train_type")
public abstract class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Traction traction;

    private Long max_speed;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Traction getTraction() {
        return traction;
    }

    public void setTraction(Traction traction) {
        this.traction = traction;
    }

    public Long getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(Long max_speed) {
        this.max_speed = max_speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Train train = (Train) o;

        if (id != null ? !id.equals(train.id) : train.id != null) return false;
        if (max_speed != null ? !max_speed.equals(train.max_speed) : train.max_speed != null) return false;
        if (traction != train.traction) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (traction != null ? traction.hashCode() : 0);
        result = 31 * result + (max_speed != null ? max_speed.hashCode() : 0);
        return result;
    }
}
