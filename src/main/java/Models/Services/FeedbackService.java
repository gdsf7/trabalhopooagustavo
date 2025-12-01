package Models.Services;

import Models.Feedback;
import Models.FeedbackRepository;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService extends BaseService<Feedback, FeedbackRepository> {
    public FeedbackService(FeedbackRepository feedbackRepository) {
        super(feedbackRepository);
    }
}
