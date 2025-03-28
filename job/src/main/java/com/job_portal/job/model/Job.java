package com.job_portal.job.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Job {

    private int jobId;

    @JsonProperty("postDesc")
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;
}
