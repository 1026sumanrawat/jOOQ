/**
 * Copyright (c) 2009-2015, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq;

/**
 * The <code>Loader</code> API is used for configuring data loads.
 * <p>
 * The step in constructing the {@link org.jooq.Loader} object where you can set the
 * optional CSV loader options.
 *
 * @author Lukas Eder
 * @author Johannes Bühler
 */
public interface LoaderJSONOptionsStep<R extends Record> extends LoaderListenerStep<R> {

    /**
     * Specify that a certain number of rows should be ignored from the JSON
     * input. This is useful for skipping processing information
     * <p>
     * By default, this is set to <code>1</code>, as CSV files are expected to
     * hold a header row.
     *
     * @param number The number of rows to ignore.
     */
    @Support
    LoaderJSONOptionsStep<R> ignoreRows(int number);
}
