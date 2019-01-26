package com.webservice.queue.repository;

import com.webservice.queue.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item> findByDepartmentCodeAndOperationIndexAndCodeStatusOrderByQueueNo(int departmentCode, String operationIndex, int codeStatus);
}