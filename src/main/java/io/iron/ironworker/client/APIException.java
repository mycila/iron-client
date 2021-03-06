/**
 * Copyright (C) 2013 Mycila (mathieu@mycila.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.iron.ironworker.client;

public class APIException extends Exception {
    private String message;
    private Exception innerException;
    
    public APIException(String message, Exception innerException) {
        this.message = message;
        this.innerException = innerException;
    }

    public String getMessage() {
        return message;
    }

    public Exception getInnerException() {
        return innerException;
    }

    public String toString() {
        return message != null ? message : innerException.toString();
    }
}
