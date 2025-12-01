package com.trabalho.trabalho.Models.Services;

import com.trabalho.trabalho.Models.Feedback;
import com.trabalho.trabalho.Models.FeedbackRepository;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService extends BaseService<Feedback, FeedbackRepository> {
    public FeedbackService(FeedbackRepository feedbackRepository) {
        super(feedbackRepository);
    }
}
