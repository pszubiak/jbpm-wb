/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.workbench.cm.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class HumanTaskNodePredicate implements Predicate<String> {

    public static final String NODE_TYPE_HUMAN_TASK = "HumanTaskNode";
    public static final List<String> NODE_TYPE_LIST_HUMAN_TASK = Arrays.asList("Human Task",
                                                                          NODE_TYPE_HUMAN_TASK);

    @Override
    public boolean test(final String nodeType) {
        return NODE_TYPE_LIST_HUMAN_TASK.contains(nodeType);
    }
}
