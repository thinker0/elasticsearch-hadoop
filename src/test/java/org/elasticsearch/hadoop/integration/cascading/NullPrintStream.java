/*
 * Copyright 2013 the original author or authors.
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
package org.elasticsearch.hadoop.integration.cascading;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Serializable;

public class NullPrintStream extends PrintStream implements Serializable {

    private static class NullOutputStream extends OutputStream implements Serializable {
        @Override
        public void write(int b) throws IOException {}
    }

    public NullPrintStream() {
        super(new NullOutputStream());
    }

    @Override
    public void write(byte[] buf, int off, int len) {}

    @Override
    public void write(int b) {}

    @Override
    public void write(byte[] b) {}
}
