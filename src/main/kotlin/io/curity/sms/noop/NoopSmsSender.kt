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


package io.curity.sms.noop;

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import se.curity.identityserver.sdk.service.sms.SmsSender

class NoopSmsSender : SmsSender {
    companion object {
        val logger: Logger = LoggerFactory.getLogger(NoopSmsSender::class.java)
    }

    override fun sendSms(toNumber: String, message: String): Boolean {
        logger.info("############# SMS #############")
        logger.info("Sending sms to: {}", toNumber)
        logger.info("Message: {}", message)
        logger.info("###############################")
        return true
    }
}
