package com.job_portal.job.service;

import com.job_portal.job.model.Job;
import com.job_portal.job.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepo jobRepo;

    public List<Job> getJobs()
    {
        return jobRepo.getJobs();
    }

    public void addJob(Job job)
    {
        jobRepo.addJob(job);
    }
}
