package coffee;

public class StorageOrdered extends AbstractEvent {

    private Long storageOrderId;
    private Long requestId;
    private String storageStatus;    

    public StorageOrdered(){
        super();
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
