/*
 * Copyright 2011, Mysema Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mysema.query.sql.dml;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import com.mysema.query.types.Expression;
import com.mysema.query.types.Path;
import com.mysema.query.types.SubQueryExpression;

/**
 * SQLMergeBatch defines the state of an SQL MERGE batch item
 * 
 * @author tiwe
 *
 */
public class SQLMergeBatch {
    
    private final List<Path<?>> keys;
    
    private final List<Path<?>> columns;
    
    private final List<Expression<?>> values;
    
    @Nullable
    private final SubQueryExpression<?> subQuery;
    
    public SQLMergeBatch(List<Path<?>> k, List<Path<?>> c, List<Expression<?>> v, @Nullable SubQueryExpression<?> sq) {
        keys = new ArrayList<Path<?>>(k);
        columns = new ArrayList<Path<?>>(c);
        values = new ArrayList<Expression<?>>(v);
        subQuery = sq;
    }
    
    public List<Path<?>> getKeys(){
        return keys;
    }

    public List<Path<?>> getColumns() {
        return columns;
    }

    public List<Expression<?>> getValues() {
        return values;
    }

    public SubQueryExpression<?> getSubQuery() {
        return subQuery;
    }

}
