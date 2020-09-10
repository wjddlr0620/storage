package coffee;

import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.List;

public interface StorageOrderRepository extends PagingAndSortingRepository<StorageOrder, Long>{

    List<StorageOrder> findByRequestId(Long requestId);

}