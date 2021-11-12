package com.tpecx.nasp.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.http.HttpHeaders;

import java.time.Duration;

@Configuration
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration {

    @Value("${elasticsearch.server.address}")
    private String ELASTIC_SEARCH_SERVER_ADDRESS;
    @Value("${elasticsearch.auth.username}")
    private String username;
    @Value("${elasticsearch.auth.password}")
    private String password;
    @Override
    public RestHighLevelClient elasticsearchClient() {
        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo(ELASTIC_SEARCH_SERVER_ADDRESS)
//                .withConnectTimeout(Duration.ofSeconds(5))
//                .withSocketTimeout(Duration.ofSeconds(3))
//                .withBasicAuth(username,password)
//                .withHeaders(() -> {
//                    HttpHeaders headers = new HttpHeaders();
//                    headers.add("xxx","xxx");
//                    return headers;
//                })
                .build();
        return RestClients.create(clientConfiguration).rest();
    }
}
