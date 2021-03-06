/*
 * Copyright (C) 2013 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package retrofit.http;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Query parameter appended to the URL. Values are converted to strings using
 * {@link String#valueOf(Object)}. Parameter Values are used literally without URL encoding. See
 * {@link retrofit.http.Query @Query} for URL encoding equivalent.
 * <p/>
 * <pre>
 * &#64;GET("/list")
 * void example(@EncodedQuery("page") int page, ..);
 * </pre>
 * <p/>
 * Query parameters may be {@code null} which will omit them from the URL.
 */
@Documented
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface EncodedQuery {
    String value();
}
