/*
 * Copyright 2023 Curity AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.curity.sms.noop.descriptor;

import io.curity.sms.noop.NoopSmsSender
import se.curity.identityserver.sdk.config.Configuration
import se.curity.identityserver.sdk.plugin.descriptor.SmsPluginDescriptor
import se.curity.identityserver.sdk.service.sms.SmsSender

class NoopSmsSenderPluginDescriptor : SmsPluginDescriptor<NoopConfiguration> {
    override fun getPluginImplementationType(): String = "sms.noop"

    override fun getConfigurationType(): Class<out NoopConfiguration> = NoopConfiguration::class.java

    override fun getSmsSenderType(): Class<out SmsSender> = NoopSmsSender::class.java
}

interface NoopConfiguration : Configuration
