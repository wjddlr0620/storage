package coffee;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="StorageOrder_table")
public class StorageOrder {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long storageOrderId;
    private Long requestId;
    private String storageStatus;

    @PostPersist
    public void onPostPersist(){
        StorageOrdered storageOrdered = new StorageOrdered();
        BeanUtils.copyProperties(this, storageOrdered);
        storageOrdered.publishAfterCommit();


    }


    public Long getStorageOrderId() {
        return storageOrderId;
    }

    public void setStorageOrderId(Long storageOrderId) {
        this.storageOrderId = storageOrderId;
    }
    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }
    public String getStorageStatus() {
        return storageStatus;
    }

    public void setStorageStatus(String storageStatus) {
        this.storageStatus = storageStatus;
    }




}
