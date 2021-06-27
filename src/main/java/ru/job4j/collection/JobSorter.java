package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> job = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1)
        );
        System.out.println(job);
        Collections.sort(job);
        System.out.println(job);
        Collections.sort(job, new SortByNameJob());
        System.out.println(job);

        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        jobs.sort(new SortByNameDown().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        Comparator<Job> compareName = Comparator.comparing(Job::getName);
        Comparator<Job> comparePriority = Comparator.comparing(Job::getPriority);
        Comparator<Job> combine = compareName.thenComparing(comparePriority);
        jobs.sort(combine);
    }
}