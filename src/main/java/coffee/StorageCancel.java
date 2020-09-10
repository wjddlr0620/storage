package coffee;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="StorageCancel_table")
public class StorageCancel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long storageCancelId;
    private Long requestId;
    private String storageStatus;

    @PostPersist
    public void onPostPersist(){
        StorageCanceled storageCanceled = new StorageCanceled();
        BeanUtils.copyProperties(this, storageCanceled);
        storageCanceled.publishAfterCommit();


    }


    public Long getStorageCancelId() {
        return storageCancelId;
    }

    public void setStorageCancelId(Long storageCancelId) {
        this.storageCancelId = storageCancelId;
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
