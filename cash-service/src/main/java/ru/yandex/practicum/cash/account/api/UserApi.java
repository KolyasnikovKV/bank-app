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
import ru.yandex.practicum.cash.account.model.RegisteredUsersRs;
import ru.yandex.practicum.cash.account.model.UpdateUserInfoRq;
import ru.yandex.practicum.cash.account.model.UserInfoRs;
import ru.yandex.practicum.cash.account.model.UserRegisterInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-17T11:33:15.955470100+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.12.0")
public class UserApi {
    private ApiClient apiClient;

    public UserApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Получение информации о зарегистрированных пользователях
     * Возвращает информацию о пользователях
     * <p><b>200</b> - OK
     * <p><b>400</b> - Некорректный запрос
     * @return RegisteredUsersRs
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAllRegisteredUsersRequestCreation() throws WebClientResponseException {
        Object postBody = null;
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<RegisteredUsersRs> localVarReturnType = new ParameterizedTypeReference<RegisteredUsersRs>() {};
        return apiClient.invokeAPI("/user/registered/list", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Получение информации о зарегистрированных пользователях
     * Возвращает информацию о пользователях
     * <p><b>200</b> - OK
     * <p><b>400</b> - Некорректный запрос
     * @return RegisteredUsersRs
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RegisteredUsersRs> getAllRegisteredUsers() throws WebClientResponseException {
        ParameterizedTypeReference<RegisteredUsersRs> localVarReturnType = new ParameterizedTypeReference<RegisteredUsersRs>() {};
        return getAllRegisteredUsersRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Получение информации о зарегистрированных пользователях
     * Возвращает информацию о пользователях
     * <p><b>200</b> - OK
     * <p><b>400</b> - Некорректный запрос
     * @return ResponseEntity&lt;RegisteredUsersRs&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RegisteredUsersRs>> getAllRegisteredUsersWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<RegisteredUsersRs> localVarReturnType = new ParameterizedTypeReference<RegisteredUsersRs>() {};
        return getAllRegisteredUsersRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Получение информации о зарегистрированных пользователях
     * Возвращает информацию о пользователях
     * <p><b>200</b> - OK
     * <p><b>400</b> - Некорректный запрос
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAllRegisteredUsersWithResponseSpec() throws WebClientResponseException {
        return getAllRegisteredUsersRequestCreation();
    }

    /**
     * Получение информации о пользователе по его имени
     * Возвращает информацию о пользователе
     * <p><b>200</b> - OK
     * <p><b>400</b> - Некорректный запрос
     * <p><b>404</b> - Пользователь не найден
     * @param username The username parameter
     * @return UserInfoRs
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getUserInfoByUsernameRequestCreation(String username) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling getUserInfoByUsername", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<UserInfoRs> localVarReturnType = new ParameterizedTypeReference<UserInfoRs>() {};
        return apiClient.invokeAPI("/user/{username}/info", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Получение информации о пользователе по его имени
     * Возвращает информацию о пользователе
     * <p><b>200</b> - OK
     * <p><b>400</b> - Некорректный запрос
     * <p><b>404</b> - Пользователь не найден
     * @param username The username parameter
     * @return UserInfoRs
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UserInfoRs> getUserInfoByUsername(String username) throws WebClientResponseException {
        ParameterizedTypeReference<UserInfoRs> localVarReturnType = new ParameterizedTypeReference<UserInfoRs>() {};
        return getUserInfoByUsernameRequestCreation(username).bodyToMono(localVarReturnType);
    }

    /**
     * Получение информации о пользователе по его имени
     * Возвращает информацию о пользователе
     * <p><b>200</b> - OK
     * <p><b>400</b> - Некорректный запрос
     * <p><b>404</b> - Пользователь не найден
     * @param username The username parameter
     * @return ResponseEntity&lt;UserInfoRs&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UserInfoRs>> getUserInfoByUsernameWithHttpInfo(String username) throws WebClientResponseException {
        ParameterizedTypeReference<UserInfoRs> localVarReturnType = new ParameterizedTypeReference<UserInfoRs>() {};
        return getUserInfoByUsernameRequestCreation(username).toEntity(localVarReturnType);
    }

    /**
     * Получение информации о пользователе по его имени
     * Возвращает информацию о пользователе
     * <p><b>200</b> - OK
     * <p><b>400</b> - Некорректный запрос
     * <p><b>404</b> - Пользователь не найден
     * @param username The username parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getUserInfoByUsernameWithResponseSpec(String username) throws WebClientResponseException {
        return getUserInfoByUsernameRequestCreation(username);
    }

    /**
     * Регистрация нового пользователя в системе
     * Данные из UI формы передаются в систему и сохраняются в БД
     * <p><b>200</b> - OK
     * <p><b>400</b> - Некорректный запрос
     * @param userRegisterInfo The userRegisterInfo parameter
     * @return UserInfoRs
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec registerNewUserRequestCreation(UserRegisterInfo userRegisterInfo) throws WebClientResponseException {
        Object postBody = userRegisterInfo;
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

        ParameterizedTypeReference<UserInfoRs> localVarReturnType = new ParameterizedTypeReference<UserInfoRs>() {};
        return apiClient.invokeAPI("/user/register", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Регистрация нового пользователя в системе
     * Данные из UI формы передаются в систему и сохраняются в БД
     * <p><b>200</b> - OK
     * <p><b>400</b> - Некорректный запрос
     * @param userRegisterInfo The userRegisterInfo parameter
     * @return UserInfoRs
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UserInfoRs> registerNewUser(UserRegisterInfo userRegisterInfo) throws WebClientResponseException {
        ParameterizedTypeReference<UserInfoRs> localVarReturnType = new ParameterizedTypeReference<UserInfoRs>() {};
        return registerNewUserRequestCreation(userRegisterInfo).bodyToMono(localVarReturnType);
    }

    /**
     * Регистрация нового пользователя в системе
     * Данные из UI формы передаются в систему и сохраняются в БД
     * <p><b>200</b> - OK
     * <p><b>400</b> - Некорректный запрос
     * @param userRegisterInfo The userRegisterInfo parameter
     * @return ResponseEntity&lt;UserInfoRs&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UserInfoRs>> registerNewUserWithHttpInfo(UserRegisterInfo userRegisterInfo) throws WebClientResponseException {
        ParameterizedTypeReference<UserInfoRs> localVarReturnType = new ParameterizedTypeReference<UserInfoRs>() {};
        return registerNewUserRequestCreation(userRegisterInfo).toEntity(localVarReturnType);
    }

    /**
     * Регистрация нового пользователя в системе
     * Данные из UI формы передаются в систему и сохраняются в БД
     * <p><b>200</b> - OK
     * <p><b>400</b> - Некорректный запрос
     * @param userRegisterInfo The userRegisterInfo parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec registerNewUserWithResponseSpec(UserRegisterInfo userRegisterInfo) throws WebClientResponseException {
        return registerNewUserRequestCreation(userRegisterInfo);
    }

    /**
     * Обновить информацию о пользователе
     * Данные из UI формы передаются в систему и сохраняются в БД
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param updateUserInfoRq The updateUserInfoRq parameter
     * @return UserInfoRs
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateUserInfoRequestCreation(String username, UpdateUserInfoRq updateUserInfoRq) throws WebClientResponseException {
        Object postBody = updateUserInfoRq;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling updateUserInfo", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<UserInfoRs> localVarReturnType = new ParameterizedTypeReference<UserInfoRs>() {};
        return apiClient.invokeAPI("/user/{username}/update", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Обновить информацию о пользователе
     * Данные из UI формы передаются в систему и сохраняются в БД
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param updateUserInfoRq The updateUserInfoRq parameter
     * @return UserInfoRs
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UserInfoRs> updateUserInfo(String username, UpdateUserInfoRq updateUserInfoRq) throws WebClientResponseException {
        ParameterizedTypeReference<UserInfoRs> localVarReturnType = new ParameterizedTypeReference<UserInfoRs>() {};
        return updateUserInfoRequestCreation(username, updateUserInfoRq).bodyToMono(localVarReturnType);
    }

    /**
     * Обновить информацию о пользователе
     * Данные из UI формы передаются в систему и сохраняются в БД
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param updateUserInfoRq The updateUserInfoRq parameter
     * @return ResponseEntity&lt;UserInfoRs&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UserInfoRs>> updateUserInfoWithHttpInfo(String username, UpdateUserInfoRq updateUserInfoRq) throws WebClientResponseException {
        ParameterizedTypeReference<UserInfoRs> localVarReturnType = new ParameterizedTypeReference<UserInfoRs>() {};
        return updateUserInfoRequestCreation(username, updateUserInfoRq).toEntity(localVarReturnType);
    }

    /**
     * Обновить информацию о пользователе
     * Данные из UI формы передаются в систему и сохраняются в БД
     * <p><b>200</b> - OK
     * @param username The username parameter
     * @param updateUserInfoRq The updateUserInfoRq parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateUserInfoWithResponseSpec(String username, UpdateUserInfoRq updateUserInfoRq) throws WebClientResponseException {
        return updateUserInfoRequestCreation(username, updateUserInfoRq);
    }
}
