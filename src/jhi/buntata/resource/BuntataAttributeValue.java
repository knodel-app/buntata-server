/*
 * Copyright 2016 Information & Computational Sciences, The James Hutton Institute
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

package jhi.buntata.resource;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

import jhi.database.shared.util.*;

/**
 * @author Sebastian Raubach
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BuntataAttributeValue extends DatabaseObject
{
	public static final String TABLE_NAME         = "attributevalues";
	public static final String FIELD_NODE_ID      = "node_id";
	public static final String FIELD_ATTRIBUTE_ID = "attribute_id";
	public static final String FIELD_VALUE        = "value";

	private Long             nodeId;
	private Long             attributeId;
	private String           value;
	private BuntataAttribute attribute;

	public BuntataAttributeValue()
	{
	}

	public BuntataAttributeValue(Long id, Date createdOn, Date updatedOn)
	{
		super(id, createdOn, updatedOn);
	}

	public Long getNodeId()
	{
		return nodeId;
	}

	public BuntataAttributeValue setNodeId(Long nodeId)
	{
		this.nodeId = nodeId;
		return this;
	}

	public Long getAttributeId()
	{
		return attributeId;
	}

	public BuntataAttributeValue setAttributeId(Long attributeId)
	{
		this.attributeId = attributeId;
		return this;
	}

	public String getValue()
	{
		return value;
	}

	public BuntataAttributeValue setValue(String value)
	{
		this.value = value;
		return this;
	}

	public BuntataAttribute getAttribute()
	{
		return attribute;
	}

	public BuntataAttributeValue setAttribute(BuntataAttribute attribute)
	{
		this.attribute = attribute;
		return this;
	}

	@Override
	public String toString()
	{
		return "BuntataAttributeValue{" +
			"nodeId=" + nodeId +
			", attributeId=" + attributeId +
			", value='" + value + '\'' +
			", attribute=" + attribute +
			"} " + super.toString();
	}
}
