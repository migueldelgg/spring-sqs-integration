package migueldelgado.sqs.producer;

import io.awspring.cloud.sqs.operations.SendResult;
import io.awspring.cloud.sqs.operations.SqsTemplate;
import migueldelgado.sqs.consumer.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sqs")
public class ProducerController {

    @Autowired
    private SqsTemplate sqsTemplate;

    @PostMapping("/send-message")
    public SendResult<String> execute(@RequestBody Message message) {
        var SQS = "https://localhost.localstack.cloud:4566/000000000000/my-queue";
        return sqsTemplate.send(SQS, message.content());
    }

}
