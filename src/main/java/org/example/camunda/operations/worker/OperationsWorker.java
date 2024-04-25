package org.example.camunda.operations.worker;

import java.util.Map;

import org.example.camunda.operations.service.OperationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.Variable;

@Component
public class OperationsWorker {

  private static final Logger LOG = LoggerFactory.getLogger(OperationsWorker.class);

  private final OperationService operationsService;

  public OperationsWorker(OperationService operationsService) {
    this.operationsService = operationsService;
  }

  @JobWorker
  public Map<String, String> base64encode(@Variable String fileContent) {
    
    return Map.of("fileContent","", "base64content", operationsService.base64encode(fileContent));
  }
}
