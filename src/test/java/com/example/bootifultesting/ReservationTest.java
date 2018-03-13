package com.example.bootifultesting;

import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class ReservationTest {

    @Test
    public void creation() {
        Reservation r = new Reservation(1L, "Jane");
        Assert.assertEquals((Long) 1L, r.getId());
        Assert.assertThat(r.getId(), Matchers.equalTo(1L));
        Assertions.assertThat(r.getId()).isEqualTo(1L);
        Assertions.assertThat(r.getId()).isNotNull();
        Assertions.assertThat(r.getReservationName()).isEqualTo("Jane");

    }
}
