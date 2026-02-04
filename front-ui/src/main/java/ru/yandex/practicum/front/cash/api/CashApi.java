package ru.yandex.practicum.front.cash.api;

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
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import ru.yandex.practicum.front.cash.ApiClient;
import ru.yandex.practicum.front.cash.model.ChangeCashRq;
import ru.yandex.practicum.front.cash.model.ResponseInfo;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-17T11:32:59.974439300+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.12.0")
public class CashApi {
    private ApiClient apiClient;

    public CashApi() {
        this(new ApiClient());
    }

    @Autowired
    public CashApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Внести или снять наличные средства со счета
     * Сервис получает запрос на зачисление или снятие средств. Выполняется обращение к account-service, blocker-service, notification-service
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param changeCashRq The changeCashRq parameter
     * @return ResponseInfo
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateCashRequestCreation(ChangeCashRq changeCashRq) throws WebClientResponseException {
        Object postBody = changeCashRq;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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
        return apiClient.invokeAPI("/cash/update", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Внести или снять наличные средства со счета
     * Сервис получает запрос на зачисление или снятие средств. Выполняется обращение к account-service, blocker-service, notification-service
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param changeCashRq The changeCashRq parameter
     * @return ResponseInfo
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseInfo> updateCash(ChangeCashRq changeCashRq) throws WebClientResponseException {
        ParameterizedTypeReference<ResponseInfo> localVarReturnType = new ParameterizedTypeReference<ResponseInfo>() {};
        return updateCashRequestCreation(changeCashRq).bodyToMono(localVarReturnType);
    }

    /**
     * Внести или снять наличные средства со счета
     * Сервис получает запрос на зачисление или снятие средств. Выполняется обращение к account-service, blocker-service, notification-service
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param changeCashRq The changeCashRq parameter
     * @return ResponseEntity&lt;ResponseInfo&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ResponseInfo>> updateCashWithHttpInfo(ChangeCashRq changeCashRq) throws WebClientResponseException {
        ParameterizedTypeReference<ResponseInfo> localVarReturnType = new ParameterizedTypeReference<ResponseInfo>() {};
        return updateCashRequestCreation(changeCashRq).toEntity(localVarReturnType);
    }

    /**
     * Внести или снять наличные средства со счета
     * Сервис получает запрос на зачисление или снятие средств. Выполняется обращение к account-service, blocker-service, notification-service
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param changeCashRq The changeCashRq parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateCashWithResponseSpec(ChangeCashRq changeCashRq) throws WebClientResponseException {
        return updateCashRequestCreation(changeCashRq);
    }
}
