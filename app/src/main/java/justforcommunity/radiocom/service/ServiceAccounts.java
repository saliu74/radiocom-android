/*
 *
 *  * Copyright (C) 2017 @ Pablo Grela
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package justforcommunity.radiocom.service;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;

import java.util.Locale;

import justforcommunity.radiocom.model.AccountDTO;
import justforcommunity.radiocom.service.exceptions.WebServiceStatusFailException;

import static justforcommunity.radiocom.task.FirebaseUtils.getTokenFirebase;
import static justforcommunity.radiocom.utils.GlobalValues.accountURL;
import static justforcommunity.radiocom.utils.GlobalValues.addDeviceToken;
import static justforcommunity.radiocom.utils.GlobalValues.addToken;
import static justforcommunity.radiocom.utils.GlobalValues.membersURL;

public class ServiceAccounts extends ServiceBase {

    public ServiceAccounts(Locale language) {
        super(language);
    }

    public AccountDTO getAccount() throws RestClientException, WebServiceStatusFailException {

        String url = membersURL + accountURL + addToken + getTokenFirebase() + addDeviceToken + FirebaseInstanceId.getInstance().getToken();
        ResponseEntity<AccountDTO> response;

        try {
            HttpEntity<?> request;
            request = new HttpEntity<Object>(getRequestHeaders());

            response = getRestTemplate().exchange(url, HttpMethod.GET, request, AccountDTO.class);

            if (response.getStatusCode() != HttpStatus.OK) {
                throw new WebServiceStatusFailException();
            }
        } catch (RestClientException e) {
            Log.d("ServiceReports", "getReports()", e);
            throw e;
        }

        return response.getBody();
    }

}
