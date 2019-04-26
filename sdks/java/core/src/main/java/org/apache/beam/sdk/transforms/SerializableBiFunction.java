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
package org.apache.beam.sdk.transforms;

import java.io.Serializable;
import java.util.function.BiFunction;

/**
 * A union of the {@link BiFunction} and {@link Serializable} interfaces.
 *
 * @param <FirstInputT> first input value type
 * @param <SecondInputT> second input value type
 * @param <OutputT> output value type
 */
@FunctionalInterface
public interface SerializableBiFunction<FirstInputT, SecondInputT, OutputT>
    extends BiFunction<FirstInputT, SecondInputT, OutputT>, Serializable {
  // This class is empty, but required for creating serializable lambda expressions.
}
