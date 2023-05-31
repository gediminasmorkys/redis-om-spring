package com.redis.om.spring.annotations.document.fixtures;

import com.redis.om.spring.repository.RedisDocumentRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface SKUCacheRepository extends RedisDocumentRepository<SKU, String> {

  Optional<SKU> findOneBySkuNumber(String skuNumber);

  List<SKU> findAllBySkuNumberIn(Set<String> skuNumbers);

  List<SKU> findAllBySkuNameIn(Set<String> dearSkuNumbers);
}
