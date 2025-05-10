package klu.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.stereotype.Service;

import com.google.gson.GsonBuilder;

import klu.repository.JobsRepository;

@Service
public class JobsManager {

    @Autowired
    private JobsRepository JR;

    // Create a new job
    public String createJob(Jobs J) {
        try {
            JR.save(J); // Fixed: changed from saveAll() to save()
            return "200::New job has been created";
        } catch (Exception e) {
            return "400::" + e.getMessage();
        }
    }

    // Read all jobs
    public String readJobs() {
        try {
            List<Jobs> jobsList = JR.findAll(); // Fixed: use correct entity type (Jobs, not Job)
            return new GsonBuilder().create().toJson(jobsList);
        } catch (Exception e) {
            return "400::" + e.getMessage();
        }
    }

    // Get a job by ID
    public String getData(Long id) {
        try {
            Optional<Job> jobOptional = Optional.empty();
            if (jobOptional.isPresent()) {
                return new GsonBuilder().create().toJson(jobOptional.get());
            } else {
                return "404::Job not found";
            }
        } catch (Exception e) {
            return "404::" + e.getMessage();
        }
    }

    // Update an existing job
    public String updateJob(Jobs J) {
        try {
            JR.save(J);
            return "200::Job details have been updated";
        } catch (Exception e) {
            return "400::" + e.getMessage();
        }
    }

    // Delete a job by ID
    public String deleteJob(Long id) {
        try {
            JR.deleteById(id);
            return "200::Job details have been deleted";
        } catch (Exception e) {
            return "400::" + e.getMessage();
        }
    }
}
