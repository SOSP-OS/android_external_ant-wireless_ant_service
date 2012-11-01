/*
 * ANT Stack
 *
 * Copyright 2009 Dynastream Innovations
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
package com.dsi.ant.core;

import java.lang.Enum;
import java.util.EnumSet;

public final class JAntUtils {

	public static <V, E extends Enum<E> & IJAntEnum<V>> E getEnumConst(Class<E> enumType, V constValue) {		
		EnumSet<E> es = EnumSet.allOf(enumType);

		E  matchingConst = null;

		for (E enumConst: es) {
			 if (enumConst.getValue().equals(constValue))
			 {
				 matchingConst = enumConst;
				 break;
			 }
		}		
		
		if (matchingConst == null) {
			//Log.e(TAG, "getEnumConst: Invalid const (" + constValue + ") for " + enumType.toString());
		}
		return matchingConst;
	}	
}

