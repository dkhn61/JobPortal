package com.job_portal.job;

import com.job_portal.job.model.Job;
import com.job_portal.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobService jobService;

    @GetMapping("jobs")
    ResponseEntity<List<Job>> getJobs() {
        return ResponseEntity.ok(jobService.getJobs());
    }

    @PostMapping("addJob")
    ResponseEntity<Job> postJob(@RequestBody Job job) {
        jobService.addJob(job);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
