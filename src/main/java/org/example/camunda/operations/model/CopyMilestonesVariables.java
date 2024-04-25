package org.example.camunda.operations.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CopyMilestonesVariables {

    private String camundaTokenUrl = "https://login.cloud.camunda.io/oauth/token";
    private String camundaModelerUrl = "https://modeler.cloud.camunda.io";
    private String githubOwner = "chDame";
    private String githubRepo = "test-cicd";
    private String githubBasePath = "src/main/resources/models";
    private String cycleDelay = "PT2M";
    public String getCamundaTokenUrl() {
        return camundaTokenUrl;
    }
    public CopyMilestonesVariables setCamundaTokenUrl(String camundaTokenUrl) {
        this.camundaTokenUrl = camundaTokenUrl;
        return this;
    }
    public String getCamundaModelerUrl() {
        return camundaModelerUrl;
    }
    public CopyMilestonesVariables setCamundaModelerUrl(String camundaModelerUrl) {
        this.camundaModelerUrl = camundaModelerUrl;
        return this;
    }
    public String getGithubOwner() {
        return githubOwner;
    }
    public CopyMilestonesVariables setGithubOwner(String githubOwner) {
        this.githubOwner = githubOwner;
        return this;
    }
    public String getGithubRepo() {
        return githubRepo;
    }
    public CopyMilestonesVariables setGithubRepo(String githubRepo) {
        this.githubRepo = githubRepo;
        return this;
    }
    public String getGithubBasePath() {
        return githubBasePath;
    }
    public CopyMilestonesVariables setGithubBasePath(String githubBasePath) {
        this.githubBasePath = githubBasePath;
        return this;
    }
    public String getCycleDelay() {
        return cycleDelay;
    }
    public CopyMilestonesVariables setCycleDelay(String cycleDelay) {
        this.cycleDelay = cycleDelay;
        return this;
    }
}
