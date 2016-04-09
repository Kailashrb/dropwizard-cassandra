/*
 * Copyright 2016 Composable Systems Limited
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package systems.composable.dropwizard.cassandra.smoke;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import systems.composable.dropwizard.cassandra.CassandraFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class SmokeTestConfiguration extends Configuration {

    @Valid
    @NotNull
    private CassandraFactory cassandra;

    @JsonProperty("cassandra")
    public CassandraFactory getCassandraConfig() {
        return cassandra;
    }

    @JsonProperty("cassandra")
    public void setCassandraConfig(CassandraFactory cassndraConfig) {
        this.cassandra = cassndraConfig;
    }
}
