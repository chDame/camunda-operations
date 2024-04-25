package org.example.camunda.operations.service;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Service;

@Service
public class OperationService {

  public String base64encode(String content) {
    return Base64.encodeBase64String(content.getBytes(StandardCharsets.UTF_8));
  }
}
