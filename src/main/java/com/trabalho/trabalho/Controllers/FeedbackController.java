package com.trabalho.trabalho.Controllers;

import com.trabalho.trabalho.Models.Services.FeedbackService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.trabalho.trabalho.Models.Feedback;

@RestController
@RequestMapping
public class FeedbackController extends Controller<Feedback, FeedbackService> {
    public FeedbackController(FeedbackService feedback) {
        super(feedback);
    }
}
