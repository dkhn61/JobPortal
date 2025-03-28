package com.job_portal.job.repo;

import com.job_portal.job.model.Job;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<Job> jobs = new ArrayList<>();
    JobRepo()
    {
        Job job1 = new Job(1, "Full Stack Software Engineering", 4, Arrays.asList("React", "Node.js"));
        Job job2 = new Job(2, "Backend Developer", 6, Arrays.asList("Java", "Python"));
        Job job3 = new Job(3, "DevOps", 5, Arrays.asList("Terraform", "Ansible"));
        Job job4 = new Job(4, "AWS Cloud Specialist", 5, Arrays.asList("Ec2", "AWS Lambda"));

        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);
        jobs.add(job4);
    }

    public List<Job> getJobs()
    {
        return jobs;
    }

    public void addJob(Job job)
    {
        this.jobs.add(job);
    }

}
