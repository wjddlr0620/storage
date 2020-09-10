package coffee;

public class StorageCanceled extends AbstractEvent {

    private Long storageCancelId;
    private Long requestId;
    private String storageStatus;    

    public StorageCanceled(){
        super();
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
