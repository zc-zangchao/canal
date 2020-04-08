package com.alibaba.otter.canal.connector.kafka.config;

import java.util.LinkedHashMap;
import java.util.Map;

import com.alibaba.otter.canal.connector.core.config.MQProperties;

/**
 * Kafka producer 配置类
 *
 * @author rewerma 2020-01-27
 * @version 1.0.0
 */
public class KafkaProducerConfig extends MQProperties {

    private Map<String, Object> kafkaProperties = new LinkedHashMap<>();

    private boolean             kerberosEnabled = false;
    private String              krb5File;
    private String              jaasFile;

    private boolean             saslEnabled = false;
    private String              saslMechanism;
    private String              saslUserName;
    private String              saslPassword;

    public Map<String, Object> getKafkaProperties() {
        return kafkaProperties;
    }

    public void setKafkaProperties(Map<String, Object> kafkaProperties) {
        this.kafkaProperties = kafkaProperties;
    }

    public boolean isKerberosEnabled() {
        return kerberosEnabled;
    }

    public void setKerberosEnabled(boolean kerberosEnabled) {
        this.kerberosEnabled = kerberosEnabled;
    }

    public String getKrb5File() {
        return krb5File;
    }

    public void setKrb5File(String krb5File) {
        this.krb5File = krb5File;
    }

    public String getJaasFile() {
        return jaasFile;
    }

    public void setJaasFile(String jaasFile) {
        this.jaasFile = jaasFile;
    }

    public boolean isSaslEnabled() {
        return saslEnabled;
    }

    public void setSaslEnabled(boolean saslEnabled) {
        this.saslEnabled = saslEnabled;
    }

    public String getSaslMechanism() {
        return saslMechanism;
    }

    public void setSaslMechanism(String saslMechanism) {
        this.saslMechanism = saslMechanism;
    }

    public String getSaslUserName() {
        return saslUserName;
    }

    public void setSaslUserName(String saslUserName) {
        this.saslUserName = saslUserName;
    }

    public String getSaslPassword() {
        return saslPassword;
    }

    public void setSaslPassword(String saslPassword) {
        this.saslPassword = saslPassword;
    }
}
