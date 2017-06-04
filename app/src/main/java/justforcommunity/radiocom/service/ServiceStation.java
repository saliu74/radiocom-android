/*
 *
 *  * Copyright (C) 2016 @ Fernando Souto González
 *  *
 *  * Developer Fernando Souto
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

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestClientException;

import java.util.Collections;
import java.util.Locale;

import justforcommunity.radiocom.model.ResponseStationDTO;
import justforcommunity.radiocom.service.exceptions.WebServiceStatusFailException;

import static justforcommunity.radiocom.utils.GlobalValues.radioStationURL;

public class ServiceStation extends ServiceBase {

    public ServiceStation(Locale language) {
        super(language);
    }

    public ResponseStationDTO getStation() throws RestClientException, WebServiceStatusFailException {

        String url = radioStationURL;
        ResponseEntity<ResponseStationDTO> response;

        try {
            HttpEntity<?> request;
            request = new HttpEntity<Object>(getRequestHeaders());

            GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
            converter.setSupportedMediaTypes(Collections.singletonList(MediaType.TEXT_PLAIN));
            getRestTemplate().getMessageConverters().add(converter);

            response = getRestTemplate().exchange(url, HttpMethod.GET, request, ResponseStationDTO.class);
            if (response.getStatusCode() != HttpStatus.OK) {
                throw new WebServiceStatusFailException();
            }
        } catch (RestClientException e) {
            Log.d("ServiceStation", "getStation", e);
            throw e;
        }

        return response.getBody();
    }
}
