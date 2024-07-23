/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.paimon.exception;

/**
 * When this exception is thrown, you should stop whatever you are doing. Don't clean/delete
 * anything.This is because we can't be sure that the commit was successful.
 */
public class CommitStateUnknownException extends RuntimeException {
    public CommitStateUnknownException(String msg) {
        super(msg);
    }

    public CommitStateUnknownException(Throwable e) {
        super(e);
    }

    public CommitStateUnknownException(String msg, Throwable e) {
        super(msg, e);
    }

    public CommitStateUnknownException(Throwable e, String msg, Object... args) {
        super(String.format(msg, args), e);
    }
}
