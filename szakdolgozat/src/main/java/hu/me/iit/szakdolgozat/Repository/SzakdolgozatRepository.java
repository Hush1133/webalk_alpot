package hu.me.iit.szakdolgozat.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface SzakdolgozatRepository extends PagingAndSortingRepository<SzakdolgozatEntity, Long> {
    List<SzakdolgozatEntity> findByCimEquals(String cim);
}
