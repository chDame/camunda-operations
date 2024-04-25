package org.example.camunda.operations.model;

public class BackupsVariables {

    //delay between every backup
    private String backupCycle="PT24H";
    //at what time the next backup is planned
    private String backupStartTime="23";
    //elasticsearch repository for snapshots
    private String backupRepo="backup";
    //if the zeebe backup phase is taking too long, we force exporters to resume
    private String waitingTimeBeforeForceExportersResume="PT1H";
    private String gatewayUrl="http://camunda-zeebe-gateway:9600";
    private String elasticsearchUrl="http://camunda-elasticsearch:9200";
    private String optimizeUrl="http://camunda-optimize:8092";
    private String operateUrl="http://camunda-operate";
    private String tasklistUrl="http://camunda-tasklist";
    public String getBackupCycle() {
        return backupCycle;
    }
    public BackupsVariables setBackupCycle(String backupCycle) {
        this.backupCycle = backupCycle;
        return this;
    }
    public String getBackupStartTime() {
        return backupStartTime;
    }
    public BackupsVariables setBackupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
        return this;
    }
    public String getBackupRepo() {
        return backupRepo;
    }
    public BackupsVariables setBackupRepo(String backupRepo) {
        this.backupRepo = backupRepo;
        return this;
    }
    public String getWaitingTimeBeforeForceExportersResume() {
        return waitingTimeBeforeForceExportersResume;
    }
    public BackupsVariables setWaitingTimeBeforeForceExportersResume(String waitingTimeBeforeForceExportersResume) {
        this.waitingTimeBeforeForceExportersResume = waitingTimeBeforeForceExportersResume;
        return this;
    }
    public String getGatewayUrl() {
        return gatewayUrl;
    }
    public BackupsVariables setGatewayUrl(String gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
        return this;
    }
    public String getElasticsearchUrl() {
        return elasticsearchUrl;
    }
    public BackupsVariables setElasticsearchUrl(String elasticsearchUrl) {
        this.elasticsearchUrl = elasticsearchUrl;
        return this;
    }
    public String getOptimizeUrl() {
        return optimizeUrl;
    }
    public BackupsVariables setOptimizeUrl(String optimizeUrl) {
        this.optimizeUrl = optimizeUrl;
        return this;
    }
    public String getOperateUrl() {
        return operateUrl;
    }
    public BackupsVariables setOperateUrl(String operateUrl) {
        this.operateUrl = operateUrl;
        return this;
    }
    public String getTasklistUrl() {
        return tasklistUrl;
    }
    public BackupsVariables setTasklistUrl(String tasklistUrl) {
        this.tasklistUrl = tasklistUrl;
        return this;
    }
    
    
}
