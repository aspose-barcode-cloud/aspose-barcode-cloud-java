// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose">
//   Copyright (c) 2025 Aspose.BarCode for Cloud
// </copyright>
// <summary>
//   Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files (the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions:
//
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//  SOFTWARE.
// </summary>
// --------------------------------------------------------------------------------------------------------------------

package com.aspose.barcode.cloud;

import java.util.Map;

/** Representing a Server configuration. */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.8.0")
public class ServerConfiguration {
    public String url;
    public String description;
    public Map<String, ServerVariable> variables;

    /**
     * Constructor
     *
     * @param url A url to the target host.
     * @param description A description of the host designated by the url.
     * @param variables A map between a variable name and its value. The value is used for
     *     substitution in the server's url template.
     */
    public ServerConfiguration(
            String url, String description, Map<String, ServerVariable> variables) {
        this.url = url;
        this.description = description;
        this.variables = variables;
    }

    /**
     * Format url template using given variables.
     *
     * @param variables A map between a variable name and its value.
     * @return Formatted url.
     */
    public String url(Map<String, String> variables) {
        String url = this.url;

        // go through variables and replace placeholders
        for (Map.Entry<String, ServerVariable> variable : this.variables.entrySet()) {
            String name = variable.getKey();
            ServerVariable serverVariable = variable.getValue();
            String value = serverVariable.defaultValue;

            if (variables != null && variables.containsKey(name)) {
                value = variables.get(name);
                if (serverVariable.enumValues.size() > 0
                        && !serverVariable.enumValues.contains(value)) {
                    throw new IllegalArgumentException(
                            "The variable "
                                    + name
                                    + " in the server url has invalid value "
                                    + value
                                    + ".");
                }
            }
            url = url.replace("{" + name + "}", value);
        }
        return url;
    }

    /**
     * Format url template using default server variables.
     *
     * @return Formatted url.
     */
    public String url() {
        return url(null);
    }
}
