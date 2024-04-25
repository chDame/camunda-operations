package org.example.camunda.operations.facade;

import org.example.camunda.operations.model.CopyMilestonesVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.camunda.zeebe.client.ZeebeClient;

@RestController
@RequestMapping("/process")
public class ProcessController {

  private static final Logger LOG = LoggerFactory.getLogger(ProcessController.class);
  private final ZeebeClient zeebe;
  private static CopyMilestonesVariables copyMilestonesVariables = new CopyMilestonesVariables();

  public ProcessController(ZeebeClient client) {
    this.zeebe = client;
  }

  @PostMapping("/startCICDcopies")
  public void startCicd() {

    zeebe
        .newCreateInstanceCommand()
        .bpmnProcessId("ci_cd_process")
        .latestVersion()
        .variables(copyMilestonesVariables)
        .send();
  }
  
  @GetMapping("/cicdConfig")
  public CopyMilestonesVariables getCicdConfig() {
      return copyMilestonesVariables;
  }
  
  @PostMapping("/cicdConfig")
  public CopyMilestonesVariables getCicdConfig(@RequestBody CopyMilestonesVariables variables) {
      copyMilestonesVariables = variables;
      return copyMilestonesVariables;
  }
}
