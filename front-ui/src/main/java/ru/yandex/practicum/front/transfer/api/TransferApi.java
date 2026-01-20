package ru.yandex.practicum.front.transfer.api;

import ru.yandex.practicum.front.transfer.ApiClient;
import ru.yandex.practicum.front.transfer.model.ResponseInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import ru.yandex.practicum.front.transfer.model.TransferCashRq;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-17T11:33:00.206339600+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.12.0")
public class TransferApi {
    private ApiClient apiClient;

    public TransferApi() {
        this(new ApiClient());
    }

    @Autowired
    public TransferApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Выполнить перевод средств между счетами
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param fromUsername The fromUsername parameter
     * @param toUsername The toUsername parameter
     * @param transferCashRq The transferCashRq parameter
     * @return ResponseInfo
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec transferCashRequestCreation(String fromUsername, String toUsername, TransferCashRq transferCashRq) throws WebClientResponseException {
        Object postBody = transferCashRq;
        // verify the required parameter 'fromUsername' is set
        if (fromUsername == null) {
            throw new WebClientResponseException("Missing the required parameter 'fromUsername' when calling transferCash", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'toUsername' is set
        if (toUsername == null) {
            throw new WebClientResponseException("Missing the required parameter 'toUsername' when calling transferCash", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fromUsername", fromUsername);
        pathParams.put("toUsername", toUsername);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ResponseInfo> localVarReturnType = new ParameterizedTypeReference<ResponseInfo>() {};
        return apiClient.invokeAPI("/transfer/from/{fromUsername}/to/{toUsername}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Выполнить перевод средств между счетами
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param fromUsername The fromUsername parameter
     * @param toUsername The toUsername parameter
     * @param transferCashRq The transferCashRq parameter
     * @return ResponseInfo
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseInfo> transferCash(String fromUsername, String toUsername, TransferCashRq transferCashRq) throws WebClientResponseException {
        ParameterizedTypeReference<ResponseInfo> localVarReturnType = new ParameterizedTypeReference<ResponseInfo>() {};
        return transferCashRequestCreation(fromUsername, toUsername, transferCashRq).bodyToMono(localVarReturnType);
    }

    /**
     * Выполнить перевод средств между счетами
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param fromUsername The fromUsername parameter
     * @param toUsername The toUsername parameter
     * @param transferCashRq The transferCashRq parameter
     * @return ResponseEntity&lt;ResponseInfo&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ResponseInfo>> transferCashWithHttpInfo(String fromUsername, String toUsername, TransferCashRq transferCashRq) throws WebClientResponseException {
        ParameterizedTypeReference<ResponseInfo> localVarReturnType = new ParameterizedTypeReference<ResponseInfo>() {};
        return transferCashRequestCreation(fromUsername, toUsername, transferCashRq).toEntity(localVarReturnType);
    }

    /**
     * Выполнить перевод средств между счетами
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param fromUsername The fromUsername parameter
     * @param toUsername The toUsername parameter
     * @param transferCashRq The transferCashRq parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec transferCashWithResponseSpec(String fromUsername, String toUsername, TransferCashRq transferCashRq) throws WebClientResponseException {
        return transferCashRequestCreation(fromUsername, toUsername, transferCashRq);
    }
}
