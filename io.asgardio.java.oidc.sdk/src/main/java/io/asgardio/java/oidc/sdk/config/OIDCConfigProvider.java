/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.asgardio.java.oidc.sdk.config;

import io.asgardio.java.oidc.sdk.config.model.OIDCAgentConfig;

/**
 * A "provider" interface for the {@link OIDCAgentConfig} model.
 *
 * @see FileBasedOIDCConfigProvider
 */
public interface OIDCConfigProvider {

    /**
     * Retrieves the {@code OIDCAgentConfig} object with the agent specific configurations.
     *
     * @return {@link OIDCAgentConfig} Object containing the agent specific configurations.
     */
    OIDCAgentConfig getOidcAgentConfig();
}
