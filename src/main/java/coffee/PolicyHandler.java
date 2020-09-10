package coffee;

import coffee.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString){

    }

    @Autowired
    private StorageOrderRepository storageOrderRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverMade_StorageOrder(@Payload Made made){

        if(made.isMe()){
            System.out.println("##### listener StorageOrder : " + made.toJson());
        
            StorageOrder storageOrder = new StorageOrder();
            storageOrder.setRequestId(made.getRequestId());
            storageOrder.setStorageStatus(made.getStatus());
            storageOrderRepository.save(storageOrder);
        }
    }

}
