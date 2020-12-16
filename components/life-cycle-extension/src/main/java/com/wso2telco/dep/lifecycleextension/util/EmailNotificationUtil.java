/**
 * Copyright (c) 2020-2021, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 *
 * WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wso2telco.dep.lifecycleextension.util;

import org.wso2.carbon.apimgt.api.model.APIIdentifier;

public class EmailNotificationUtil {

    private EmailNotificationUtil(){
    }

    public static String getApiProviderEmailContent(APIIdentifier api) {

        return "<div style='margin: 0 0 3px 0;padding: 5px;border-style: solid;border-width: 1px 1px 1px 11px;border-color:#e46c0a;color: #525863;line-height: normal;font-weight: bold;'>" +
                "<h2> New API Creation</h2>" +
                "</div>" +
                "<div style='border-style:solid;border-width:1px 1px 1px 1px;border-color:#e46c0a;color:#525863;'>" +
                "<table border='0'>" +
                "<tr>" +
                "<td><b> API Name : </b></td>" +
                "<td>" + api.getApiName() + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td><b> API Publisher : </b></td>" +
                "<td>" + api.getProviderName() + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td><b> API Version : </b></td>" +
                "<td>" + api.getVersion() + "</td>" +
                "</tr>" +
                "</table>" +
                "</div>";

    }
}
