/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
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

package org.jbpm.workbench.cm.client.util;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.jboss.errai.databinding.client.api.Converter;

import static com.google.common.base.Strings.isNullOrEmpty;

public class CommaListValuesConverter implements Converter<List, String> {

    @Override
    public List toModelValue(final String widgetValue) {
        if (isNullOrEmpty(widgetValue)) {
            return new ArrayList<String>();
        } else {
            return new ArrayList(Splitter.on(",").trimResults().omitEmptyStrings().splitToList(widgetValue));
        }
    }

    @Override
    public String toWidgetValue(final List modelValue) {
        if (modelValue == null) {
            return "";
        } else {
            return Joiner.on(", ").join(modelValue);
        }
    }

    @Override
    public Class<List> getModelType() {
        return List.class;
    }

    @Override
    public Class<String> getComponentType() {
        return String.class;
    }
}