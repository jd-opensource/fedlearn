/* Copyright 2020 The FedLearn Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.jdt.fedlearn.core.entity.boost;
import com.jdt.fedlearn.core.entity.Message;
import com.jdt.fedlearn.core.type.MetricType;

import java.util.List;
import java.util.Map;

public class BoostP5Res implements Message {
    private boolean isStop;
    private int depth;
    private Map<MetricType, List<Double>> trainMetric;

    public BoostP5Res(boolean isStop, int depth, Map<MetricType, List<Double>> trainMetric) {
        this.isStop = isStop;
        this.depth = depth;
        this.trainMetric = trainMetric;
    }

    public BoostP5Res(boolean isStop, int depth) {
        this.isStop = isStop;
        this.depth = depth;
    }

    public boolean isStop() {
        return isStop;
    }

    public int getDepth() {
        return depth;
    }

    public void setTrainMetric(Map<MetricType, List<Double>> trainMetric) {
        this.trainMetric = trainMetric;
    }

    public Map<MetricType, List<Double>> getTrainMetric() {
        return this.trainMetric;
    }
}