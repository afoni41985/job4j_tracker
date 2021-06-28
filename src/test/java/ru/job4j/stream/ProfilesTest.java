package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ProfilesTest {

    @Test
    public void whenCollectSuccessful() {
        Profiles prof = new Profiles();
        List<Profile> profiles = List.of(
                new Profile(new Address("a", "b", 1, 2)),
                new Profile(new Address("c", "d", 3, 4)),
                new Profile(new Address("g", "j", 5, 6)),
                new Profile(new Address("k", "k", 7, 8))
        );
        List<Address> expected = List.of(
                new Address("a", "b", 1, 2),
                new Address("c", "d", 3, 4),
                new Address("g", "j", 5, 6),
                new Address("k", "k", 7, 8)
        );
        List<Address> rsl = prof.collect(profiles);
        Assert.assertEquals(rsl, expected);
    }
}
