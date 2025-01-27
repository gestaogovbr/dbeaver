/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ui;

import org.eclipse.swt.widgets.Composite;
import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;

public abstract class ObjectPropertyConfiguratorWrapper<OBJECT, SETTINGS>  extends AbstractObjectPropertyConfigurator<OBJECT, SETTINGS> {
    private IObjectPropertyConfigurator<OBJECT, SETTINGS> configurator = null;

    protected abstract IObjectPropertyConfigurator<OBJECT, SETTINGS> createConfigurator();

    @Override
    public void createControl(@NotNull Composite parent, OBJECT object, @NotNull Runnable propertyChangeListener) {
        this.configurator = createConfigurator();
        this.configurator.createControl(parent, object, propertyChangeListener);
    }

    @Override
    public void loadSettings(@NotNull SETTINGS settings) {
        if (this.configurator != null) {
            this.configurator.loadSettings(settings);
        }
    }

    @Override
    public void saveSettings(@NotNull SETTINGS settings) {
        if (this.configurator != null) {
            this.configurator.saveSettings(settings);
        }
    }

    @Override
    public void resetSettings(@NotNull SETTINGS settings) {
        if (this.configurator != null) {
            this.configurator.resetSettings(settings);
        }
    }

    @Override
    public boolean isComplete() {
        if (this.configurator != null) {
            return this.configurator.isComplete();
        } else {
            return true;
        }
    }

    @Nullable
    @Override
    public String getErrorMessage() {
        if (this.configurator != null) {
            return this.configurator.getErrorMessage();
        } else {
            return null;
        }
    }
}