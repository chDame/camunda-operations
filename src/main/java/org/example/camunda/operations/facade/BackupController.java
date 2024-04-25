package org.example.camunda.operations.facade;

import org.example.camunda.operations.model.BackupsVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.camunda.zeebe.client.ZeebeClient;

@RestController
@RequestMapping("/bakcups")
public class BackupController {

  private static final Logger LOG = LoggerFactory.getLogger(BackupController.class);
  private final ZeebeClient zeebe;
  private static BackupsVariables backupVariables = new BackupsVariables();

  public BackupController(ZeebeClient client) {
    this.zeebe = client;
  }

  @PostMapping("/start")
  public void start() {

    zeebe
        .newCreateInstanceCommand()
        .bpmnProcessId("backup")
        .latestVersion()
        .variables(backupVariables)
        .send();
  }
  
  @GetMapping("/config")
  public BackupsVariables getCicdConfig() {
      return backupVariables;
  }
  
  @PostMapping("/config")
  public BackupsVariables getCicdConfig(@RequestBody BackupsVariables variables) {
      backupVariables = variables;
      return backupVariables;
  }
}
