package ru.yandex.practicum.cash.account.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;
import ru.yandex.practicum.cash.account.ApiClient;
import ru.yandex.practicum.cash.account.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-17T11:33:15.955470100+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.12.0")
public class AccountApi {
    private ApiClient apiClient;

    public AccountApi() {
        this(new ApiClient());
    }

    @Autowired
    public AccountApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Внести наличные средства на счет
     * Данные из UI формы передаются в систему и после проверки допустимости действия - средства зачисляются на счет
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param changeCashRq The changeCashRq parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addCashToAccountRequestCreation(String username, ChangeCashRq changeCashRq) throws WebClientResponseException {
        Object postBody = changeCashRq;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling addCashToAccount", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("username", username);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/account/{username}/cash", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Внести наличные средства на счет
     * Данные из UI формы передаются в систему и после проверки допустимости действия - средства зачисляются на счет
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param changeCashRq The changeCashRq parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> addCashToAccount(String username, ChangeCashRq changeCashRq) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return addCashToAccountRequestCreation(username, changeCashRq).bodyToMono(localVarReturnType);
    }

    /**
     * Внести наличные средства на счет
     * Данные из UI формы передаются в систему и после проверки допустимости действия - средства зачисляются на счет
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param changeCashRq The changeCashRq parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> addCashToAccountWithHttpInfo(String username, ChangeCashRq changeCashRq) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return addCashToAccountRequestCreation(username, changeCashRq).toEntity(localVarReturnType);
    }

    /**
     * Внести наличные средства на счет
     * Данные из UI формы передаются в систему и после проверки допустимости действия - средства зачисляются на счет
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param changeCashRq The changeCashRq parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec addCashToAccountWithResponseSpec(String username, ChangeCashRq changeCashRq) throws WebClientResponseException {
        return addCashToAccountRequestCreation(username, changeCashRq);
    }

    /**
     * Создать новый счет пользователя
     * Данные из UI формы передаются в систему и после проверки допустимости действия - счет создается в БД
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param createAccountRq The createAccountRq parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createUserAccountRequestCreation(String username, CreateAccountRq createAccountRq) throws WebClientResponseException {
        Object postBody = createAccountRq;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling createUserAccount", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("username", username);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/account/{username}/create", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Создать новый счет пользователя
     * Данные из UI формы передаются в систему и после проверки допустимости действия - счет создается в БД
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param createAccountRq The createAccountRq parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> createUserAccount(String username, CreateAccountRq createAccountRq) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return createUserAccountRequestCreation(username, createAccountRq).bodyToMono(localVarReturnType);
    }

    /**
     * Создать новый счет пользователя
     * Данные из UI формы передаются в систему и после проверки допустимости действия - счет создается в БД
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param createAccountRq The createAccountRq parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> createUserAccountWithHttpInfo(String username, CreateAccountRq createAccountRq) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return createUserAccountRequestCreation(username, createAccountRq).toEntity(localVarReturnType);
    }

    /**
     * Создать новый счет пользователя
     * Данные из UI формы передаются в систему и после проверки допустимости действия - счет создается в БД
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param createAccountRq The createAccountRq parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createUserAccountWithResponseSpec(String username, CreateAccountRq createAccountRq) throws WebClientResponseException {
        return createUserAccountRequestCreation(username, createAccountRq);
    }

    /**
     * Удалить счет пользователя
     * Данные из UI формы передаются в систему и после проверки допустимости действия - счет удаляется из БД
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param deleteAccountRq The deleteAccountRq parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteUserAccountRequestCreation(String username, DeleteAccountRq deleteAccountRq) throws WebClientResponseException {
        Object postBody = deleteAccountRq;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling deleteUserAccount", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("username", username);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/account/{username}/delete", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Удалить счет пользователя
     * Данные из UI формы передаются в систему и после проверки допустимости действия - счет удаляется из БД
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param deleteAccountRq The deleteAccountRq parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteUserAccount(String username, DeleteAccountRq deleteAccountRq) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteUserAccountRequestCreation(username, deleteAccountRq).bodyToMono(localVarReturnType);
    }

    /**
     * Удалить счет пользователя
     * Данные из UI формы передаются в систему и после проверки допустимости действия - счет удаляется из БД
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param deleteAccountRq The deleteAccountRq parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> deleteUserAccountWithHttpInfo(String username, DeleteAccountRq deleteAccountRq) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteUserAccountRequestCreation(username, deleteAccountRq).toEntity(localVarReturnType);
    }

    /**
     * Удалить счет пользователя
     * Данные из UI формы передаются в систему и после проверки допустимости действия - счет удаляется из БД
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param deleteAccountRq The deleteAccountRq parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteUserAccountWithResponseSpec(String username, DeleteAccountRq deleteAccountRq) throws WebClientResponseException {
        return deleteUserAccountRequestCreation(username, deleteAccountRq);
    }

    /**
     * Снять наличные средства со счета
     * Данные из UI формы передаются в систему и после проверки допустимости действия - средства списываются со счета
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param username The username parameter
     * @param changeCashRq The changeCashRq parameter
     * @return ResponseInfo
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCashFromAccountRequestCreation(String username, ChangeCashRq changeCashRq) throws WebClientResponseException {
        Object postBody = changeCashRq;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling getCashFromAccount", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("username", username);

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
        return apiClient.invokeAPI("/account/{username}/cash", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Снять наличные средства со счета
     * Данные из UI формы передаются в систему и после проверки допустимости действия - средства списываются со счета
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param username The username parameter
     * @param changeCashRq The changeCashRq parameter
     * @return ResponseInfo
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseInfo> getCashFromAccount(String username, ChangeCashRq changeCashRq) throws WebClientResponseException {
        ParameterizedTypeReference<ResponseInfo> localVarReturnType = new ParameterizedTypeReference<ResponseInfo>() {};
        return getCashFromAccountRequestCreation(username, changeCashRq).bodyToMono(localVarReturnType);
    }

    /**
     * Снять наличные средства со счета
     * Данные из UI формы передаются в систему и после проверки допустимости действия - средства списываются со счета
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param username The username parameter
     * @param changeCashRq The changeCashRq parameter
     * @return ResponseEntity&lt;ResponseInfo&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ResponseInfo>> getCashFromAccountWithHttpInfo(String username, ChangeCashRq changeCashRq) throws WebClientResponseException {
        ParameterizedTypeReference<ResponseInfo> localVarReturnType = new ParameterizedTypeReference<ResponseInfo>() {};
        return getCashFromAccountRequestCreation(username, changeCashRq).toEntity(localVarReturnType);
    }

    /**
     * Снять наличные средства со счета
     * Данные из UI формы передаются в систему и после проверки допустимости действия - средства списываются со счета
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param username The username parameter
     * @param changeCashRq The changeCashRq parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCashFromAccountWithResponseSpec(String username, ChangeCashRq changeCashRq) throws WebClientResponseException {
        return getCashFromAccountRequestCreation(username, changeCashRq);
    }

    /**
     * Перевод денег между счетами
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param username The username parameter
     * @param transferCashRq The transferCashRq parameter
     * @return ResponseInfo
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec transferCashRequestCreation(String username, TransferCashRq transferCashRq) throws WebClientResponseException {
        Object postBody = transferCashRq;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling transferCash", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("username", username);

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
        return apiClient.invokeAPI("/account/{username}/cash/transfer", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Перевод денег между счетами
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param username The username parameter
     * @param transferCashRq The transferCashRq parameter
     * @return ResponseInfo
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseInfo> transferCash(String username, TransferCashRq transferCashRq) throws WebClientResponseException {
        ParameterizedTypeReference<ResponseInfo> localVarReturnType = new ParameterizedTypeReference<ResponseInfo>() {};
        return transferCashRequestCreation(username, transferCashRq).bodyToMono(localVarReturnType);
    }

    /**
     * Перевод денег между счетами
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param username The username parameter
     * @param transferCashRq The transferCashRq parameter
     * @return ResponseEntity&lt;ResponseInfo&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ResponseInfo>> transferCashWithHttpInfo(String username, TransferCashRq transferCashRq) throws WebClientResponseException {
        ParameterizedTypeReference<ResponseInfo> localVarReturnType = new ParameterizedTypeReference<ResponseInfo>() {};
        return transferCashRequestCreation(username, transferCashRq).toEntity(localVarReturnType);
    }

    /**
     * Перевод денег между счетами
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - BAD REQUEST
     * @param username The username parameter
     * @param transferCashRq The transferCashRq parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec transferCashWithResponseSpec(String username, TransferCashRq transferCashRq) throws WebClientResponseException {
        return transferCashRequestCreation(username, transferCashRq);
    }
}
