package com.tpecx.nasp;

import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.support.WriteRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.Collections;
import java.util.UUID;
@SpringBootTest
public class ESTest {
    @Autowired
    private RestHighLevelClient restHighLevelClient;
    @Test
    void test() throws IOException {
        RestClient restClient = restHighLevelClient.getLowLevelClient();
        String randomId = UUID.randomUUID().toString();
        IndexRequest request = new IndexRequest("sprint-data")
                .id(randomId)
                .source(Collections.singletonMap("feature","high-level-rest-client"))
                .setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE);
        IndexResponse response = restHighLevelClient.index(request, RequestOptions.DEFAULT);
        GetRequest getRequest = new GetRequest("sprint-data").id(randomId);
        GetResponse getResponse = restHighLevelClient.get(getRequest,RequestOptions.DEFAULT);
        System.out.println(response.toString());
        System.out.println(getResponse);
    }

}
