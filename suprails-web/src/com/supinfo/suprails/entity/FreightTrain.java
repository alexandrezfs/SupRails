package com.supinfo.suprails.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Alexandre NGUYEN on 13/10/2014.
 */

@Entity
@DiscriminatorValue("freight")
public class FreightTrain extends Train {

    private Long maxWeight;

    public Long getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Long maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        FreightTrain that = (FreightTrain) o;

        if (maxWeight != null ? !maxWeight.equals(that.maxWeight) : that.maxWeight != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (maxWeight != null ? maxWeight.hashCode() : 0);
        return result;
    }
}
