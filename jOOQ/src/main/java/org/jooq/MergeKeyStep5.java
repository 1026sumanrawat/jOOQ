/*
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

// ...
import static org.jooq.SQLDialect.CUBRID;
// ...
import static org.jooq.SQLDialect.DERBY;
import static org.jooq.SQLDialect.FIREBIRD;
import static org.jooq.SQLDialect.H2;
// ...
import static org.jooq.SQLDialect.HSQLDB;
// ...
import static org.jooq.SQLDialect.POSTGRES;
// ...
// ...
// ...
// ...

import java.util.Collection;

/**
 * This type is used for the H2-specific variant of the {@link Merge}'s DSL API.
 * <p>
 * Example: <code><pre>
 * DSLContext create = DSL.using(configuration);
 *
 * create.mergeInto(table, field1, field2, field3, field4, field5)
 *       .key(id)
 *       .values(field1, field2, field3, field4, field5)
 *       .execute();
 * </pre></code>
 *
 * @author Lukas Eder
 * @deprecated - [#10045] - 3.14.0 - Use the standard SQL MERGE API instead, via {@link DSLContext#mergeInto(Table)}
 */
@Deprecated
public interface MergeKeyStep5<R extends Record, T1, T2, T3, T4, T5> extends MergeValuesStep5<R, T1, T2, T3, T4, T5> {

    /**
     * Specify an optional <code>KEY</code> clause.
     * <p>
     * Use this optional clause in order to override using the underlying
     * <code>PRIMARY KEY</code>.
     *
     * @deprecated - [#10045] - 3.14.0 - Use the standard SQL MERGE API instead, via {@link DSLContext#mergeInto(Table)}
     */
    @Deprecated
    @Support({ CUBRID, DERBY, FIREBIRD, H2, HSQLDB, POSTGRES })
    MergeValuesStep5<R, T1, T2, T3, T4, T5> key(Field<?>... keys);

    /**
     * Specify an optional <code>KEY</code> clause.
     * <p>
     * Use this optional clause in order to override using the underlying
     * <code>PRIMARY KEY</code>.
     *
     * @deprecated - [#10045] - 3.14.0 - Use the standard SQL MERGE API instead, via {@link DSLContext#mergeInto(Table)}
     */
    @Deprecated
    @Support({ CUBRID, DERBY, FIREBIRD, H2, HSQLDB, POSTGRES })
    MergeValuesStep5<R, T1, T2, T3, T4, T5> key(Collection<? extends Field<?>> keys);
}
