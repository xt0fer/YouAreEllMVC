/* 
 * IntegerParamType.java
 *
 * Copyright (C) 2007 Ferran Busquets
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
 *
 */
package org.naturalcli.parameters;

import org.naturalcli.IParameterType;


/**
 * The class implements an integer parameter type.
 * 
 * @author Ferran Busquets
 *
 */
public class IntegerParamType implements IParameterType {

	/* (non-Javadoc)
	 * @see org.naturalcli.paramtypes.IParameterType#getParameterTypeName()
	 */
	@Override
	public String getParameterTypeName() {
		return "integer";
	}

	/* (non-Javadoc)
	 * @see org.naturalcli.paramtypes.IParameterType#validateParameter(java.lang.String)
	 */
	@Override
	public boolean validateParameter(String value) {
        try {
            Integer.valueOf(value);
            return true;
        } catch (NumberFormatException e)
        {
            return false;
        }
    }

	/* (non-Javadoc)
	 * @see org.naturalcli.paramtypes.IParameterType#validationMessage(java.lang.String)
	 */
	@Override
	public String validationMessage(String value) {
		return this.validateParameter(value) ? null : "Bad integer.";
	}

	/* (non-Javadoc)
	 * @see org.naturalcli.paramtypes.IParameterType#convertParameterValue(java.lang.String)
	 */
	@Override
	public Object convertParameterValue(String strRepresentation) {
		return new Integer(strRepresentation);
	}		
}
